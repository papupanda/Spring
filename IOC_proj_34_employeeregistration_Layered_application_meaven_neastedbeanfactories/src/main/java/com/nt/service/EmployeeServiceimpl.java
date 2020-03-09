package com.nt.service;

import java.util.List;

import com.nt.bo.EmployeeBo;
import com.nt.dao.EmployeeDao;
import com.nt.dto.EmployeeDto;

public class EmployeeServiceimpl implements EmployeeService {
 private EmployeeDao dao;
	public EmployeeServiceimpl(EmployeeDao dao) {
	this.dao = dao;
}
	public List<EmployeeDto> getEmployeedata(String states[])throws Exception;

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
