package com.ty.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.dto.Employee;

@Component
public class EmployeeDaoImplementation implements EmployeeDao{
	
	@Autowired
	private EntityManager manager;

	public Employee saveEmployee(Employee employee) {
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
		return employee;
	}

	public Employee findEmployeeById(int id) {
		return manager.find(Employee.class,id);
	}

	public Employee updateEmployee(Employee employee) {
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.merge(employee);
		transaction.commit();
		return employee;
	}

	public boolean deleteEmployee(Employee employee) {
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.remove(employee);
		transaction.commit();
		return true;
	}

	@Override
	public List<Employee> findAllEmployee() {
		Query query=manager.createQuery("select e from Employee e");
		return query.getResultList();
	}

}
