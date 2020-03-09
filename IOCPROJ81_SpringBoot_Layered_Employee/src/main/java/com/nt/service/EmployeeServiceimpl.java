package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBo;
import com.nt.dao.EmployeeDao;
import com.nt.dto.EmployeeDto;

@Service("service")
public class EmployeeServiceimpl implements EmployeeService {
	@Autowired
 private EmployeeDao dao;
	
	public String register(EmployeeDto dto)throws Exception {
		double grosssalary;
		double netsalary;
		String result = null;
		EmployeeBo bo=new EmployeeBo();
		//write business logic
		grosssalary=dto.getBasicsalary()+(dto.getBasicsalary()*0.3);
		netsalary=(grosssalary-(grosssalary*0.2));
		//create student bo class object
		bo.setEmpno(dto.getEmpno());
		bo.setEmpname(dto.getEmpname());
		bo.setEmpaddrs(dto.getEmpaddrs());
		bo.setBasicsalary(dto.getBasicsalary());
		bo.setGrosssalary(grosssalary);
		bo.setNetsalary(netsalary);
		//use dao
		int count=dao.insert(bo);
		if(count==1) {
			return "Employee registration sucessed gross saalary::"+ grosssalary +"netsalry"+netsalary+"result"+result;
		}
		else {
			return "employee registration failed gross salary::"+grosssalary+"netsalary"+netsalary+"result"+result;
			
		}
		
		
		
	}
	

}
