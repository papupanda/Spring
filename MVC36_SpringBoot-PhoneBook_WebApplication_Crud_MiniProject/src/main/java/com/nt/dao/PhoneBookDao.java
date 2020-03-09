package com.nt.dao;

import java.util.List;

import com.nt.bo.PhoneBookBo;

public interface PhoneBookDao {
	public int insert(PhoneBookBo bo);
	public List<PhoneBookBo> fetchAll();
	public PhoneBookBo getbyid(int sno);
	public int editbyid(PhoneBookBo bo);
	public int delete(int sno);

}
