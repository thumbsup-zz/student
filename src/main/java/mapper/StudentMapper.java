package mapper;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bo.Student;

public interface StudentMapper
{
	public Student getStudentById(Long id);
	public List<Student> getStudentByFirstName(String Student_name);
	public int putStudent(Student p_student);
	public List<Student> getAll();
}