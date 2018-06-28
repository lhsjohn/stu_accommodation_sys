package cn.edu.hqu.stu_accommodation_sys.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.edu.hqu.stu_accommodation_sys.pojo.House;
import cn.edu.hqu.stu_accommodation_sys.pojo.Landlord;
import cn.edu.hqu.stu_accommodation_sys.service.HouseService;

@Controller
public class RentHouseController {
	
	@Autowired
	private HouseService houseService;
	

	@RequestMapping(value="landlord_rent_form",method=RequestMethod.GET)
	public String showRentHouseForm(Model model,HttpSession session) {
		model.addAttribute(new House());
	   Landlord landlord=(Landlord) session.getAttribute("landlordInfo");
	   model.addAttribute("landlordId", landlord.getLandlordId());
		return "landlord_rent_form";
	}
	
	
/*	@RequestMapping(value="landlord_rent_form",method=RequestMethod.POST)
	public String processRentHouseForm(@Valid House house,Errors errors,RedirectAttributes model) {
		System.out.println(house.toString());
		if(errors.hasErrors()) {
			return "landlord_rent_form";
		}else if(!houseService.houseHaveNotExisted(house)) {
			return "landlord_rent_form";
		}else {
			model.addFlashAttribute("houseInfo",house);
			return "redirect:/landlord-dashboard";
			//return "landlord-dashboard";
		}
		
	}*/
	@RequestMapping(value="/landlord_rent_form")
	@ResponseBody
	public String processRentHouseForm(@RequestBody House house,Errors errors,RedirectAttributes model
			,HttpSession session) {
		Landlord landlord=(Landlord) session.getAttribute("landlordInfo");
		Map <String,Object > jsonMap = new HashMap<String,Object>();
		if(houseService.houseHaveNotExisted(house,landlord)) {
			jsonMap.put("msg", "1");
		}else {
			jsonMap.put("msg", "0");
		}
	
		System.out.println("111111"+house.getHouseAddress());
		return com.alibaba.fastjson.JSONObject.toJSONString(jsonMap);
	}
	
	
	
	
	
	@RequestMapping(value="student_house_list1",method=RequestMethod.GET)
	public String getHouseList(Model model) {
		List<House>list=new ArrayList<House>();
		list=houseService.getHouseList();
		System.out.println(list);	
		model.addAttribute("houseList", list);
		return "student_house_list";
	}
	
	
	
	
}
