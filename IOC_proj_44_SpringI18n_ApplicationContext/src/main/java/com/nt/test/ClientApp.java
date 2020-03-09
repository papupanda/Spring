package com.nt.test;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {

	public static void main(String[] args) {
		//create Ioc container
		ApplicationContext ctx=null;
		Locale locale=null;
		String msg1=null,msg2=null,msg3=null,msg4=null;
		JButton btn1=null,btn2=null,btn3=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//create locale object
		locale=new Locale(args[0],args[1]);
		msg1=ctx.getMessage("screen.tittle",new Object[]{},"msg1",locale);
		msg2=ctx.getMessage("btn.cap1",new Object[]{},"msg2",locale);
		msg3=ctx.getMessage("btn.cap2",new Object[]{},"msg3",locale);
		msg4=ctx.getMessage("btn.cap3",new Object[]{},"msg4",locale);
		//create frame object
		Frame frame=new JFrame();
		frame.setLayout(new FlowLayout());
		frame.setTitle(msg1);
		frame.setSize(200,200);
		//add component
		btn1=new JButton(msg2);
		btn2=new JButton(msg3);
		btn3=new JButton(msg4);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.setVisible(true);
		frame.pack();
		((JFrame) frame).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




	}

}
