package com.nt.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBo;
@Repository("dao")
public class EmployeeDaoimpl implements Employeedao{
	private static final String Insert_emp="INSERT INTO EMP_CRUD VALUES(?,?,?,?)";
	private static final String Get_emp="SELECT ID,NAME,SALARY,DESIGNATION FROM EMP_CRUD";
	private static final String getby_id="SELECT ID,NAME,SALARY,DESIGNATION FROM EMP_CRUD WHERE ID=?";
	private static final String update_emp="UPDATE EMP_CRUD SET NAME=?,SALARY=?,DESIGNATION=? WHERE ID=?";
	private static final String Delete_emp="DELETE FROM EMP_CRUD WHERE ID=?";
	@Autowired
	private JdbcTemplate jt;

	//Insert Employee Value
	@Override
	public int insert(EmployeeBo bo) {
		int count=jt.update(Insert_emp,bo.getId(),bo.getName(),bo.getSalary(),bo.getDesignation());
		return count;
	}

	//get all Employee Data
	@Override
	public List<EmployeeBo> getAll() {
		List<EmployeeBo> listbo=new ArrayList<EmployeeBo>();
		listbo=(List<EmployeeBo>) jt.query(Get_emp, new RowMapperResultSetExtractor(new BeanPropertyRowMapper(EmployeeBo.class)));
		return listbo;
	}
	//get by id
	@Override
	public EmployeeBo getEmployeeByid(int id) {
		EmployeeBo bo=null;
		bo=new EmployeeBo();
		bo=jt.queryForObject(getby_id,new BeanPropertyRowMapper<>(EmployeeBo.class),id);
		
		return bo;
	}

//edit by emp
	@Override
	public int UpdateEmployeeDetail(EmployeeBo bo) {
		int count=0;
		count=jt.update(update_emp,bo.getName(),bo.getSalary(),bo.getDesignation(),bo.getId());
		return count;
	}

	@Override
	public int deleteById(int id) {
		int count=0;
		count=jt.update(Delete_emp,id);
		return count;
	}

	
}
