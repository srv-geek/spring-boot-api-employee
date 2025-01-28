package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.EmployeeDao;
import com.jbk.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;

	public String insertData(Employee e) {
		String msg = dao.insertData(e);
		return msg;
	}

	public String deleteData(int emp_id) {
		String msg = dao.deleteData(emp_id);
		return msg;
	}

	public String updateData(Employee e, int emp_id) {
		String msg = dao.updateData(e, emp_id);
		return msg;

	}

	public Employee getSingleRecord(int emp_id) {
		Employee e1 = dao.getSingleRecord(emp_id);
		return e1;
	}

	public List<Employee> getAllRecord() {
		List<Employee> list = dao.getAllRecord();
		return list;

	}

}
