package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.emp.EmployeeProfile;
import com.nt.faculty.Faculty;
import com.nt.info.Studentinfo;
import com.nt.student.Student;
import com.nt.university.University;

public class test {

	public static void main(String[] args) {
		Student s = null;
		University u = null;
		Studentinfo i = null;
		Faculty f = null;
		EmployeeProfile e = null;
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		// create ioc container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		// loacte file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		s = factory.getBean("st", Student.class);
		System.out.println(s);
		System.out.println("....................");
		u = factory.getBean("university", University.class);
		System.out.println("crouses are::");
		System.out.println(u);
		System.out.println("....................");
		i = factory.getBean("stu", Studentinfo.class);
		System.out.println(i);
		System.out.println("...................");
		f = factory.getBean("fc", Faculty.class);
		System.out.println(f);
		System.out.println(".....................");
		e = factory.getBean("emp", EmployeeProfile.class);
		System.out.println(e);

	}

}
