package com.employee;
import java.util.*;

public interface EmployeeService 
{
	
	void sortEmployeeByName(List<Employee> employeeList);
	void sortEmployeeByNumber(List<Employee> employeeList);
	void sortEmployeeBySalary(List<Employee> employeeList);

}
