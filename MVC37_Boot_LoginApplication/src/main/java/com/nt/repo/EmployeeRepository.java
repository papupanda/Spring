package com.nt.repo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.nt.bo.EmployeeBo;
import com.nt.model.Emplogin;

public interface EmployeeRepository extends CrudRepository<Emplogin, String> {

	@Query(value="select count(*) from emplogin  where username=:username and password=:password")
	public int validate(@Param("username")String username,@Param("password")String password);
}
