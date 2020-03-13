package com.iking.provider.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class AssetsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetsInfoExample() {
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

        public Criteria andAssetsIdIsNull() {
            addCriterion("assets_id is null");
            return (Criteria) this;
        }

        public Criteria andAssetsIdIsNotNull() {
            addCriterion("assets_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssetsIdEqualTo(String value) {
            addCriterion("assets_id =", value, "assetsId");
            return (Criteria) this;
        }

        public Criteria andAssetsIdNotEqualTo(String value) {
            addCriterion("assets_id <>", value, "assetsId");
            return (Criteria) this;
        }

        public Criteria andAssetsIdGreaterThan(String value) {
            addCriterion("assets_id >", value, "assetsId");
            return (Criteria) this;
        }

        public Criteria andAssetsIdGreaterThanOrEqualTo(String value) {
            addCriterion("assets_id >=", value, "assetsId");
            return (Criteria) this;
        }

        public Criteria andAssetsIdLessThan(String value) {
            addCriterion("assets_id <", value, "assetsId");
            return (Criteria) this;
        }

        public Criteria andAssetsIdLessThanOrEqualTo(String value) {
            addCriterion("assets_id <=", value, "assetsId");
            return (Criteria) this;
        }

        public Criteria andAssetsIdLike(String value) {
            addCriterion("assets_id like", value, "assetsId");
            return (Criteria) this;
        }

        public Criteria andAssetsIdNotLike(String value) {
            addCriterion("assets_id not like", value, "assetsId");
            return (Criteria) this;
        }

        public Criteria andAssetsIdIn(List<String> values) {
            addCriterion("assets_id in", values, "assetsId");
            return (Criteria) this;
        }

        public Criteria andAssetsIdNotIn(List<String> values) {
            addCriterion("assets_id not in", values, "assetsId");
            return (Criteria) this;
        }

        public Criteria andAssetsIdBetween(String value1, String value2) {
            addCriterion("assets_id between", value1, value2, "assetsId");
            return (Criteria) this;
        }

        public Criteria andAssetsIdNotBetween(String value1, String value2) {
            addCriterion("assets_id not between", value1, value2, "assetsId");
            return (Criteria) this;
        }

        public Criteria andAssetsNameIsNull() {
            addCriterion("assets_name is null");
            return (Criteria) this;
        }

        public Criteria andAssetsNameIsNotNull() {
            addCriterion("assets_name is not null");
            return (Criteria) this;
        }

        public Criteria andAssetsNameEqualTo(String value) {
            addCriterion("assets_name =", value, "assetsName");
            return (Criteria) this;
        }

        public Criteria andAssetsNameNotEqualTo(String value) {
            addCriterion("assets_name <>", value, "assetsName");
            return (Criteria) this;
        }

        public Criteria andAssetsNameGreaterThan(String value) {
            addCriterion("assets_name >", value, "assetsName");
            return (Criteria) this;
        }

        public Criteria andAssetsNameGreaterThanOrEqualTo(String value) {
            addCriterion("assets_name >=", value, "assetsName");
            return (Criteria) this;
        }

        public Criteria andAssetsNameLessThan(String value) {
            addCriterion("assets_name <", value, "assetsName");
            return (Criteria) this;
        }

        public Criteria andAssetsNameLessThanOrEqualTo(String value) {
            addCriterion("assets_name <=", value, "assetsName");
            return (Criteria) this;
        }

        public Criteria andAssetsNameLike(String value) {
            addCriterion("assets_name like", value, "assetsName");
            return (Criteria) this;
        }

        public Criteria andAssetsNameNotLike(String value) {
            addCriterion("assets_name not like", value, "assetsName");
            return (Criteria) this;
        }

        public Criteria andAssetsNameIn(List<String> values) {
            addCriterion("assets_name in", values, "assetsName");
            return (Criteria) this;
        }

        public Criteria andAssetsNameNotIn(List<String> values) {
            addCriterion("assets_name not in", values, "assetsName");
            return (Criteria) this;
        }

        public Criteria andAssetsNameBetween(String value1, String value2) {
            addCriterion("assets_name between", value1, value2, "assetsName");
            return (Criteria) this;
        }

        public Criteria andAssetsNameNotBetween(String value1, String value2) {
            addCriterion("assets_name not between", value1, value2, "assetsName");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeIsNull() {
            addCriterion("assets_type is null");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeIsNotNull() {
            addCriterion("assets_type is not null");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeEqualTo(String value) {
            addCriterion("assets_type =", value, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeNotEqualTo(String value) {
            addCriterion("assets_type <>", value, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeGreaterThan(String value) {
            addCriterion("assets_type >", value, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("assets_type >=", value, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeLessThan(String value) {
            addCriterion("assets_type <", value, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeLessThanOrEqualTo(String value) {
            addCriterion("assets_type <=", value, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeLike(String value) {
            addCriterion("assets_type like", value, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeNotLike(String value) {
            addCriterion("assets_type not like", value, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeIn(List<String> values) {
            addCriterion("assets_type in", values, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeNotIn(List<String> values) {
            addCriterion("assets_type not in", values, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeBetween(String value1, String value2) {
            addCriterion("assets_type between", value1, value2, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsTypeNotBetween(String value1, String value2) {
            addCriterion("assets_type not between", value1, value2, "assetsType");
            return (Criteria) this;
        }

        public Criteria andAssetsUseIsNull() {
            addCriterion("assets_use is null");
            return (Criteria) this;
        }

        public Criteria andAssetsUseIsNotNull() {
            addCriterion("assets_use is not null");
            return (Criteria) this;
        }

        public Criteria andAssetsUseEqualTo(String value) {
            addCriterion("assets_use =", value, "assetsUse");
            return (Criteria) this;
        }

        public Criteria andAssetsUseNotEqualTo(String value) {
            addCriterion("assets_use <>", value, "assetsUse");
            return (Criteria) this;
        }

        public Criteria andAssetsUseGreaterThan(String value) {
            addCriterion("assets_use >", value, "assetsUse");
            return (Criteria) this;
        }

        public Criteria andAssetsUseGreaterThanOrEqualTo(String value) {
            addCriterion("assets_use >=", value, "assetsUse");
            return (Criteria) this;
        }

        public Criteria andAssetsUseLessThan(String value) {
            addCriterion("assets_use <", value, "assetsUse");
            return (Criteria) this;
        }

        public Criteria andAssetsUseLessThanOrEqualTo(String value) {
            addCriterion("assets_use <=", value, "assetsUse");
            return (Criteria) this;
        }

        public Criteria andAssetsUseLike(String value) {
            addCriterion("assets_use like", value, "assetsUse");
            return (Criteria) this;
        }

        public Criteria andAssetsUseNotLike(String value) {
            addCriterion("assets_use not like", value, "assetsUse");
            return (Criteria) this;
        }

        public Criteria andAssetsUseIn(List<String> values) {
            addCriterion("assets_use in", values, "assetsUse");
            return (Criteria) this;
        }

        public Criteria andAssetsUseNotIn(List<String> values) {
            addCriterion("assets_use not in", values, "assetsUse");
            return (Criteria) this;
        }

        public Criteria andAssetsUseBetween(String value1, String value2) {
            addCriterion("assets_use between", value1, value2, "assetsUse");
            return (Criteria) this;
        }

        public Criteria andAssetsUseNotBetween(String value1, String value2) {
            addCriterion("assets_use not between", value1, value2, "assetsUse");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andField1IsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andField1IsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andField1EqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andField1NotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andField1GreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andField1GreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andField1LessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andField1LessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andField1Like(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andField1NotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andField1In(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andField1NotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andField1Between(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andField1NotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andField2IsNull() {
            addCriterion("opreate is null");
            return (Criteria) this;
        }

        public Criteria andField2IsNotNull() {
            addCriterion("opreate is not null");
            return (Criteria) this;
        }

        public Criteria andField2EqualTo(String value) {
            addCriterion("opreate =", value, "opreate");
            return (Criteria) this;
        }

        public Criteria andField2NotEqualTo(String value) {
            addCriterion("opreate <>", value, "opreate");
            return (Criteria) this;
        }

        public Criteria andField2GreaterThan(String value) {
            addCriterion("opreate >", value, "opreate");
            return (Criteria) this;
        }

        public Criteria andField2GreaterThanOrEqualTo(String value) {
            addCriterion("opreate >=", value, "opreate");
            return (Criteria) this;
        }

        public Criteria andField2LessThan(String value) {
            addCriterion("opreate <", value, "opreate");
            return (Criteria) this;
        }

        public Criteria andField2LessThanOrEqualTo(String value) {
            addCriterion("opreate <=", value, "opreate");
            return (Criteria) this;
        }

        public Criteria andField2Like(String value) {
            addCriterion("opreate like", value, "opreate");
            return (Criteria) this;
        }

        public Criteria andField2NotLike(String value) {
            addCriterion("opreate not like", value, "opreate");
            return (Criteria) this;
        }

        public Criteria andField2In(List<String> values) {
            addCriterion("opreate in", values, "opreate");
            return (Criteria) this;
        }

        public Criteria andField2NotIn(List<String> values) {
            addCriterion("opreate not in", values, "opreate");
            return (Criteria) this;
        }

        public Criteria andField2Between(String value1, String value2) {
            addCriterion("opreate between", value1, value2, "opreate");
            return (Criteria) this;
        }

        public Criteria andField2NotBetween(String value1, String value2) {
            addCriterion("opreate not between", value1, value2, "opreate");
            return (Criteria) this;
        }

        public Criteria andField3IsNull() {
            addCriterion("field3 is null");
            return (Criteria) this;
        }

        public Criteria andField3IsNotNull() {
            addCriterion("field3 is not null");
            return (Criteria) this;
        }

        public Criteria andField3EqualTo(String value) {
            addCriterion("field3 =", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3NotEqualTo(String value) {
            addCriterion("field3 <>", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3GreaterThan(String value) {
            addCriterion("field3 >", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3GreaterThanOrEqualTo(String value) {
            addCriterion("field3 >=", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3LessThan(String value) {
            addCriterion("field3 <", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3LessThanOrEqualTo(String value) {
            addCriterion("field3 <=", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3Like(String value) {
            addCriterion("field3 like", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3NotLike(String value) {
            addCriterion("field3 not like", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3In(List<String> values) {
            addCriterion("field3 in", values, "field3");
            return (Criteria) this;
        }

        public Criteria andField3NotIn(List<String> values) {
            addCriterion("field3 not in", values, "field3");
            return (Criteria) this;
        }

        public Criteria andField3Between(String value1, String value2) {
            addCriterion("field3 between", value1, value2, "field3");
            return (Criteria) this;
        }

        public Criteria andField3NotBetween(String value1, String value2) {
            addCriterion("field3 not between", value1, value2, "field3");
            return (Criteria) this;
        }

        public Criteria andField4IsNull() {
            addCriterion("field4 is null");
            return (Criteria) this;
        }

        public Criteria andField4IsNotNull() {
            addCriterion("field4 is not null");
            return (Criteria) this;
        }

        public Criteria andField4EqualTo(String value) {
            addCriterion("field4 =", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4NotEqualTo(String value) {
            addCriterion("field4 <>", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4GreaterThan(String value) {
            addCriterion("field4 >", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4GreaterThanOrEqualTo(String value) {
            addCriterion("field4 >=", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4LessThan(String value) {
            addCriterion("field4 <", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4LessThanOrEqualTo(String value) {
            addCriterion("field4 <=", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4Like(String value) {
            addCriterion("field4 like", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4NotLike(String value) {
            addCriterion("field4 not like", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4In(List<String> values) {
            addCriterion("field4 in", values, "field4");
            return (Criteria) this;
        }

        public Criteria andField4NotIn(List<String> values) {
            addCriterion("field4 not in", values, "field4");
            return (Criteria) this;
        }

        public Criteria andField4Between(String value1, String value2) {
            addCriterion("field4 between", value1, value2, "field4");
            return (Criteria) this;
        }

        public Criteria andField4NotBetween(String value1, String value2) {
            addCriterion("field4 not between", value1, value2, "field4");
            return (Criteria) this;
        }

        public Criteria andField5IsNull() {
            addCriterion("field5 is null");
            return (Criteria) this;
        }

        public Criteria andField5IsNotNull() {
            addCriterion("field5 is not null");
            return (Criteria) this;
        }

        public Criteria andField5EqualTo(String value) {
            addCriterion("field5 =", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5NotEqualTo(String value) {
            addCriterion("field5 <>", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5GreaterThan(String value) {
            addCriterion("field5 >", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5GreaterThanOrEqualTo(String value) {
            addCriterion("field5 >=", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5LessThan(String value) {
            addCriterion("field5 <", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5LessThanOrEqualTo(String value) {
            addCriterion("field5 <=", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5Like(String value) {
            addCriterion("field5 like", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5NotLike(String value) {
            addCriterion("field5 not like", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5In(List<String> values) {
            addCriterion("field5 in", values, "field5");
            return (Criteria) this;
        }

        public Criteria andField5NotIn(List<String> values) {
            addCriterion("field5 not in", values, "field5");
            return (Criteria) this;
        }

        public Criteria andField5Between(String value1, String value2) {
            addCriterion("field5 between", value1, value2, "field5");
            return (Criteria) this;
        }

        public Criteria andField5NotBetween(String value1, String value2) {
            addCriterion("field5 not between", value1, value2, "field5");
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