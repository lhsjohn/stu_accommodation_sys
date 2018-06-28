package cn.edu.hqu.stu_accommodation_sys.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hqu.stu_accommodation_sys.dao.AppointmentMapper;
import cn.edu.hqu.stu_accommodation_sys.pojo.Appointment;
import cn.edu.hqu.stu_accommodation_sys.pojo.AppointmentExample;
import cn.edu.hqu.stu_accommodation_sys.pojo.AppointmentExample.Criteria;
import cn.edu.hqu.stu_accommodation_sys.pojo.House;
import cn.edu.hqu.stu_accommodation_sys.pojo.Student;
import cn.edu.hqu.stu_accommodation_sys.service.AppointmentService;
@Service
public class AppointmentServiceImpl implements AppointmentService {
    
	@Autowired
	private AppointmentMapper appointmentMapper;

	@Override
	public void insertStudentAppointment(Student student, House house) {
	   Appointment appointment=new Appointment();
	   appointment.setAppHouseAddress(house.getHouseAddress());
	   appointment.setAppHouseCapacity(house.getHouseCapacity());
	   appointment.setAppHouseCost(house.getHouseCost());
	   appointment.setAppHouseDesc(house.getHouseDesc());
	   appointment.setAppHouseHostname(house.getHouseHostname());
	   appointment.setAppHouseType(house.getHouseType());
	   appointment.setAppLandlordName(house.getHouseHostname());
	   appointment.setAppStuName(student.getStuUsername());
	   appointment.setAppStuId(student.getStuId());
	   appointment.setAppHouseId(house.getHouseId());
	   appointment.setAppLandlordId(house.getHouseHostid());
	   String uuid=UUID.randomUUID().toString().replace("-", "");
	   appointment.setAppId(uuid);
	   appointmentMapper.insert(appointment);
	
	}

	@Override
	public List<Appointment> getStuAppointmentList(String stuName) {
		AppointmentExample example=new AppointmentExample();
		Criteria criteria=example.createCriteria();
		criteria.andAppStuNameEqualTo(stuName);
		List<Appointment>list=appointmentMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<Appointment> getLandlordAppointment(String LandlordName) {
		AppointmentExample example=new AppointmentExample();
		Criteria criteria=example.createCriteria();
		criteria.andAppLandlordNameEqualTo(LandlordName);
		List<Appointment>list=new ArrayList<Appointment>();
		list=appointmentMapper.selectByExample(example);
		return list;
	}

	@Override
	public void deleteStudentAppointment(String HouseId) {
		AppointmentExample example=new AppointmentExample();
		Criteria criteria=example.createCriteria();
        criteria.andAppHouseIdEqualTo(HouseId);
        appointmentMapper.deleteByExample(example);

	}

	@Override
	public Appointment getAppointByAppId(String appId) {
		return appointmentMapper.selectByPrimaryKey(appId);
	}
	
	
	
}
