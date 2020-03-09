package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.nt.command.RegisterCommand;

public class NaukriRegistration extends AbstractWizardFormController {

	@Override
	public ModelAndView processFinish(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		RegisterCommand cmd=null;
		//type cast
		cmd=(RegisterCommand)command;
		//create and return mav object
		return new ModelAndView("result","cmdData",cmd);
	}

}
