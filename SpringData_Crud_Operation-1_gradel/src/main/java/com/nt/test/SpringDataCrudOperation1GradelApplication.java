package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.config.AppConfig;
import com.nt.dto.EmployeeDto;
import com.nt.service.EmployeeService;
import com.nt.service.EmployeeServiceimpl;

@SpringBootApplication
@Import(AppConfig.class)
public class SpringDataCrudOperation1GradelApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService service=null;
		EmployeeDto dto=null;
		//create ioc container
		ctx=SpringApplication.run(SpringDataCrudOperation1GradelApplication.class, args);
       //get service class object
		service=ctx.getBean("empService",EmployeeServiceimpl.class);
		//invoke method
		try {
			//create dto
			dto=new EmployeeDto();
			dto.setEname("papu");
			dto.setDesg("hyd");
			dto.setSalary(10000);
			System.out.println(service.registerEmployee(dto));
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
