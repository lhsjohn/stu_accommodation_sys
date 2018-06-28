package cn.edu.hqu.stu_accommodation_sys.dao;

import cn.edu.hqu.stu_accommodation_sys.pojo.Landlord;
import cn.edu.hqu.stu_accommodation_sys.pojo.LandlordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LandlordMapper {
    long countByExample(LandlordExample example);

    int deleteByExample(LandlordExample example);

    int deleteByPrimaryKey(String landlordId);

    int insert(Landlord record);

    int insertSelective(Landlord record);

    List<Landlord> selectByExample(LandlordExample example);

    Landlord selectByPrimaryKey(String landlordId);

    int updateByExampleSelective(@Param("record") Landlord record, @Param("example") LandlordExample example);

    int updateByExample(@Param("record") Landlord record, @Param("example") LandlordExample example);

    int updateByPrimaryKeySelective(Landlord record);

    int updateByPrimaryKey(Landlord record);
}