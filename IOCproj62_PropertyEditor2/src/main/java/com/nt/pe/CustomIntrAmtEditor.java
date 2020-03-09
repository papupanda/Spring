package com.nt.pe;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.PropertyEditorRegistrySupport;

import com.nt.beans.IntrAmtDetails;

public class CustomIntrAmtEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		System.out.println("CustomIntrAmtEditor.setAsText()");
		//set the value
		int principle=Integer.parseInt(text.substring(0,text.indexOf(",")));
		int time=Integer.parseInt(text.substring(text.indexOf(",")+1,text.lastIndexOf(",")));
		int rate=Integer.parseInt(text.substring(text.lastIndexOf(",")+1,text.length()));
		IntrAmtDetails details=new IntrAmtDetails();
		details.setPrinciple(principle);
		details.setTime(time);
		details.setRate(rate);
		setValue(details);
	}

}
