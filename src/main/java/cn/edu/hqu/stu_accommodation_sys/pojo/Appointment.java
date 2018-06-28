package cn.edu.hqu.stu_accommodation_sys.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Appointment implements Serializable {
    private String appId;

    private String appStuId;

    private String appLandlordId;

    private String appStuName;

    private String appLandlordName;

    private String appHouseId;

    private String appHouseAddress;

    private String appHouseType;

    private Integer appHouseCapacity;

    private String appHouseHostname;

    private Double appHouseCost;

    private String appHouseDesc;

    private Double appHouseSquare;

    private Date appDate;

    private static final long serialVersionUID = 1L;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppStuId() {
        return appStuId;
    }

    public void setAppStuId(String appStuId) {
        this.appStuId = appStuId;
    }

    public String getAppLandlordId() {
        return appLandlordId;
    }

    public void setAppLandlordId(String appLandlordId) {
        this.appLandlordId = appLandlordId;
    }

    public String getAppStuName() {
        return appStuName;
    }

    public void setAppStuName(String appStuName) {
        this.appStuName = appStuName;
    }

    public String getAppLandlordName() {
        return appLandlordName;
    }

    public void setAppLandlordName(String appLandlordName) {
        this.appLandlordName = appLandlordName;
    }

    public String getAppHouseId() {
        return appHouseId;
    }

    public void setAppHouseId(String appHouseId) {
        this.appHouseId = appHouseId;
    }

    public String getAppHouseAddress() {
        return appHouseAddress;
    }

    public void setAppHouseAddress(String appHouseAddress) {
        this.appHouseAddress = appHouseAddress;
    }

    public String getAppHouseType() {
        return appHouseType;
    }

    public void setAppHouseType(String appHouseType) {
        this.appHouseType = appHouseType;
    }

    public Integer getAppHouseCapacity() {
        return appHouseCapacity;
    }

    public void setAppHouseCapacity(Integer appHouseCapacity) {
        this.appHouseCapacity = appHouseCapacity;
    }

    public String getAppHouseHostname() {
        return appHouseHostname;
    }

    public void setAppHouseHostname(String appHouseHostname) {
        this.appHouseHostname = appHouseHostname;
    }

    public Double getAppHouseCost() {
        return appHouseCost;
    }

    public void setAppHouseCost(Double appHouseCost) {
        this.appHouseCost = appHouseCost;
    }

    public String getAppHouseDesc() {
        return appHouseDesc;
    }

    public void setAppHouseDesc(String appHouseDesc) {
        this.appHouseDesc = appHouseDesc;
    }

    public Double getAppHouseSquare() {
        return appHouseSquare;
    }

    public void setAppHouseSquare(Double appHouseSquare) {
        this.appHouseSquare = appHouseSquare;
    }

    public Date getAppDate() {
        return appDate;
    }

    public void setAppDate(Date appDate) {
        this.appDate = appDate;
    }
}