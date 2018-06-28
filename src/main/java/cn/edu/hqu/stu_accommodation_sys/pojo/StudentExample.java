package cn.edu.hqu.stu_accommodation_sys.pojo;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public StudentExample() {
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

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(String value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(String value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(String value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(String value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(String value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(String value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLike(String value) {
            addCriterion("stu_id like", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotLike(String value) {
            addCriterion("stu_id not like", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<String> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<String> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(String value1, String value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(String value1, String value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuUsernameIsNull() {
            addCriterion("stu_username is null");
            return (Criteria) this;
        }

        public Criteria andStuUsernameIsNotNull() {
            addCriterion("stu_username is not null");
            return (Criteria) this;
        }

        public Criteria andStuUsernameEqualTo(String value) {
            addCriterion("stu_username =", value, "stuUsername");
            return (Criteria) this;
        }

        public Criteria andStuUsernameNotEqualTo(String value) {
            addCriterion("stu_username <>", value, "stuUsername");
            return (Criteria) this;
        }

        public Criteria andStuUsernameGreaterThan(String value) {
            addCriterion("stu_username >", value, "stuUsername");
            return (Criteria) this;
        }

        public Criteria andStuUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_username >=", value, "stuUsername");
            return (Criteria) this;
        }

        public Criteria andStuUsernameLessThan(String value) {
            addCriterion("stu_username <", value, "stuUsername");
            return (Criteria) this;
        }

        public Criteria andStuUsernameLessThanOrEqualTo(String value) {
            addCriterion("stu_username <=", value, "stuUsername");
            return (Criteria) this;
        }

        public Criteria andStuUsernameLike(String value) {
            addCriterion("stu_username like", value, "stuUsername");
            return (Criteria) this;
        }

        public Criteria andStuUsernameNotLike(String value) {
            addCriterion("stu_username not like", value, "stuUsername");
            return (Criteria) this;
        }

        public Criteria andStuUsernameIn(List<String> values) {
            addCriterion("stu_username in", values, "stuUsername");
            return (Criteria) this;
        }

        public Criteria andStuUsernameNotIn(List<String> values) {
            addCriterion("stu_username not in", values, "stuUsername");
            return (Criteria) this;
        }

        public Criteria andStuUsernameBetween(String value1, String value2) {
            addCriterion("stu_username between", value1, value2, "stuUsername");
            return (Criteria) this;
        }

        public Criteria andStuUsernameNotBetween(String value1, String value2) {
            addCriterion("stu_username not between", value1, value2, "stuUsername");
            return (Criteria) this;
        }

        public Criteria andStuPasswordIsNull() {
            addCriterion("stu_password is null");
            return (Criteria) this;
        }

        public Criteria andStuPasswordIsNotNull() {
            addCriterion("stu_password is not null");
            return (Criteria) this;
        }

        public Criteria andStuPasswordEqualTo(String value) {
            addCriterion("stu_password =", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotEqualTo(String value) {
            addCriterion("stu_password <>", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordGreaterThan(String value) {
            addCriterion("stu_password >", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("stu_password >=", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordLessThan(String value) {
            addCriterion("stu_password <", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordLessThanOrEqualTo(String value) {
            addCriterion("stu_password <=", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordLike(String value) {
            addCriterion("stu_password like", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotLike(String value) {
            addCriterion("stu_password not like", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordIn(List<String> values) {
            addCriterion("stu_password in", values, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotIn(List<String> values) {
            addCriterion("stu_password not in", values, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordBetween(String value1, String value2) {
            addCriterion("stu_password between", value1, value2, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotBetween(String value1, String value2) {
            addCriterion("stu_password not between", value1, value2, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuEmailIsNull() {
            addCriterion("stu_email is null");
            return (Criteria) this;
        }

        public Criteria andStuEmailIsNotNull() {
            addCriterion("stu_email is not null");
            return (Criteria) this;
        }

        public Criteria andStuEmailEqualTo(String value) {
            addCriterion("stu_email =", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotEqualTo(String value) {
            addCriterion("stu_email <>", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailGreaterThan(String value) {
            addCriterion("stu_email >", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailGreaterThanOrEqualTo(String value) {
            addCriterion("stu_email >=", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLessThan(String value) {
            addCriterion("stu_email <", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLessThanOrEqualTo(String value) {
            addCriterion("stu_email <=", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLike(String value) {
            addCriterion("stu_email like", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotLike(String value) {
            addCriterion("stu_email not like", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailIn(List<String> values) {
            addCriterion("stu_email in", values, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotIn(List<String> values) {
            addCriterion("stu_email not in", values, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailBetween(String value1, String value2) {
            addCriterion("stu_email between", value1, value2, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotBetween(String value1, String value2) {
            addCriterion("stu_email not between", value1, value2, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIsNull() {
            addCriterion("stu_phone is null");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIsNotNull() {
            addCriterion("stu_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStuPhoneEqualTo(String value) {
            addCriterion("stu_phone =", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotEqualTo(String value) {
            addCriterion("stu_phone <>", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneGreaterThan(String value) {
            addCriterion("stu_phone >", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("stu_phone >=", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneLessThan(String value) {
            addCriterion("stu_phone <", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneLessThanOrEqualTo(String value) {
            addCriterion("stu_phone <=", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneLike(String value) {
            addCriterion("stu_phone like", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotLike(String value) {
            addCriterion("stu_phone not like", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIn(List<String> values) {
            addCriterion("stu_phone in", values, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotIn(List<String> values) {
            addCriterion("stu_phone not in", values, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneBetween(String value1, String value2) {
            addCriterion("stu_phone between", value1, value2, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotBetween(String value1, String value2) {
            addCriterion("stu_phone not between", value1, value2, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuGenderIsNull() {
            addCriterion("stu_gender is null");
            return (Criteria) this;
        }

        public Criteria andStuGenderIsNotNull() {
            addCriterion("stu_gender is not null");
            return (Criteria) this;
        }

        public Criteria andStuGenderEqualTo(String value) {
            addCriterion("stu_gender =", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderNotEqualTo(String value) {
            addCriterion("stu_gender <>", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderGreaterThan(String value) {
            addCriterion("stu_gender >", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderGreaterThanOrEqualTo(String value) {
            addCriterion("stu_gender >=", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderLessThan(String value) {
            addCriterion("stu_gender <", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderLessThanOrEqualTo(String value) {
            addCriterion("stu_gender <=", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderLike(String value) {
            addCriterion("stu_gender like", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderNotLike(String value) {
            addCriterion("stu_gender not like", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderIn(List<String> values) {
            addCriterion("stu_gender in", values, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderNotIn(List<String> values) {
            addCriterion("stu_gender not in", values, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderBetween(String value1, String value2) {
            addCriterion("stu_gender between", value1, value2, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderNotBetween(String value1, String value2) {
            addCriterion("stu_gender not between", value1, value2, "stuGender");
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