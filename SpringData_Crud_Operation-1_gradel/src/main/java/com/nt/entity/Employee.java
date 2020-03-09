package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Employee1")
public class Employee implements Serializable {
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO)
	@Column(name="EID")
	private int eid;
	private String ename;
	private String desg;
	private float salary;
	

}
