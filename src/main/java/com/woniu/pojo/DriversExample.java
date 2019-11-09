package com.woniu.pojo;

import java.util.ArrayList;
import java.util.List;

public class DriversExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DriversExample() {
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

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDnameIsNull() {
            addCriterion("dname is null");
            return (Criteria) this;
        }

        public Criteria andDnameIsNotNull() {
            addCriterion("dname is not null");
            return (Criteria) this;
        }

        public Criteria andDnameEqualTo(String value) {
            addCriterion("dname =", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotEqualTo(String value) {
            addCriterion("dname <>", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThan(String value) {
            addCriterion("dname >", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThanOrEqualTo(String value) {
            addCriterion("dname >=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThan(String value) {
            addCriterion("dname <", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThanOrEqualTo(String value) {
            addCriterion("dname <=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLike(String value) {
            addCriterion("dname like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotLike(String value) {
            addCriterion("dname not like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameIn(List<String> values) {
            addCriterion("dname in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotIn(List<String> values) {
            addCriterion("dname not in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameBetween(String value1, String value2) {
            addCriterion("dname between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotBetween(String value1, String value2) {
            addCriterion("dname not between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDtelIsNull() {
            addCriterion("dtel is null");
            return (Criteria) this;
        }

        public Criteria andDtelIsNotNull() {
            addCriterion("dtel is not null");
            return (Criteria) this;
        }

        public Criteria andDtelEqualTo(Integer value) {
            addCriterion("dtel =", value, "dtel");
            return (Criteria) this;
        }

        public Criteria andDtelNotEqualTo(Integer value) {
            addCriterion("dtel <>", value, "dtel");
            return (Criteria) this;
        }

        public Criteria andDtelGreaterThan(Integer value) {
            addCriterion("dtel >", value, "dtel");
            return (Criteria) this;
        }

        public Criteria andDtelGreaterThanOrEqualTo(Integer value) {
            addCriterion("dtel >=", value, "dtel");
            return (Criteria) this;
        }

        public Criteria andDtelLessThan(Integer value) {
            addCriterion("dtel <", value, "dtel");
            return (Criteria) this;
        }

        public Criteria andDtelLessThanOrEqualTo(Integer value) {
            addCriterion("dtel <=", value, "dtel");
            return (Criteria) this;
        }

        public Criteria andDtelIn(List<Integer> values) {
            addCriterion("dtel in", values, "dtel");
            return (Criteria) this;
        }

        public Criteria andDtelNotIn(List<Integer> values) {
            addCriterion("dtel not in", values, "dtel");
            return (Criteria) this;
        }

        public Criteria andDtelBetween(Integer value1, Integer value2) {
            addCriterion("dtel between", value1, value2, "dtel");
            return (Criteria) this;
        }

        public Criteria andDtelNotBetween(Integer value1, Integer value2) {
            addCriterion("dtel not between", value1, value2, "dtel");
            return (Criteria) this;
        }

        public Criteria andDfaceIsNull() {
            addCriterion("dface is null");
            return (Criteria) this;
        }

        public Criteria andDfaceIsNotNull() {
            addCriterion("dface is not null");
            return (Criteria) this;
        }

        public Criteria andDfaceEqualTo(String value) {
            addCriterion("dface =", value, "dface");
            return (Criteria) this;
        }

        public Criteria andDfaceNotEqualTo(String value) {
            addCriterion("dface <>", value, "dface");
            return (Criteria) this;
        }

        public Criteria andDfaceGreaterThan(String value) {
            addCriterion("dface >", value, "dface");
            return (Criteria) this;
        }

        public Criteria andDfaceGreaterThanOrEqualTo(String value) {
            addCriterion("dface >=", value, "dface");
            return (Criteria) this;
        }

        public Criteria andDfaceLessThan(String value) {
            addCriterion("dface <", value, "dface");
            return (Criteria) this;
        }

        public Criteria andDfaceLessThanOrEqualTo(String value) {
            addCriterion("dface <=", value, "dface");
            return (Criteria) this;
        }

        public Criteria andDfaceLike(String value) {
            addCriterion("dface like", value, "dface");
            return (Criteria) this;
        }

        public Criteria andDfaceNotLike(String value) {
            addCriterion("dface not like", value, "dface");
            return (Criteria) this;
        }

        public Criteria andDfaceIn(List<String> values) {
            addCriterion("dface in", values, "dface");
            return (Criteria) this;
        }

        public Criteria andDfaceNotIn(List<String> values) {
            addCriterion("dface not in", values, "dface");
            return (Criteria) this;
        }

        public Criteria andDfaceBetween(String value1, String value2) {
            addCriterion("dface between", value1, value2, "dface");
            return (Criteria) this;
        }

        public Criteria andDfaceNotBetween(String value1, String value2) {
            addCriterion("dface not between", value1, value2, "dface");
            return (Criteria) this;
        }

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andDphotoIsNull() {
            addCriterion("dphoto is null");
            return (Criteria) this;
        }

        public Criteria andDphotoIsNotNull() {
            addCriterion("dphoto is not null");
            return (Criteria) this;
        }

        public Criteria andDphotoEqualTo(String value) {
            addCriterion("dphoto =", value, "dphoto");
            return (Criteria) this;
        }

        public Criteria andDphotoNotEqualTo(String value) {
            addCriterion("dphoto <>", value, "dphoto");
            return (Criteria) this;
        }

        public Criteria andDphotoGreaterThan(String value) {
            addCriterion("dphoto >", value, "dphoto");
            return (Criteria) this;
        }

        public Criteria andDphotoGreaterThanOrEqualTo(String value) {
            addCriterion("dphoto >=", value, "dphoto");
            return (Criteria) this;
        }

        public Criteria andDphotoLessThan(String value) {
            addCriterion("dphoto <", value, "dphoto");
            return (Criteria) this;
        }

        public Criteria andDphotoLessThanOrEqualTo(String value) {
            addCriterion("dphoto <=", value, "dphoto");
            return (Criteria) this;
        }

        public Criteria andDphotoLike(String value) {
            addCriterion("dphoto like", value, "dphoto");
            return (Criteria) this;
        }

        public Criteria andDphotoNotLike(String value) {
            addCriterion("dphoto not like", value, "dphoto");
            return (Criteria) this;
        }

        public Criteria andDphotoIn(List<String> values) {
            addCriterion("dphoto in", values, "dphoto");
            return (Criteria) this;
        }

        public Criteria andDphotoNotIn(List<String> values) {
            addCriterion("dphoto not in", values, "dphoto");
            return (Criteria) this;
        }

        public Criteria andDphotoBetween(String value1, String value2) {
            addCriterion("dphoto between", value1, value2, "dphoto");
            return (Criteria) this;
        }

        public Criteria andDphotoNotBetween(String value1, String value2) {
            addCriterion("dphoto not between", value1, value2, "dphoto");
            return (Criteria) this;
        }

        public Criteria andDstatusIsNull() {
            addCriterion("dstatus is null");
            return (Criteria) this;
        }

        public Criteria andDstatusIsNotNull() {
            addCriterion("dstatus is not null");
            return (Criteria) this;
        }

        public Criteria andDstatusEqualTo(Integer value) {
            addCriterion("dstatus =", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusNotEqualTo(Integer value) {
            addCriterion("dstatus <>", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusGreaterThan(Integer value) {
            addCriterion("dstatus >", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("dstatus >=", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusLessThan(Integer value) {
            addCriterion("dstatus <", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusLessThanOrEqualTo(Integer value) {
            addCriterion("dstatus <=", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusIn(List<Integer> values) {
            addCriterion("dstatus in", values, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusNotIn(List<Integer> values) {
            addCriterion("dstatus not in", values, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusBetween(Integer value1, Integer value2) {
            addCriterion("dstatus between", value1, value2, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("dstatus not between", value1, value2, "dstatus");
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