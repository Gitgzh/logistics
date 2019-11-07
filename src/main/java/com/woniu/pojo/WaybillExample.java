package com.woniu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WaybillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WaybillExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andWidIsNull() {
            addCriterion("wid is null");
            return (Criteria) this;
        }

        public Criteria andWidIsNotNull() {
            addCriterion("wid is not null");
            return (Criteria) this;
        }

        public Criteria andWidEqualTo(Integer value) {
            addCriterion("wid =", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotEqualTo(Integer value) {
            addCriterion("wid <>", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThan(Integer value) {
            addCriterion("wid >", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wid >=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThan(Integer value) {
            addCriterion("wid <", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThanOrEqualTo(Integer value) {
            addCriterion("wid <=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidIn(List<Integer> values) {
            addCriterion("wid in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotIn(List<Integer> values) {
            addCriterion("wid not in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidBetween(Integer value1, Integer value2) {
            addCriterion("wid between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotBetween(Integer value1, Integer value2) {
            addCriterion("wid not between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("goodsname is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("goodsname is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("goodsname =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("goodsname <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("goodsname >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsname >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("goodsname <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("goodsname <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("goodsname like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("goodsname not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("goodsname in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("goodsname not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("goodsname between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("goodsname not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodssizeIsNull() {
            addCriterion("goodssize is null");
            return (Criteria) this;
        }

        public Criteria andGoodssizeIsNotNull() {
            addCriterion("goodssize is not null");
            return (Criteria) this;
        }

        public Criteria andGoodssizeEqualTo(Double value) {
            addCriterion("goodssize =", value, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeNotEqualTo(Double value) {
            addCriterion("goodssize <>", value, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeGreaterThan(Double value) {
            addCriterion("goodssize >", value, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeGreaterThanOrEqualTo(Double value) {
            addCriterion("goodssize >=", value, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeLessThan(Double value) {
            addCriterion("goodssize <", value, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeLessThanOrEqualTo(Double value) {
            addCriterion("goodssize <=", value, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeIn(List<Double> values) {
            addCriterion("goodssize in", values, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeNotIn(List<Double> values) {
            addCriterion("goodssize not in", values, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeBetween(Double value1, Double value2) {
            addCriterion("goodssize between", value1, value2, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeNotBetween(Double value1, Double value2) {
            addCriterion("goodssize not between", value1, value2, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodsweightIsNull() {
            addCriterion("goodsweight is null");
            return (Criteria) this;
        }

        public Criteria andGoodsweightIsNotNull() {
            addCriterion("goodsweight is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsweightEqualTo(Double value) {
            addCriterion("goodsweight =", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightNotEqualTo(Double value) {
            addCriterion("goodsweight <>", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightGreaterThan(Double value) {
            addCriterion("goodsweight >", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightGreaterThanOrEqualTo(Double value) {
            addCriterion("goodsweight >=", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightLessThan(Double value) {
            addCriterion("goodsweight <", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightLessThanOrEqualTo(Double value) {
            addCriterion("goodsweight <=", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightIn(List<Double> values) {
            addCriterion("goodsweight in", values, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightNotIn(List<Double> values) {
            addCriterion("goodsweight not in", values, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightBetween(Double value1, Double value2) {
            addCriterion("goodsweight between", value1, value2, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightNotBetween(Double value1, Double value2) {
            addCriterion("goodsweight not between", value1, value2, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGettimeIsNull() {
            addCriterion("gettime is null");
            return (Criteria) this;
        }

        public Criteria andGettimeIsNotNull() {
            addCriterion("gettime is not null");
            return (Criteria) this;
        }

        public Criteria andGettimeEqualTo(Date value) {
            addCriterionForJDBCDate("gettime =", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("gettime <>", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeGreaterThan(Date value) {
            addCriterionForJDBCDate("gettime >", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gettime >=", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeLessThan(Date value) {
            addCriterionForJDBCDate("gettime <", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gettime <=", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeIn(List<Date> values) {
            addCriterionForJDBCDate("gettime in", values, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("gettime not in", values, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gettime between", value1, value2, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gettime not between", value1, value2, "gettime");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
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

        public Criteria andGiveplaceIsNull() {
            addCriterion("giveplace is null");
            return (Criteria) this;
        }

        public Criteria andGiveplaceIsNotNull() {
            addCriterion("giveplace is not null");
            return (Criteria) this;
        }

        public Criteria andGiveplaceEqualTo(String value) {
            addCriterion("giveplace =", value, "giveplace");
            return (Criteria) this;
        }

        public Criteria andGiveplaceNotEqualTo(String value) {
            addCriterion("giveplace <>", value, "giveplace");
            return (Criteria) this;
        }

        public Criteria andGiveplaceGreaterThan(String value) {
            addCriterion("giveplace >", value, "giveplace");
            return (Criteria) this;
        }

        public Criteria andGiveplaceGreaterThanOrEqualTo(String value) {
            addCriterion("giveplace >=", value, "giveplace");
            return (Criteria) this;
        }

        public Criteria andGiveplaceLessThan(String value) {
            addCriterion("giveplace <", value, "giveplace");
            return (Criteria) this;
        }

        public Criteria andGiveplaceLessThanOrEqualTo(String value) {
            addCriterion("giveplace <=", value, "giveplace");
            return (Criteria) this;
        }

        public Criteria andGiveplaceLike(String value) {
            addCriterion("giveplace like", value, "giveplace");
            return (Criteria) this;
        }

        public Criteria andGiveplaceNotLike(String value) {
            addCriterion("giveplace not like", value, "giveplace");
            return (Criteria) this;
        }

        public Criteria andGiveplaceIn(List<String> values) {
            addCriterion("giveplace in", values, "giveplace");
            return (Criteria) this;
        }

        public Criteria andGiveplaceNotIn(List<String> values) {
            addCriterion("giveplace not in", values, "giveplace");
            return (Criteria) this;
        }

        public Criteria andGiveplaceBetween(String value1, String value2) {
            addCriterion("giveplace between", value1, value2, "giveplace");
            return (Criteria) this;
        }

        public Criteria andGiveplaceNotBetween(String value1, String value2) {
            addCriterion("giveplace not between", value1, value2, "giveplace");
            return (Criteria) this;
        }

        public Criteria andGivepeopleIsNull() {
            addCriterion("givepeople is null");
            return (Criteria) this;
        }

        public Criteria andGivepeopleIsNotNull() {
            addCriterion("givepeople is not null");
            return (Criteria) this;
        }

        public Criteria andGivepeopleEqualTo(String value) {
            addCriterion("givepeople =", value, "givepeople");
            return (Criteria) this;
        }

        public Criteria andGivepeopleNotEqualTo(String value) {
            addCriterion("givepeople <>", value, "givepeople");
            return (Criteria) this;
        }

        public Criteria andGivepeopleGreaterThan(String value) {
            addCriterion("givepeople >", value, "givepeople");
            return (Criteria) this;
        }

        public Criteria andGivepeopleGreaterThanOrEqualTo(String value) {
            addCriterion("givepeople >=", value, "givepeople");
            return (Criteria) this;
        }

        public Criteria andGivepeopleLessThan(String value) {
            addCriterion("givepeople <", value, "givepeople");
            return (Criteria) this;
        }

        public Criteria andGivepeopleLessThanOrEqualTo(String value) {
            addCriterion("givepeople <=", value, "givepeople");
            return (Criteria) this;
        }

        public Criteria andGivepeopleLike(String value) {
            addCriterion("givepeople like", value, "givepeople");
            return (Criteria) this;
        }

        public Criteria andGivepeopleNotLike(String value) {
            addCriterion("givepeople not like", value, "givepeople");
            return (Criteria) this;
        }

        public Criteria andGivepeopleIn(List<String> values) {
            addCriterion("givepeople in", values, "givepeople");
            return (Criteria) this;
        }

        public Criteria andGivepeopleNotIn(List<String> values) {
            addCriterion("givepeople not in", values, "givepeople");
            return (Criteria) this;
        }

        public Criteria andGivepeopleBetween(String value1, String value2) {
            addCriterion("givepeople between", value1, value2, "givepeople");
            return (Criteria) this;
        }

        public Criteria andGivepeopleNotBetween(String value1, String value2) {
            addCriterion("givepeople not between", value1, value2, "givepeople");
            return (Criteria) this;
        }

        public Criteria andGivetelIsNull() {
            addCriterion("givetel is null");
            return (Criteria) this;
        }

        public Criteria andGivetelIsNotNull() {
            addCriterion("givetel is not null");
            return (Criteria) this;
        }

        public Criteria andGivetelEqualTo(String value) {
            addCriterion("givetel =", value, "givetel");
            return (Criteria) this;
        }

        public Criteria andGivetelNotEqualTo(String value) {
            addCriterion("givetel <>", value, "givetel");
            return (Criteria) this;
        }

        public Criteria andGivetelGreaterThan(String value) {
            addCriterion("givetel >", value, "givetel");
            return (Criteria) this;
        }

        public Criteria andGivetelGreaterThanOrEqualTo(String value) {
            addCriterion("givetel >=", value, "givetel");
            return (Criteria) this;
        }

        public Criteria andGivetelLessThan(String value) {
            addCriterion("givetel <", value, "givetel");
            return (Criteria) this;
        }

        public Criteria andGivetelLessThanOrEqualTo(String value) {
            addCriterion("givetel <=", value, "givetel");
            return (Criteria) this;
        }

        public Criteria andGivetelLike(String value) {
            addCriterion("givetel like", value, "givetel");
            return (Criteria) this;
        }

        public Criteria andGivetelNotLike(String value) {
            addCriterion("givetel not like", value, "givetel");
            return (Criteria) this;
        }

        public Criteria andGivetelIn(List<String> values) {
            addCriterion("givetel in", values, "givetel");
            return (Criteria) this;
        }

        public Criteria andGivetelNotIn(List<String> values) {
            addCriterion("givetel not in", values, "givetel");
            return (Criteria) this;
        }

        public Criteria andGivetelBetween(String value1, String value2) {
            addCriterion("givetel between", value1, value2, "givetel");
            return (Criteria) this;
        }

        public Criteria andGivetelNotBetween(String value1, String value2) {
            addCriterion("givetel not between", value1, value2, "givetel");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
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

        public Criteria andWnumIsNull() {
            addCriterion("wnum is null");
            return (Criteria) this;
        }

        public Criteria andWnumIsNotNull() {
            addCriterion("wnum is not null");
            return (Criteria) this;
        }

        public Criteria andWnumEqualTo(String value) {
            addCriterion("wnum =", value, "wnum");
            return (Criteria) this;
        }

        public Criteria andWnumNotEqualTo(String value) {
            addCriterion("wnum <>", value, "wnum");
            return (Criteria) this;
        }

        public Criteria andWnumGreaterThan(String value) {
            addCriterion("wnum >", value, "wnum");
            return (Criteria) this;
        }

        public Criteria andWnumGreaterThanOrEqualTo(String value) {
            addCriterion("wnum >=", value, "wnum");
            return (Criteria) this;
        }

        public Criteria andWnumLessThan(String value) {
            addCriterion("wnum <", value, "wnum");
            return (Criteria) this;
        }

        public Criteria andWnumLessThanOrEqualTo(String value) {
            addCriterion("wnum <=", value, "wnum");
            return (Criteria) this;
        }

        public Criteria andWnumLike(String value) {
            addCriterion("wnum like", value, "wnum");
            return (Criteria) this;
        }

        public Criteria andWnumNotLike(String value) {
            addCriterion("wnum not like", value, "wnum");
            return (Criteria) this;
        }

        public Criteria andWnumIn(List<String> values) {
            addCriterion("wnum in", values, "wnum");
            return (Criteria) this;
        }

        public Criteria andWnumNotIn(List<String> values) {
            addCriterion("wnum not in", values, "wnum");
            return (Criteria) this;
        }

        public Criteria andWnumBetween(String value1, String value2) {
            addCriterion("wnum between", value1, value2, "wnum");
            return (Criteria) this;
        }

        public Criteria andWnumNotBetween(String value1, String value2) {
            addCriterion("wnum not between", value1, value2, "wnum");
            return (Criteria) this;
        }

        public Criteria andWstatusIsNull() {
            addCriterion("wstatus is null");
            return (Criteria) this;
        }

        public Criteria andWstatusIsNotNull() {
            addCriterion("wstatus is not null");
            return (Criteria) this;
        }

        public Criteria andWstatusEqualTo(Integer value) {
            addCriterion("wstatus =", value, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusNotEqualTo(Integer value) {
            addCriterion("wstatus <>", value, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusGreaterThan(Integer value) {
            addCriterion("wstatus >", value, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("wstatus >=", value, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusLessThan(Integer value) {
            addCriterion("wstatus <", value, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusLessThanOrEqualTo(Integer value) {
            addCriterion("wstatus <=", value, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusIn(List<Integer> values) {
            addCriterion("wstatus in", values, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusNotIn(List<Integer> values) {
            addCriterion("wstatus not in", values, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusBetween(Integer value1, Integer value2) {
            addCriterion("wstatus between", value1, value2, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("wstatus not between", value1, value2, "wstatus");
            return (Criteria) this;
        }

        public Criteria andNidIsNull() {
            addCriterion("nid is null");
            return (Criteria) this;
        }

        public Criteria andNidIsNotNull() {
            addCriterion("nid is not null");
            return (Criteria) this;
        }

        public Criteria andNidEqualTo(Integer value) {
            addCriterion("nid =", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotEqualTo(Integer value) {
            addCriterion("nid <>", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThan(Integer value) {
            addCriterion("nid >", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nid >=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThan(Integer value) {
            addCriterion("nid <", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThanOrEqualTo(Integer value) {
            addCriterion("nid <=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidIn(List<Integer> values) {
            addCriterion("nid in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotIn(List<Integer> values) {
            addCriterion("nid not in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidBetween(Integer value1, Integer value2) {
            addCriterion("nid between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotBetween(Integer value1, Integer value2) {
            addCriterion("nid not between", value1, value2, "nid");
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