package cn.edu.hqu.stu_accommodation_sys.controller;

import javax.validation.Valid;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.edu.hqu.stu_accommodation_sys.pojo.Landlord;
import cn.edu.hqu.stu_accommodation_sys.pojo.Student;
import cn.edu.hqu.stu_accommodation_sys.pojo.StudentExample;
import cn.edu.hqu.stu_accommodation_sys.pojo.StudentExample.Criteria;
import cn.edu.hqu.stu_accommodation_sys.service.LandlordService;
import cn.edu.hqu.stu_accommodation_sys.service.StudentService;

@Controller
public class RegisterController {

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private LandlordService landlordService;
	

	@RequestMapping(value="/register-student",method=RequestMethod.GET)
	public String showStudentRegisterForm(Model model) {
		model.addAttribute(new Student());
		return "register-student";	
	}

	
	@RequestMapping(value="/register-student",method=RequestMethod.POST)
	public String processRegister(@Valid Student student,BindingResult result,RedirectAttributes model) {
		   if(result.hasErrors()) {
			   //System.out.println(123);
			   //return "register-student";
			   return "register-student";
		   }
		   else if(!studentService.registerStudent(student)) {
			 /*  errors.rejectValue("stuName", "该用户已经存在");*/
			   System.out.println(123);
			   System.out.println(student.toString());
			   return "register-student";
		   }
		   else {
			   model.addFlashAttribute("myInfo", student);
			   return "redirect:/student-dashboard";
			   //return "student-dashboard";
		   }
	}
	
	@RequestMapping(value="register-landlord",method=RequestMethod.GET)
	public String showLandlordRegisterForm(Model model) {
		model.addAttribute(new Landlord());
		return "register-landlord";
	}
	
	@RequestMapping(value="register-landlord",method=RequestMethod.POST)
	public String processLandlordRegsiter(@Validated Landlord landlord,Errors errors,RedirectAttributes model) {
		if(errors.hasErrors()) {
		  System.out.println("出现了错误"+landlord.toString());
			return "register-landlord";
		}else if(!landlordService.registerLandlord(landlord)) {
			model.addAttribute("message","用户名已存在");
			System.out.println(landlord.toString());
			return "register-landlord";
		}else {
			model.addFlashAttribute("landlordInfo",landlord);
			return "redirect:/landlord-dashboard";
			//return "landlord-dashboard";
		}
		
		
		
		
		
		
	}
	
	
	
}
