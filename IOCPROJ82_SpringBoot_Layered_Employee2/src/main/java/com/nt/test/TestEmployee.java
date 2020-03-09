package com.nt.test;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.config.BusinessConfig;
import com.nt.config.Presentation;
import com.nt.controller.Maincontroller;
import com.nt.vo.EmployeeVo;

@SpringBootApplication
@Import({BusinessConfig.class,Presentation.class})

public class TestEmployee {


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
     ApplicationContext ctx=SpringApplication.run(TestEmployee.class, args);
        //BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
	  //creating studentvo object
     EmployeeVo vo=new EmployeeVo();
     vo.setEmpno(empno);
	vo.setEmpname(empname);
     vo.setBasicsalary(basicsalary);
     vo.setEmpaddrs(empaddrs);
     //use bean
     //Maincontroller controller=factory.getBean("empcontroller",Maincontroller.class);
     Maincontroller controller=ctx.getBean("controller",Maincontroller.class);
     try {
			String result=controller.processEmployee(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			System.out.println("internal problem try again");
		}//catch
	}//mainmetod
	

}//class

