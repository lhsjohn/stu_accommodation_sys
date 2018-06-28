package cn.edu.hqu.stu_accommodation_sys.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.edu.hqu.stu_accommodation_sys.pojo.Appointment;
import cn.edu.hqu.stu_accommodation_sys.pojo.House;
import cn.edu.hqu.stu_accommodation_sys.pojo.Student;
import cn.edu.hqu.stu_accommodation_sys.service.AppointmentService;
import cn.edu.hqu.stu_accommodation_sys.service.HouseService;
import cn.edu.hqu.stu_accommodation_sys.service.StudentService;

@Controller
public class StudentController {

  @Autowired
  private StudentService studentService;
  @Autowired
  private HouseService houseService;
  @Autowired
  private AppointmentService appointmentService;
  @RequestMapping(value="/student-dashboard",method=RequestMethod.GET)
  public String getStudentDashBorad(@ModelAttribute("myInfo")Student student,RedirectAttributes model,HttpSession session) {
        System.out.println("student-dashboard"+student.toString());
        model.addFlashAttribute("myInfo",student);
        session.setAttribute("Student", student);
        return "student-dashboard";      
  }

  @RequestMapping(value="student-appointment/{houseId}")
  public String studentMakeAppoint(HttpSession session,Model model,@PathVariable String houseId) {
	  System.out.println("ajax testing..."+houseId);
	  model.addAttribute("houseId",houseId);
	  House house=houseService.getHouseById(houseId);
	  Student stu=(Student) session.getAttribute("Student");
	  house.setHouseId(houseId);
	  model.addAttribute("myInfo",stu);
      appointmentService.insertStudentAppointment(stu, house);
      //session.setAttribute("Student", stu);
	  return "student-dashboard";
  }
  
  @RequestMapping(value="student-delete-appointment/{houseId}")
  public String studentDeleteAppointment(HttpSession session,Model model,@PathVariable String houseId) {
	  model.addAttribute("houseId",houseId);
	  Student stu=(Student) session.getAttribute("Student");
	  model.addAttribute("myInfo",stu);
	  appointmentService.deleteStudentAppointment(houseId);
	  return "student-dashboard";
  }
  
  
  @RequestMapping(value="/student_appointment",method=RequestMethod.GET)
  public String showStudentAppointment(HttpSession session,Model model,Map<String,Object> map,
		  @RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn) {
	  Student stu=(Student) session.getAttribute("Student");
	  //引入分页查询，使用PageHelper分页功能  
	    //在查询之前传入当前页，然后多少记录  
	    PageHelper.startPage(pn,3);  
	    //startPage后紧跟的这个查询就是分页查询  
	  List<Appointment>list= appointmentService.getStuAppointmentList(stu.getStuUsername());
	  PageInfo pageInfo=new PageInfo(list,3);
	  model.addAttribute("appointmentList",list);
	   map.put("pageInfo",pageInfo);  
	  System.out.println(list.toString());
	  return "student_appointment_info";
  }
  
  
  @RequestMapping(value="/studentInfo",method=RequestMethod.GET)
  public String showStudentInfo(Model model,HttpSession session) {
	  Student stu=(Student) session.getAttribute("Student");
	  model.addAttribute("stu",stu);
	 // model.addAttribute("myInfo", student);
	  return "studentInfo";
  }
  
	@RequestMapping("/student_house_list")  
	public String list(@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn,  
	                   Map<String,Object> map,Model model){    
	    //引入分页查询，使用PageHelper分页功能  
	    //在查询之前传入当前页，然后多少记录  
	    PageHelper.startPage(pn,3);  
	    //startPage后紧跟的这个查询就是分页查询  
	    List<House> emps = houseService.getHouseList();
	    //使用PageInfo包装查询结果，只需要将pageInfo交给页面就可以  
	    PageInfo pageInfo = new PageInfo(emps,3);  
	    //pageINfo封装了分页的详细信息，也可以指定连续显示的页数  
	    model.addAttribute("houseList", emps);
	    map.put("pageInfo",pageInfo);  
	    return "student_house_list";  
	}  
	@RequestMapping ("/student_return_dashboard")
	public String studentReturnDashboard(HttpSession session,Model model) {
		Student student=(Student) session.getAttribute("Student");
	    model.addAttribute("myInfo", student);
	    return "student-dashboard";
	}
	
	
}
