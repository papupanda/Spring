package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.ScheduleReminder;

public class ClientApp {

	public static void main(String[] args) {
		//create IOC container
		ScheduleReminder reminder=null;
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
        reminder=ctx.getBean("Sr",ScheduleReminder.class);
        System.out.println(reminder.remainder1());
        //close container
        ((AbstractApplicationContext) ctx).close();
	}

}
