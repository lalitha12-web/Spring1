package com.bitlabs.dao;

import java.util.List;

import com.bitlabs.entity.Student;

public interface DaoInterface {

	
	Student saveStudentDetails(Student std);

	List<Student> viewAllStudents();

	void deleteStudent(long std);

	Student getStudentById(long id);

	void updateStudent(Student std);

	


	

	
}
