package service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bo.Student;
import service.StudentDAO;


public class StudentDAOTest implements StudentDAO
{

	@Before
	public void setUp() throws Exception
	{
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void test()
	{
		fail("Not yet implemented");
	}

	public Student getStudentById(Long id)
	{
		StudentDAOImpl sd = new StudentDAOImpl();
		Student l_student = sd.getStudentById(1L);
		
		return l_student;
	}

	public List<Student> getStudentByFirstName(String Student_name)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Student> getAll()
	{
		StudentDAOImpl sd = new StudentDAOImpl();
		List<Student> l_students = sd.getAll();
		
		return l_students;
	}

	public Student putStudent(Student s)
	{
		Student l_Student= new Student("sanjay","virkar",'M',(short)40, 30,30);
		return null;
	}

}
