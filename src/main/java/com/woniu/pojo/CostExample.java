package com.woniu.pojo;

import java.util.ArrayList;
import java.util.List;

public class CostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CostExample() {
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

        public Criteria andCostidIsNull() {
            addCriterion("costid is null");
            return (Criteria) this;
        }

        public Criteria andCostidIsNotNull() {
            addCriterion("costid is not null");
            return (Criteria) this;
        }

        public Criteria andCostidEqualTo(Integer value) {
            addCriterion("costid =", value, "costid");
            return (Criteria) this;
        }

        public Criteria andCostidNotEqualTo(Integer value) {
            addCriterion("costid <>", value, "costid");
            return (Criteria) this;
        }

        public Criteria andCostidGreaterThan(Integer value) {
            addCriterion("costid >", value, "costid");
            return (Criteria) this;
        }

        public Criteria andCostidGreaterThanOrEqualTo(Integer value) {
            addCriterion("costid >=", value, "costid");
            return (Criteria) this;
        }

        public Criteria andCostidLessThan(Integer value) {
            addCriterion("costid <", value, "costid");
            return (Criteria) this;
        }

        public Criteria andCostidLessThanOrEqualTo(Integer value) {
            addCriterion("costid <=", value, "costid");
            return (Criteria) this;
        }

        public Criteria andCostidIn(List<Integer> values) {
            addCriterion("costid in", values, "costid");
            return (Criteria) this;
        }

        public Criteria andCostidNotIn(List<Integer> values) {
            addCriterion("costid not in", values, "costid");
            return (Criteria) this;
        }

        public Criteria andCostidBetween(Integer value1, Integer value2) {
            addCriterion("costid between", value1, value2, "costid");
            return (Criteria) this;
        }

        public Criteria andCostidNotBetween(Integer value1, Integer value2) {
            addCriterion("costid not between", value1, value2, "costid");
            return (Criteria) this;
        }

        public Criteria andWagesIsNull() {
            addCriterion("wages is null");
            return (Criteria) this;
        }

        public Criteria andWagesIsNotNull() {
            addCriterion("wages is not null");
            return (Criteria) this;
        }

        public Criteria andWagesEqualTo(Double value) {
            addCriterion("wages =", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesNotEqualTo(Double value) {
            addCriterion("wages <>", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesGreaterThan(Double value) {
            addCriterion("wages >", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesGreaterThanOrEqualTo(Double value) {
            addCriterion("wages >=", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesLessThan(Double value) {
            addCriterion("wages <", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesLessThanOrEqualTo(Double value) {
            addCriterion("wages <=", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesIn(List<Double> values) {
            addCriterion("wages in", values, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesNotIn(List<Double> values) {
            addCriterion("wages not in", values, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesBetween(Double value1, Double value2) {
            addCriterion("wages between", value1, value2, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesNotBetween(Double value1, Double value2) {
            addCriterion("wages not between", value1, value2, "wages");
            return (Criteria) this;
        }

        public Criteria andOperatenameIsNull() {
            addCriterion("operatename is null");
            return (Criteria) this;
        }

        public Criteria andOperatenameIsNotNull() {
            addCriterion("operatename is not null");
            return (Criteria) this;
        }

        public Criteria andOperatenameEqualTo(Double value) {
            addCriterion("operatename =", value, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameNotEqualTo(Double value) {
            addCriterion("operatename <>", value, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameGreaterThan(Double value) {
            addCriterion("operatename >", value, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameGreaterThanOrEqualTo(Double value) {
            addCriterion("operatename >=", value, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameLessThan(Double value) {
            addCriterion("operatename <", value, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameLessThanOrEqualTo(Double value) {
            addCriterion("operatename <=", value, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameIn(List<Double> values) {
            addCriterion("operatename in", values, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameNotIn(List<Double> values) {
            addCriterion("operatename not in", values, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameBetween(Double value1, Double value2) {
            addCriterion("operatename between", value1, value2, "operatename");
            return (Criteria) this;
        }

        public Criteria andOperatenameNotBetween(Double value1, Double value2) {
            addCriterion("operatename not between", value1, value2, "operatename");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(Double value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(Double value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(Double value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(Double value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(Double value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(Double value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<Double> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<Double> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(Double value1, Double value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(Double value1, Double value2) {
            addCriterion("other not between", value1, value2, "other");
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