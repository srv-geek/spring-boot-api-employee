package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Employee;
import com.jbk.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping("/EmployeeRecord")
	public String insertData(@RequestBody Employee e) {
		String msg = service.insertData(e);
		return msg;
	}

	@DeleteMapping("/deletedata/{emp_id}")
	public String deleteData(@PathVariable int emp_id) {
		String msg = service.deleteData(emp_id);
		return msg;
	}

	@PutMapping("/updatedata/{emp_id}")
	public String updateData(@RequestBody Employee e, @PathVariable int emp_id) {
		String msg = service.updateData(e, emp_id);
		return msg;
	}

	@GetMapping("/getsinglerecord")
	public Employee getSingleRecord(@RequestParam int emp_id) {
		Employee e1 = service.getSingleRecord(emp_id);
		return e1;
	}

	@GetMapping("/getallrecord")
	public List<Employee> getAllRecord() {
		List<Employee> list = service.getAllRecord();
		return list;
	}

}
