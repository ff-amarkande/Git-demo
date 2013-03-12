package com.employee;



import java.util.ArrayList;



import java.util.List;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

@Test
public class EmployeeTest {
	
  private EmployeeService employeeService = new EmployeeServiceImpl();	

 

 public void sortEmployeeByNumber() 
 {
	  
	    Employee employeeOne=new Employee(1,"Ashwin",50000);
		Employee employeeTwo=new Employee(2,"Amit",20000);
		Employee employeeThree=new Employee(3,"Vivek",40000);
		Employee h4employeeFour=new Employee(4,"Sachin",10000);
		
			
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList.add(employeeOne);
		employeeList.add(employeeTwo);
		employeeList.add(employeeThree);
		employeeList.add(h4employeeFour);
		
		employeeService.sortEmployeeByNumber(employeeList);
		
		
		Employee topElement = employeeList.get(0);
		Employee secondElement = employeeList.get(1);  
		 
		    
		  //System.out.println("!st "+topElement.getEmployeeName());  
		 AssertJUnit.assertEquals(1, topElement.getEmployeeNumber());
		 AssertJUnit.assertEquals(2, secondElement.getEmployeeNumber());
 }https://github.com/ff-amarkande/Employee.git
 

 public void sortEmployeeBySalary() 
 {
	  
	    Employee employeeOne=new Employee(1,"Ashwin",50000);
		Employee employeeTwo=new Employee(2,"Amit",20000);
		Employee employeeThree=new Employee(3,"Vivek",40000);
		Employee h4employeeFour=new Employee(4,"Sachin",10000);
		
			
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList.add(employeeOne);
		employeeList.add(employeeTwo);
		employeeList.add(employeeThree);
		employeeList.add(h4employeeFour);
		
	   employeeService.sortEmployeeBySalary(employeeList);
	
		
		Employee topElement = employeeList.get(0);
		Employee secondElement = employeeList.get(1);  
		 
		    
		
		 AssertJUnit.assertEquals(10000, topElement.getEmployeeSalary());
		 AssertJUnit.assertEquals(20000, secondElement.getEmployeeSalary());
		  
	  
	  
 }
 
 
   
	public void sortEmployeeByName() 
	  {
		  
		    Employee employeeOne=new Employee(1,"Ashwin",50000);
			Employee employeeTwo=new Employee(2,"Amit",20000);
			Employee employeeThree=new Employee(3,"Vivek",40000);
			Employee h4employeeFour=new Employee(4,"Sachin",10000);
			
				
			List<Employee> employeeList=new ArrayList<Employee>();
			employeeList.add(employeeOne);
			employeeList.add(employeeTwo);
			employeeList.add(employeeThree);
			employeeList.add(h4employeeFour);
			
			employeeService.sortEmployeeByName(employeeList);
			//Collections.sort(employeeList);
			
			Employee topElement = employeeList.get(0);
			Employee secondElement = employeeList.get(1);  
			 
			    
			 
			 AssertJUnit.assertEquals("Amit", topElement.getEmployeeName());
			 AssertJUnit.assertEquals("Ashwin", secondElement.getEmployeeName());
		}
	 

 
 
 
 
}
