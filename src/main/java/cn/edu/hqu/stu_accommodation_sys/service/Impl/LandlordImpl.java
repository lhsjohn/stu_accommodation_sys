package cn.edu.hqu.stu_accommodation_sys.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hqu.stu_accommodation_sys.dao.LandlordMapper;
import cn.edu.hqu.stu_accommodation_sys.pojo.Landlord;
import cn.edu.hqu.stu_accommodation_sys.pojo.LandlordExample;
import cn.edu.hqu.stu_accommodation_sys.pojo.LandlordExample.Criteria;
import cn.edu.hqu.stu_accommodation_sys.service.LandlordService;

@Service
public class LandlordImpl implements LandlordService {
	
	@Autowired
	private LandlordMapper landlordMapper;

	@Override
	public boolean registerLandlord(Landlord landlord) {
       LandlordExample example=new LandlordExample();
       Criteria criteria=example.createCriteria();
       criteria.andLandlordUsernameEqualTo(landlord.getLandlordUsername());
       List<Landlord> list=new ArrayList<Landlord>();
       list=landlordMapper.selectByExample(example);
       if(list.isEmpty()) {
    	  String id= UUID.randomUUID().toString().replace("-", "");
    	  landlord.setLandlordId(id);
    	  landlord.setLandlordAccount(1200.00);
    	  landlord.setLandlordPassword(DigestUtils.md5Hex(landlord.getLandlordPassword()));
    	   landlordMapper.insert(landlord);
    	   return true;
       }
		return false;
	}

/*	@Override
	public Landlord landlordLogin(String landlordUsername, String landlordPassword) {
		LandlordExample example=new LandlordExample();
		Criteria criteria=example.createCriteria();
		criteria.andLandlordUsernameEqualTo(landlordUsername);
		List<Landlord> list=new ArrayList<Landlord>();
		list=landlordMapper.selectByExample(example);
		Landlord landlord=null;
		if(!list.isEmpty()) {
		     landlord=list.get(0);
		}
		if(landlord!=null&&landlord.getLandlordPassword().equals(landlordPassword)) {
			return landlord;
		}
		
		return null;
	}*/

	@Override
	public void updateLandlord(Landlord landlord, String houseCost) {
	  Double cost= Double.parseDouble(houseCost);
	  String landlordId=landlord.getLandlordId();
	  landlord.setLandlordAccount(landlord.getLandlordAccount()-cost);
	  landlordMapper.updateByPrimaryKey(landlord);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Landlord landlordLogin(String landlordUsername, String landlordPassword) {
	    LandlordExample example=new LandlordExample();
	    Criteria criteria=example.createCriteria();
	    criteria.andLandlordUsernameEqualTo(landlordUsername);
	    criteria.andLandlordPasswordEqualTo(landlordPassword);
	    List<Landlord> list=new ArrayList<Landlord>();
	    list= landlordMapper.selectByExample(example);
	    
	    if(!list.isEmpty()) {
	       return list.get(0);
	    }
		return null;
	}

	@Override
	public Landlord findLandlordByPrimaryKey(Landlord landlord) {
		return landlordMapper.selectByPrimaryKey(landlord.getLandlordId());
	}

	@Override
	public Landlord findLandlordByUserName(String username) {
     LandlordExample example=new LandlordExample();
     Criteria criteria=example.createCriteria();
     List<Landlord>list=new ArrayList<Landlord>();
     criteria.andLandlordUsernameEqualTo(username);
	 list=landlordMapper.selectByExample(example);	
     
     if(!list.isEmpty()) {
    	 return list.get(0);
     }

		return null;
	}

	@Override
	public Landlord getLandlordById(String landlordId) {
		return landlordMapper.selectByPrimaryKey(landlordId);
	}



}
