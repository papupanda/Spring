package com.nt.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.nt.bo.PhoneBookBo;
import com.nt.dto.PhoneBookDto;
@Repository("dao")
public class PhoneBookDaoImpl implements PhoneBookDao {
	private static final String phone_insert="INSERT INTO PHONEBOOK VALUES(SNO_SEQ.NEXTVAL,?,?,?)";
	private static final String phone_fetch="SELECT SNO,NAME,EMAIL,PHONENUMBER FROM PHONEBOOK";
	private static final String phone_getid="SELECT SNO,NAME,EMAIL,PHONENUMBER FROM PHONEBOOK WHERE SNO=?";
	private static final String phone_edit="UPDATE PHONEBOOK SET NAME=?,EMAIL=?,PHONENUMBER=? WHERE SNO=?";
	private static final String phone_delete="DELETE FROM PHONEBOOK WHERE SNO=?";
	@Autowired
	private JdbcTemplate jt;

	@Override
	public int insert(PhoneBookBo bo) {
		int count=0;
		count=jt.update(phone_insert,bo.getName(),bo.getEmail(),bo.getPhonenumber());
		return count;
	}

	@Override
	public List<PhoneBookBo> fetchAll() {
		List<PhoneBookBo> listbo=new ArrayList<PhoneBookBo>();
		listbo=(List<PhoneBookBo>) jt.query(phone_fetch,new RowMapperResultSetExtractor(new BeanPropertyRowMapper(PhoneBookBo.class)));
		return listbo;
	}

	@Override
	public int delete(int sno) {
		int count=0;
		count=jt.update(phone_delete,sno);
		return count;
	}

	@Override
	public PhoneBookBo getbyid(int sno) {
		PhoneBookBo bo=null;
		bo=jt.queryForObject(phone_getid,new BeanPropertyRowMapper<>(PhoneBookBo.class) ,sno);
		return bo;
	}

	@Override
	public int editbyid(PhoneBookBo bo) {
		int count=0;
		count=jt.update(phone_edit,bo.getName(),bo.getEmail(),bo.getPhonenumber(),bo.getSno());
		return count;
	}

}
