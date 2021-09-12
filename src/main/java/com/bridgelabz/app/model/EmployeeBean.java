package com.bridgelabz.app.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bridgelabz.app.SpringCoreConceptsApplication;

@Component
public class EmployeeBean {
	
	private static final Logger logger= LoggerFactory.getLogger(EmployeeBean.class);

	
	private String empName;
	private int empId;
	
	@Autowired
	private DepartmentBean departmentBean;
	
	public EmployeeBean() {
		System.out.println("Employee Bean reached");
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public DepartmentBean getDepartmentBean() {
		return departmentBean;
	}

	public void setDepartmentBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}
	
	public void showDetails() {
		logger.info("Employee name -> "+empName);
		logger.info("Employee Id -> "+empId);
		departmentBean.setDeptName("IT");
		logger.info("Department name is ->"+departmentBean.getDeptName());
		
	}
}
