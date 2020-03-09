package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.beans.Player;
import com.nt.config.Appconfig;

@SpringBootApplication
@Import(Appconfig.class)
public class Test {

	public static void main(String[] args) {
		//create Ioc container
		ApplicationContext ctx=null;
		Player player=null;
		ctx=SpringApplication.run(Test.class, args);
		player=ctx.getBean("player",Player.class);
		System.out.println("Player Equipment::"+player.playgame());
	}

}
