package cn.edu.hqu.stu_accommodation_sys.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.edu.hqu.stu_accommodation_sys.pojo.House;
import cn.edu.hqu.stu_accommodation_sys.service.HouseService;
@Controller
public class PageController {
     @Autowired
	private HouseService houseService;
	@RequestMapping("/student_house_list54")  
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
}
