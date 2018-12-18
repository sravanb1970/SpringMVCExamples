package com.Employee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.Employee.bo.EmpBO;

public class EmpRowMapper implements RowMapper<EmpBO> {

	public EmpBO mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmpBO bo=new EmpBO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
		
		return bo;
	}

	
}
