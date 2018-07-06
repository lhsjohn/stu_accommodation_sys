package cn.edu.hqu.stu_accommodation_sys.service.Impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hqu.stu_accommodation_sys.dao.MeetingMapper;
import cn.edu.hqu.stu_accommodation_sys.pojo.House;
import cn.edu.hqu.stu_accommodation_sys.pojo.Landlord;
import cn.edu.hqu.stu_accommodation_sys.pojo.Meeting;
import cn.edu.hqu.stu_accommodation_sys.pojo.MeetingExample;
import cn.edu.hqu.stu_accommodation_sys.pojo.MeetingExample.Criteria;
import cn.edu.hqu.stu_accommodation_sys.pojo.Student;
import cn.edu.hqu.stu_accommodation_sys.service.MeetingService;

@Service
public class MeetingServiceImpl implements MeetingService {
    
	
	@Autowired
	private MeetingMapper meetingMapper;

	@Override
	public int insertMeetingInfo(Student student, Landlord landlord, House house) {
		Meeting meeting=new Meeting();
		meeting.setMeetHouseHostname(landlord.getLandlordName());
		meeting.setMeetHouseType(house.getHouseType());
		
		meeting.setMeetHousePrice(house.getHouseCost());
		meeting.setMeetStuName(student.getStuUsername());
		meeting.setMeetPlace("会面点1111");
		meeting.setMeetLandlordId(landlord.getLandlordId());
		meeting.setMeetTime(new Date().toString());
        String meetId=UUID.randomUUID().toString().replace("-", "");
        meeting.setMeetId(meetId);
		return meetingMapper.insert(meeting);
		
	
	}

	@Override
	public List<Meeting> selectMeetingListByLandlordId(String landlordId) {
		List<Meeting> list=new ArrayList<Meeting>();
		MeetingExample example=new MeetingExample();
		Criteria criteria=example.createCriteria();
		criteria.andMeetLandlordIdEqualTo(landlordId);
		list=meetingMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<Meeting> selectMeetingListByStudentName(String studentName) {
      List<Meeting> list=new ArrayList<Meeting>();
      MeetingExample example=new MeetingExample();
      Criteria criteria=example.createCriteria();
      criteria.andMeetStuNameEqualTo(studentName);
	list=meetingMapper.selectByExample(example);	
		return list;
	}
	
	
	
	
	
	
	
}
