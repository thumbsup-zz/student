package service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bo.Student;

public interface StudentDAO
{
	Student getStudentById(Long id);	
	List<Student> getStudentByFirstName(String Student_name);
	List<Student> getAll();
	Student putStudent(Student s);
}