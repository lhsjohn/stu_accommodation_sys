package cn.edu.hqu.stu_accommodation_sys.service;

import cn.edu.hqu.stu_accommodation_sys.pojo.Student;
import cn.edu.hqu.stu_accommodation_sys.pojo.StudentExample;

public interface StudentService {

	 public boolean registerStudent(Student student);
	 public Student getStudentInfomation(String stuName);
	 public Student testFindStudentByExample(StudentExample example);
	 public Student studentLogin(String stuUsername,String stuPassword);
	 public void testInsertStudent(Student student);
	 public Student getStudentByPrimaryKey(String primaryKey);
	 public Student findStudentByStuUserName(String stuUserName);
}
