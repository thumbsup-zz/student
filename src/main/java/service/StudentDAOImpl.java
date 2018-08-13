package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import bo.Student;

import org.apache.ibatis.session.SqlSession;

import util.MyBatisSqlSessionFactory;
import mapper.StudentMapper;
 
public class StudentDAOImpl implements StudentDAO
{
	private Logger _LOG = Logger.getLogger(StudentDAOImpl.class);
	
    public Student getStudentById(Long p_id) 
    {
    	_LOG.debug("in getStudentById with param id:" + p_id);
    	
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try 
        {
          StudentMapper l_StudentMapper = sqlSession.getMapper(StudentMapper.class);
          
          Student l_student = l_StudentMapper.getStudentById(p_id);
          return l_student;
        } 
        finally 
        {
          sqlSession.close();
        }    	
    }
    public List<Student> getAll() 
    {
    	_LOG.debug("in getAll");
    	
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try 
        {
          StudentMapper l_StudentMapper = sqlSession.getMapper(StudentMapper.class);
          
          List<Student> l_students = l_StudentMapper.getAll();
          return l_students;
        } 
        finally
        {
          sqlSession.close();
        }    	
    }
	public Student getStudentInfoById(Long id)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> getStudentByFirstName(String p_Student_name)
	{
		_LOG.debug("in getStudentByFirstName");
    	
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try 
        {
          StudentMapper l_StudentMapper = sqlSession.getMapper(StudentMapper.class);
          
          List<Student> l_students = l_StudentMapper.getStudentByFirstName(p_Student_name);
          return l_students;
        } 
        finally 
        {
          sqlSession.close();
        }    	
	}

	public Student putStudent(Student p_student)
	{
		_LOG.debug("in putStudentById with first name:" + p_student.getFirstName());
		Student l_student = null;
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        
        try
        {
          StudentMapper l_StudentMapper = sqlSession.getMapper(StudentMapper.class);
          l_StudentMapper.putStudent(p_student);
        } 
        finally 
        {
        	sqlSession.commit();
        	sqlSession.close();
        }    	
		return l_student;
	}
}