package com.mycompany.app.service;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.app.dao.EmployeeDao;
import com.mycompany.app.model.Employee;

@Service
public class EmpService
{
	@Autowired
	private EmployeeDao employeeDao;
	
	@Transactional
	public int saveEmployee(Employee employee)
	{
		return employeeDao.saveEmployee(employee);
	}
	@Transactional
	public List<Employee> getEmployeeName(String  emp_name)
	{
		return employeeDao.getEmployeeName( emp_name);
	}
	@Transactional
	public List<Employee> getEmployeeCity(String  location)
	{
		return employeeDao.getEmployeeCity( location);
	}
	

}
