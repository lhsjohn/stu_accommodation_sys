package cn.edu.hqu.stu_accommodation_sys.service;

import java.util.List;

import cn.edu.hqu.stu_accommodation_sys.pojo.Appointment;
import cn.edu.hqu.stu_accommodation_sys.pojo.House;
import cn.edu.hqu.stu_accommodation_sys.pojo.Student;


public interface AppointmentService {
	void insertStudentAppointment(Student student,House house);
	 List<Appointment> getStuAppointmentList(String stuName);
	 List<Appointment> getLandlordAppointment(String LandlordName);
	 void deleteStudentAppointment(String HouseId);
	 Appointment getAppointByAppId(String appId);
}
