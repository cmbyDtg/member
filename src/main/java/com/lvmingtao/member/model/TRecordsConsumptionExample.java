package com.lvmingtao.member.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TRecordsConsumptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TRecordsConsumptionExample() {
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

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Long value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Long value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Long value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Long value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Long value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Long value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Long> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Long> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Long value1, Long value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Long value1, Long value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andConsumptionTypeIsNull() {
            addCriterion("consumption_type is null");
            return (Criteria) this;
        }

        public Criteria andConsumptionTypeIsNotNull() {
            addCriterion("consumption_type is not null");
            return (Criteria) this;
        }

        public Criteria andConsumptionTypeEqualTo(Integer value) {
            addCriterion("consumption_type =", value, "consumptionType");
            return (Criteria) this;
        }

        public Criteria andConsumptionTypeNotEqualTo(Integer value) {
            addCriterion("consumption_type <>", value, "consumptionType");
            return (Criteria) this;
        }

        public Criteria andConsumptionTypeGreaterThan(Integer value) {
            addCriterion("consumption_type >", value, "consumptionType");
            return (Criteria) this;
        }

        public Criteria andConsumptionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("consumption_type >=", value, "consumptionType");
            return (Criteria) this;
        }

        public Criteria andConsumptionTypeLessThan(Integer value) {
            addCriterion("consumption_type <", value, "consumptionType");
            return (Criteria) this;
        }

        public Criteria andConsumptionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("consumption_type <=", value, "consumptionType");
            return (Criteria) this;
        }

        public Criteria andConsumptionTypeIn(List<Integer> values) {
            addCriterion("consumption_type in", values, "consumptionType");
            return (Criteria) this;
        }

        public Criteria andConsumptionTypeNotIn(List<Integer> values) {
            addCriterion("consumption_type not in", values, "consumptionType");
            return (Criteria) this;
        }

        public Criteria andConsumptionTypeBetween(Integer value1, Integer value2) {
            addCriterion("consumption_type between", value1, value2, "consumptionType");
            return (Criteria) this;
        }

        public Criteria andConsumptionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("consumption_type not between", value1, value2, "consumptionType");
            return (Criteria) this;
        }

        public Criteria andConsumptionAmountMoneyIsNull() {
            addCriterion("consumption_amount_money is null");
            return (Criteria) this;
        }

        public Criteria andConsumptionAmountMoneyIsNotNull() {
            addCriterion("consumption_amount_money is not null");
            return (Criteria) this;
        }

        public Criteria andConsumptionAmountMoneyEqualTo(Integer value) {
            addCriterion("consumption_amount_money =", value, "consumptionAmountMoney");
            return (Criteria) this;
        }

        public Criteria andConsumptionAmountMoneyNotEqualTo(Integer value) {
            addCriterion("consumption_amount_money <>", value, "consumptionAmountMoney");
            return (Criteria) this;
        }

        public Criteria andConsumptionAmountMoneyGreaterThan(Integer value) {
            addCriterion("consumption_amount_money >", value, "consumptionAmountMoney");
            return (Criteria) this;
        }

        public Criteria andConsumptionAmountMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("consumption_amount_money >=", value, "consumptionAmountMoney");
            return (Criteria) this;
        }

        public Criteria andConsumptionAmountMoneyLessThan(Integer value) {
            addCriterion("consumption_amount_money <", value, "consumptionAmountMoney");
            return (Criteria) this;
        }

        public Criteria andConsumptionAmountMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("consumption_amount_money <=", value, "consumptionAmountMoney");
            return (Criteria) this;
        }

        public Criteria andConsumptionAmountMoneyIn(List<Integer> values) {
            addCriterion("consumption_amount_money in", values, "consumptionAmountMoney");
            return (Criteria) this;
        }

        public Criteria andConsumptionAmountMoneyNotIn(List<Integer> values) {
            addCriterion("consumption_amount_money not in", values, "consumptionAmountMoney");
            return (Criteria) this;
        }

        public Criteria andConsumptionAmountMoneyBetween(Integer value1, Integer value2) {
            addCriterion("consumption_amount_money between", value1, value2, "consumptionAmountMoney");
            return (Criteria) this;
        }

        public Criteria andConsumptionAmountMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("consumption_amount_money not between", value1, value2, "consumptionAmountMoney");
            return (Criteria) this;
        }

        public Criteria andConsumptionRemarksIsNull() {
            addCriterion("consumption_remarks is null");
            return (Criteria) this;
        }

        public Criteria andConsumptionRemarksIsNotNull() {
            addCriterion("consumption_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andConsumptionRemarksEqualTo(String value) {
            addCriterion("consumption_remarks =", value, "consumptionRemarks");
            return (Criteria) this;
        }

        public Criteria andConsumptionRemarksNotEqualTo(String value) {
            addCriterion("consumption_remarks <>", value, "consumptionRemarks");
            return (Criteria) this;
        }

        public Criteria andConsumptionRemarksGreaterThan(String value) {
            addCriterion("consumption_remarks >", value, "consumptionRemarks");
            return (Criteria) this;
        }

        public Criteria andConsumptionRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("consumption_remarks >=", value, "consumptionRemarks");
            return (Criteria) this;
        }

        public Criteria andConsumptionRemarksLessThan(String value) {
            addCriterion("consumption_remarks <", value, "consumptionRemarks");
            return (Criteria) this;
        }

        public Criteria andConsumptionRemarksLessThanOrEqualTo(String value) {
            addCriterion("consumption_remarks <=", value, "consumptionRemarks");
            return (Criteria) this;
        }

        public Criteria andConsumptionRemarksLike(String value) {
            addCriterion("consumption_remarks like", value, "consumptionRemarks");
            return (Criteria) this;
        }

        public Criteria andConsumptionRemarksNotLike(String value) {
            addCriterion("consumption_remarks not like", value, "consumptionRemarks");
            return (Criteria) this;
        }

        public Criteria andConsumptionRemarksIn(List<String> values) {
            addCriterion("consumption_remarks in", values, "consumptionRemarks");
            return (Criteria) this;
        }

        public Criteria andConsumptionRemarksNotIn(List<String> values) {
            addCriterion("consumption_remarks not in", values, "consumptionRemarks");
            return (Criteria) this;
        }

        public Criteria andConsumptionRemarksBetween(String value1, String value2) {
            addCriterion("consumption_remarks between", value1, value2, "consumptionRemarks");
            return (Criteria) this;
        }

        public Criteria andConsumptionRemarksNotBetween(String value1, String value2) {
            addCriterion("consumption_remarks not between", value1, value2, "consumptionRemarks");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNull() {
            addCriterion("creation_time is null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNotNull() {
            addCriterion("creation_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeEqualTo(Date value) {
            addCriterion("creation_time =", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotEqualTo(Date value) {
            addCriterion("creation_time <>", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThan(Date value) {
            addCriterion("creation_time >", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creation_time >=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThan(Date value) {
            addCriterion("creation_time <", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThanOrEqualTo(Date value) {
            addCriterion("creation_time <=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIn(List<Date> values) {
            addCriterion("creation_time in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotIn(List<Date> values) {
            addCriterion("creation_time not in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeBetween(Date value1, Date value2) {
            addCriterion("creation_time between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotBetween(Date value1, Date value2) {
            addCriterion("creation_time not between", value1, value2, "creationTime");
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