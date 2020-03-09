package com.nt.Bpp;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.nt.bo.Basebo;

public class BaseBoBeanProcessor implements BeanPostProcessor {
	public BaseBoBeanProcessor() {
		System.out.println("BaseBoBeanProcessor.0 param constructor");
	}
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BaseBoBeanProcessor.postProcessBeforeInitialization()");
		return bean;
	}
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BaseBoBeanProcessor.postProcessAfterInitialization()");
		if(bean instanceof Basebo) {
			System.out.println(beanName);
			((Basebo)bean).setDoj(new Date());
		}
		return bean;
	}

}
