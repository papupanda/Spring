package com.nt.advice;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {

	@ExceptionHandler(DataAccessException.class)
	public String handeldbProblems() {
		return "show_sql_problem";
	}
	@ExceptionHandler(Exception.class)
	public String handelAllProblem() {
		return "show_problem";
	}
}
