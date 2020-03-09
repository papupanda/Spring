package com.nt.test;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.nt.controller.Maincontroller;
import com.nt.vo.EmployeeVo;

public class ClientTest {

	public static void main(String[] args) {
		String emno,emname,empaddrs1,basicsalary1;
		//creating scanner class
		Scanner sc=null;
		//read data
		sc=new Scanner(System.in);
		System.out.println("enter employee no::");
		String empno=sc.next();
		System.out.println("enetr employee name::");
        String empname=sc.next();
        System.out.println("enter employee address::");
        String empaddrs=sc.next();
        System.out.println("enter basic salary::");
        String basicsalary=sc.next();
        //creating IOC container
    ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    ConfigurableEnvironment env=(ConfigurableEnvironment) ctx.getEnvironment();
    env.setActiveProfiles("per");
    
	  //creating studentvo object
     EmployeeVo vo=new EmployeeVo();
     vo.setEmpno(empno);
	vo.setEmpname(empname);
     vo.setBasicsalary(basicsalary);
     vo.setEmpaddrs(empaddrs);
     //use bean
     Maincontroller controller=ctx.getBean("empcontroller",Maincontroller.class);
     ((AbstractApplicationContext) ctx).refresh();
     try {
			String result=controller.processEmployee(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			System.out.println("internal problem try again");
		}//catch
	}//mainmetod
	

}//class
