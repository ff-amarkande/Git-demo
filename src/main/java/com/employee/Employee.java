package com.employee;

public class Employee implements Comparable<Employee>
{

	private int employeeNumber,employeeSalary;
	private String employeeName;
	
	Employee(){
		super();
	}
	
	Employee(int employeeNumber,String employeeName,int employeeSalary)
	{
		this.employeeName=employeeName;
		this.employeeNumber=employeeNumber;
		this.employeeSalary=employeeSalary;
		
	}
public int compare(Employee o1, Employee o2) {
		
		return o1.getEmployeeNumber()-o2.getEmployeeNumber();
	}
	public int getEmployeeNumber() 
	{
		return employeeNumber;
	}
	
	public void setEmployeeNumber(int employeeNumber) 
	{
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() 
	{
		return employeeName;
	}

	public void setEmployeeName(String employeeName) 
	{
		this.employeeName = employeeName;
	}

	public int getEmployeeSalary()
    {
		return employeeSalary;
    }
	

	public void setEmployeeSalary(int employeeSalary) 
	{
		this.employeeSalary = employeeSalary;
	}

	

	public int compareTo(Employee other) {
		if(other == null){
			return 1;
		}
		if(this.equals(other) ){
			return 0;
		}
		
		return this.getEmployeeName().compareTo(other.getEmployeeName());
	}

	
	
}
