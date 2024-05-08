package com.ty.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ty.dao.EmployeeDaoImplementation;
import com.ty.dto.Employee;
import com.ty.sevice.EmployeeService;

@Controller
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService service;
	
	@Autowired
	 private EmployeeDaoImplementation dao;
	
	@RequestMapping("/employeeapp")
	public ModelAndView landingPage()
	{
		ModelAndView mv=new ModelAndView("registerEmployee.jsp");
		mv.addObject("employee", new Employee());
		return mv;
	}
	
	@RequestMapping("/saveemployee")
	public ModelAndView saveEmployee(@ModelAttribute Employee employee)
	{
		boolean result=service.saveEmployee(employee);
		ModelAndView mv=new ModelAndView("dashBoard.jsp");
		if(result)
		{
			return findAllEmployee();
		}
		
		mv.addObject("msg","Employee Not saved!!");
		return mv;
	}
	
	@RequestMapping("/findall")
	public ModelAndView findAllEmployee()
	{
		List<Employee> listOfEmp=service.findAllEmployee();
		ModelAndView mv=new ModelAndView("display.jsp");
		mv.addObject("employees", listOfEmp);
		return mv;
	}
	
	@RequestMapping("/edit")
	public ModelAndView editUser(int id)
	{
		Employee employee= service.findEmployeeById(id);
		ModelAndView mv=new ModelAndView("editEmployee.jsp");
		mv.addObject("employee", employee);
		return mv;
	}
	
	@RequestMapping("/updateUser")
	public ModelAndView updateEmployee(@ModelAttribute Employee employee)
	{
		dao.updateEmployee(employee);
		return findAllEmployee();
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteEmployee(int id)
	{
		service.deleteEmployeeById(id);
		return findAllEmployee();
	}

}
