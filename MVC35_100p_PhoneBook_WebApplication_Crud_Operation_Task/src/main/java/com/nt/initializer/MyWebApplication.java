package com.nt.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.nt.config.RootAppConfig;
import com.nt.config.WebMvcAppConfig;

public class MyWebApplication implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		AnnotationConfigWebApplicationContext rootCtx=null,childCtx=null;
		ContextLoaderListener listener=null;
		ServletRegistration.Dynamic reg=null;
		//create parent container
		rootCtx=new AnnotationConfigWebApplicationContext();
		rootCtx.register(RootAppConfig.class);
		//create and register contextloader listner
		listener=new ContextLoaderListener(rootCtx);
		//add listner
		sc.addListener(listener);
		//create child container
		childCtx=new AnnotationConfigWebApplicationContext();
		childCtx.register(WebMvcAppConfig.class);
		//create and registerdispatcherservlet
		reg=sc.addServlet("ds", new DispatcherServlet(childCtx));
		reg.addMapping("*.htm");
		reg.setLoadOnStartup(2);

	}

}
