package com.nt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="EMPLOGIN")
public class Emplogin implements Serializable{
	@Id
	@Column(name="USERNAME")
	private String username;
	@Column(name="PASSWORD")
	private String password;

}
