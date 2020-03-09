package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.beans.BeanConfugration;
import com.nt.beans.WishGenerator;

public class AnnotationConfigTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		//craete ioc container
		ctx=new AnnotationConfigApplicationContext(BeanConfugration.class);
      //call method
		WishGenerator generator=ctx.getBean("wish",WishGenerator.class);
		System.out.println("Wish message generator::"+generator.generateWishMsg("papu"));
	//close container
		((AbstractApplicationContext) ctx).close();
	}

}
