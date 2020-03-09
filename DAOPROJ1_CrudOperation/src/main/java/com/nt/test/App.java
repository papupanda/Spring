package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.EmployeeMgmtImpl;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext ctx=null;
      EmployeeMgmtImpl em=null;
      //create ioc contaoner
      ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
      em=ctx.getBean("service",EmployeeMgmtImpl.class);
      System.out.println("Employee count:::"+ em.FindEmployeeCount());
      System.out.println("Employee salary:::"+em.FindEmployeeSalaryByno(7499));
      System.out.println("Employee no:::"+em.findEmployeeDetailByNO(7499));
      
    }
}
