package cn.edu.hqu.stu_accommodation_sys.pojo;

import java.util.ArrayList;
import java.util.List;

public class HouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public HouseExample() {
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

        public Criteria andHouseIdIsNull() {
            addCriterion("house_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNotNull() {
            addCriterion("house_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseIdEqualTo(String value) {
            addCriterion("house_id =", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotEqualTo(String value) {
            addCriterion("house_id <>", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThan(String value) {
            addCriterion("house_id >", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThanOrEqualTo(String value) {
            addCriterion("house_id >=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThan(String value) {
            addCriterion("house_id <", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThanOrEqualTo(String value) {
            addCriterion("house_id <=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLike(String value) {
            addCriterion("house_id like", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotLike(String value) {
            addCriterion("house_id not like", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIn(List<String> values) {
            addCriterion("house_id in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotIn(List<String> values) {
            addCriterion("house_id not in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdBetween(String value1, String value2) {
            addCriterion("house_id between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotBetween(String value1, String value2) {
            addCriterion("house_id not between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseAddressIsNull() {
            addCriterion("house_address is null");
            return (Criteria) this;
        }

        public Criteria andHouseAddressIsNotNull() {
            addCriterion("house_address is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAddressEqualTo(String value) {
            addCriterion("house_address =", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotEqualTo(String value) {
            addCriterion("house_address <>", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressGreaterThan(String value) {
            addCriterion("house_address >", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("house_address >=", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressLessThan(String value) {
            addCriterion("house_address <", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressLessThanOrEqualTo(String value) {
            addCriterion("house_address <=", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressLike(String value) {
            addCriterion("house_address like", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotLike(String value) {
            addCriterion("house_address not like", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressIn(List<String> values) {
            addCriterion("house_address in", values, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotIn(List<String> values) {
            addCriterion("house_address not in", values, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressBetween(String value1, String value2) {
            addCriterion("house_address between", value1, value2, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotBetween(String value1, String value2) {
            addCriterion("house_address not between", value1, value2, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNull() {
            addCriterion("house_type is null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNotNull() {
            addCriterion("house_type is not null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeEqualTo(String value) {
            addCriterion("house_type =", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotEqualTo(String value) {
            addCriterion("house_type <>", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThan(String value) {
            addCriterion("house_type >", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("house_type >=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThan(String value) {
            addCriterion("house_type <", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThanOrEqualTo(String value) {
            addCriterion("house_type <=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLike(String value) {
            addCriterion("house_type like", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotLike(String value) {
            addCriterion("house_type not like", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIn(List<String> values) {
            addCriterion("house_type in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotIn(List<String> values) {
            addCriterion("house_type not in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeBetween(String value1, String value2) {
            addCriterion("house_type between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotBetween(String value1, String value2) {
            addCriterion("house_type not between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseCapacityIsNull() {
            addCriterion("house_capacity is null");
            return (Criteria) this;
        }

        public Criteria andHouseCapacityIsNotNull() {
            addCriterion("house_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCapacityEqualTo(Integer value) {
            addCriterion("house_capacity =", value, "houseCapacity");
            return (Criteria) this;
        }

        public Criteria andHouseCapacityNotEqualTo(Integer value) {
            addCriterion("house_capacity <>", value, "houseCapacity");
            return (Criteria) this;
        }

        public Criteria andHouseCapacityGreaterThan(Integer value) {
            addCriterion("house_capacity >", value, "houseCapacity");
            return (Criteria) this;
        }

        public Criteria andHouseCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_capacity >=", value, "houseCapacity");
            return (Criteria) this;
        }

        public Criteria andHouseCapacityLessThan(Integer value) {
            addCriterion("house_capacity <", value, "houseCapacity");
            return (Criteria) this;
        }

        public Criteria andHouseCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("house_capacity <=", value, "houseCapacity");
            return (Criteria) this;
        }

        public Criteria andHouseCapacityIn(List<Integer> values) {
            addCriterion("house_capacity in", values, "houseCapacity");
            return (Criteria) this;
        }

        public Criteria andHouseCapacityNotIn(List<Integer> values) {
            addCriterion("house_capacity not in", values, "houseCapacity");
            return (Criteria) this;
        }

        public Criteria andHouseCapacityBetween(Integer value1, Integer value2) {
            addCriterion("house_capacity between", value1, value2, "houseCapacity");
            return (Criteria) this;
        }

        public Criteria andHouseCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("house_capacity not between", value1, value2, "houseCapacity");
            return (Criteria) this;
        }

        public Criteria andHouseSquareIsNull() {
            addCriterion("house_square is null");
            return (Criteria) this;
        }

        public Criteria andHouseSquareIsNotNull() {
            addCriterion("house_square is not null");
            return (Criteria) this;
        }

        public Criteria andHouseSquareEqualTo(Double value) {
            addCriterion("house_square =", value, "houseSquare");
            return (Criteria) this;
        }

        public Criteria andHouseSquareNotEqualTo(Double value) {
            addCriterion("house_square <>", value, "houseSquare");
            return (Criteria) this;
        }

        public Criteria andHouseSquareGreaterThan(Double value) {
            addCriterion("house_square >", value, "houseSquare");
            return (Criteria) this;
        }

        public Criteria andHouseSquareGreaterThanOrEqualTo(Double value) {
            addCriterion("house_square >=", value, "houseSquare");
            return (Criteria) this;
        }

        public Criteria andHouseSquareLessThan(Double value) {
            addCriterion("house_square <", value, "houseSquare");
            return (Criteria) this;
        }

        public Criteria andHouseSquareLessThanOrEqualTo(Double value) {
            addCriterion("house_square <=", value, "houseSquare");
            return (Criteria) this;
        }

        public Criteria andHouseSquareIn(List<Double> values) {
            addCriterion("house_square in", values, "houseSquare");
            return (Criteria) this;
        }

        public Criteria andHouseSquareNotIn(List<Double> values) {
            addCriterion("house_square not in", values, "houseSquare");
            return (Criteria) this;
        }

        public Criteria andHouseSquareBetween(Double value1, Double value2) {
            addCriterion("house_square between", value1, value2, "houseSquare");
            return (Criteria) this;
        }

        public Criteria andHouseSquareNotBetween(Double value1, Double value2) {
            addCriterion("house_square not between", value1, value2, "houseSquare");
            return (Criteria) this;
        }

        public Criteria andHouseCostIsNull() {
            addCriterion("house_cost is null");
            return (Criteria) this;
        }

        public Criteria andHouseCostIsNotNull() {
            addCriterion("house_cost is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCostEqualTo(Double value) {
            addCriterion("house_cost =", value, "houseCost");
            return (Criteria) this;
        }

        public Criteria andHouseCostNotEqualTo(Double value) {
            addCriterion("house_cost <>", value, "houseCost");
            return (Criteria) this;
        }

        public Criteria andHouseCostGreaterThan(Double value) {
            addCriterion("house_cost >", value, "houseCost");
            return (Criteria) this;
        }

        public Criteria andHouseCostGreaterThanOrEqualTo(Double value) {
            addCriterion("house_cost >=", value, "houseCost");
            return (Criteria) this;
        }

        public Criteria andHouseCostLessThan(Double value) {
            addCriterion("house_cost <", value, "houseCost");
            return (Criteria) this;
        }

        public Criteria andHouseCostLessThanOrEqualTo(Double value) {
            addCriterion("house_cost <=", value, "houseCost");
            return (Criteria) this;
        }

        public Criteria andHouseCostIn(List<Double> values) {
            addCriterion("house_cost in", values, "houseCost");
            return (Criteria) this;
        }

        public Criteria andHouseCostNotIn(List<Double> values) {
            addCriterion("house_cost not in", values, "houseCost");
            return (Criteria) this;
        }

        public Criteria andHouseCostBetween(Double value1, Double value2) {
            addCriterion("house_cost between", value1, value2, "houseCost");
            return (Criteria) this;
        }

        public Criteria andHouseCostNotBetween(Double value1, Double value2) {
            addCriterion("house_cost not between", value1, value2, "houseCost");
            return (Criteria) this;
        }

        public Criteria andHouseHostidIsNull() {
            addCriterion("house_hostId is null");
            return (Criteria) this;
        }

        public Criteria andHouseHostidIsNotNull() {
            addCriterion("house_hostId is not null");
            return (Criteria) this;
        }

        public Criteria andHouseHostidEqualTo(String value) {
            addCriterion("house_hostId =", value, "houseHostid");
            return (Criteria) this;
        }

        public Criteria andHouseHostidNotEqualTo(String value) {
            addCriterion("house_hostId <>", value, "houseHostid");
            return (Criteria) this;
        }

        public Criteria andHouseHostidGreaterThan(String value) {
            addCriterion("house_hostId >", value, "houseHostid");
            return (Criteria) this;
        }

        public Criteria andHouseHostidGreaterThanOrEqualTo(String value) {
            addCriterion("house_hostId >=", value, "houseHostid");
            return (Criteria) this;
        }

        public Criteria andHouseHostidLessThan(String value) {
            addCriterion("house_hostId <", value, "houseHostid");
            return (Criteria) this;
        }

        public Criteria andHouseHostidLessThanOrEqualTo(String value) {
            addCriterion("house_hostId <=", value, "houseHostid");
            return (Criteria) this;
        }

        public Criteria andHouseHostidLike(String value) {
            addCriterion("house_hostId like", value, "houseHostid");
            return (Criteria) this;
        }

        public Criteria andHouseHostidNotLike(String value) {
            addCriterion("house_hostId not like", value, "houseHostid");
            return (Criteria) this;
        }

        public Criteria andHouseHostidIn(List<String> values) {
            addCriterion("house_hostId in", values, "houseHostid");
            return (Criteria) this;
        }

        public Criteria andHouseHostidNotIn(List<String> values) {
            addCriterion("house_hostId not in", values, "houseHostid");
            return (Criteria) this;
        }

        public Criteria andHouseHostidBetween(String value1, String value2) {
            addCriterion("house_hostId between", value1, value2, "houseHostid");
            return (Criteria) this;
        }

        public Criteria andHouseHostidNotBetween(String value1, String value2) {
            addCriterion("house_hostId not between", value1, value2, "houseHostid");
            return (Criteria) this;
        }

        public Criteria andHouseHostnameIsNull() {
            addCriterion("house_hostname is null");
            return (Criteria) this;
        }

        public Criteria andHouseHostnameIsNotNull() {
            addCriterion("house_hostname is not null");
            return (Criteria) this;
        }

        public Criteria andHouseHostnameEqualTo(String value) {
            addCriterion("house_hostname =", value, "houseHostname");
            return (Criteria) this;
        }

        public Criteria andHouseHostnameNotEqualTo(String value) {
            addCriterion("house_hostname <>", value, "houseHostname");
            return (Criteria) this;
        }

        public Criteria andHouseHostnameGreaterThan(String value) {
            addCriterion("house_hostname >", value, "houseHostname");
            return (Criteria) this;
        }

        public Criteria andHouseHostnameGreaterThanOrEqualTo(String value) {
            addCriterion("house_hostname >=", value, "houseHostname");
            return (Criteria) this;
        }

        public Criteria andHouseHostnameLessThan(String value) {
            addCriterion("house_hostname <", value, "houseHostname");
            return (Criteria) this;
        }

        public Criteria andHouseHostnameLessThanOrEqualTo(String value) {
            addCriterion("house_hostname <=", value, "houseHostname");
            return (Criteria) this;
        }

        public Criteria andHouseHostnameLike(String value) {
            addCriterion("house_hostname like", value, "houseHostname");
            return (Criteria) this;
        }

        public Criteria andHouseHostnameNotLike(String value) {
            addCriterion("house_hostname not like", value, "houseHostname");
            return (Criteria) this;
        }

        public Criteria andHouseHostnameIn(List<String> values) {
            addCriterion("house_hostname in", values, "houseHostname");
            return (Criteria) this;
        }

        public Criteria andHouseHostnameNotIn(List<String> values) {
            addCriterion("house_hostname not in", values, "houseHostname");
            return (Criteria) this;
        }

        public Criteria andHouseHostnameBetween(String value1, String value2) {
            addCriterion("house_hostname between", value1, value2, "houseHostname");
            return (Criteria) this;
        }

        public Criteria andHouseHostnameNotBetween(String value1, String value2) {
            addCriterion("house_hostname not between", value1, value2, "houseHostname");
            return (Criteria) this;
        }

        public Criteria andHouseDescIsNull() {
            addCriterion("house_desc is null");
            return (Criteria) this;
        }

        public Criteria andHouseDescIsNotNull() {
            addCriterion("house_desc is not null");
            return (Criteria) this;
        }

        public Criteria andHouseDescEqualTo(String value) {
            addCriterion("house_desc =", value, "houseDesc");
            return (Criteria) this;
        }

        public Criteria andHouseDescNotEqualTo(String value) {
            addCriterion("house_desc <>", value, "houseDesc");
            return (Criteria) this;
        }

        public Criteria andHouseDescGreaterThan(String value) {
            addCriterion("house_desc >", value, "houseDesc");
            return (Criteria) this;
        }

        public Criteria andHouseDescGreaterThanOrEqualTo(String value) {
            addCriterion("house_desc >=", value, "houseDesc");
            return (Criteria) this;
        }

        public Criteria andHouseDescLessThan(String value) {
            addCriterion("house_desc <", value, "houseDesc");
            return (Criteria) this;
        }

        public Criteria andHouseDescLessThanOrEqualTo(String value) {
            addCriterion("house_desc <=", value, "houseDesc");
            return (Criteria) this;
        }

        public Criteria andHouseDescLike(String value) {
            addCriterion("house_desc like", value, "houseDesc");
            return (Criteria) this;
        }

        public Criteria andHouseDescNotLike(String value) {
            addCriterion("house_desc not like", value, "houseDesc");
            return (Criteria) this;
        }

        public Criteria andHouseDescIn(List<String> values) {
            addCriterion("house_desc in", values, "houseDesc");
            return (Criteria) this;
        }

        public Criteria andHouseDescNotIn(List<String> values) {
            addCriterion("house_desc not in", values, "houseDesc");
            return (Criteria) this;
        }

        public Criteria andHouseDescBetween(String value1, String value2) {
            addCriterion("house_desc between", value1, value2, "houseDesc");
            return (Criteria) this;
        }

        public Criteria andHouseDescNotBetween(String value1, String value2) {
            addCriterion("house_desc not between", value1, value2, "houseDesc");
            return (Criteria) this;
        }

        public Criteria andHouseStateIsNull() {
            addCriterion("house_state is null");
            return (Criteria) this;
        }

        public Criteria andHouseStateIsNotNull() {
            addCriterion("house_state is not null");
            return (Criteria) this;
        }

        public Criteria andHouseStateEqualTo(String value) {
            addCriterion("house_state =", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateNotEqualTo(String value) {
            addCriterion("house_state <>", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateGreaterThan(String value) {
            addCriterion("house_state >", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateGreaterThanOrEqualTo(String value) {
            addCriterion("house_state >=", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateLessThan(String value) {
            addCriterion("house_state <", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateLessThanOrEqualTo(String value) {
            addCriterion("house_state <=", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateLike(String value) {
            addCriterion("house_state like", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateNotLike(String value) {
            addCriterion("house_state not like", value, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateIn(List<String> values) {
            addCriterion("house_state in", values, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateNotIn(List<String> values) {
            addCriterion("house_state not in", values, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateBetween(String value1, String value2) {
            addCriterion("house_state between", value1, value2, "houseState");
            return (Criteria) this;
        }

        public Criteria andHouseStateNotBetween(String value1, String value2) {
            addCriterion("house_state not between", value1, value2, "houseState");
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