package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.controller.MainController;
import com.nt.vo.StudentVo;

public class RealTimeTest {
	public static void main(String[] args) {
		//create ioc container
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		String sno;
		String sname;
		String mark1;
		String mark2;
		String mark3;
		//create scanner class object
		Scanner sc=null;
		sc=new Scanner(System.in);
		System.out.println("enter sno");
		sno=sc.next();
		System.out.println("enter student name");
		sname=sc.next();
		System.out.println("enter student mark1");
		mark1=sc.next();
		System.out.println("enter student mark2");
		mark2=sc.next();
		System.out.println("enter student mark3");
		mark3=sc.next();
		//create studentVo class object having inputs
		StudentVo vo=new StudentVo();
		vo.setSno(sno);
		vo.setSname(sname);
		vo.setMark1(mark1);
		vo.setMark2(mark2);
		vo.setMark3(mark3);
	
		
		//get bean
		MainController controller=factory.getBean("stController",MainController.class);
		try {
			String result=controller.ProcessStudent(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			System.out.println("internal problem try again");
		}
	}//main

}//class
