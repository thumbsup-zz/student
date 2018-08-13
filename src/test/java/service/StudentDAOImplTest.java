package service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bo.Student;
import service.StudentDAOImpl;

public class StudentDAOImplTest
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
	public void testPutStudent()
	{
		Student l_Student= new Student("sanjay","virkar",'M',(short)40, 30,30);
		//Student l_Student2= null;
		
		StudentDAOImpl sd = new StudentDAOImpl();
		sd.putStudent(l_Student);
		
		//assertEquals("Sorry unexected value found", 0L, l_Student2.getId());
		
	}

	@Test
	public void testGetStudentById()
	{
		StudentDAOImpl sd = new StudentDAOImpl();
		Student l_student = sd.getStudentById(1L);
		
		if (l_student != null)
			assertEquals("Sorry unexected value found", 1L, l_student.getId().longValue());		
	}

	@Test
	public void testGetAll()
	{
		StudentDAOImpl sd = new StudentDAOImpl();
		List<Student> l_students = sd.getAll();

		assertNotEquals("Expecting more than one record but found",0,l_students.size());
	}

	@Test
	public void testGetStudentByFirstName()
	{
		StudentDAOImpl sd = new StudentDAOImpl();
		List<Student> l_students = sd.getStudentByFirstName("sanjay");
		
		assertEquals("Sorry unexected value found", 1L, l_students.size());		
	}
}
