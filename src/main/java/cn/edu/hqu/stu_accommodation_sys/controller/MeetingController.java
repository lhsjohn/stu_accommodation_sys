package cn.edu.hqu.stu_accommodation_sys.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.edu.hqu.stu_accommodation_sys.pojo.Appointment;
import cn.edu.hqu.stu_accommodation_sys.pojo.House;
import cn.edu.hqu.stu_accommodation_sys.pojo.Landlord;
import cn.edu.hqu.stu_accommodation_sys.pojo.Meeting;
import cn.edu.hqu.stu_accommodation_sys.pojo.Student;
import cn.edu.hqu.stu_accommodation_sys.service.AppointmentService;
import cn.edu.hqu.stu_accommodation_sys.service.HouseService;
import cn.edu.hqu.stu_accommodation_sys.service.LandlordService;
import cn.edu.hqu.stu_accommodation_sys.service.MeetingService;
import cn.edu.hqu.stu_accommodation_sys.service.StudentService;

@Controller
public class MeetingController {
	
	@Autowired
	private AppointmentService appointService;	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private MeetingService meetingService;
	
	@Autowired
	private LandlordService landlordService;
	
	@Autowired
	private HouseService houseService;
	
	
	@RequestMapping(value="meeting/{appId}")
	public String showMeetingInfo(@PathVariable String appId,Model model,HttpSession session) {
		Appointment appointment=appointService.getAppointByAppId(appId);
		Student student=studentService.getStudentByPrimaryKey(appointment.getAppStuId());
		System.out.println("aaaaaaaaaaa"+student.toString());
		Landlord landlord=landlordService.getLandlordById(appointment.getAppLandlordId());
		House house=houseService.getHouseById(appointment.getAppHouseId());
		meetingService.insertMeetingInfo(student, landlord, house);
		model.addAttribute("landlordInfo",landlord);
		return "landlord-dashboard";
	}
	
	
	@RequestMapping(value="/landlord-meeting-list",method=RequestMethod.GET)
	public String showLandlordMeetingList(Model model,HttpSession session) {
		Landlord landlord=(Landlord) session.getAttribute("landLord");
		
		List<Meeting> list=meetingService.selectMeetingListByLandlordId(landlord.getLandlordId());
		
		model.addAttribute("meetingList",list);
		return "landlord-meeting-list";

	}
	@RequestMapping(value="/student-meeting-list",method=RequestMethod.GET)
	public String showStudentMeetingList(Model model,HttpSession session,
		 @RequestParam(required=false,defaultValue="1",value="pn")Integer pn) {
		Student student=(Student) session.getAttribute("Student");
		 //引入分页查询，使用PageHelper分页功能  
	    //在查询之前传入当前页，然后多少记录  
	    PageHelper.startPage(pn,3);  
	    //startPage后紧跟的这个查询就是分页查询  
		List<Meeting> list=meetingService.selectMeetingListByStudentName(student.getStuUsername());
		PageInfo pageInfo=new PageInfo(list,3);
		model.addAttribute("pageInfo",pageInfo);
		model.addAttribute("meetingList",list);
		return "student-meeting-list";
	}
	
	
	
	

}
