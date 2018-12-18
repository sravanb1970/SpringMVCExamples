package com.Employee.controller;

import java.awt.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.Employee.dto.EmpDTO;
import com.Employee.service.ListEmpService;

public class ListEmpController extends AbstractController{
private ListEmpService service;
public void setService(ListEmpService service) {
	this.service = service;
}
@Override
protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
		throws Exception {
	
	java.util.List<EmpDTO> emp=service.getAllEmployees();
	
	return new ModelAndView("listemps","empList",emp);
}

}
