package cn.edu.hqu.stu_accommodation_sys.service;

import cn.edu.hqu.stu_accommodation_sys.pojo.Landlord;

public interface LandlordService {
 
	public boolean registerLandlord(Landlord landlord);
	public Landlord landlordLogin(String landlordUsername,String landlordPassword);
	public void updateLandlord(Landlord landlord,String houseCost);
	public Landlord findLandlordByPrimaryKey(Landlord landlord);
	public Landlord findLandlordByUserName(String username);
	public Landlord getLandlordById(String landlordId);
	/*
	   select * from landlord where landlord_username=landlordUsername and landlord_password=landlordPassword;
	   
	 */
}
