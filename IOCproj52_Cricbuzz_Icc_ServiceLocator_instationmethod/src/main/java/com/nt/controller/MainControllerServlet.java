package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.CricBuzzService;
import com.nt.service.CricBuzzServiceimpl;

public class MainControllerServlet extends HttpServlet {
	ApplicationContext ctx=null;
	@Override
	public void init() throws ServletException {
		//create IOC container 
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	int mid=0;
	CricBuzzServiceimpl service=null;
	String score=null;
	RequestDispatcher rd=null;
	//read additional req param value
	mid=Integer.parseInt(req.getParameter("mid"));
	//get local service object
	service=ctx.getBean("cbservice",CricBuzzServiceimpl.class);
	try {
		//use service
		score=service.getScore(mid);
	//keep request score request
		req.setAttribute("scoreBoard",score);
		rd=req.getRequestDispatcher("/show_score.jsp");
		rd.forward(req, res);
	}
	catch (Exception e) {
		e.printStackTrace();
		rd=req.getRequestDispatcher("/error.jsp");
		rd.forward(req, res);
	}
	
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}
	@Override
	public void destroy() {
		//close container
		((AbstractApplicationContext) ctx).close();
		
	}

}

