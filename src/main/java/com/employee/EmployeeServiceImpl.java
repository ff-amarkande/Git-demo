package com.employee;
import java.util.*;
import com.employee.Employee;;


public class EmployeeServiceImpl implements EmployeeService
{
	
	public static void main(String[] args)
	{
		EmployeeServiceImpl employeeTest=new EmployeeServiceImpl();
		
		//Employee employeet=new Employee();
		
		Employee employeeOne=new Employee(1,"Ashwin",50000);
		Employee employeeTwo=new Employee(2,"Amit",20000);
		Employee employeeThree=new Employee(3,"Vivek",40000);
		Employee h4employeeFour=new Employee(4,"Sachin",10000);
		
			
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList.add(employeeOne);
		employeeList.add(employeeTwo);
		employeeList.add(employeeThree);
		employeeList.add(h4employeeFour);
		
		employeeTest.sortEmployeeByName(employeeList);
		employeeTest.sortEmployeeByNumber(employeeList);
		employeeTest.sortEmployeeBySalary(employeeList);
	
	}

	public void sortEmployeeByName(List<Employee> employees) 
	{
		  System.out.println("----Sort By Name-----");
		  Collections.sort(employees);
		  for (int i = 0; i < employees.size(); i++)
	        {
	            System.out.print("Eid "+employees.get(i).getEmployeeNumber());
	            System.out.print(" Name "+employees.get(i).getEmployeeName());
	            System.out.println(" Salary "+employees.get(i).getEmployeeSalary());
	        }
	}
	
	public void sortEmployeeByNumber(List<Employee> employees) 
	{
		  System.out.println("----Sort By Number-----");
		  Collections.sort(employees,new Comparator<Employee>(){

				public int compare(Employee o1, Employee o2) {
					return o1.getEmployeeNumber()-o2.getEmployeeNumber();
				}
				  
			  } 
			);
		
		  for (int i = 0; i < employees.size(); i++)
	        {
	            System.out.print("Eid "+employees.get(i).getEmployeeNumber());
	            System.out.print(" Name "+employees.get(i).getEmployeeName());
	            System.out.println(" Salary "+employees.get(i).getEmployeeSalary());
	        }
	}

	public void sortEmployeeBySalary(List<Employee> employees) 
	{
		  System.out.println("----Sort By Salary-----");
		  Collections.sort(employees,new Comparator<Employee>(){

				public int compare(Employee o1, Employee o2) {
					return o1.getEmployeeSalary()-o2.getEmployeeSalary();
				}
				  
			  } 
			);
			
			  for (int i = 0; i < employees.size(); i++)
		        {
		            System.out.print("Eid "+employees.get(i).getEmployeeNumber());
		            System.out.print(" Name "+employees.get(i).getEmployeeName());
		            System.out.println(" Salary "+employees.get(i).getEmployeeSalary());
		        }
	}

	

	



	


	
}
