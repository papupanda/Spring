package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.confugration.BusinessConfig;
import com.nt.confugration.PresentationConfig;
import com.nt.controller.TourismController;
import com.nt.dto.TourismDto;

public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext pctx=null,cctx=null;
		TourismController controller=null;
		List<TourismDto> listdto=null;
		//create parent container
		pctx=new AnnotationConfigApplicationContext(BusinessConfig.class);
		//create child container
		cctx=new AnnotationConfigApplicationContext(PresentationConfig.class);
		((AnnotationConfigApplicationContext)cctx).setParent(pctx);
        //getting controller class object
		controller=cctx.getBean("controller",TourismController.class);
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


