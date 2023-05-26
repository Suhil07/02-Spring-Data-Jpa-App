package in.ashokit.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.ashokit.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{
	@Transactional
	@Modifying
   @Query(value="update emp_tbl set emp_salary=?1 where dept=?2",nativeQuery = true)
	public void updateSalaryByDept(double esalary,String deptNo);
	
	@Transactional
	@Modifying
	@Query("update Employee e set e.empName=?1 where e.empSalary = ?2")
    public void  updateNameBySalary(String eName, double Salary);
	
	@Transactional
	@Modifying
	@Query("delete from Employee e where e.dept=?1")
	 public void  deleteByDept( String deptName);
	
	@Modifying
    @Query(value = "insert into emp_tbl(emp_id,emp_name,emp_salary,emp_gender,dept)VALUES(?,?,?,?,?)", nativeQuery = true)
    @Transactional
    public void insertEmployee(Integer id,String name,Double sal,String gender,String dept);
}

	
