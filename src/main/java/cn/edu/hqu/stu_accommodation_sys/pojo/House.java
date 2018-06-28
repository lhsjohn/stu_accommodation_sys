package cn.edu.hqu.stu_accommodation_sys.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class House implements Serializable {
    private String houseId;

    private String houseAddress;

    private String houseType;

    private Integer houseCapacity;

    private Double houseSquare;

    private Double houseCost;

    private String houseHostid;

    private String houseHostname;

    private String houseDesc;

    private String houseState;

    private static final long serialVersionUID = 1L;

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public Integer getHouseCapacity() {
        return houseCapacity;
    }

    public void setHouseCapacity(Integer houseCapacity) {
        this.houseCapacity = houseCapacity;
    }

    public Double getHouseSquare() {
        return houseSquare;
    }

    public void setHouseSquare(Double houseSquare) {
        this.houseSquare = houseSquare;
    }

    public Double getHouseCost() {
        return houseCost;
    }

    public void setHouseCost(Double houseCost) {
        this.houseCost = houseCost;
    }

    public String getHouseHostid() {
        return houseHostid;
    }

    public void setHouseHostid(String houseHostid) {
        this.houseHostid = houseHostid;
    }

    public String getHouseHostname() {
        return houseHostname;
    }

    public void setHouseHostname(String houseHostname) {
        this.houseHostname = houseHostname;
    }

    public String getHouseDesc() {
        return houseDesc;
    }

    public void setHouseDesc(String houseDesc) {
        this.houseDesc = houseDesc;
    }

    public String getHouseState() {
        return houseState;
    }

    public void setHouseState(String houseState) {
        this.houseState = houseState;
    }
}