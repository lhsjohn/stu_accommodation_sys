package cn.edu.hqu.stu_accommodation_sys.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hqu.stu_accommodation_sys.dao.HouseMapper;
import cn.edu.hqu.stu_accommodation_sys.pojo.House;
import cn.edu.hqu.stu_accommodation_sys.pojo.HouseExample;
import cn.edu.hqu.stu_accommodation_sys.pojo.HouseExample.Criteria;
import cn.edu.hqu.stu_accommodation_sys.pojo.Landlord;
import cn.edu.hqu.stu_accommodation_sys.service.HouseService;
@Service
public class HouseServiceImpl implements HouseService {

	@Autowired
	private HouseMapper houseMapper;

	@Override
	public boolean houseHaveNotExisted(House house,Landlord landlord) {
		HouseExample example=new HouseExample();
		Criteria criteria=example.createCriteria();
		criteria.andHouseAddressEqualTo(house.getHouseAddress());
		criteria.andHouseHostnameEqualTo(house.getHouseHostname());
		//criteria.andHouseDescEqualTo(house.getHouseDesc());
		List<House> list=new ArrayList<House>();
        list=houseMapper.selectByExample(example);
        if(list.isEmpty()) {
        	String houseId=UUID.randomUUID().toString().replace("-","");
        	house.setHouseId(houseId);
        	house.setHouseHostid(landlord.getLandlordId());
        	houseMapper.insert(house);
        	return true;
        }
        return false;

	}

	@Override
	public List<House> getHouseList() {
	   List<House> list=new ArrayList<House>();
	   list=houseMapper.selectByExample(null);
		return list;
	}

	@Override
	public House getHouseById(String houseId) {
		
		HouseExample example=new HouseExample();
		Criteria criteria=example.createCriteria();
		criteria.andHouseIdEqualTo(houseId);
		List<House>list=new ArrayList<House>();
		list=houseMapper.selectByExample(example);
		return list.get(0);
	}
	
	
	

	@Override
	public List<House> getHouseByLandlordUsername(String landlordUsername) {
		HouseExample example=new HouseExample();
		Criteria criteria=example.createCriteria();
		criteria.andHouseHostnameEqualTo(landlordUsername);
		List<House>list=new ArrayList<House>();
		list=houseMapper.selectByExample(example);
		return list;
		
	}

	@Override
	public List<House> getHouseByLandlordId(String landlordId) {
      HouseExample example=new HouseExample();
      Criteria criteria=example.createCriteria();
      criteria.andHouseHostidEqualTo(landlordId);
      List<House>list=new ArrayList<House>();
		list=houseMapper.selectByExample(example);
		return list;
	}

	@Override
	public boolean updateHouseInfo(House house, Landlord landlord) {
		house.setHouseHostid(landlord.getLandlordId());
		house.setHouseHostname(landlord.getLandlordName());
		HouseExample example=new HouseExample();
		Criteria criteria=example.createCriteria();
		criteria.andHouseIdEqualTo(house.getHouseId());
		int result=houseMapper.updateByExample(house, example);
		
		if(result==0) {
			return false;
		}
		return true;
	
	}

	@Override
	public int deleteHouseByHouseId(String houseId) {
		   HouseExample example=new HouseExample();
		    Criteria criteria=example.createCriteria();
		    criteria.andHouseIdEqualTo(houseId);
		  return  houseMapper.deleteByExample(example);
		
	}
	
	
	
	
	
	
}
