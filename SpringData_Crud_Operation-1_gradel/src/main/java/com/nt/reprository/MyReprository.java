package com.nt.reprository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Employee;

public interface MyReprository extends CrudRepository<Employee, Integer> {

}
