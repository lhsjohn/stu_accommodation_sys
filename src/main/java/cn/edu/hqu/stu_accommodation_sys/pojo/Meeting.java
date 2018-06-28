package cn.edu.hqu.stu_accommodation_sys.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Meeting implements Serializable {
    private String meetId;

    private String meetStuId;

    private String meetStuName;

    private String meetLandlordName;

    private String meetHouseId;

    private String meetLandlordId;

    private String meetHouseType;

    private String meetHouseHostname;

    private String meetTime;

    private String meetPlace;

    private Double meetHousePrice;

    private static final long serialVersionUID = 1L;

    public String getMeetId() {
        return meetId;
    }

    public void setMeetId(String meetId) {
        this.meetId = meetId;
    }

    public String getMeetStuId() {
        return meetStuId;
    }

    public void setMeetStuId(String meetStuId) {
        this.meetStuId = meetStuId;
    }

    public String getMeetStuName() {
        return meetStuName;
    }

    public void setMeetStuName(String meetStuName) {
        this.meetStuName = meetStuName;
    }

    public String getMeetLandlordName() {
        return meetLandlordName;
    }

    public void setMeetLandlordName(String meetLandlordName) {
        this.meetLandlordName = meetLandlordName;
    }

    public String getMeetHouseId() {
        return meetHouseId;
    }

    public void setMeetHouseId(String meetHouseId) {
        this.meetHouseId = meetHouseId;
    }

    public String getMeetLandlordId() {
        return meetLandlordId;
    }

    public void setMeetLandlordId(String meetLandlordId) {
        this.meetLandlordId = meetLandlordId;
    }

    public String getMeetHouseType() {
        return meetHouseType;
    }

    public void setMeetHouseType(String meetHouseType) {
        this.meetHouseType = meetHouseType;
    }

    public String getMeetHouseHostname() {
        return meetHouseHostname;
    }

    public void setMeetHouseHostname(String meetHouseHostname) {
        this.meetHouseHostname = meetHouseHostname;
    }

    public String getMeetTime() {
        return meetTime;
    }

    public void setMeetTime(String meetTime) {
        this.meetTime = meetTime;
    }

    public String getMeetPlace() {
        return meetPlace;
    }

    public void setMeetPlace(String meetPlace) {
        this.meetPlace = meetPlace;
    }

    public Double getMeetHousePrice() {
        return meetHousePrice;
    }

    public void setMeetHousePrice(Double meetHousePrice) {
        this.meetHousePrice = meetHousePrice;
    }
}