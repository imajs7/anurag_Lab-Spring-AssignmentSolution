package com.student.service;

import java.util.List;

import com.student.model.Student;

public interface StudentService {
	
	List<Student> findAllStudents();
	Student findStudentById(Integer studentId);
	void saveStudent(Student student);
	void deleteStudent(Integer studentId);

}
