package com.Employee.service;

import java.util.ArrayList;
import java.util.List;

import com.Employee.bo.EmpBO;
import com.Employee.dao.ListEmpDAO;
import com.Employee.dto.EmpDTO;

public class ListEmpService {
	private ListEmpDAO dao;
	
public void setDao(ListEmpDAO dao) {
	this.dao = dao;
}
public List<EmpDTO> getAllEmployees(){
	List<EmpBO> bo=dao.retriveEmps();
	List<EmpDTO> dto=new ArrayList<EmpDTO>();
	for(EmpBO b:bo) {
		EmpDTO empDto=new EmpDTO(b.getEno(),b.getEname(),b.getEjob(),b.getEsalary());
		
dto.add(empDto);
	}
	return dto;
}

}
