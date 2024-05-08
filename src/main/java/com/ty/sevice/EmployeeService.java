package com.ty.sevice;

import java.util.List;


import com.ty.dto.Employee;

public interface EmployeeService {
	
	
	
	public boolean saveEmployee(Employee employee);
	public boolean updateEmployee(int id,Employee employee);
	public Employee findEmployeeById(int id);
	public boolean deleteEmployeeById(int id);
	public List<Employee> findAllEmployee();

}
