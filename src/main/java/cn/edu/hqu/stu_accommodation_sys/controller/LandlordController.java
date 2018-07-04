package cn.edu.hqu.stu_accommodation_sys.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.alibaba.fastjson.JSONObject;

import cn.edu.hqu.stu_accommodation_sys.pojo.Appointment;
import cn.edu.hqu.stu_accommodation_sys.pojo.House;
import cn.edu.hqu.stu_accommodation_sys.pojo.Landlord;
import cn.edu.hqu.stu_accommodation_sys.service.AppointmentService;
import cn.edu.hqu.stu_accommodation_sys.service.HouseService;
import cn.edu.hqu.stu_accommodation_sys.service.LandlordService;

@Controller
public class LandlordController {
    
	
	@Autowired
	private LandlordService landlordService;
	@Autowired
	private AppointmentService appointmentService;
	@Autowired
	private HouseService houseService;
	
	@RequestMapping(value="/landlord-dashboard",method=RequestMethod.GET)
	public String getLandlordDashboard(@ModelAttribute("landlordInfo")Landlord landlord,
		RedirectAttributes model,HttpSession session) {
	  
	  model.addFlashAttribute("landlordInfo",landlord);
	  session.setAttribute("landLord",landlord);
		return "landlord-dashboard";	
	}
	
	@RequestMapping(value="landlord-dashboard/{houseCost}")
	public String decreaseLandlordAccount(HttpSession session,Model model,@PathVariable String houseCost) {
		Landlord landlord=(Landlord) session.getAttribute("landLord");
		landlordService.updateLandlord(landlord, houseCost);
		model.addAttribute("landlordInfo", landlord);
		return "landlord-dashboard";
	}
	
	@RequestMapping(value="/after_edit_dashboard")
	public String showAfterEditLandlordDashboard(HttpSession session,Model model) {
		Landlord landlord=(Landlord) session.getAttribute("landlordInfo");
	
		model.addAttribute("landlordInfo", landlord);
	    return "landlord-dashboard";
	
	}
	
	
	
	@RequestMapping(value="/landlord-appointment-info",method=RequestMethod.GET)
	public String showlandlordAppointmentInfoList(Model model,HttpSession session) {
		List<Appointment> list=new ArrayList<Appointment>();
		Landlord landlord=new Landlord();
		landlord=(Landlord) session.getAttribute("landlordInfo");
		list=appointmentService.getLandlordAppointment(landlord.getLandlordId());
		session.setAttribute("landlordInfo", landlord);
		model.addAttribute("appointmentList",list);
		return "landlord_appointment_info";	
	}
	
	@RequestMapping(value="/landlord-rent-info",method=RequestMethod.GET)
	public String showMyRentHouse(Model model,HttpSession session) {
		Landlord landlord=new Landlord();
		landlord=(Landlord) session.getAttribute("landLord");
		List<House> list=new ArrayList<House>();
     	//list=houseService.getHouseByLandlordUsername(landlord.getLandlordEmail(););
		list=houseService.getHouseByLandlordId(landlord.getLandlordId());
     	model.addAttribute("rentHouseInfo",list);
     	return "landlord_rent_info";
	}

	@RequestMapping(value="landlord-edit-form/{houseId}",method=RequestMethod.GET)
	 public String showLandlordEditForm(Model model,HttpSession session,@PathVariable String houseId) {
		
		House house=houseService.getHouseById(houseId);
		
		model.addAttribute("house",house);
		
		return "landlord_edit_form";
		
	}
	
	@RequestMapping(value="landlord-delete/{houseId}",method=RequestMethod.GET)
	public String deleteLandlordHouse(Model model,HttpSession session,@PathVariable String houseId) {
		
		Landlord landlord=(Landlord) session.getAttribute("landlordInfo");
		
		
		model.addAttribute("landlordInfo", landlord);
		
		houseService.deleteHouseByHouseId(houseId);
	    return "landlord-dashboard";
		
	}
	
	
	
	@RequestMapping(value="/landlord-update-house")
	@ResponseBody
	public String processUpdateHouseInfo(@RequestBody House house,HttpSession session) {
		Landlord landlord=(Landlord) session.getAttribute("landlordInfo");
		Map <String,Object > jsonMap = new HashMap<String,Object>();
		System.out.println("test house:"+house.toString());
		if(houseService.updateHouseInfo(house, landlord)) {
			jsonMap.put("msg", "1");
		}else {
			jsonMap.put("msg", "0");
		}
		return com.alibaba.fastjson.JSONObject.toJSONString(jsonMap);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
