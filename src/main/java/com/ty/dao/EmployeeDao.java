package com.ty.dao;

import java.util.List;

import com.ty.dto.Employee;

public interface EmployeeDao {
	
	public Employee saveEmployee(Employee employee);
	public Employee findEmployeeById(int id);
	public Employee updateEmployee(Employee employee);
	public boolean deleteEmployee(Employee employee);
	
	public List<Employee> findAllEmployee();

}
