package in.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{
		  ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		  EmployeeRepository repository = ctxt.getBean(EmployeeRepository.class);
		  /*
		   Employee e = new Employee(1,"John",5000.00,"Male","Sales");
		   repository.save(e);
		   System.out.println("record saved in the Data base table");
		  */
		    /*
		    Employee e1 = new Employee(2, "Orlen", 5000.00, "Male", "Sales");
			Employee e2 = new Employee(3, "Charles", 15000.00, "Male", "Admin");
			Employee e3 = new Employee(4, "Smith", 25000.00, "Male", "Marketing");
			Employee e4 = new Employee(5, "Cathy", 35000.00, "Fe-Male", "Account");
			Employee e5 = new Employee(6, "Robert", 45000.00, "Male", "HR");
			Employee e6 = new Employee(7, "David", 55000.00, "Male", "Manager");
			
			repository.saveAll(Arrays.asList(e1, e2, e3, e4, e5, e6));
			
			System.out.println("record saved...");
			*/
		  
		  /*
		    System.out.println("Fetching all records from emp_tbl");
		    List<Employee> emps = repository.findAll();
		    emps.forEach(System.out::println);
		  */
		  
		  /*
		  System.out.println("Retrieving records based on salary descending order");
		  Sort sort = Sort.by("empSalary").descending();
		  List<Employee> emps = repository.findAll(sort);
		  emps.forEach(System.out::println);
		  */
		  
		  /*
		  System.out.println("Retrieving records based on empName ascending order");
		  Sort sort = Sort.by("empName").ascending();
		  List<Employee> emps = repository.findAll(sort);
		  emps.forEach(System.out::println);
		  */ 
		  
		  /*
		   System.out.println("Retrieving first 3 records as per page size ");
		   int pageNo = 1;
		   PageRequest page = PageRequest.of(pageNo-1, 3);
		   Page<Employee> findAll = repository.findAll(page);
		   List<Employee> emps = findAll.getContent();
		   emps.forEach(System.out::println);
		  */ 
		  
		  /*
		    System.out.println("Query By Example "); 
		    System.out.println("Dynamic query based on empGender ");
		    Employee emp = new Employee();
		    emp.setEmpGender("Male");
			Example<Employee> exmp = Example.of(emp);
			List<Employee> emps = repository.findAll(exmp);
			emps.forEach(System.out::println);
		*/
		    
		  /*
		     System.out.println("Dynamic query based on empGender & empDept ");
		     Employee emp = new Employee();
		     emp.setEmpGender("Male");
		     emp.setDept("Sales");
			 Example<Employee> exmp = Example.of(emp);
			 List<Employee> emps = repository.findAll(exmp);
			 emps.forEach(System.out::println);
		  */
		   
		  
		  // repository.updateSalaryByDept(7500.00, "Sales");
		 //  repository.updateNameBySalary("Suhil", 55000.00);
		 /*
		  Employee e7 = new Employee(8, "Komali", 65000.00, "Fe-Male", "HR");
		  Employee e8 = new Employee(9, "Nithesh", 75000.00, "Male", "Manager");
		  
		  Employee e9 = new Employee(9, "Jagadeesh", 75000.00, "Male", "Developer");
		  Employee e10 = new Employee(10, "Sunil", 70000.00, "Male", "Developer");
		  repository.saveAll(Arrays.asList( e9, e10));
		 */
		  
		  
		  //repository.deleteByDept("Developer");
		  
		  repository.insertEmployee(10, "Dhoni",70000.00,"Male", "Developer");
		  
	}

}
