package com.nt.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;

@Named("vt")
@Scope("singleton")
public class Voter {
	@Value("${voter.name} ")
	private String name;
	@Value("${voter.age}")
	private int age;
	@Value("${voter.isSingle}")
	private String isSingle;
	
	@PostConstruct
	public void myinit() {
		System.out.println("Voter.myinit()");
		if(name==null|| age<=0) {
			throw new IllegalArgumentException("name age must be set");
		}
		if(isSingle==null) {
			
			isSingle="yes";
		}
		
			
		}
	@PreDestroy
	public void MyDestroy() {
		System.out.println("Voter.MyDestroy()");
		name=null;
		age=0;
		isSingle=null;
	}
	public String CheckVotingElgibility() {
		if(age<18) {
			return name + " u r not ellible to vote";
		}
		else {
			return name+"u r eligible to vote";
		}
	}

}
