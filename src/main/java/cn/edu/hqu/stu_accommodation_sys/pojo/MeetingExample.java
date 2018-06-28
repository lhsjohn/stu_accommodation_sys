package cn.edu.hqu.stu_accommodation_sys.pojo;

import java.util.ArrayList;
import java.util.List;

public class MeetingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MeetingExample() {
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

        public Criteria andMeetIdIsNull() {
            addCriterion("meet_id is null");
            return (Criteria) this;
        }

        public Criteria andMeetIdIsNotNull() {
            addCriterion("meet_id is not null");
            return (Criteria) this;
        }

        public Criteria andMeetIdEqualTo(String value) {
            addCriterion("meet_id =", value, "meetId");
            return (Criteria) this;
        }

        public Criteria andMeetIdNotEqualTo(String value) {
            addCriterion("meet_id <>", value, "meetId");
            return (Criteria) this;
        }

        public Criteria andMeetIdGreaterThan(String value) {
            addCriterion("meet_id >", value, "meetId");
            return (Criteria) this;
        }

        public Criteria andMeetIdGreaterThanOrEqualTo(String value) {
            addCriterion("meet_id >=", value, "meetId");
            return (Criteria) this;
        }

        public Criteria andMeetIdLessThan(String value) {
            addCriterion("meet_id <", value, "meetId");
            return (Criteria) this;
        }

        public Criteria andMeetIdLessThanOrEqualTo(String value) {
            addCriterion("meet_id <=", value, "meetId");
            return (Criteria) this;
        }

        public Criteria andMeetIdLike(String value) {
            addCriterion("meet_id like", value, "meetId");
            return (Criteria) this;
        }

        public Criteria andMeetIdNotLike(String value) {
            addCriterion("meet_id not like", value, "meetId");
            return (Criteria) this;
        }

        public Criteria andMeetIdIn(List<String> values) {
            addCriterion("meet_id in", values, "meetId");
            return (Criteria) this;
        }

        public Criteria andMeetIdNotIn(List<String> values) {
            addCriterion("meet_id not in", values, "meetId");
            return (Criteria) this;
        }

        public Criteria andMeetIdBetween(String value1, String value2) {
            addCriterion("meet_id between", value1, value2, "meetId");
            return (Criteria) this;
        }

        public Criteria andMeetIdNotBetween(String value1, String value2) {
            addCriterion("meet_id not between", value1, value2, "meetId");
            return (Criteria) this;
        }

        public Criteria andMeetStuIdIsNull() {
            addCriterion("meet_stu_id is null");
            return (Criteria) this;
        }

        public Criteria andMeetStuIdIsNotNull() {
            addCriterion("meet_stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMeetStuIdEqualTo(String value) {
            addCriterion("meet_stu_id =", value, "meetStuId");
            return (Criteria) this;
        }

        public Criteria andMeetStuIdNotEqualTo(String value) {
            addCriterion("meet_stu_id <>", value, "meetStuId");
            return (Criteria) this;
        }

        public Criteria andMeetStuIdGreaterThan(String value) {
            addCriterion("meet_stu_id >", value, "meetStuId");
            return (Criteria) this;
        }

        public Criteria andMeetStuIdGreaterThanOrEqualTo(String value) {
            addCriterion("meet_stu_id >=", value, "meetStuId");
            return (Criteria) this;
        }

        public Criteria andMeetStuIdLessThan(String value) {
            addCriterion("meet_stu_id <", value, "meetStuId");
            return (Criteria) this;
        }

        public Criteria andMeetStuIdLessThanOrEqualTo(String value) {
            addCriterion("meet_stu_id <=", value, "meetStuId");
            return (Criteria) this;
        }

        public Criteria andMeetStuIdLike(String value) {
            addCriterion("meet_stu_id like", value, "meetStuId");
            return (Criteria) this;
        }

        public Criteria andMeetStuIdNotLike(String value) {
            addCriterion("meet_stu_id not like", value, "meetStuId");
            return (Criteria) this;
        }

        public Criteria andMeetStuIdIn(List<String> values) {
            addCriterion("meet_stu_id in", values, "meetStuId");
            return (Criteria) this;
        }

        public Criteria andMeetStuIdNotIn(List<String> values) {
            addCriterion("meet_stu_id not in", values, "meetStuId");
            return (Criteria) this;
        }

        public Criteria andMeetStuIdBetween(String value1, String value2) {
            addCriterion("meet_stu_id between", value1, value2, "meetStuId");
            return (Criteria) this;
        }

        public Criteria andMeetStuIdNotBetween(String value1, String value2) {
            addCriterion("meet_stu_id not between", value1, value2, "meetStuId");
            return (Criteria) this;
        }

        public Criteria andMeetStuNameIsNull() {
            addCriterion("meet_stu_name is null");
            return (Criteria) this;
        }

        public Criteria andMeetStuNameIsNotNull() {
            addCriterion("meet_stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andMeetStuNameEqualTo(String value) {
            addCriterion("meet_stu_name =", value, "meetStuName");
            return (Criteria) this;
        }

        public Criteria andMeetStuNameNotEqualTo(String value) {
            addCriterion("meet_stu_name <>", value, "meetStuName");
            return (Criteria) this;
        }

        public Criteria andMeetStuNameGreaterThan(String value) {
            addCriterion("meet_stu_name >", value, "meetStuName");
            return (Criteria) this;
        }

        public Criteria andMeetStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("meet_stu_name >=", value, "meetStuName");
            return (Criteria) this;
        }

        public Criteria andMeetStuNameLessThan(String value) {
            addCriterion("meet_stu_name <", value, "meetStuName");
            return (Criteria) this;
        }

        public Criteria andMeetStuNameLessThanOrEqualTo(String value) {
            addCriterion("meet_stu_name <=", value, "meetStuName");
            return (Criteria) this;
        }

        public Criteria andMeetStuNameLike(String value) {
            addCriterion("meet_stu_name like", value, "meetStuName");
            return (Criteria) this;
        }

        public Criteria andMeetStuNameNotLike(String value) {
            addCriterion("meet_stu_name not like", value, "meetStuName");
            return (Criteria) this;
        }

        public Criteria andMeetStuNameIn(List<String> values) {
            addCriterion("meet_stu_name in", values, "meetStuName");
            return (Criteria) this;
        }

        public Criteria andMeetStuNameNotIn(List<String> values) {
            addCriterion("meet_stu_name not in", values, "meetStuName");
            return (Criteria) this;
        }

        public Criteria andMeetStuNameBetween(String value1, String value2) {
            addCriterion("meet_stu_name between", value1, value2, "meetStuName");
            return (Criteria) this;
        }

        public Criteria andMeetStuNameNotBetween(String value1, String value2) {
            addCriterion("meet_stu_name not between", value1, value2, "meetStuName");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordNameIsNull() {
            addCriterion("meet_landlord_name is null");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordNameIsNotNull() {
            addCriterion("meet_landlord_name is not null");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordNameEqualTo(String value) {
            addCriterion("meet_landlord_name =", value, "meetLandlordName");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordNameNotEqualTo(String value) {
            addCriterion("meet_landlord_name <>", value, "meetLandlordName");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordNameGreaterThan(String value) {
            addCriterion("meet_landlord_name >", value, "meetLandlordName");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordNameGreaterThanOrEqualTo(String value) {
            addCriterion("meet_landlord_name >=", value, "meetLandlordName");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordNameLessThan(String value) {
            addCriterion("meet_landlord_name <", value, "meetLandlordName");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordNameLessThanOrEqualTo(String value) {
            addCriterion("meet_landlord_name <=", value, "meetLandlordName");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordNameLike(String value) {
            addCriterion("meet_landlord_name like", value, "meetLandlordName");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordNameNotLike(String value) {
            addCriterion("meet_landlord_name not like", value, "meetLandlordName");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordNameIn(List<String> values) {
            addCriterion("meet_landlord_name in", values, "meetLandlordName");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordNameNotIn(List<String> values) {
            addCriterion("meet_landlord_name not in", values, "meetLandlordName");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordNameBetween(String value1, String value2) {
            addCriterion("meet_landlord_name between", value1, value2, "meetLandlordName");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordNameNotBetween(String value1, String value2) {
            addCriterion("meet_landlord_name not between", value1, value2, "meetLandlordName");
            return (Criteria) this;
        }

        public Criteria andMeetHouseIdIsNull() {
            addCriterion("meet_house_id is null");
            return (Criteria) this;
        }

        public Criteria andMeetHouseIdIsNotNull() {
            addCriterion("meet_house_id is not null");
            return (Criteria) this;
        }

        public Criteria andMeetHouseIdEqualTo(String value) {
            addCriterion("meet_house_id =", value, "meetHouseId");
            return (Criteria) this;
        }

        public Criteria andMeetHouseIdNotEqualTo(String value) {
            addCriterion("meet_house_id <>", value, "meetHouseId");
            return (Criteria) this;
        }

        public Criteria andMeetHouseIdGreaterThan(String value) {
            addCriterion("meet_house_id >", value, "meetHouseId");
            return (Criteria) this;
        }

        public Criteria andMeetHouseIdGreaterThanOrEqualTo(String value) {
            addCriterion("meet_house_id >=", value, "meetHouseId");
            return (Criteria) this;
        }

        public Criteria andMeetHouseIdLessThan(String value) {
            addCriterion("meet_house_id <", value, "meetHouseId");
            return (Criteria) this;
        }

        public Criteria andMeetHouseIdLessThanOrEqualTo(String value) {
            addCriterion("meet_house_id <=", value, "meetHouseId");
            return (Criteria) this;
        }

        public Criteria andMeetHouseIdLike(String value) {
            addCriterion("meet_house_id like", value, "meetHouseId");
            return (Criteria) this;
        }

        public Criteria andMeetHouseIdNotLike(String value) {
            addCriterion("meet_house_id not like", value, "meetHouseId");
            return (Criteria) this;
        }

        public Criteria andMeetHouseIdIn(List<String> values) {
            addCriterion("meet_house_id in", values, "meetHouseId");
            return (Criteria) this;
        }

        public Criteria andMeetHouseIdNotIn(List<String> values) {
            addCriterion("meet_house_id not in", values, "meetHouseId");
            return (Criteria) this;
        }

        public Criteria andMeetHouseIdBetween(String value1, String value2) {
            addCriterion("meet_house_id between", value1, value2, "meetHouseId");
            return (Criteria) this;
        }

        public Criteria andMeetHouseIdNotBetween(String value1, String value2) {
            addCriterion("meet_house_id not between", value1, value2, "meetHouseId");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordIdIsNull() {
            addCriterion("meet_landlord_id is null");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordIdIsNotNull() {
            addCriterion("meet_landlord_id is not null");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordIdEqualTo(String value) {
            addCriterion("meet_landlord_id =", value, "meetLandlordId");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordIdNotEqualTo(String value) {
            addCriterion("meet_landlord_id <>", value, "meetLandlordId");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordIdGreaterThan(String value) {
            addCriterion("meet_landlord_id >", value, "meetLandlordId");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordIdGreaterThanOrEqualTo(String value) {
            addCriterion("meet_landlord_id >=", value, "meetLandlordId");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordIdLessThan(String value) {
            addCriterion("meet_landlord_id <", value, "meetLandlordId");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordIdLessThanOrEqualTo(String value) {
            addCriterion("meet_landlord_id <=", value, "meetLandlordId");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordIdLike(String value) {
            addCriterion("meet_landlord_id like", value, "meetLandlordId");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordIdNotLike(String value) {
            addCriterion("meet_landlord_id not like", value, "meetLandlordId");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordIdIn(List<String> values) {
            addCriterion("meet_landlord_id in", values, "meetLandlordId");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordIdNotIn(List<String> values) {
            addCriterion("meet_landlord_id not in", values, "meetLandlordId");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordIdBetween(String value1, String value2) {
            addCriterion("meet_landlord_id between", value1, value2, "meetLandlordId");
            return (Criteria) this;
        }

        public Criteria andMeetLandlordIdNotBetween(String value1, String value2) {
            addCriterion("meet_landlord_id not between", value1, value2, "meetLandlordId");
            return (Criteria) this;
        }

        public Criteria andMeetHouseTypeIsNull() {
            addCriterion("meet_house_type is null");
            return (Criteria) this;
        }

        public Criteria andMeetHouseTypeIsNotNull() {
            addCriterion("meet_house_type is not null");
            return (Criteria) this;
        }

        public Criteria andMeetHouseTypeEqualTo(String value) {
            addCriterion("meet_house_type =", value, "meetHouseType");
            return (Criteria) this;
        }

        public Criteria andMeetHouseTypeNotEqualTo(String value) {
            addCriterion("meet_house_type <>", value, "meetHouseType");
            return (Criteria) this;
        }

        public Criteria andMeetHouseTypeGreaterThan(String value) {
            addCriterion("meet_house_type >", value, "meetHouseType");
            return (Criteria) this;
        }

        public Criteria andMeetHouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("meet_house_type >=", value, "meetHouseType");
            return (Criteria) this;
        }

        public Criteria andMeetHouseTypeLessThan(String value) {
            addCriterion("meet_house_type <", value, "meetHouseType");
            return (Criteria) this;
        }

        public Criteria andMeetHouseTypeLessThanOrEqualTo(String value) {
            addCriterion("meet_house_type <=", value, "meetHouseType");
            return (Criteria) this;
        }

        public Criteria andMeetHouseTypeLike(String value) {
            addCriterion("meet_house_type like", value, "meetHouseType");
            return (Criteria) this;
        }

        public Criteria andMeetHouseTypeNotLike(String value) {
            addCriterion("meet_house_type not like", value, "meetHouseType");
            return (Criteria) this;
        }

        public Criteria andMeetHouseTypeIn(List<String> values) {
            addCriterion("meet_house_type in", values, "meetHouseType");
            return (Criteria) this;
        }

        public Criteria andMeetHouseTypeNotIn(List<String> values) {
            addCriterion("meet_house_type not in", values, "meetHouseType");
            return (Criteria) this;
        }

        public Criteria andMeetHouseTypeBetween(String value1, String value2) {
            addCriterion("meet_house_type between", value1, value2, "meetHouseType");
            return (Criteria) this;
        }

        public Criteria andMeetHouseTypeNotBetween(String value1, String value2) {
            addCriterion("meet_house_type not between", value1, value2, "meetHouseType");
            return (Criteria) this;
        }

        public Criteria andMeetHouseHostnameIsNull() {
            addCriterion("meet_house_hostname is null");
            return (Criteria) this;
        }

        public Criteria andMeetHouseHostnameIsNotNull() {
            addCriterion("meet_house_hostname is not null");
            return (Criteria) this;
        }

        public Criteria andMeetHouseHostnameEqualTo(String value) {
            addCriterion("meet_house_hostname =", value, "meetHouseHostname");
            return (Criteria) this;
        }

        public Criteria andMeetHouseHostnameNotEqualTo(String value) {
            addCriterion("meet_house_hostname <>", value, "meetHouseHostname");
            return (Criteria) this;
        }

        public Criteria andMeetHouseHostnameGreaterThan(String value) {
            addCriterion("meet_house_hostname >", value, "meetHouseHostname");
            return (Criteria) this;
        }

        public Criteria andMeetHouseHostnameGreaterThanOrEqualTo(String value) {
            addCriterion("meet_house_hostname >=", value, "meetHouseHostname");
            return (Criteria) this;
        }

        public Criteria andMeetHouseHostnameLessThan(String value) {
            addCriterion("meet_house_hostname <", value, "meetHouseHostname");
            return (Criteria) this;
        }

        public Criteria andMeetHouseHostnameLessThanOrEqualTo(String value) {
            addCriterion("meet_house_hostname <=", value, "meetHouseHostname");
            return (Criteria) this;
        }

        public Criteria andMeetHouseHostnameLike(String value) {
            addCriterion("meet_house_hostname like", value, "meetHouseHostname");
            return (Criteria) this;
        }

        public Criteria andMeetHouseHostnameNotLike(String value) {
            addCriterion("meet_house_hostname not like", value, "meetHouseHostname");
            return (Criteria) this;
        }

        public Criteria andMeetHouseHostnameIn(List<String> values) {
            addCriterion("meet_house_hostname in", values, "meetHouseHostname");
            return (Criteria) this;
        }

        public Criteria andMeetHouseHostnameNotIn(List<String> values) {
            addCriterion("meet_house_hostname not in", values, "meetHouseHostname");
            return (Criteria) this;
        }

        public Criteria andMeetHouseHostnameBetween(String value1, String value2) {
            addCriterion("meet_house_hostname between", value1, value2, "meetHouseHostname");
            return (Criteria) this;
        }

        public Criteria andMeetHouseHostnameNotBetween(String value1, String value2) {
            addCriterion("meet_house_hostname not between", value1, value2, "meetHouseHostname");
            return (Criteria) this;
        }

        public Criteria andMeetTimeIsNull() {
            addCriterion("meet_time is null");
            return (Criteria) this;
        }

        public Criteria andMeetTimeIsNotNull() {
            addCriterion("meet_time is not null");
            return (Criteria) this;
        }

        public Criteria andMeetTimeEqualTo(String value) {
            addCriterion("meet_time =", value, "meetTime");
            return (Criteria) this;
        }

        public Criteria andMeetTimeNotEqualTo(String value) {
            addCriterion("meet_time <>", value, "meetTime");
            return (Criteria) this;
        }

        public Criteria andMeetTimeGreaterThan(String value) {
            addCriterion("meet_time >", value, "meetTime");
            return (Criteria) this;
        }

        public Criteria andMeetTimeGreaterThanOrEqualTo(String value) {
            addCriterion("meet_time >=", value, "meetTime");
            return (Criteria) this;
        }

        public Criteria andMeetTimeLessThan(String value) {
            addCriterion("meet_time <", value, "meetTime");
            return (Criteria) this;
        }

        public Criteria andMeetTimeLessThanOrEqualTo(String value) {
            addCriterion("meet_time <=", value, "meetTime");
            return (Criteria) this;
        }

        public Criteria andMeetTimeLike(String value) {
            addCriterion("meet_time like", value, "meetTime");
            return (Criteria) this;
        }

        public Criteria andMeetTimeNotLike(String value) {
            addCriterion("meet_time not like", value, "meetTime");
            return (Criteria) this;
        }

        public Criteria andMeetTimeIn(List<String> values) {
            addCriterion("meet_time in", values, "meetTime");
            return (Criteria) this;
        }

        public Criteria andMeetTimeNotIn(List<String> values) {
            addCriterion("meet_time not in", values, "meetTime");
            return (Criteria) this;
        }

        public Criteria andMeetTimeBetween(String value1, String value2) {
            addCriterion("meet_time between", value1, value2, "meetTime");
            return (Criteria) this;
        }

        public Criteria andMeetTimeNotBetween(String value1, String value2) {
            addCriterion("meet_time not between", value1, value2, "meetTime");
            return (Criteria) this;
        }

        public Criteria andMeetPlaceIsNull() {
            addCriterion("meet_place is null");
            return (Criteria) this;
        }

        public Criteria andMeetPlaceIsNotNull() {
            addCriterion("meet_place is not null");
            return (Criteria) this;
        }

        public Criteria andMeetPlaceEqualTo(String value) {
            addCriterion("meet_place =", value, "meetPlace");
            return (Criteria) this;
        }

        public Criteria andMeetPlaceNotEqualTo(String value) {
            addCriterion("meet_place <>", value, "meetPlace");
            return (Criteria) this;
        }

        public Criteria andMeetPlaceGreaterThan(String value) {
            addCriterion("meet_place >", value, "meetPlace");
            return (Criteria) this;
        }

        public Criteria andMeetPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("meet_place >=", value, "meetPlace");
            return (Criteria) this;
        }

        public Criteria andMeetPlaceLessThan(String value) {
            addCriterion("meet_place <", value, "meetPlace");
            return (Criteria) this;
        }

        public Criteria andMeetPlaceLessThanOrEqualTo(String value) {
            addCriterion("meet_place <=", value, "meetPlace");
            return (Criteria) this;
        }

        public Criteria andMeetPlaceLike(String value) {
            addCriterion("meet_place like", value, "meetPlace");
            return (Criteria) this;
        }

        public Criteria andMeetPlaceNotLike(String value) {
            addCriterion("meet_place not like", value, "meetPlace");
            return (Criteria) this;
        }

        public Criteria andMeetPlaceIn(List<String> values) {
            addCriterion("meet_place in", values, "meetPlace");
            return (Criteria) this;
        }

        public Criteria andMeetPlaceNotIn(List<String> values) {
            addCriterion("meet_place not in", values, "meetPlace");
            return (Criteria) this;
        }

        public Criteria andMeetPlaceBetween(String value1, String value2) {
            addCriterion("meet_place between", value1, value2, "meetPlace");
            return (Criteria) this;
        }

        public Criteria andMeetPlaceNotBetween(String value1, String value2) {
            addCriterion("meet_place not between", value1, value2, "meetPlace");
            return (Criteria) this;
        }

        public Criteria andMeetHousePriceIsNull() {
            addCriterion("meet_house_price is null");
            return (Criteria) this;
        }

        public Criteria andMeetHousePriceIsNotNull() {
            addCriterion("meet_house_price is not null");
            return (Criteria) this;
        }

        public Criteria andMeetHousePriceEqualTo(Double value) {
            addCriterion("meet_house_price =", value, "meetHousePrice");
            return (Criteria) this;
        }

        public Criteria andMeetHousePriceNotEqualTo(Double value) {
            addCriterion("meet_house_price <>", value, "meetHousePrice");
            return (Criteria) this;
        }

        public Criteria andMeetHousePriceGreaterThan(Double value) {
            addCriterion("meet_house_price >", value, "meetHousePrice");
            return (Criteria) this;
        }

        public Criteria andMeetHousePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("meet_house_price >=", value, "meetHousePrice");
            return (Criteria) this;
        }

        public Criteria andMeetHousePriceLessThan(Double value) {
            addCriterion("meet_house_price <", value, "meetHousePrice");
            return (Criteria) this;
        }

        public Criteria andMeetHousePriceLessThanOrEqualTo(Double value) {
            addCriterion("meet_house_price <=", value, "meetHousePrice");
            return (Criteria) this;
        }

        public Criteria andMeetHousePriceIn(List<Double> values) {
            addCriterion("meet_house_price in", values, "meetHousePrice");
            return (Criteria) this;
        }

        public Criteria andMeetHousePriceNotIn(List<Double> values) {
            addCriterion("meet_house_price not in", values, "meetHousePrice");
            return (Criteria) this;
        }

        public Criteria andMeetHousePriceBetween(Double value1, Double value2) {
            addCriterion("meet_house_price between", value1, value2, "meetHousePrice");
            return (Criteria) this;
        }

        public Criteria andMeetHousePriceNotBetween(Double value1, Double value2) {
            addCriterion("meet_house_price not between", value1, value2, "meetHousePrice");
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