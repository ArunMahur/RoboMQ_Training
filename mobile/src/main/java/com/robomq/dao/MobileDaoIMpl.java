package com.robomq.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.robomq.pojo.Mobile;
import com.robomq.pojo.MobileMapper;



public class MobileDaoIMpl implements MobileDao {

	JdbcTemplate jdbcTemplate;

	private final String SQL_FIND_MOBILE = "select * from mobile where id = ?";
	private final String SQL_DELETE_MOBILE = "delete from mobile where id = ?";
	private final String SQL_UPDATE_MOBILE = "update mobile set name = ?, price = ?, qty  = ?, desc=? where id = ?";
	private final String SQL_GET_ALL = "select * from mobile";
	private final String SQL_INSERT_MOBILE = "insert into mobile(id, name, price, qty,desc) values(?,?,?,?,?)";

	@Autowired
	public MobileDaoIMpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public Mobile getPersonById(int id) {

		return jdbcTemplate.queryForObject(SQL_FIND_MOBILE, new Object[] { id },new MobileMapper());
	}
	public List<Mobile> getAllPersons() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(SQL_GET_ALL, new MobileMapper());
	}
	public boolean deletePerson(Mobile person) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(SQL_DELETE_MOBILE, person.getId())>0;
	}
	public boolean updatePerson(Mobile person) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(SQL_UPDATE_MOBILE, person.getName(),person.getPrice(),person.getQty(),person.getDesc())>0;
	}
	public boolean createPerson(Mobile person) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(SQL_INSERT_MOBILE, person.getId(),person.getName(),person.getPrice(),person.getQty(),person.getDesc())>0;
	}

	
}
