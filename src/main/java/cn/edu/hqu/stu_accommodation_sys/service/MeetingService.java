package cn.edu.hqu.stu_accommodation_sys.service;

import java.util.List;

import cn.edu.hqu.stu_accommodation_sys.pojo.House;
import cn.edu.hqu.stu_accommodation_sys.pojo.Landlord;
import cn.edu.hqu.stu_accommodation_sys.pojo.Meeting;
import cn.edu.hqu.stu_accommodation_sys.pojo.Student;

public interface MeetingService {

	int insertMeetingInfo(Student student,Landlord landlord,House house);
	List<Meeting> selectMeetingListByLandlordId(String landlordId);
	List<Meeting> selectMeetingListByStudentName(String studentName);
}
