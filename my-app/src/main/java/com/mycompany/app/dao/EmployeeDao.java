package com.mycompany.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mycompany.app.model.Employee;

@Repository
public class EmployeeDao
{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public int saveEmployee(Employee employee)
	{
		int emp=(int) hibernateTemplate.save(employee);
		return emp;
	}
	
	public List<Employee> getEmployeeName(String emp_name)
	{
		return (List<Employee>) hibernateTemplate.find("from Employee e where e.emp_name like ?",  emp_name);

	}
	public List<Employee> getEmployeeCity(String location)
	{
		return (List<Employee>) hibernateTemplate.findByNamedQuery("byLocation", location);

	}
}
