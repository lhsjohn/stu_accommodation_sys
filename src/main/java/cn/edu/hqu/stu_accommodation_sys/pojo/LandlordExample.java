package cn.edu.hqu.stu_accommodation_sys.pojo;

import java.util.ArrayList;
import java.util.List;

public class LandlordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LandlordExample() {
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

        public Criteria andLandlordIdIsNull() {
            addCriterion("landlord_id is null");
            return (Criteria) this;
        }

        public Criteria andLandlordIdIsNotNull() {
            addCriterion("landlord_id is not null");
            return (Criteria) this;
        }

        public Criteria andLandlordIdEqualTo(String value) {
            addCriterion("landlord_id =", value, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdNotEqualTo(String value) {
            addCriterion("landlord_id <>", value, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdGreaterThan(String value) {
            addCriterion("landlord_id >", value, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdGreaterThanOrEqualTo(String value) {
            addCriterion("landlord_id >=", value, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdLessThan(String value) {
            addCriterion("landlord_id <", value, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdLessThanOrEqualTo(String value) {
            addCriterion("landlord_id <=", value, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdLike(String value) {
            addCriterion("landlord_id like", value, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdNotLike(String value) {
            addCriterion("landlord_id not like", value, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdIn(List<String> values) {
            addCriterion("landlord_id in", values, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdNotIn(List<String> values) {
            addCriterion("landlord_id not in", values, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdBetween(String value1, String value2) {
            addCriterion("landlord_id between", value1, value2, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdNotBetween(String value1, String value2) {
            addCriterion("landlord_id not between", value1, value2, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameIsNull() {
            addCriterion("landlord_username is null");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameIsNotNull() {
            addCriterion("landlord_username is not null");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameEqualTo(String value) {
            addCriterion("landlord_username =", value, "landlordUsername");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameNotEqualTo(String value) {
            addCriterion("landlord_username <>", value, "landlordUsername");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameGreaterThan(String value) {
            addCriterion("landlord_username >", value, "landlordUsername");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("landlord_username >=", value, "landlordUsername");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameLessThan(String value) {
            addCriterion("landlord_username <", value, "landlordUsername");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameLessThanOrEqualTo(String value) {
            addCriterion("landlord_username <=", value, "landlordUsername");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameLike(String value) {
            addCriterion("landlord_username like", value, "landlordUsername");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameNotLike(String value) {
            addCriterion("landlord_username not like", value, "landlordUsername");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameIn(List<String> values) {
            addCriterion("landlord_username in", values, "landlordUsername");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameNotIn(List<String> values) {
            addCriterion("landlord_username not in", values, "landlordUsername");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameBetween(String value1, String value2) {
            addCriterion("landlord_username between", value1, value2, "landlordUsername");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameNotBetween(String value1, String value2) {
            addCriterion("landlord_username not between", value1, value2, "landlordUsername");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordIsNull() {
            addCriterion("landlord_password is null");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordIsNotNull() {
            addCriterion("landlord_password is not null");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordEqualTo(String value) {
            addCriterion("landlord_password =", value, "landlordPassword");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordNotEqualTo(String value) {
            addCriterion("landlord_password <>", value, "landlordPassword");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordGreaterThan(String value) {
            addCriterion("landlord_password >", value, "landlordPassword");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("landlord_password >=", value, "landlordPassword");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordLessThan(String value) {
            addCriterion("landlord_password <", value, "landlordPassword");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordLessThanOrEqualTo(String value) {
            addCriterion("landlord_password <=", value, "landlordPassword");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordLike(String value) {
            addCriterion("landlord_password like", value, "landlordPassword");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordNotLike(String value) {
            addCriterion("landlord_password not like", value, "landlordPassword");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordIn(List<String> values) {
            addCriterion("landlord_password in", values, "landlordPassword");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordNotIn(List<String> values) {
            addCriterion("landlord_password not in", values, "landlordPassword");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordBetween(String value1, String value2) {
            addCriterion("landlord_password between", value1, value2, "landlordPassword");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordNotBetween(String value1, String value2) {
            addCriterion("landlord_password not between", value1, value2, "landlordPassword");
            return (Criteria) this;
        }

        public Criteria andLandlordIdcardIsNull() {
            addCriterion("landlord_idcard is null");
            return (Criteria) this;
        }

        public Criteria andLandlordIdcardIsNotNull() {
            addCriterion("landlord_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andLandlordIdcardEqualTo(String value) {
            addCriterion("landlord_idcard =", value, "landlordIdcard");
            return (Criteria) this;
        }

        public Criteria andLandlordIdcardNotEqualTo(String value) {
            addCriterion("landlord_idcard <>", value, "landlordIdcard");
            return (Criteria) this;
        }

        public Criteria andLandlordIdcardGreaterThan(String value) {
            addCriterion("landlord_idcard >", value, "landlordIdcard");
            return (Criteria) this;
        }

        public Criteria andLandlordIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("landlord_idcard >=", value, "landlordIdcard");
            return (Criteria) this;
        }

        public Criteria andLandlordIdcardLessThan(String value) {
            addCriterion("landlord_idcard <", value, "landlordIdcard");
            return (Criteria) this;
        }

        public Criteria andLandlordIdcardLessThanOrEqualTo(String value) {
            addCriterion("landlord_idcard <=", value, "landlordIdcard");
            return (Criteria) this;
        }

        public Criteria andLandlordIdcardLike(String value) {
            addCriterion("landlord_idcard like", value, "landlordIdcard");
            return (Criteria) this;
        }

        public Criteria andLandlordIdcardNotLike(String value) {
            addCriterion("landlord_idcard not like", value, "landlordIdcard");
            return (Criteria) this;
        }

        public Criteria andLandlordIdcardIn(List<String> values) {
            addCriterion("landlord_idcard in", values, "landlordIdcard");
            return (Criteria) this;
        }

        public Criteria andLandlordIdcardNotIn(List<String> values) {
            addCriterion("landlord_idcard not in", values, "landlordIdcard");
            return (Criteria) this;
        }

        public Criteria andLandlordIdcardBetween(String value1, String value2) {
            addCriterion("landlord_idcard between", value1, value2, "landlordIdcard");
            return (Criteria) this;
        }

        public Criteria andLandlordIdcardNotBetween(String value1, String value2) {
            addCriterion("landlord_idcard not between", value1, value2, "landlordIdcard");
            return (Criteria) this;
        }

        public Criteria andLandlordNameIsNull() {
            addCriterion("landlord_name is null");
            return (Criteria) this;
        }

        public Criteria andLandlordNameIsNotNull() {
            addCriterion("landlord_name is not null");
            return (Criteria) this;
        }

        public Criteria andLandlordNameEqualTo(String value) {
            addCriterion("landlord_name =", value, "landlordName");
            return (Criteria) this;
        }

        public Criteria andLandlordNameNotEqualTo(String value) {
            addCriterion("landlord_name <>", value, "landlordName");
            return (Criteria) this;
        }

        public Criteria andLandlordNameGreaterThan(String value) {
            addCriterion("landlord_name >", value, "landlordName");
            return (Criteria) this;
        }

        public Criteria andLandlordNameGreaterThanOrEqualTo(String value) {
            addCriterion("landlord_name >=", value, "landlordName");
            return (Criteria) this;
        }

        public Criteria andLandlordNameLessThan(String value) {
            addCriterion("landlord_name <", value, "landlordName");
            return (Criteria) this;
        }

        public Criteria andLandlordNameLessThanOrEqualTo(String value) {
            addCriterion("landlord_name <=", value, "landlordName");
            return (Criteria) this;
        }

        public Criteria andLandlordNameLike(String value) {
            addCriterion("landlord_name like", value, "landlordName");
            return (Criteria) this;
        }

        public Criteria andLandlordNameNotLike(String value) {
            addCriterion("landlord_name not like", value, "landlordName");
            return (Criteria) this;
        }

        public Criteria andLandlordNameIn(List<String> values) {
            addCriterion("landlord_name in", values, "landlordName");
            return (Criteria) this;
        }

        public Criteria andLandlordNameNotIn(List<String> values) {
            addCriterion("landlord_name not in", values, "landlordName");
            return (Criteria) this;
        }

        public Criteria andLandlordNameBetween(String value1, String value2) {
            addCriterion("landlord_name between", value1, value2, "landlordName");
            return (Criteria) this;
        }

        public Criteria andLandlordNameNotBetween(String value1, String value2) {
            addCriterion("landlord_name not between", value1, value2, "landlordName");
            return (Criteria) this;
        }

        public Criteria andLandlordEmailIsNull() {
            addCriterion("landlord_email is null");
            return (Criteria) this;
        }

        public Criteria andLandlordEmailIsNotNull() {
            addCriterion("landlord_email is not null");
            return (Criteria) this;
        }

        public Criteria andLandlordEmailEqualTo(String value) {
            addCriterion("landlord_email =", value, "landlordEmail");
            return (Criteria) this;
        }

        public Criteria andLandlordEmailNotEqualTo(String value) {
            addCriterion("landlord_email <>", value, "landlordEmail");
            return (Criteria) this;
        }

        public Criteria andLandlordEmailGreaterThan(String value) {
            addCriterion("landlord_email >", value, "landlordEmail");
            return (Criteria) this;
        }

        public Criteria andLandlordEmailGreaterThanOrEqualTo(String value) {
            addCriterion("landlord_email >=", value, "landlordEmail");
            return (Criteria) this;
        }

        public Criteria andLandlordEmailLessThan(String value) {
            addCriterion("landlord_email <", value, "landlordEmail");
            return (Criteria) this;
        }

        public Criteria andLandlordEmailLessThanOrEqualTo(String value) {
            addCriterion("landlord_email <=", value, "landlordEmail");
            return (Criteria) this;
        }

        public Criteria andLandlordEmailLike(String value) {
            addCriterion("landlord_email like", value, "landlordEmail");
            return (Criteria) this;
        }

        public Criteria andLandlordEmailNotLike(String value) {
            addCriterion("landlord_email not like", value, "landlordEmail");
            return (Criteria) this;
        }

        public Criteria andLandlordEmailIn(List<String> values) {
            addCriterion("landlord_email in", values, "landlordEmail");
            return (Criteria) this;
        }

        public Criteria andLandlordEmailNotIn(List<String> values) {
            addCriterion("landlord_email not in", values, "landlordEmail");
            return (Criteria) this;
        }

        public Criteria andLandlordEmailBetween(String value1, String value2) {
            addCriterion("landlord_email between", value1, value2, "landlordEmail");
            return (Criteria) this;
        }

        public Criteria andLandlordEmailNotBetween(String value1, String value2) {
            addCriterion("landlord_email not between", value1, value2, "landlordEmail");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneIsNull() {
            addCriterion("landlord_phone is null");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneIsNotNull() {
            addCriterion("landlord_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneEqualTo(String value) {
            addCriterion("landlord_phone =", value, "landlordPhone");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneNotEqualTo(String value) {
            addCriterion("landlord_phone <>", value, "landlordPhone");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneGreaterThan(String value) {
            addCriterion("landlord_phone >", value, "landlordPhone");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("landlord_phone >=", value, "landlordPhone");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneLessThan(String value) {
            addCriterion("landlord_phone <", value, "landlordPhone");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneLessThanOrEqualTo(String value) {
            addCriterion("landlord_phone <=", value, "landlordPhone");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneLike(String value) {
            addCriterion("landlord_phone like", value, "landlordPhone");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneNotLike(String value) {
            addCriterion("landlord_phone not like", value, "landlordPhone");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneIn(List<String> values) {
            addCriterion("landlord_phone in", values, "landlordPhone");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneNotIn(List<String> values) {
            addCriterion("landlord_phone not in", values, "landlordPhone");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneBetween(String value1, String value2) {
            addCriterion("landlord_phone between", value1, value2, "landlordPhone");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneNotBetween(String value1, String value2) {
            addCriterion("landlord_phone not between", value1, value2, "landlordPhone");
            return (Criteria) this;
        }

        public Criteria andLandlordGenderIsNull() {
            addCriterion("landlord_gender is null");
            return (Criteria) this;
        }

        public Criteria andLandlordGenderIsNotNull() {
            addCriterion("landlord_gender is not null");
            return (Criteria) this;
        }

        public Criteria andLandlordGenderEqualTo(String value) {
            addCriterion("landlord_gender =", value, "landlordGender");
            return (Criteria) this;
        }

        public Criteria andLandlordGenderNotEqualTo(String value) {
            addCriterion("landlord_gender <>", value, "landlordGender");
            return (Criteria) this;
        }

        public Criteria andLandlordGenderGreaterThan(String value) {
            addCriterion("landlord_gender >", value, "landlordGender");
            return (Criteria) this;
        }

        public Criteria andLandlordGenderGreaterThanOrEqualTo(String value) {
            addCriterion("landlord_gender >=", value, "landlordGender");
            return (Criteria) this;
        }

        public Criteria andLandlordGenderLessThan(String value) {
            addCriterion("landlord_gender <", value, "landlordGender");
            return (Criteria) this;
        }

        public Criteria andLandlordGenderLessThanOrEqualTo(String value) {
            addCriterion("landlord_gender <=", value, "landlordGender");
            return (Criteria) this;
        }

        public Criteria andLandlordGenderLike(String value) {
            addCriterion("landlord_gender like", value, "landlordGender");
            return (Criteria) this;
        }

        public Criteria andLandlordGenderNotLike(String value) {
            addCriterion("landlord_gender not like", value, "landlordGender");
            return (Criteria) this;
        }

        public Criteria andLandlordGenderIn(List<String> values) {
            addCriterion("landlord_gender in", values, "landlordGender");
            return (Criteria) this;
        }

        public Criteria andLandlordGenderNotIn(List<String> values) {
            addCriterion("landlord_gender not in", values, "landlordGender");
            return (Criteria) this;
        }

        public Criteria andLandlordGenderBetween(String value1, String value2) {
            addCriterion("landlord_gender between", value1, value2, "landlordGender");
            return (Criteria) this;
        }

        public Criteria andLandlordGenderNotBetween(String value1, String value2) {
            addCriterion("landlord_gender not between", value1, value2, "landlordGender");
            return (Criteria) this;
        }

        public Criteria andLandlordInfoIsNull() {
            addCriterion("landlord_info is null");
            return (Criteria) this;
        }

        public Criteria andLandlordInfoIsNotNull() {
            addCriterion("landlord_info is not null");
            return (Criteria) this;
        }

        public Criteria andLandlordInfoEqualTo(String value) {
            addCriterion("landlord_info =", value, "landlordInfo");
            return (Criteria) this;
        }

        public Criteria andLandlordInfoNotEqualTo(String value) {
            addCriterion("landlord_info <>", value, "landlordInfo");
            return (Criteria) this;
        }

        public Criteria andLandlordInfoGreaterThan(String value) {
            addCriterion("landlord_info >", value, "landlordInfo");
            return (Criteria) this;
        }

        public Criteria andLandlordInfoGreaterThanOrEqualTo(String value) {
            addCriterion("landlord_info >=", value, "landlordInfo");
            return (Criteria) this;
        }

        public Criteria andLandlordInfoLessThan(String value) {
            addCriterion("landlord_info <", value, "landlordInfo");
            return (Criteria) this;
        }

        public Criteria andLandlordInfoLessThanOrEqualTo(String value) {
            addCriterion("landlord_info <=", value, "landlordInfo");
            return (Criteria) this;
        }

        public Criteria andLandlordInfoLike(String value) {
            addCriterion("landlord_info like", value, "landlordInfo");
            return (Criteria) this;
        }

        public Criteria andLandlordInfoNotLike(String value) {
            addCriterion("landlord_info not like", value, "landlordInfo");
            return (Criteria) this;
        }

        public Criteria andLandlordInfoIn(List<String> values) {
            addCriterion("landlord_info in", values, "landlordInfo");
            return (Criteria) this;
        }

        public Criteria andLandlordInfoNotIn(List<String> values) {
            addCriterion("landlord_info not in", values, "landlordInfo");
            return (Criteria) this;
        }

        public Criteria andLandlordInfoBetween(String value1, String value2) {
            addCriterion("landlord_info between", value1, value2, "landlordInfo");
            return (Criteria) this;
        }

        public Criteria andLandlordInfoNotBetween(String value1, String value2) {
            addCriterion("landlord_info not between", value1, value2, "landlordInfo");
            return (Criteria) this;
        }

        public Criteria andLandlordAgeIsNull() {
            addCriterion("landlord_age is null");
            return (Criteria) this;
        }

        public Criteria andLandlordAgeIsNotNull() {
            addCriterion("landlord_age is not null");
            return (Criteria) this;
        }

        public Criteria andLandlordAgeEqualTo(Integer value) {
            addCriterion("landlord_age =", value, "landlordAge");
            return (Criteria) this;
        }

        public Criteria andLandlordAgeNotEqualTo(Integer value) {
            addCriterion("landlord_age <>", value, "landlordAge");
            return (Criteria) this;
        }

        public Criteria andLandlordAgeGreaterThan(Integer value) {
            addCriterion("landlord_age >", value, "landlordAge");
            return (Criteria) this;
        }

        public Criteria andLandlordAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("landlord_age >=", value, "landlordAge");
            return (Criteria) this;
        }

        public Criteria andLandlordAgeLessThan(Integer value) {
            addCriterion("landlord_age <", value, "landlordAge");
            return (Criteria) this;
        }

        public Criteria andLandlordAgeLessThanOrEqualTo(Integer value) {
            addCriterion("landlord_age <=", value, "landlordAge");
            return (Criteria) this;
        }

        public Criteria andLandlordAgeIn(List<Integer> values) {
            addCriterion("landlord_age in", values, "landlordAge");
            return (Criteria) this;
        }

        public Criteria andLandlordAgeNotIn(List<Integer> values) {
            addCriterion("landlord_age not in", values, "landlordAge");
            return (Criteria) this;
        }

        public Criteria andLandlordAgeBetween(Integer value1, Integer value2) {
            addCriterion("landlord_age between", value1, value2, "landlordAge");
            return (Criteria) this;
        }

        public Criteria andLandlordAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("landlord_age not between", value1, value2, "landlordAge");
            return (Criteria) this;
        }

        public Criteria andLandlordAccountIsNull() {
            addCriterion("landlord_account is null");
            return (Criteria) this;
        }

        public Criteria andLandlordAccountIsNotNull() {
            addCriterion("landlord_account is not null");
            return (Criteria) this;
        }

        public Criteria andLandlordAccountEqualTo(Double value) {
            addCriterion("landlord_account =", value, "landlordAccount");
            return (Criteria) this;
        }

        public Criteria andLandlordAccountNotEqualTo(Double value) {
            addCriterion("landlord_account <>", value, "landlordAccount");
            return (Criteria) this;
        }

        public Criteria andLandlordAccountGreaterThan(Double value) {
            addCriterion("landlord_account >", value, "landlordAccount");
            return (Criteria) this;
        }

        public Criteria andLandlordAccountGreaterThanOrEqualTo(Double value) {
            addCriterion("landlord_account >=", value, "landlordAccount");
            return (Criteria) this;
        }

        public Criteria andLandlordAccountLessThan(Double value) {
            addCriterion("landlord_account <", value, "landlordAccount");
            return (Criteria) this;
        }

        public Criteria andLandlordAccountLessThanOrEqualTo(Double value) {
            addCriterion("landlord_account <=", value, "landlordAccount");
            return (Criteria) this;
        }

        public Criteria andLandlordAccountIn(List<Double> values) {
            addCriterion("landlord_account in", values, "landlordAccount");
            return (Criteria) this;
        }

        public Criteria andLandlordAccountNotIn(List<Double> values) {
            addCriterion("landlord_account not in", values, "landlordAccount");
            return (Criteria) this;
        }

        public Criteria andLandlordAccountBetween(Double value1, Double value2) {
            addCriterion("landlord_account between", value1, value2, "landlordAccount");
            return (Criteria) this;
        }

        public Criteria andLandlordAccountNotBetween(Double value1, Double value2) {
            addCriterion("landlord_account not between", value1, value2, "landlordAccount");
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