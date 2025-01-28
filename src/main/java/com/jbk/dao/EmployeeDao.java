package com.jbk.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	SessionFactory factory;

	public String insertData(Employee e) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		ss.persist(e);
		tr.commit();
		ss.close();
		return "Data is Inserted Successufully!";
	}

	public String deleteData(int emp_id) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e = ss.get(Employee.class, emp_id);
		ss.remove(e);
		tr.commit();
		ss.close();
		return "Data is deleted successufully!";
	}

	public String updateData(Employee e, int emp_id) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e1 = ss.get(Employee.class, emp_id);
		e1.setCity(e.getCity());
		e1.setDomain(e.getDomain());
		e1.setSalary(e.getSalary());
		ss.merge(e1);
		tr.commit();
		ss.close();
		return "Data is updated successufully!";
	}

	public Employee getSingleRecord(int emp_id) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "from Employee where emp_id=:myid";
		Query<Employee> query = ss.createQuery(hqlquery, Employee.class);
		query.setParameter("myid", emp_id);
		Employee e1 = query.uniqueResult();

		tr.commit();
		ss.close();
		return e1;
	}

	public List<Employee> getAllRecord() {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "from Employee";
		Query<Employee> query = ss.createQuery(hqlquery, Employee.class);
		List<Employee> list = query.list();

		tr.commit();
		ss.close();
		return list;
	}

}
