package cn.edu.hqu.stu_accommodation_sys.service;

import java.util.List;

import cn.edu.hqu.stu_accommodation_sys.pojo.House;
import cn.edu.hqu.stu_accommodation_sys.pojo.Landlord;

public interface HouseService {
	boolean houseHaveNotExisted(House house,Landlord landlord);
    List<House> getHouseList();
    House getHouseById(String houseId);
    List<House> getHouseByLandlordUsername(String landlordUsername);
	List<House> getHouseByLandlordId(String landlordId);
	boolean updateHouseInfo(House house,Landlord landlord);
	int deleteHouseByHouseId(String houseId);
	
	
	
	
}
