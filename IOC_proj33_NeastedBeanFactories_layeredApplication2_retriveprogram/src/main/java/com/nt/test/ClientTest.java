package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.TourismController;
import com.nt.dto.TourismDto;

public class ClientTest {

	public static void main(String[] args) {
		BeanFactory pfactory=null,cfactory=null;
		TourismController controller=null;
		List<TourismDto> listdto=null;
		//create parent container
		pfactory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/businesstier.xml"));
		//creating child container
		cfactory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/presentationtier.xml"),pfactory);
        //getting controller class object
		controller=cfactory.getBean("tourController",TourismController.class);
		try {
		listdto=controller.getAllStatesPlaces(new String[] {"hyderbad","odisha","chennai"});
		listdto.forEach(dto->
		{
			System.out.println("-------------------------------------");
			System.out.println("StateCode-"+dto.getState_code());
			System.out.println("StateName-"+dto.getState_name());
			System.out.println("TouristPlace-"+dto.getTourist_place());
			System.out.println("Package-"+dto.getPackage_amt());
			System.out.println("NetBill-"+dto.getNet_amt());
			System.out.println("-------------------------------------");
		});
		
	}
	catch(Exception e)
	{
		System.out.println("DB Server Died Please Try Again.....");
		e.printStackTrace();
	}
		
	}
}


