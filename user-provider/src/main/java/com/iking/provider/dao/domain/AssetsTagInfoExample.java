package com.iking.provider.dao.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssetsTagInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetsTagInfoExample() {
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

        public Criteria andEpcIdIsNull() {
            addCriterion("epc_id is null");
            return (Criteria) this;
        }

        public Criteria andEpcIdIsNotNull() {
            addCriterion("epc_id is not null");
            return (Criteria) this;
        }

        public Criteria andEpcIdEqualTo(String value) {
            addCriterion("epc_id =", value, "epcId");
            return (Criteria) this;
        }

        public Criteria andEpcIdNotEqualTo(String value) {
            addCriterion("epc_id <>", value, "epcId");
            return (Criteria) this;
        }

        public Criteria andEpcIdGreaterThan(String value) {
            addCriterion("epc_id >", value, "epcId");
            return (Criteria) this;
        }

        public Criteria andEpcIdGreaterThanOrEqualTo(String value) {
            addCriterion("epc_id >=", value, "epcId");
            return (Criteria) this;
        }

        public Criteria andEpcIdLessThan(String value) {
            addCriterion("epc_id <", value, "epcId");
            return (Criteria) this;
        }

        public Criteria andEpcIdLessThanOrEqualTo(String value) {
            addCriterion("epc_id <=", value, "epcId");
            return (Criteria) this;
        }

        public Criteria andEpcIdLike(String value) {
            addCriterion("epc_id like", value, "epcId");
            return (Criteria) this;
        }

        public Criteria andEpcIdNotLike(String value) {
            addCriterion("epc_id not like", value, "epcId");
            return (Criteria) this;
        }

        public Criteria andEpcIdIn(List<String> values) {
            addCriterion("epc_id in", values, "epcId");
            return (Criteria) this;
        }

        public Criteria andEpcIdNotIn(List<String> values) {
            addCriterion("epc_id not in", values, "epcId");
            return (Criteria) this;
        }

        public Criteria andEpcIdBetween(String value1, String value2) {
            addCriterion("epc_id between", value1, value2, "epcId");
            return (Criteria) this;
        }

        public Criteria andEpcIdNotBetween(String value1, String value2) {
            addCriterion("epc_id not between", value1, value2, "epcId");
            return (Criteria) this;
        }

        public Criteria andAssetsNumberIsNull() {
            addCriterion("assets_number is null");
            return (Criteria) this;
        }

        public Criteria andAssetsNumberIsNotNull() {
            addCriterion("assets_number is not null");
            return (Criteria) this;
        }

        public Criteria andAssetsNumberEqualTo(String value) {
            addCriterion("assets_number =", value, "assetsNumber");
            return (Criteria) this;
        }

        public Criteria andAssetsNumberNotEqualTo(String value) {
            addCriterion("assets_number <>", value, "assetsNumber");
            return (Criteria) this;
        }

        public Criteria andAssetsNumberGreaterThan(String value) {
            addCriterion("assets_number >", value, "assetsNumber");
            return (Criteria) this;
        }

        public Criteria andAssetsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("assets_number >=", value, "assetsNumber");
            return (Criteria) this;
        }

        public Criteria andAssetsNumberLessThan(String value) {
            addCriterion("assets_number <", value, "assetsNumber");
            return (Criteria) this;
        }

        public Criteria andAssetsNumberLessThanOrEqualTo(String value) {
            addCriterion("assets_number <=", value, "assetsNumber");
            return (Criteria) this;
        }

        public Criteria andAssetsNumberLike(String value) {
            addCriterion("assets_number like", value, "assetsNumber");
            return (Criteria) this;
        }

        public Criteria andAssetsNumberNotLike(String value) {
            addCriterion("assets_number not like", value, "assetsNumber");
            return (Criteria) this;
        }

        public Criteria andAssetsNumberIn(List<String> values) {
            addCriterion("assets_number in", values, "assetsNumber");
            return (Criteria) this;
        }

        public Criteria andAssetsNumberNotIn(List<String> values) {
            addCriterion("assets_number not in", values, "assetsNumber");
            return (Criteria) this;
        }

        public Criteria andAssetsNumberBetween(String value1, String value2) {
            addCriterion("assets_number between", value1, value2, "assetsNumber");
            return (Criteria) this;
        }

        public Criteria andAssetsNumberNotBetween(String value1, String value2) {
            addCriterion("assets_number not between", value1, value2, "assetsNumber");
            return (Criteria) this;
        }

        public Criteria andScanDateIsNull() {
            addCriterion("scan_date is null");
            return (Criteria) this;
        }

        public Criteria andScanDateIsNotNull() {
            addCriterion("scan_date is not null");
            return (Criteria) this;
        }

        public Criteria andScanDateEqualTo(Date value) {
            addCriterion("scan_date =", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateNotEqualTo(Date value) {
            addCriterion("scan_date <>", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateGreaterThan(Date value) {
            addCriterion("scan_date >", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateGreaterThanOrEqualTo(Date value) {
            addCriterion("scan_date >=", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateLessThan(Date value) {
            addCriterion("scan_date <", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateLessThanOrEqualTo(Date value) {
            addCriterion("scan_date <=", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateIn(List<Date> values) {
            addCriterion("scan_date in", values, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateNotIn(List<Date> values) {
            addCriterion("scan_date not in", values, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateBetween(Date value1, Date value2) {
            addCriterion("scan_date between", value1, value2, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateNotBetween(Date value1, Date value2) {
            addCriterion("scan_date not between", value1, value2, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanPlaceIsNull() {
            addCriterion("scan_place is null");
            return (Criteria) this;
        }

        public Criteria andScanPlaceIsNotNull() {
            addCriterion("scan_place is not null");
            return (Criteria) this;
        }

        public Criteria andScanPlaceEqualTo(String value) {
            addCriterion("scan_place =", value, "scanPlace");
            return (Criteria) this;
        }

        public Criteria andScanPlaceNotEqualTo(String value) {
            addCriterion("scan_place <>", value, "scanPlace");
            return (Criteria) this;
        }

        public Criteria andScanPlaceGreaterThan(String value) {
            addCriterion("scan_place >", value, "scanPlace");
            return (Criteria) this;
        }

        public Criteria andScanPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("scan_place >=", value, "scanPlace");
            return (Criteria) this;
        }

        public Criteria andScanPlaceLessThan(String value) {
            addCriterion("scan_place <", value, "scanPlace");
            return (Criteria) this;
        }

        public Criteria andScanPlaceLessThanOrEqualTo(String value) {
            addCriterion("scan_place <=", value, "scanPlace");
            return (Criteria) this;
        }

        public Criteria andScanPlaceLike(String value) {
            addCriterion("scan_place like", value, "scanPlace");
            return (Criteria) this;
        }

        public Criteria andScanPlaceNotLike(String value) {
            addCriterion("scan_place not like", value, "scanPlace");
            return (Criteria) this;
        }

        public Criteria andScanPlaceIn(List<String> values) {
            addCriterion("scan_place in", values, "scanPlace");
            return (Criteria) this;
        }

        public Criteria andScanPlaceNotIn(List<String> values) {
            addCriterion("scan_place not in", values, "scanPlace");
            return (Criteria) this;
        }

        public Criteria andScanPlaceBetween(String value1, String value2) {
            addCriterion("scan_place between", value1, value2, "scanPlace");
            return (Criteria) this;
        }

        public Criteria andScanPlaceNotBetween(String value1, String value2) {
            addCriterion("scan_place not between", value1, value2, "scanPlace");
            return (Criteria) this;
        }

        public Criteria andDevNameIsNull() {
            addCriterion("dev_name is null");
            return (Criteria) this;
        }

        public Criteria andDevNameIsNotNull() {
            addCriterion("dev_name is not null");
            return (Criteria) this;
        }

        public Criteria andDevNameEqualTo(String value) {
            addCriterion("dev_name =", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotEqualTo(String value) {
            addCriterion("dev_name <>", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameGreaterThan(String value) {
            addCriterion("dev_name >", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameGreaterThanOrEqualTo(String value) {
            addCriterion("dev_name >=", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameLessThan(String value) {
            addCriterion("dev_name <", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameLessThanOrEqualTo(String value) {
            addCriterion("dev_name <=", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameLike(String value) {
            addCriterion("dev_name like", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotLike(String value) {
            addCriterion("dev_name not like", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameIn(List<String> values) {
            addCriterion("dev_name in", values, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotIn(List<String> values) {
            addCriterion("dev_name not in", values, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameBetween(String value1, String value2) {
            addCriterion("dev_name between", value1, value2, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotBetween(String value1, String value2) {
            addCriterion("dev_name not between", value1, value2, "devName");
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