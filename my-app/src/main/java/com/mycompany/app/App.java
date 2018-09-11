package com.mycompany.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mycompany.app.config.RootConfig;
import com.mycompany.app.model.Employee;
import com.mycompany.app.service.EmpService;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
    ApplicationContext applicationContext=new AnnotationConfigApplicationContext(RootConfig.class);
    EmpService empService=applicationContext.getBean("empService",EmpService.class);
    
   /* Employee employee=new Employee();
    employee.setCompany("Tech_M");
    employee.setDesignation("tester");
    employee.setEmp_name("surendra"); 
    employee.setLocation("chennai");
    employee.setSalary(89739);
    int emp=empService.saveEmployee(employee);
    System.out.println(emp);*/
    
  /*  Employee employee=(Employee) empService.getEmployeeName("surendra");
    System.out.println(employee);
	}
    */
     Employee employee=(Employee) empService.getEmployeeName("chennai");
    System.out.println(employee);
	}
    
    
}
