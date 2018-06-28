package cn.edu.hqu.stu_accommodation_sys.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppointmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public AppointmentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppStuIdIsNull() {
            addCriterion("app_stu_id is null");
            return (Criteria) this;
        }

        public Criteria andAppStuIdIsNotNull() {
            addCriterion("app_stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppStuIdEqualTo(String value) {
            addCriterion("app_stu_id =", value, "appStuId");
            return (Criteria) this;
        }

        public Criteria andAppStuIdNotEqualTo(String value) {
            addCriterion("app_stu_id <>", value, "appStuId");
            return (Criteria) this;
        }

        public Criteria andAppStuIdGreaterThan(String value) {
            addCriterion("app_stu_id >", value, "appStuId");
            return (Criteria) this;
        }

        public Criteria andAppStuIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_stu_id >=", value, "appStuId");
            return (Criteria) this;
        }

        public Criteria andAppStuIdLessThan(String value) {
            addCriterion("app_stu_id <", value, "appStuId");
            return (Criteria) this;
        }

        public Criteria andAppStuIdLessThanOrEqualTo(String value) {
            addCriterion("app_stu_id <=", value, "appStuId");
            return (Criteria) this;
        }

        public Criteria andAppStuIdLike(String value) {
            addCriterion("app_stu_id like", value, "appStuId");
            return (Criteria) this;
        }

        public Criteria andAppStuIdNotLike(String value) {
            addCriterion("app_stu_id not like", value, "appStuId");
            return (Criteria) this;
        }

        public Criteria andAppStuIdIn(List<String> values) {
            addCriterion("app_stu_id in", values, "appStuId");
            return (Criteria) this;
        }

        public Criteria andAppStuIdNotIn(List<String> values) {
            addCriterion("app_stu_id not in", values, "appStuId");
            return (Criteria) this;
        }

        public Criteria andAppStuIdBetween(String value1, String value2) {
            addCriterion("app_stu_id between", value1, value2, "appStuId");
            return (Criteria) this;
        }

        public Criteria andAppStuIdNotBetween(String value1, String value2) {
            addCriterion("app_stu_id not between", value1, value2, "appStuId");
            return (Criteria) this;
        }

        public Criteria andAppLandlordIdIsNull() {
            addCriterion("app_landlord_id is null");
            return (Criteria) this;
        }

        public Criteria andAppLandlordIdIsNotNull() {
            addCriterion("app_landlord_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppLandlordIdEqualTo(String value) {
            addCriterion("app_landlord_id =", value, "appLandlordId");
            return (Criteria) this;
        }

        public Criteria andAppLandlordIdNotEqualTo(String value) {
            addCriterion("app_landlord_id <>", value, "appLandlordId");
            return (Criteria) this;
        }

        public Criteria andAppLandlordIdGreaterThan(String value) {
            addCriterion("app_landlord_id >", value, "appLandlordId");
            return (Criteria) this;
        }

        public Criteria andAppLandlordIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_landlord_id >=", value, "appLandlordId");
            return (Criteria) this;
        }

        public Criteria andAppLandlordIdLessThan(String value) {
            addCriterion("app_landlord_id <", value, "appLandlordId");
            return (Criteria) this;
        }

        public Criteria andAppLandlordIdLessThanOrEqualTo(String value) {
            addCriterion("app_landlord_id <=", value, "appLandlordId");
            return (Criteria) this;
        }

        public Criteria andAppLandlordIdLike(String value) {
            addCriterion("app_landlord_id like", value, "appLandlordId");
            return (Criteria) this;
        }

        public Criteria andAppLandlordIdNotLike(String value) {
            addCriterion("app_landlord_id not like", value, "appLandlordId");
            return (Criteria) this;
        }

        public Criteria andAppLandlordIdIn(List<String> values) {
            addCriterion("app_landlord_id in", values, "appLandlordId");
            return (Criteria) this;
        }

        public Criteria andAppLandlordIdNotIn(List<String> values) {
            addCriterion("app_landlord_id not in", values, "appLandlordId");
            return (Criteria) this;
        }

        public Criteria andAppLandlordIdBetween(String value1, String value2) {
            addCriterion("app_landlord_id between", value1, value2, "appLandlordId");
            return (Criteria) this;
        }

        public Criteria andAppLandlordIdNotBetween(String value1, String value2) {
            addCriterion("app_landlord_id not between", value1, value2, "appLandlordId");
            return (Criteria) this;
        }

        public Criteria andAppStuNameIsNull() {
            addCriterion("app_stu_name is null");
            return (Criteria) this;
        }

        public Criteria andAppStuNameIsNotNull() {
            addCriterion("app_stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andAppStuNameEqualTo(String value) {
            addCriterion("app_stu_name =", value, "appStuName");
            return (Criteria) this;
        }

        public Criteria andAppStuNameNotEqualTo(String value) {
            addCriterion("app_stu_name <>", value, "appStuName");
            return (Criteria) this;
        }

        public Criteria andAppStuNameGreaterThan(String value) {
            addCriterion("app_stu_name >", value, "appStuName");
            return (Criteria) this;
        }

        public Criteria andAppStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("app_stu_name >=", value, "appStuName");
            return (Criteria) this;
        }

        public Criteria andAppStuNameLessThan(String value) {
            addCriterion("app_stu_name <", value, "appStuName");
            return (Criteria) this;
        }

        public Criteria andAppStuNameLessThanOrEqualTo(String value) {
            addCriterion("app_stu_name <=", value, "appStuName");
            return (Criteria) this;
        }

        public Criteria andAppStuNameLike(String value) {
            addCriterion("app_stu_name like", value, "appStuName");
            return (Criteria) this;
        }

        public Criteria andAppStuNameNotLike(String value) {
            addCriterion("app_stu_name not like", value, "appStuName");
            return (Criteria) this;
        }

        public Criteria andAppStuNameIn(List<String> values) {
            addCriterion("app_stu_name in", values, "appStuName");
            return (Criteria) this;
        }

        public Criteria andAppStuNameNotIn(List<String> values) {
            addCriterion("app_stu_name not in", values, "appStuName");
            return (Criteria) this;
        }

        public Criteria andAppStuNameBetween(String value1, String value2) {
            addCriterion("app_stu_name between", value1, value2, "appStuName");
            return (Criteria) this;
        }

        public Criteria andAppStuNameNotBetween(String value1, String value2) {
            addCriterion("app_stu_name not between", value1, value2, "appStuName");
            return (Criteria) this;
        }

        public Criteria andAppLandlordNameIsNull() {
            addCriterion("app_landlord_name is null");
            return (Criteria) this;
        }

        public Criteria andAppLandlordNameIsNotNull() {
            addCriterion("app_landlord_name is not null");
            return (Criteria) this;
        }

        public Criteria andAppLandlordNameEqualTo(String value) {
            addCriterion("app_landlord_name =", value, "appLandlordName");
            return (Criteria) this;
        }

        public Criteria andAppLandlordNameNotEqualTo(String value) {
            addCriterion("app_landlord_name <>", value, "appLandlordName");
            return (Criteria) this;
        }

        public Criteria andAppLandlordNameGreaterThan(String value) {
            addCriterion("app_landlord_name >", value, "appLandlordName");
            return (Criteria) this;
        }

        public Criteria andAppLandlordNameGreaterThanOrEqualTo(String value) {
            addCriterion("app_landlord_name >=", value, "appLandlordName");
            return (Criteria) this;
        }

        public Criteria andAppLandlordNameLessThan(String value) {
            addCriterion("app_landlord_name <", value, "appLandlordName");
            return (Criteria) this;
        }

        public Criteria andAppLandlordNameLessThanOrEqualTo(String value) {
            addCriterion("app_landlord_name <=", value, "appLandlordName");
            return (Criteria) this;
        }

        public Criteria andAppLandlordNameLike(String value) {
            addCriterion("app_landlord_name like", value, "appLandlordName");
            return (Criteria) this;
        }

        public Criteria andAppLandlordNameNotLike(String value) {
            addCriterion("app_landlord_name not like", value, "appLandlordName");
            return (Criteria) this;
        }

        public Criteria andAppLandlordNameIn(List<String> values) {
            addCriterion("app_landlord_name in", values, "appLandlordName");
            return (Criteria) this;
        }

        public Criteria andAppLandlordNameNotIn(List<String> values) {
            addCriterion("app_landlord_name not in", values, "appLandlordName");
            return (Criteria) this;
        }

        public Criteria andAppLandlordNameBetween(String value1, String value2) {
            addCriterion("app_landlord_name between", value1, value2, "appLandlordName");
            return (Criteria) this;
        }

        public Criteria andAppLandlordNameNotBetween(String value1, String value2) {
            addCriterion("app_landlord_name not between", value1, value2, "appLandlordName");
            return (Criteria) this;
        }

        public Criteria andAppHouseIdIsNull() {
            addCriterion("app_house_id is null");
            return (Criteria) this;
        }

        public Criteria andAppHouseIdIsNotNull() {
            addCriterion("app_house_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppHouseIdEqualTo(String value) {
            addCriterion("app_house_id =", value, "appHouseId");
            return (Criteria) this;
        }

        public Criteria andAppHouseIdNotEqualTo(String value) {
            addCriterion("app_house_id <>", value, "appHouseId");
            return (Criteria) this;
        }

        public Criteria andAppHouseIdGreaterThan(String value) {
            addCriterion("app_house_id >", value, "appHouseId");
            return (Criteria) this;
        }

        public Criteria andAppHouseIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_house_id >=", value, "appHouseId");
            return (Criteria) this;
        }

        public Criteria andAppHouseIdLessThan(String value) {
            addCriterion("app_house_id <", value, "appHouseId");
            return (Criteria) this;
        }

        public Criteria andAppHouseIdLessThanOrEqualTo(String value) {
            addCriterion("app_house_id <=", value, "appHouseId");
            return (Criteria) this;
        }

        public Criteria andAppHouseIdLike(String value) {
            addCriterion("app_house_id like", value, "appHouseId");
            return (Criteria) this;
        }

        public Criteria andAppHouseIdNotLike(String value) {
            addCriterion("app_house_id not like", value, "appHouseId");
            return (Criteria) this;
        }

        public Criteria andAppHouseIdIn(List<String> values) {
            addCriterion("app_house_id in", values, "appHouseId");
            return (Criteria) this;
        }

        public Criteria andAppHouseIdNotIn(List<String> values) {
            addCriterion("app_house_id not in", values, "appHouseId");
            return (Criteria) this;
        }

        public Criteria andAppHouseIdBetween(String value1, String value2) {
            addCriterion("app_house_id between", value1, value2, "appHouseId");
            return (Criteria) this;
        }

        public Criteria andAppHouseIdNotBetween(String value1, String value2) {
            addCriterion("app_house_id not between", value1, value2, "appHouseId");
            return (Criteria) this;
        }

        public Criteria andAppHouseAddressIsNull() {
            addCriterion("app_house_address is null");
            return (Criteria) this;
        }

        public Criteria andAppHouseAddressIsNotNull() {
            addCriterion("app_house_address is not null");
            return (Criteria) this;
        }

        public Criteria andAppHouseAddressEqualTo(String value) {
            addCriterion("app_house_address =", value, "appHouseAddress");
            return (Criteria) this;
        }

        public Criteria andAppHouseAddressNotEqualTo(String value) {
            addCriterion("app_house_address <>", value, "appHouseAddress");
            return (Criteria) this;
        }

        public Criteria andAppHouseAddressGreaterThan(String value) {
            addCriterion("app_house_address >", value, "appHouseAddress");
            return (Criteria) this;
        }

        public Criteria andAppHouseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("app_house_address >=", value, "appHouseAddress");
            return (Criteria) this;
        }

        public Criteria andAppHouseAddressLessThan(String value) {
            addCriterion("app_house_address <", value, "appHouseAddress");
            return (Criteria) this;
        }

        public Criteria andAppHouseAddressLessThanOrEqualTo(String value) {
            addCriterion("app_house_address <=", value, "appHouseAddress");
            return (Criteria) this;
        }

        public Criteria andAppHouseAddressLike(String value) {
            addCriterion("app_house_address like", value, "appHouseAddress");
            return (Criteria) this;
        }

        public Criteria andAppHouseAddressNotLike(String value) {
            addCriterion("app_house_address not like", value, "appHouseAddress");
            return (Criteria) this;
        }

        public Criteria andAppHouseAddressIn(List<String> values) {
            addCriterion("app_house_address in", values, "appHouseAddress");
            return (Criteria) this;
        }

        public Criteria andAppHouseAddressNotIn(List<String> values) {
            addCriterion("app_house_address not in", values, "appHouseAddress");
            return (Criteria) this;
        }

        public Criteria andAppHouseAddressBetween(String value1, String value2) {
            addCriterion("app_house_address between", value1, value2, "appHouseAddress");
            return (Criteria) this;
        }

        public Criteria andAppHouseAddressNotBetween(String value1, String value2) {
            addCriterion("app_house_address not between", value1, value2, "appHouseAddress");
            return (Criteria) this;
        }

        public Criteria andAppHouseTypeIsNull() {
            addCriterion("app_house_type is null");
            return (Criteria) this;
        }

        public Criteria andAppHouseTypeIsNotNull() {
            addCriterion("app_house_type is not null");
            return (Criteria) this;
        }

        public Criteria andAppHouseTypeEqualTo(String value) {
            addCriterion("app_house_type =", value, "appHouseType");
            return (Criteria) this;
        }

        public Criteria andAppHouseTypeNotEqualTo(String value) {
            addCriterion("app_house_type <>", value, "appHouseType");
            return (Criteria) this;
        }

        public Criteria andAppHouseTypeGreaterThan(String value) {
            addCriterion("app_house_type >", value, "appHouseType");
            return (Criteria) this;
        }

        public Criteria andAppHouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("app_house_type >=", value, "appHouseType");
            return (Criteria) this;
        }

        public Criteria andAppHouseTypeLessThan(String value) {
            addCriterion("app_house_type <", value, "appHouseType");
            return (Criteria) this;
        }

        public Criteria andAppHouseTypeLessThanOrEqualTo(String value) {
            addCriterion("app_house_type <=", value, "appHouseType");
            return (Criteria) this;
        }

        public Criteria andAppHouseTypeLike(String value) {
            addCriterion("app_house_type like", value, "appHouseType");
            return (Criteria) this;
        }

        public Criteria andAppHouseTypeNotLike(String value) {
            addCriterion("app_house_type not like", value, "appHouseType");
            return (Criteria) this;
        }

        public Criteria andAppHouseTypeIn(List<String> values) {
            addCriterion("app_house_type in", values, "appHouseType");
            return (Criteria) this;
        }

        public Criteria andAppHouseTypeNotIn(List<String> values) {
            addCriterion("app_house_type not in", values, "appHouseType");
            return (Criteria) this;
        }

        public Criteria andAppHouseTypeBetween(String value1, String value2) {
            addCriterion("app_house_type between", value1, value2, "appHouseType");
            return (Criteria) this;
        }

        public Criteria andAppHouseTypeNotBetween(String value1, String value2) {
            addCriterion("app_house_type not between", value1, value2, "appHouseType");
            return (Criteria) this;
        }

        public Criteria andAppHouseCapacityIsNull() {
            addCriterion("app_house_capacity is null");
            return (Criteria) this;
        }

        public Criteria andAppHouseCapacityIsNotNull() {
            addCriterion("app_house_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andAppHouseCapacityEqualTo(Integer value) {
            addCriterion("app_house_capacity =", value, "appHouseCapacity");
            return (Criteria) this;
        }

        public Criteria andAppHouseCapacityNotEqualTo(Integer value) {
            addCriterion("app_house_capacity <>", value, "appHouseCapacity");
            return (Criteria) this;
        }

        public Criteria andAppHouseCapacityGreaterThan(Integer value) {
            addCriterion("app_house_capacity >", value, "appHouseCapacity");
            return (Criteria) this;
        }

        public Criteria andAppHouseCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_house_capacity >=", value, "appHouseCapacity");
            return (Criteria) this;
        }

        public Criteria andAppHouseCapacityLessThan(Integer value) {
            addCriterion("app_house_capacity <", value, "appHouseCapacity");
            return (Criteria) this;
        }

        public Criteria andAppHouseCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("app_house_capacity <=", value, "appHouseCapacity");
            return (Criteria) this;
        }

        public Criteria andAppHouseCapacityIn(List<Integer> values) {
            addCriterion("app_house_capacity in", values, "appHouseCapacity");
            return (Criteria) this;
        }

        public Criteria andAppHouseCapacityNotIn(List<Integer> values) {
            addCriterion("app_house_capacity not in", values, "appHouseCapacity");
            return (Criteria) this;
        }

        public Criteria andAppHouseCapacityBetween(Integer value1, Integer value2) {
            addCriterion("app_house_capacity between", value1, value2, "appHouseCapacity");
            return (Criteria) this;
        }

        public Criteria andAppHouseCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("app_house_capacity not between", value1, value2, "appHouseCapacity");
            return (Criteria) this;
        }

        public Criteria andAppHouseHostnameIsNull() {
            addCriterion("app_house_hostname is null");
            return (Criteria) this;
        }

        public Criteria andAppHouseHostnameIsNotNull() {
            addCriterion("app_house_hostname is not null");
            return (Criteria) this;
        }

        public Criteria andAppHouseHostnameEqualTo(String value) {
            addCriterion("app_house_hostname =", value, "appHouseHostname");
            return (Criteria) this;
        }

        public Criteria andAppHouseHostnameNotEqualTo(String value) {
            addCriterion("app_house_hostname <>", value, "appHouseHostname");
            return (Criteria) this;
        }

        public Criteria andAppHouseHostnameGreaterThan(String value) {
            addCriterion("app_house_hostname >", value, "appHouseHostname");
            return (Criteria) this;
        }

        public Criteria andAppHouseHostnameGreaterThanOrEqualTo(String value) {
            addCriterion("app_house_hostname >=", value, "appHouseHostname");
            return (Criteria) this;
        }

        public Criteria andAppHouseHostnameLessThan(String value) {
            addCriterion("app_house_hostname <", value, "appHouseHostname");
            return (Criteria) this;
        }

        public Criteria andAppHouseHostnameLessThanOrEqualTo(String value) {
            addCriterion("app_house_hostname <=", value, "appHouseHostname");
            return (Criteria) this;
        }

        public Criteria andAppHouseHostnameLike(String value) {
            addCriterion("app_house_hostname like", value, "appHouseHostname");
            return (Criteria) this;
        }

        public Criteria andAppHouseHostnameNotLike(String value) {
            addCriterion("app_house_hostname not like", value, "appHouseHostname");
            return (Criteria) this;
        }

        public Criteria andAppHouseHostnameIn(List<String> values) {
            addCriterion("app_house_hostname in", values, "appHouseHostname");
            return (Criteria) this;
        }

        public Criteria andAppHouseHostnameNotIn(List<String> values) {
            addCriterion("app_house_hostname not in", values, "appHouseHostname");
            return (Criteria) this;
        }

        public Criteria andAppHouseHostnameBetween(String value1, String value2) {
            addCriterion("app_house_hostname between", value1, value2, "appHouseHostname");
            return (Criteria) this;
        }

        public Criteria andAppHouseHostnameNotBetween(String value1, String value2) {
            addCriterion("app_house_hostname not between", value1, value2, "appHouseHostname");
            return (Criteria) this;
        }

        public Criteria andAppHouseCostIsNull() {
            addCriterion("app_house_cost is null");
            return (Criteria) this;
        }

        public Criteria andAppHouseCostIsNotNull() {
            addCriterion("app_house_cost is not null");
            return (Criteria) this;
        }

        public Criteria andAppHouseCostEqualTo(Double value) {
            addCriterion("app_house_cost =", value, "appHouseCost");
            return (Criteria) this;
        }

        public Criteria andAppHouseCostNotEqualTo(Double value) {
            addCriterion("app_house_cost <>", value, "appHouseCost");
            return (Criteria) this;
        }

        public Criteria andAppHouseCostGreaterThan(Double value) {
            addCriterion("app_house_cost >", value, "appHouseCost");
            return (Criteria) this;
        }

        public Criteria andAppHouseCostGreaterThanOrEqualTo(Double value) {
            addCriterion("app_house_cost >=", value, "appHouseCost");
            return (Criteria) this;
        }

        public Criteria andAppHouseCostLessThan(Double value) {
            addCriterion("app_house_cost <", value, "appHouseCost");
            return (Criteria) this;
        }

        public Criteria andAppHouseCostLessThanOrEqualTo(Double value) {
            addCriterion("app_house_cost <=", value, "appHouseCost");
            return (Criteria) this;
        }

        public Criteria andAppHouseCostIn(List<Double> values) {
            addCriterion("app_house_cost in", values, "appHouseCost");
            return (Criteria) this;
        }

        public Criteria andAppHouseCostNotIn(List<Double> values) {
            addCriterion("app_house_cost not in", values, "appHouseCost");
            return (Criteria) this;
        }

        public Criteria andAppHouseCostBetween(Double value1, Double value2) {
            addCriterion("app_house_cost between", value1, value2, "appHouseCost");
            return (Criteria) this;
        }

        public Criteria andAppHouseCostNotBetween(Double value1, Double value2) {
            addCriterion("app_house_cost not between", value1, value2, "appHouseCost");
            return (Criteria) this;
        }

        public Criteria andAppHouseDescIsNull() {
            addCriterion("app_house_desc is null");
            return (Criteria) this;
        }

        public Criteria andAppHouseDescIsNotNull() {
            addCriterion("app_house_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAppHouseDescEqualTo(String value) {
            addCriterion("app_house_desc =", value, "appHouseDesc");
            return (Criteria) this;
        }

        public Criteria andAppHouseDescNotEqualTo(String value) {
            addCriterion("app_house_desc <>", value, "appHouseDesc");
            return (Criteria) this;
        }

        public Criteria andAppHouseDescGreaterThan(String value) {
            addCriterion("app_house_desc >", value, "appHouseDesc");
            return (Criteria) this;
        }

        public Criteria andAppHouseDescGreaterThanOrEqualTo(String value) {
            addCriterion("app_house_desc >=", value, "appHouseDesc");
            return (Criteria) this;
        }

        public Criteria andAppHouseDescLessThan(String value) {
            addCriterion("app_house_desc <", value, "appHouseDesc");
            return (Criteria) this;
        }

        public Criteria andAppHouseDescLessThanOrEqualTo(String value) {
            addCriterion("app_house_desc <=", value, "appHouseDesc");
            return (Criteria) this;
        }

        public Criteria andAppHouseDescLike(String value) {
            addCriterion("app_house_desc like", value, "appHouseDesc");
            return (Criteria) this;
        }

        public Criteria andAppHouseDescNotLike(String value) {
            addCriterion("app_house_desc not like", value, "appHouseDesc");
            return (Criteria) this;
        }

        public Criteria andAppHouseDescIn(List<String> values) {
            addCriterion("app_house_desc in", values, "appHouseDesc");
            return (Criteria) this;
        }

        public Criteria andAppHouseDescNotIn(List<String> values) {
            addCriterion("app_house_desc not in", values, "appHouseDesc");
            return (Criteria) this;
        }

        public Criteria andAppHouseDescBetween(String value1, String value2) {
            addCriterion("app_house_desc between", value1, value2, "appHouseDesc");
            return (Criteria) this;
        }

        public Criteria andAppHouseDescNotBetween(String value1, String value2) {
            addCriterion("app_house_desc not between", value1, value2, "appHouseDesc");
            return (Criteria) this;
        }

        public Criteria andAppHouseSquareIsNull() {
            addCriterion("app_house_square is null");
            return (Criteria) this;
        }

        public Criteria andAppHouseSquareIsNotNull() {
            addCriterion("app_house_square is not null");
            return (Criteria) this;
        }

        public Criteria andAppHouseSquareEqualTo(Double value) {
            addCriterion("app_house_square =", value, "appHouseSquare");
            return (Criteria) this;
        }

        public Criteria andAppHouseSquareNotEqualTo(Double value) {
            addCriterion("app_house_square <>", value, "appHouseSquare");
            return (Criteria) this;
        }

        public Criteria andAppHouseSquareGreaterThan(Double value) {
            addCriterion("app_house_square >", value, "appHouseSquare");
            return (Criteria) this;
        }

        public Criteria andAppHouseSquareGreaterThanOrEqualTo(Double value) {
            addCriterion("app_house_square >=", value, "appHouseSquare");
            return (Criteria) this;
        }

        public Criteria andAppHouseSquareLessThan(Double value) {
            addCriterion("app_house_square <", value, "appHouseSquare");
            return (Criteria) this;
        }

        public Criteria andAppHouseSquareLessThanOrEqualTo(Double value) {
            addCriterion("app_house_square <=", value, "appHouseSquare");
            return (Criteria) this;
        }

        public Criteria andAppHouseSquareIn(List<Double> values) {
            addCriterion("app_house_square in", values, "appHouseSquare");
            return (Criteria) this;
        }

        public Criteria andAppHouseSquareNotIn(List<Double> values) {
            addCriterion("app_house_square not in", values, "appHouseSquare");
            return (Criteria) this;
        }

        public Criteria andAppHouseSquareBetween(Double value1, Double value2) {
            addCriterion("app_house_square between", value1, value2, "appHouseSquare");
            return (Criteria) this;
        }

        public Criteria andAppHouseSquareNotBetween(Double value1, Double value2) {
            addCriterion("app_house_square not between", value1, value2, "appHouseSquare");
            return (Criteria) this;
        }

        public Criteria andAppDateIsNull() {
            addCriterion("app_date is null");
            return (Criteria) this;
        }

        public Criteria andAppDateIsNotNull() {
            addCriterion("app_date is not null");
            return (Criteria) this;
        }

        public Criteria andAppDateEqualTo(Date value) {
            addCriterion("app_date =", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateNotEqualTo(Date value) {
            addCriterion("app_date <>", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateGreaterThan(Date value) {
            addCriterion("app_date >", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateGreaterThanOrEqualTo(Date value) {
            addCriterion("app_date >=", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateLessThan(Date value) {
            addCriterion("app_date <", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateLessThanOrEqualTo(Date value) {
            addCriterion("app_date <=", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateIn(List<Date> values) {
            addCriterion("app_date in", values, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateNotIn(List<Date> values) {
            addCriterion("app_date not in", values, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateBetween(Date value1, Date value2) {
            addCriterion("app_date between", value1, value2, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateNotBetween(Date value1, Date value2) {
            addCriterion("app_date not between", value1, value2, "appDate");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}