package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="emp_tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee 
{
  @Id
  private Integer empId;
  private String empName;
  private Double empSalary;
  private String empGender;
  private String dept;
  
}
