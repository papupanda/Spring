package com.nt.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.EmployeeDto;
import com.nt.dto.StudentDto;
import com.nt.service.NITservice;

public class MainController extends HttpServlet {
	ApplicationContext ctx;
	@Override
	public void init() throws ServletException {
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		NITservice service=null;
		String s1val=null;
		StudentDto sdto=null;
		EmployeeDto edto=null;
		String resultMsg=null;
		//get service class object
		service=ctx.getBean("nitservice",NITservice.class);
		//read s1 request param value
		s1val=req.getParameter("s1");
		if(s1val.equalsIgnoreCase("registerStudent")) {
			//read from data and store StudentDto class object
			sdto=new StudentDto();
			sdto.setId(Integer.parseInt(req.getParameter("sno")));
			sdto.setName(req.getParameter("sname"));
			sdto.setAddrs(req.getParameter("saddrs"));
			sdto.setCourse(req.getParameter("course"));
			sdto.setQualify(req.getParameter("qlfy"));
			//use service
			resultMsg=service.registerStudent(sdto);
			//keep result in request scope
			req.setAttribute("result", resultMsg);
		}
		else if(s1val.equalsIgnoreCase("registerEmployee")) {
			//read from data and store StudentDto class object
			edto=new EmployeeDto();
			edto.setId(Integer.parseInt(req.getParameter("empno")));
			edto.setName(req.getParameter("ename"));
			edto.setAddrs(req.getParameter("eaddrs"));
			edto.setDsg(req.getParameter("desg"));
			edto.setExp(Float.parseFloat(req.getParameter("exp")));
			//use service
			resultMsg=service.registerStudent(sdto);
			//keep result in request scope
			req.setAttribute("result", resultMsg);
		}
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}
	@Override
	public void destroy() {
		((AbstractApplicationContext) ctx).close();
		
	}

}
