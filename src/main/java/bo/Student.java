package bo;

import java.sql.Date;

public class Student
{
	private Long _id =0L;
	private String _firstName =""; 
	private String _lastName ="";
	private char _sex  =' ';
	private short _age =0;
	private int _height =0;
	private int _weight =0;
	private Date _createdOn = null;
	private String _createdBy = "";
	private Date _updatedOn = null;
	private String _updatedBy = "";
	private Date _deletedOn = null;
	private String _deletedBy = "";
		
	/*

	 * DROP TABLE IF EXISTS `student`;
	 * 
	   create table student
	   (
	  	id        INT NOT NULL AUTO_INCREMENT,
		firstName varchar(40),
		lastName  varchar(40),
		sex       varchar(1),
		age       int(11),
		height    int(11),
		weight    int(11),
		createdOn datetime,
		createdBy varchar(40),
		updatedOn datetime, 
		updatedBy varchar(40),
		deletedOn datetime,
		deletedBy varchar(40),
		PRIMARY KEY (ID)
		);

	 * 
	 */
	public Student()
	{
		;
	}
	public Student(String firstName, String lastName, char sex,
			short age, int height, int weight)
	{
		super();
		_firstName = firstName;
		_lastName = lastName;
		_sex = sex;
		_age = age;
		_height = height;
		_weight = weight;
	}
	public Long getId()
	{
		return _id;
	}
	public void setId(Long p_id)
	{
		this._id = p_id;
	}
	public String getFirstName()
	{
		return _firstName;
	}
	public void setFirstName(String p_firtName)
	{
		_firstName = p_firtName;
	}
	public String getLastName()
	{
		return _lastName;
	}
	public void setLastName(String p_lastName)
	{
		_lastName = p_lastName;
	}
	public char getSex()
	{
		return _sex;
	}
	public void setSex(char p_sex)
	{
		_sex = p_sex;
	}
	public short getAge()
	{
		return _age;
	}
	public void setAge(short i)
	{
		_age = i;
	}
	public int getHeight()
	{
		return _height;
	}
	public void setHeight(int p_height)
	{
		_height = p_height;
	}
	public int getWeight()
	{
		return _weight;
	}
	public void setWeight(int p_weight)
	{
		_weight = p_weight;
	}
	public Date getCreatedOn()
	{
		return _createdOn;
	}
	public void setCreatedOn(Date createdOn)
	{
		this._createdOn = createdOn;
	}
	public String getCreatedBy()
	{
		return _createdBy;
	}
	public void setCreatedBy(String createdBy)
	{
		this._createdBy = createdBy;
	}
	public Date getUpdatedOn()
	{
		return _updatedOn;
	}
	public void setUpdatedOn(Date updatedOn)
	{
		this._updatedOn = updatedOn;
	}
	public String getUpdatedBy()
	{
		return _updatedBy;
	}
	public void setUpdatedBy(String updatedBy)
	{
		this._updatedBy = updatedBy;
	}
	public Date getDeletedOn()
	{
		return _deletedOn;
	}
	public void setDeletedOn(Date deletedOn)
	{
		this._deletedOn = deletedOn;
	}
	public String getDeletedBy()
	{
		return _deletedBy;
	}
	public void setDeletedBy(String deletedBy)
	{
		this._deletedBy = deletedBy;
	}
	
	
}
