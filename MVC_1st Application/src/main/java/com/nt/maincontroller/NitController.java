package com.nt.maincontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.handler.Handler;
import com.nt.handler.HandlerDate;
import com.nt.handler.HandlerSystem;

public class NitController extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Handler handle=null;
		String lvn=null;
		String target=null;
		RequestDispatcher rd=null;
		//action handler
		if(req.getServletPath().equalsIgnoreCase("/date.do")) {
			handle=new HandlerDate();
		}
		else if(req.getServletPath().equalsIgnoreCase("/prop.do")) {
			handle=new HandlerSystem();
		}
		else {
			throw new IllegalArgumentException("invalid incoming request");
		}
		lvn=handle.execute(req, res);
		//view management
		if(lvn.equalsIgnoreCase("date")) {
			target="/show_date.jsp";
		}
		else if(lvn.equalsIgnoreCase("props")) {
			target="/show_props.jsp";
		}
		else {
       	 throw new IllegalArgumentException("invalid logical view name");
		 
		}
		//forward to view comp (result jsp)
		rd=req.getRequestDispatcher(target);
		rd.forward(req, res);
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}

}
