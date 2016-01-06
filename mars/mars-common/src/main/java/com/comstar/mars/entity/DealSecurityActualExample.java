package com.comstar.mars.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DealSecurityActualExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DEAL_SECURITY_ACTUAL
     *
     * @mbggenerated Thu Jul 10 14:16:03 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DEAL_SECURITY_ACTUAL
     *
     * @mbggenerated Thu Jul 10 14:16:03 CST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DEAL_SECURITY_ACTUAL
     *
     * @mbggenerated Thu Jul 10 14:16:03 CST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEAL_SECURITY_ACTUAL
     *
     * @mbggenerated Thu Jul 10 14:16:03 CST 2014
     */
    public DealSecurityActualExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEAL_SECURITY_ACTUAL
     *
     * @mbggenerated Thu Jul 10 14:16:03 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEAL_SECURITY_ACTUAL
     *
     * @mbggenerated Thu Jul 10 14:16:03 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEAL_SECURITY_ACTUAL
     *
     * @mbggenerated Thu Jul 10 14:16:03 CST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEAL_SECURITY_ACTUAL
     *
     * @mbggenerated Thu Jul 10 14:16:03 CST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEAL_SECURITY_ACTUAL
     *
     * @mbggenerated Thu Jul 10 14:16:03 CST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEAL_SECURITY_ACTUAL
     *
     * @mbggenerated Thu Jul 10 14:16:03 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEAL_SECURITY_ACTUAL
     *
     * @mbggenerated Thu Jul 10 14:16:03 CST 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEAL_SECURITY_ACTUAL
     *
     * @mbggenerated Thu Jul 10 14:16:03 CST 2014
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEAL_SECURITY_ACTUAL
     *
     * @mbggenerated Thu Jul 10 14:16:03 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEAL_SECURITY_ACTUAL
     *
     * @mbggenerated Thu Jul 10 14:16:03 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DEAL_SECURITY_ACTUAL
     *
     * @mbggenerated Thu Jul 10 14:16:03 CST 2014
     */
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

        public Criteria andDealSecurityActualIdIsNull() {
            addCriterion("DEAL_SECURITY_ACTUAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andDealSecurityActualIdIsNotNull() {
            addCriterion("DEAL_SECURITY_ACTUAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDealSecurityActualIdEqualTo(Long value) {
            addCriterion("DEAL_SECURITY_ACTUAL_ID =", value, "dealSecurityActualId");
            return (Criteria) this;
        }

        public Criteria andDealSecurityActualIdNotEqualTo(Long value) {
            addCriterion("DEAL_SECURITY_ACTUAL_ID <>", value, "dealSecurityActualId");
            return (Criteria) this;
        }

        public Criteria andDealSecurityActualIdGreaterThan(Long value) {
            addCriterion("DEAL_SECURITY_ACTUAL_ID >", value, "dealSecurityActualId");
            return (Criteria) this;
        }

        public Criteria andDealSecurityActualIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DEAL_SECURITY_ACTUAL_ID >=", value, "dealSecurityActualId");
            return (Criteria) this;
        }

        public Criteria andDealSecurityActualIdLessThan(Long value) {
            addCriterion("DEAL_SECURITY_ACTUAL_ID <", value, "dealSecurityActualId");
            return (Criteria) this;
        }

        public Criteria andDealSecurityActualIdLessThanOrEqualTo(Long value) {
            addCriterion("DEAL_SECURITY_ACTUAL_ID <=", value, "dealSecurityActualId");
            return (Criteria) this;
        }

        public Criteria andDealSecurityActualIdIn(List<Long> values) {
            addCriterion("DEAL_SECURITY_ACTUAL_ID in", values, "dealSecurityActualId");
            return (Criteria) this;
        }

        public Criteria andDealSecurityActualIdNotIn(List<Long> values) {
            addCriterion("DEAL_SECURITY_ACTUAL_ID not in", values, "dealSecurityActualId");
            return (Criteria) this;
        }

        public Criteria andDealSecurityActualIdBetween(Long value1, Long value2) {
            addCriterion("DEAL_SECURITY_ACTUAL_ID between", value1, value2, "dealSecurityActualId");
            return (Criteria) this;
        }

        public Criteria andDealSecurityActualIdNotBetween(Long value1, Long value2) {
            addCriterion("DEAL_SECURITY_ACTUAL_ID not between", value1, value2, "dealSecurityActualId");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNull() {
            addCriterion("BRANCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNotNull() {
            addCriterion("BRANCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBranchIdEqualTo(Integer value) {
            addCriterion("BRANCH_ID =", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotEqualTo(Integer value) {
            addCriterion("BRANCH_ID <>", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThan(Integer value) {
            addCriterion("BRANCH_ID >", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BRANCH_ID >=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThan(Integer value) {
            addCriterion("BRANCH_ID <", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThanOrEqualTo(Integer value) {
            addCriterion("BRANCH_ID <=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdIn(List<Integer> values) {
            addCriterion("BRANCH_ID in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotIn(List<Integer> values) {
            addCriterion("BRANCH_ID not in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdBetween(Integer value1, Integer value2) {
            addCriterion("BRANCH_ID between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BRANCH_ID not between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andFinancialProductIdIsNull() {
            addCriterion("FINANCIAL_PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andFinancialProductIdIsNotNull() {
            addCriterion("FINANCIAL_PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFinancialProductIdEqualTo(Integer value) {
            addCriterion("FINANCIAL_PRODUCT_ID =", value, "financialProductId");
            return (Criteria) this;
        }

        public Criteria andFinancialProductIdNotEqualTo(Integer value) {
            addCriterion("FINANCIAL_PRODUCT_ID <>", value, "financialProductId");
            return (Criteria) this;
        }

        public Criteria andFinancialProductIdGreaterThan(Integer value) {
            addCriterion("FINANCIAL_PRODUCT_ID >", value, "financialProductId");
            return (Criteria) this;
        }

        public Criteria andFinancialProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FINANCIAL_PRODUCT_ID >=", value, "financialProductId");
            return (Criteria) this;
        }

        public Criteria andFinancialProductIdLessThan(Integer value) {
            addCriterion("FINANCIAL_PRODUCT_ID <", value, "financialProductId");
            return (Criteria) this;
        }

        public Criteria andFinancialProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("FINANCIAL_PRODUCT_ID <=", value, "financialProductId");
            return (Criteria) this;
        }

        public Criteria andFinancialProductIdIn(List<Integer> values) {
            addCriterion("FINANCIAL_PRODUCT_ID in", values, "financialProductId");
            return (Criteria) this;
        }

        public Criteria andFinancialProductIdNotIn(List<Integer> values) {
            addCriterion("FINANCIAL_PRODUCT_ID not in", values, "financialProductId");
            return (Criteria) this;
        }

        public Criteria andFinancialProductIdBetween(Integer value1, Integer value2) {
            addCriterion("FINANCIAL_PRODUCT_ID between", value1, value2, "financialProductId");
            return (Criteria) this;
        }

        public Criteria andFinancialProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FINANCIAL_PRODUCT_ID not between", value1, value2, "financialProductId");
            return (Criteria) this;
        }

        public Criteria andDealSecurityReceivableIdIsNull() {
            addCriterion("DEAL_SECURITY_RECEIVABLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDealSecurityReceivableIdIsNotNull() {
            addCriterion("DEAL_SECURITY_RECEIVABLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDealSecurityReceivableIdEqualTo(Long value) {
            addCriterion("DEAL_SECURITY_RECEIVABLE_ID =", value, "dealSecurityReceivableId");
            return (Criteria) this;
        }

        public Criteria andDealSecurityReceivableIdNotEqualTo(Long value) {
            addCriterion("DEAL_SECURITY_RECEIVABLE_ID <>", value, "dealSecurityReceivableId");
            return (Criteria) this;
        }

        public Criteria andDealSecurityReceivableIdGreaterThan(Long value) {
            addCriterion("DEAL_SECURITY_RECEIVABLE_ID >", value, "dealSecurityReceivableId");
            return (Criteria) this;
        }

        public Criteria andDealSecurityReceivableIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DEAL_SECURITY_RECEIVABLE_ID >=", value, "dealSecurityReceivableId");
            return (Criteria) this;
        }

        public Criteria andDealSecurityReceivableIdLessThan(Long value) {
            addCriterion("DEAL_SECURITY_RECEIVABLE_ID <", value, "dealSecurityReceivableId");
            return (Criteria) this;
        }

        public Criteria andDealSecurityReceivableIdLessThanOrEqualTo(Long value) {
            addCriterion("DEAL_SECURITY_RECEIVABLE_ID <=", value, "dealSecurityReceivableId");
            return (Criteria) this;
        }

        public Criteria andDealSecurityReceivableIdIn(List<Long> values) {
            addCriterion("DEAL_SECURITY_RECEIVABLE_ID in", values, "dealSecurityReceivableId");
            return (Criteria) this;
        }

        public Criteria andDealSecurityReceivableIdNotIn(List<Long> values) {
            addCriterion("DEAL_SECURITY_RECEIVABLE_ID not in", values, "dealSecurityReceivableId");
            return (Criteria) this;
        }

        public Criteria andDealSecurityReceivableIdBetween(Long value1, Long value2) {
            addCriterion("DEAL_SECURITY_RECEIVABLE_ID between", value1, value2, "dealSecurityReceivableId");
            return (Criteria) this;
        }

        public Criteria andDealSecurityReceivableIdNotBetween(Long value1, Long value2) {
            addCriterion("DEAL_SECURITY_RECEIVABLE_ID not between", value1, value2, "dealSecurityReceivableId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andActualDateIsNull() {
            addCriterion("ACTUAL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andActualDateIsNotNull() {
            addCriterion("ACTUAL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andActualDateEqualTo(Integer value) {
            addCriterion("ACTUAL_DATE =", value, "actualDate");
            return (Criteria) this;
        }

        public Criteria andActualDateNotEqualTo(Integer value) {
            addCriterion("ACTUAL_DATE <>", value, "actualDate");
            return (Criteria) this;
        }

        public Criteria andActualDateGreaterThan(Integer value) {
            addCriterion("ACTUAL_DATE >", value, "actualDate");
            return (Criteria) this;
        }

        public Criteria andActualDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACTUAL_DATE >=", value, "actualDate");
            return (Criteria) this;
        }

        public Criteria andActualDateLessThan(Integer value) {
            addCriterion("ACTUAL_DATE <", value, "actualDate");
            return (Criteria) this;
        }

        public Criteria andActualDateLessThanOrEqualTo(Integer value) {
            addCriterion("ACTUAL_DATE <=", value, "actualDate");
            return (Criteria) this;
        }

        public Criteria andActualDateIn(List<Integer> values) {
            addCriterion("ACTUAL_DATE in", values, "actualDate");
            return (Criteria) this;
        }

        public Criteria andActualDateNotIn(List<Integer> values) {
            addCriterion("ACTUAL_DATE not in", values, "actualDate");
            return (Criteria) this;
        }

        public Criteria andActualDateBetween(Integer value1, Integer value2) {
            addCriterion("ACTUAL_DATE between", value1, value2, "actualDate");
            return (Criteria) this;
        }

        public Criteria andActualDateNotBetween(Integer value1, Integer value2) {
            addCriterion("ACTUAL_DATE not between", value1, value2, "actualDate");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andActualTypeIsNull() {
            addCriterion("ACTUAL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andActualTypeIsNotNull() {
            addCriterion("ACTUAL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andActualTypeEqualTo(String value) {
            addCriterion("ACTUAL_TYPE =", value, "actualType");
            return (Criteria) this;
        }

        public Criteria andActualTypeNotEqualTo(String value) {
            addCriterion("ACTUAL_TYPE <>", value, "actualType");
            return (Criteria) this;
        }

        public Criteria andActualTypeGreaterThan(String value) {
            addCriterion("ACTUAL_TYPE >", value, "actualType");
            return (Criteria) this;
        }

        public Criteria andActualTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACTUAL_TYPE >=", value, "actualType");
            return (Criteria) this;
        }

        public Criteria andActualTypeLessThan(String value) {
            addCriterion("ACTUAL_TYPE <", value, "actualType");
            return (Criteria) this;
        }

        public Criteria andActualTypeLessThanOrEqualTo(String value) {
            addCriterion("ACTUAL_TYPE <=", value, "actualType");
            return (Criteria) this;
        }

        public Criteria andActualTypeLike(String value) {
            addCriterion("ACTUAL_TYPE like", value, "actualType");
            return (Criteria) this;
        }

        public Criteria andActualTypeNotLike(String value) {
            addCriterion("ACTUAL_TYPE not like", value, "actualType");
            return (Criteria) this;
        }

        public Criteria andActualTypeIn(List<String> values) {
            addCriterion("ACTUAL_TYPE in", values, "actualType");
            return (Criteria) this;
        }

        public Criteria andActualTypeNotIn(List<String> values) {
            addCriterion("ACTUAL_TYPE not in", values, "actualType");
            return (Criteria) this;
        }

        public Criteria andActualTypeBetween(String value1, String value2) {
            addCriterion("ACTUAL_TYPE between", value1, value2, "actualType");
            return (Criteria) this;
        }

        public Criteria andActualTypeNotBetween(String value1, String value2) {
            addCriterion("ACTUAL_TYPE not between", value1, value2, "actualType");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("MODIFY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("MODIFY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("MODIFY_DATE =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("MODIFY_DATE <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("MODIFY_DATE >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DATE >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("MODIFY_DATE <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DATE <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("MODIFY_DATE in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("MODIFY_DATE not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DATE between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DATE not between", value1, value2, "modifyDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DEAL_SECURITY_ACTUAL
     *
     * @mbggenerated do_not_delete_during_merge Thu Jul 10 14:16:03 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DEAL_SECURITY_ACTUAL
     *
     * @mbggenerated Thu Jul 10 14:16:03 CST 2014
     */
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