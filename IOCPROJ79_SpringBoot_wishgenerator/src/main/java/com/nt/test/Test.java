package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.beans.WishMessageGeneratorService;
import com.nt.config.Appconfug;
@SpringBootApplication

@Import(Appconfug.class)
public class Test {
	public static void main(String[] args) {
		//create Ioc conatinera
		ApplicationContext ctx=null;
		WishMessageGeneratorService service=null;
		ctx=SpringApplication.run(Test.class, args);
		service=ctx.getBean("ms",WishMessageGeneratorService.class);
		System.out.println("message is::"+service.generateWishMessage(" papu"));
		//close container
		((ConfigurableApplicationContext) ctx).close();
		

	}

}
