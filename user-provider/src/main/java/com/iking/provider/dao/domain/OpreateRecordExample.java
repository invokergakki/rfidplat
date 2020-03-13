package com.iking.provider.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class OpreateRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OpreateRecordExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAddedNumberIsNull() {
            addCriterion("added_number is null");
            return (Criteria) this;
        }

        public Criteria andAddedNumberIsNotNull() {
            addCriterion("added_number is not null");
            return (Criteria) this;
        }

        public Criteria andAddedNumberEqualTo(Integer value) {
            addCriterion("added_number =", value, "addedNumber");
            return (Criteria) this;
        }

        public Criteria andAddedNumberNotEqualTo(Integer value) {
            addCriterion("added_number <>", value, "addedNumber");
            return (Criteria) this;
        }

        public Criteria andAddedNumberGreaterThan(Integer value) {
            addCriterion("added_number >", value, "addedNumber");
            return (Criteria) this;
        }

        public Criteria andAddedNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("added_number >=", value, "addedNumber");
            return (Criteria) this;
        }

        public Criteria andAddedNumberLessThan(Integer value) {
            addCriterion("added_number <", value, "addedNumber");
            return (Criteria) this;
        }

        public Criteria andAddedNumberLessThanOrEqualTo(Integer value) {
            addCriterion("added_number <=", value, "addedNumber");
            return (Criteria) this;
        }

        public Criteria andAddedNumberIn(List<Integer> values) {
            addCriterion("added_number in", values, "addedNumber");
            return (Criteria) this;
        }

        public Criteria andAddedNumberNotIn(List<Integer> values) {
            addCriterion("added_number not in", values, "addedNumber");
            return (Criteria) this;
        }

        public Criteria andAddedNumberBetween(Integer value1, Integer value2) {
            addCriterion("added_number between", value1, value2, "addedNumber");
            return (Criteria) this;
        }

        public Criteria andAddedNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("added_number not between", value1, value2, "addedNumber");
            return (Criteria) this;
        }

        public Criteria andUpdatedNumberIsNull() {
            addCriterion("updated_number is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedNumberIsNotNull() {
            addCriterion("updated_number is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedNumberEqualTo(Integer value) {
            addCriterion("updated_number =", value, "updatedNumber");
            return (Criteria) this;
        }

        public Criteria andUpdatedNumberNotEqualTo(Integer value) {
            addCriterion("updated_number <>", value, "updatedNumber");
            return (Criteria) this;
        }

        public Criteria andUpdatedNumberGreaterThan(Integer value) {
            addCriterion("updated_number >", value, "updatedNumber");
            return (Criteria) this;
        }

        public Criteria andUpdatedNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("updated_number >=", value, "updatedNumber");
            return (Criteria) this;
        }

        public Criteria andUpdatedNumberLessThan(Integer value) {
            addCriterion("updated_number <", value, "updatedNumber");
            return (Criteria) this;
        }

        public Criteria andUpdatedNumberLessThanOrEqualTo(Integer value) {
            addCriterion("updated_number <=", value, "updatedNumber");
            return (Criteria) this;
        }

        public Criteria andUpdatedNumberIn(List<Integer> values) {
            addCriterion("updated_number in", values, "updatedNumber");
            return (Criteria) this;
        }

        public Criteria andUpdatedNumberNotIn(List<Integer> values) {
            addCriterion("updated_number not in", values, "updatedNumber");
            return (Criteria) this;
        }

        public Criteria andUpdatedNumberBetween(Integer value1, Integer value2) {
            addCriterion("updated_number between", value1, value2, "updatedNumber");
            return (Criteria) this;
        }

        public Criteria andUpdatedNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("updated_number not between", value1, value2, "updatedNumber");
            return (Criteria) this;
        }

        public Criteria andIsQueriedIsNull() {
            addCriterion("is_queried is null");
            return (Criteria) this;
        }

        public Criteria andIsQueriedIsNotNull() {
            addCriterion("is_queried is not null");
            return (Criteria) this;
        }

        public Criteria andIsQueriedEqualTo(String value) {
            addCriterion("is_queried =", value, "isQueried");
            return (Criteria) this;
        }

        public Criteria andIsQueriedNotEqualTo(String value) {
            addCriterion("is_queried <>", value, "isQueried");
            return (Criteria) this;
        }

        public Criteria andIsQueriedGreaterThan(String value) {
            addCriterion("is_queried >", value, "isQueried");
            return (Criteria) this;
        }

        public Criteria andIsQueriedGreaterThanOrEqualTo(String value) {
            addCriterion("is_queried >=", value, "isQueried");
            return (Criteria) this;
        }

        public Criteria andIsQueriedLessThan(String value) {
            addCriterion("is_queried <", value, "isQueried");
            return (Criteria) this;
        }

        public Criteria andIsQueriedLessThanOrEqualTo(String value) {
            addCriterion("is_queried <=", value, "isQueried");
            return (Criteria) this;
        }

        public Criteria andIsQueriedLike(String value) {
            addCriterion("is_queried like", value, "isQueried");
            return (Criteria) this;
        }

        public Criteria andIsQueriedNotLike(String value) {
            addCriterion("is_queried not like", value, "isQueried");
            return (Criteria) this;
        }

        public Criteria andIsQueriedIn(List<String> values) {
            addCriterion("is_queried in", values, "isQueried");
            return (Criteria) this;
        }

        public Criteria andIsQueriedNotIn(List<String> values) {
            addCriterion("is_queried not in", values, "isQueried");
            return (Criteria) this;
        }

        public Criteria andIsQueriedBetween(String value1, String value2) {
            addCriterion("is_queried between", value1, value2, "isQueried");
            return (Criteria) this;
        }

        public Criteria andIsQueriedNotBetween(String value1, String value2) {
            addCriterion("is_queried not between", value1, value2, "isQueried");
            return (Criteria) this;
        }
    }

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