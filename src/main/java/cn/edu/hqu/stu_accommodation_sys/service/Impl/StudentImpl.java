package cn.edu.hqu.stu_accommodation_sys.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hqu.stu_accommodation_sys.dao.StudentMapper;
import cn.edu.hqu.stu_accommodation_sys.pojo.Student;
import cn.edu.hqu.stu_accommodation_sys.pojo.StudentExample;
import cn.edu.hqu.stu_accommodation_sys.pojo.StudentExample.Criteria;
import cn.edu.hqu.stu_accommodation_sys.service.StudentService;

@Service
public class StudentImpl implements StudentService {
	
	@Autowired
	private StudentMapper studentMapper;

	
	@Override
	public boolean registerStudent(Student student) {
		System.out.println("service "+ student.toString());
		StudentExample example=new StudentExample();
		Criteria criteria=example.createCriteria();
		criteria.andStuUsernameEqualTo(student.getStuUsername());
		List<Student> list=new ArrayList<Student>();
		list= studentMapper.selectByExample(example);
		System.out.println(list);
		if(list.isEmpty()) {
			String uuid=UUID.randomUUID().toString().replace("-", "");
			student.setStuId(uuid);
			studentMapper.insert(student);
			return true;
		}
		/*System.out.println(list.get(0).toString());*/
	// studentMapper.insert(list.get(1));
		  return false;
	}
	
	

	
	@Override
	public Student getStudentInfomation(String stuName) {
		// TODO Auto-generated method stub
		
		StudentExample example=new StudentExample();
		Criteria criteria=example.createCriteria();
		criteria.andStuUsernameEqualTo(stuName);
		return (Student)studentMapper.selectByExample(example);
	}




	 @Override
	public Student testFindStudentByExample(StudentExample example) {
		// TODO Auto-generated method stub
	   List<Student>list=new ArrayList<Student>();
	   list=studentMapper.selectByExample(example);
	   return list.get(0);
	}




	@Override
	public void testInsertStudent(Student student) {
	    studentMapper.insert(student);
	}





	@Override
	public Student studentLogin(String stuUsername, String stuPassword) {
	  StudentExample example=new StudentExample();
	  Criteria criteria=example.createCriteria();
	  criteria.andStuUsernameEqualTo(stuUsername);
	  Student student = null;
	  List<Student> list = studentMapper.selectByExample(example);
	  if(!list.isEmpty())
		 student=list.get(0);
	  if(student!=null&&student.getStuPassword().equals(stuPassword)) {
		  return student;
	  }
	
		return null;
	}




	@Override
	public Student findStudentByStuUserName(String stuUserName) {
		// TODO Auto-generated method stub
		StudentExample example=new StudentExample();
		Criteria criteria=example.createCriteria();
		criteria.andStuUsernameEqualTo(stuUserName);
		 List<Student> list = studentMapper.selectByExample(example);
		 Student student=null;
		  if(!list.isEmpty())
			 student=list.get(0);
		
		  return student;
	}




	@Override
	public Student getStudentByPrimaryKey(String primaryKey) {
		return studentMapper.selectByPrimaryKey(primaryKey);
	}




}
