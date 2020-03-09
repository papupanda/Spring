package com.nt.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

import com.nt.bo.StudentBo;

public class StudentDaoImpl implements StudentDao {
	private static final String Stu_insert="INSERT INTO STUDENT_INFO VALUES(SID_SEQ.NEXTVAL,?,?,?,?,?,?,?)";
	private static final String Stu_info="SELECT SID,SNAME,AGE,FATHERNAME,ADHARNO,ADDRESS,PHONENUMBER,BATCH FROM STUDENT_INFO";
	private static final String Stu_id="SELECT SID,SNAME,AGE,FATHERNAME,ADHARNO,ADDRESS,PHONENUMBER,BATCH FROM STUDENT_INFO WHERE SID=?";
	private static final String Stu_modify="UPDATE STUDENT_INFO SET SNAME=?,AGE=?,FATHERNAME=?,ADHARNO=?,ADDRESS=?,PHONENUMBER=?,BATCH=? WHERE SID=?";
	private static final String Delete_stu="DELETE FROM STUDENT_INFO WHERE SID=?";
	private JdbcTemplate jt;

	public StudentDaoImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	public List<StudentBo> FetchAll() {
		List<StudentBo> listbo=new ArrayList<StudentBo>();
		listbo=(List<StudentBo>) jt.query(Stu_info, new RowMapperResultSetExtractor(new BeanPropertyRowMapper(StudentBo.class)));
		
		return listbo;
		
	}

	@Override
	public StudentBo getStudentid(int sid) {
		StudentBo bo=null;
		bo=jt.queryForObject(Stu_id,(rs,index)->{
			StudentBo bo1=null;
			bo1=new StudentBo();
			bo1.setSid(rs.getInt(1));
			bo1.setSname(rs.getString(2));
			bo1.setAge(rs.getInt(3));
			bo1.setFathername(rs.getString(4));
			bo1.setAdharno(rs.getInt(5));
			bo1.setAddress(rs.getString(6));
			bo1.setPhonenumber(rs.getInt(7));
			bo1.setBatch(rs.getString(8));
			return bo1;
			
		},sid );
		return bo;
	}

	@Override
	public int updateStudentByid(StudentBo bo) {
		int count=0;
		count=jt.update(Stu_modify,bo.getSname(),bo.getAge(),bo.getFathername(),bo.getAdharno(),bo.getAddress(),bo.getPhonenumber(),bo.getBatch(),bo.getSid());
		return count;
	}

	@Override
	public int insert(StudentBo bo) {
		int count=0;
		count=jt.update(Stu_insert,bo.getSname(),bo.getAge(),bo.getFathername(),bo.getAdharno(),bo.getAddress(),bo.getPhonenumber(),bo.getBatch());
		return count;
	}

	@Override
	public int DeleteStudentByid(int sid) {
		int count=0;
		count=jt.update(Delete_stu,sid);
		return count;
	} 

}
