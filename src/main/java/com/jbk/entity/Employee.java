package com.jbk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employee {

	@Id
	private int emp_id;
	private String name;
	private String email;
	private String city;
	private String domain;
	private long salary;

	public Employee() {

	}

	public Employee(int emp_id, String name, String email, String city, String domain, long salary) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.email = email;
		this.city = city;
		this.domain = domain;
		this.salary = salary;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", email=" + email + ", city=" + city + ", domain="
				+ domain + ", salary=" + salary + "]";
	}

}
