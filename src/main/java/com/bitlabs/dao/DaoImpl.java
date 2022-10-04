package com.bitlabs.dao;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bitlabs.entity.Student;


public class DaoImpl implements DaoInterface {

	SessionFactory sf=null;
	public DaoImpl() {

		sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
	@Override
	public Student saveStudentDetails(Student std) {
		
		Session session=sf.openSession();
		
		Transaction txn=session.beginTransaction();
		
		session.save(std);
		
		txn.commit();
		session.close();
		
		
		
		return std;
	}
	@Override
	public List<Student> viewAllStudents() {
		
		Session session=sf.openSession();
		
		Query query=session.createQuery("From Student");
		
		List<Student> std=query.list();
		
		session.close();
		
		
		return std;
	}
	@Override
	public void deleteStudent(long id) {
		
		Session session=sf.openSession();
		Transaction txn=session.beginTransaction();
		
		Student std1=session.get(Student.class, id);
		session.delete(std1);
		
		txn.commit();
		
		session.close();
		
	}
	@Override
	public Student getStudentById(long id) {
		
		Session session=sf.openSession();
		Student std=session.get(Student.class, id);
			
		session.close();
		return std;
	}
	@Override
	public void updateStudent(Student std) {
		
		Session session =sf.openSession();
		
		Transaction txn=session.beginTransaction();
		
		Student std1=session.get(Student.class, std.getId());
		std1.setFname(std.getFname());
		std1.setMobile(std.getMobile());
		session.update(std1);
		
		
		txn.commit();
		
		session.close();
		
	}
	
	
	
	
	
	
}
