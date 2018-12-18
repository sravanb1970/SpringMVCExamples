package com.Employee.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.Employee.bo.EmpBO;

public class ListEmpDAO {

	private JdbcTemplate jt;
	private static final String GET_ALL_EMPLOYEES="SELECT * FROM EMPLOYEE";
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public List<EmpBO> retriveEmps(){
		List<EmpBO> listempBO=jt.query(GET_ALL_EMPLOYEES, new EmpRowMapper());
		return listempBO;
		
				
	}
	
}
