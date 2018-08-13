package rest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.glassfish.jersey.process.internal.RequestScoped;
import org.junit.Test;

import service.StudentDAO;
import service.StudentDAOImpl;
import bo.Student;

@RequestScoped
@Path("/crud") 
public class StudentService
{
	Logger _LOG = Logger.getLogger(StudentService.class);
	
    @GET
    public String getMsg()
    {
         return "Welcome to Student WS using Jersey 2";
    }
    public StudentService()
    {
    }
    
    @GET
    @Path("/student/dummy")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Student getDummyStudent() 
    {
    	_LOG.debug("in getDummyStudent");
    	Student l_student = new Student();
    	l_student.setId(1L);
    	l_student.setFirstName("");
    	l_student.setHeight(1);
    	l_student.setLastName("");
    	l_student.setSex('M');
    	l_student.setWeight(0);
    	l_student.setAge((short) 0);

        return l_student;
    }

    @GET
    @Path("/student/id/{id}")
    @Produces({ MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Student getStudentInJson(@PathParam("id") long p_Student_id) 
    {
    	_LOG.debug("in getWsInJson with param p_Student_id:" + p_Student_id);
    	StudentDAO l_StudentDAO = new StudentDAOImpl();
    	
    	Student l_Student = l_StudentDAO.getStudentById(p_Student_id);
        return l_Student;
    }    
   
    //http://localhost:8080/user/Student/crud/workstation/name/CSAMCAM38368
    //http://localhost:8080/Student/Student/crud/student/name/sanjay
    @GET
    @Path("/student/firstname/{nm}")
    @Produces({ MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})    
    //@Produces({MediaType.APPLICATION_XML})
	public List<Student> GetStudentsByFirstName(@PathParam("nm") String p_StudentFirstName)
	{
    	_LOG.debug("in GetStudentsByFirstName with param p_StudentFirstName:" + p_StudentFirstName);
    	service.StudentDAO l_StudentDAO = new StudentDAOImpl();
		List<Student> StudentList = l_StudentDAO.getStudentByFirstName("%" + p_StudentFirstName + "%");
		return StudentList;
	}

    @GET
    @Path("/student/all")
    @Produces({ MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})    
    //@Produces({MediaType.APPLICATION_XML})
	public List<Student> GetAll()
	{
    	_LOG.debug("in GetAll" );
    	service.StudentDAO l_StudentDAO = new StudentDAOImpl();
		List<Student> StudentList = l_StudentDAO.getAll();
		return StudentList;
	}
    
    
    
}