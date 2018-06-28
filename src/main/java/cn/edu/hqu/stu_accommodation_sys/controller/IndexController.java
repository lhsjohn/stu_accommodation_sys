package cn.edu.hqu.stu_accommodation_sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class IndexController {
      
	 @RequestMapping("/")
	  public String showIndexPage() {
		  return "index";
	  }
	 
	 @RequestMapping("/index-student")
     public String showStudentLogin() {
		 return "index-student";
	 }
	 
	 
	 
	 
	 
}
