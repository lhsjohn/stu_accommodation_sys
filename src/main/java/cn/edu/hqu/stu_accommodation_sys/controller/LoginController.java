package cn.edu.hqu.stu_accommodation_sys.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.edu.hqu.stu_accommodation_sys.pojo.Landlord;
import cn.edu.hqu.stu_accommodation_sys.pojo.Student;
import cn.edu.hqu.stu_accommodation_sys.service.LandlordService;
import cn.edu.hqu.stu_accommodation_sys.service.StudentService;

@Controller
public class LoginController {
   
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private LandlordService landlordService;
	
	@RequestMapping(value="/login-student",method=RequestMethod.GET)
	public String showStudentLogin(Model model) {
		model.addAttribute(new Student());
		return "login-student";
	}
	@RequestMapping(value="/login-student",method=RequestMethod.POST)
	public String checkStudentLogin(Student student,Errors erros,RedirectAttributes model) {
		Student student2=null;
		System.out.println(student.getStuUsername()+ " "+student.getStuPassword());
		if((student2=studentService.studentLogin(student.getStuUsername(), student.getStuPassword()))==null) {
		  return "login-student";
	} else {
		student2=studentService.findStudentByStuUserName(student.getStuUsername());
		model.addFlashAttribute("myInfo", student2);
		 return "redirect:/student-dashboard";
		//return "student-dashboard";
	}
}
		
   @RequestMapping(value="login-landlord",method=RequestMethod.GET)
	public String showLandlordLogin (Model model) {
	   Landlord land=new Landlord();
	   model.addAttribute("landlord", land);
		return "login-landlord";
	}
   @RequestMapping(value="login-landlord",method=RequestMethod.POST)
   public String checkLandlordLogin(Landlord landlord,Errors errors,RedirectAttributes model,HttpSession session) {
	   Landlord landlord2=null;
	  
	   System.out.println(landlord.getLandlordUsername()+"  "+landlord.getLandlordPassword());
	   if((landlord2=landlordService.landlordLogin(landlord.getLandlordUsername(),landlord.getLandlordPassword()))==null) {
		   return "login-landlord";
	   }else {
		   landlord2=landlordService.findLandlordByUserName(landlord.getLandlordUsername());
		   session.setAttribute("landlordInfo", landlord2);
		   model.addFlashAttribute("landlordInfo", landlord2);
		   return "redirect:/landlord-dashboard";
	   }
	   
	   
   }
	
   
		
		
	

	
	
}
