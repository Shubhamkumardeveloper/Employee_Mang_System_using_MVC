package com.ty.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.dao.EmployeeDao;
import com.ty.dto.Employee;

@Component
public class EmployeeServiceImplementation implements EmployeeService {
	
	@Autowired
	private EmployeeDao dao;

	@Override
	public boolean saveEmployee(Employee employee) {
		if(employee!=null)
		{
			dao.saveEmployee(employee);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateEmployee(int id, Employee employee) {
		Employee emp=dao.findEmployeeById(id);
		if(employee!=null && emp!=null)
		{
			dao.updateEmployee(employee);
			return true;
		}
		return false;
	}

	@Override
	public Employee findEmployeeById(int id) {
		return dao.findEmployeeById(id);
	}

	@Override
	public boolean deleteEmployeeById(int id) {
		Employee employee=dao.findEmployeeById(id);
		if(employee!=null)
		{
			dao.deleteEmployee(employee);
			return true;
		}
		return false;
	}

	@Override
	public List<Employee> findAllEmployee() {
		return dao.findAllEmployee();
	}
}
