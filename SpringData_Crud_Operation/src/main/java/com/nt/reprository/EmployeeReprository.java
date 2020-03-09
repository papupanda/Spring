package com.nt.reprository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.nt.entity.EmployeeEntity;

public interface EmployeeReprository extends CrudRepository<EmployeeEntity,Integer>{
	@Query("from  Employee where desg in(:job1,:job2)")
	public List<EmployeeEntity> findEmpsByDesgs(@Param("job1")String desg1,@Param("job2")String desg2);
	

}
