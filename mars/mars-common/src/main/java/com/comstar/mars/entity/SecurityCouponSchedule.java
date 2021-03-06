package com.comstar.mars.entity;

import java.math.BigDecimal;
import java.util.Date;

public class SecurityCouponSchedule extends SecurityCouponScheduleKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMSTPLC.SECURITY_COUPON_SCHD.CUS_NUMBER
     *
     * @mbggenerated Wed Jul 30 11:48:46 CST 2014
     */
    private Integer cusNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMSTPLC.SECURITY_COUPON_SCHD.START_DATE
     *
     * @mbggenerated Wed Jul 30 11:48:46 CST 2014
     */
    private String startDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMSTPLC.SECURITY_COUPON_SCHD.END_DATE
     *
     * @mbggenerated Wed Jul 30 11:48:46 CST 2014
     */
    private String endDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMSTPLC.SECURITY_COUPON_SCHD.COUPON_AMT
     *
     * @mbggenerated Wed Jul 30 11:48:46 CST 2014
     */
    private BigDecimal couponAmt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMSTPLC.SECURITY_COUPON_SCHD.MODIFY_DATE
     *
     * @mbggenerated Wed Jul 30 11:48:46 CST 2014
     */
    private Date modifyDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMSTPLC.SECURITY_COUPON_SCHD.MODIFY_USER
     *
     * @mbggenerated Wed Jul 30 11:48:46 CST 2014
     */
    private String modifyUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMSTPLC.SECURITY_COUPON_SCHD.INTEREST_DAYS
     *
     * @mbggenerated Wed Jul 30 11:48:46 CST 2014
     */
    private BigDecimal interestDays;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMSTPLC.SECURITY_COUPON_SCHD.YEAR_DAYS
     *
     * @mbggenerated Wed Jul 30 11:48:46 CST 2014
     */
    private BigDecimal yearDays;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMSTPLC.SECURITY_COUPON_SCHD.CUS_NUMBER
     *
     * @return the value of COMSTPLC.SECURITY_COUPON_SCHD.CUS_NUMBER
     *
     * @mbggenerated Wed Jul 30 11:48:46 CST 2014
     */
    public Integer getCusNumber() {
        return cusNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMSTPLC.SECURITY_COUPON_SCHD.CUS_NUMBER
     *
     * @param cusNumber the value for COMSTPLC.SECURITY_COUPON_SCHD.CUS_NUMBER
     *
     * @mbggenerated Wed Jul 30 11:48:46 CST 2014
     */
    public void setCusNumber(Integer cusNumber) {
        this.cusNumber = cusNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMSTPLC.SECURITY_COUPON_SCHD.START_DATE
     *
     * @return the value of COMSTPLC.SECURITY_COUPON_SCHD.START_DATE
     *
     * @mbggenerated Wed Jul 30 11:48:46 CST 2014
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMSTPLC.SECURITY_COUPON_SCHD.START_DATE
     *
     * @param startDate the value for COMSTPLC.SECURITY_COUPON_SCHD.START_DATE
     *
     * @mbggenerated Wed Jul 30 11:48:46 CST 2014
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate == null ? null : startDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMSTPLC.SECURITY_COUPON_SCHD.END_DATE
     *
     * @return the value of COMSTPLC.SECURITY_COUPON_SCHD.END_DATE
     *
     * @mbggenerated Wed Jul 30 11:48:46 CST 2014
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMSTPLC.SECURITY_COUPON_SCHD.END_DATE
     *
     * @param endDate the value for COMSTPLC.SECURITY_COUPON_SCHD.END_DATE
     *
     * @mbggenerated Wed Jul 30 11:48:46 CST 2014
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMSTPLC.SECURITY_COUPON_SCHD.COUPON_AMT
     *
     * @return the value of COMSTPLC.SECURITY_COUPON_SCHD.COUPON_AMT
     *
     * @mbggenerated Wed Jul 30 11:48:46 CST 2014
     */
    public BigDecimal getCouponAmt() {
        return couponAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMSTPLC.SECURITY_COUPON_SCHD.COUPON_AMT
     *
     * @param couponAmt the value for COMSTPLC.SECURITY_COUPON_SCHD.COUPON_AMT
     *
     * @mbggenerated Wed Jul 30 11:48:46 CST 2014
     */
    public void setCouponAmt(BigDecimal couponAmt) {
        this.couponAmt = couponAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMSTPLC.SECURITY_COUPON_SCHD.MODIFY_DATE
     *
     * @return the value of COMSTPLC.SECURITY_COUPON_SCHD.MODIFY_DATE
     *
     * @mbggenerated Wed Jul 30 11:48:46 CST 2014
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMSTPLC.SECURITY_COUPON_SCHD.MODIFY_DATE
     *
     * @param modifyDate the value for COMSTPLC.SECURITY_COUPON_SCHD.MODIFY_DATE
     *
     * @mbggenerated Wed Jul 30 11:48:46 CST 2014
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMSTPLC.SECURITY_COUPON_SCHD.MODIFY_USER
     *
     * @return the value of COMSTPLC.SECURITY_COUPON_SCHD.MODIFY_USER
     *
     * @mbggenerated Wed Jul 30 11:48:46 CST 2014
     */
    public String getModifyUser() {
        return modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMSTPLC.SECURITY_COUPON_SCHD.MODIFY_USER
     *
     * @param modifyUser the value for COMSTPLC.SECURITY_COUPON_SCHD.MODIFY_USER
     *
     * @mbggenerated Wed Jul 30 11:48:46 CST 2014
     */
    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMSTPLC.SECURITY_COUPON_SCHD.INTEREST_DAYS
     *
     * @return the value of COMSTPLC.SECURITY_COUPON_SCHD.INTEREST_DAYS
     *
     * @mbggenerated Wed Jul 30 11:48:46 CST 2014
     */
    public BigDecimal getInterestDays() {
        return interestDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMSTPLC.SECURITY_COUPON_SCHD.INTEREST_DAYS
     *
     * @param interestDays the value for COMSTPLC.SECURITY_COUPON_SCHD.INTEREST_DAYS
     *
     * @mbggenerated Wed Jul 30 11:48:46 CST 2014
     */
    public void setInterestDays(BigDecimal interestDays) {
        this.interestDays = interestDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMSTPLC.SECURITY_COUPON_SCHD.YEAR_DAYS
     *
     * @return the value of COMSTPLC.SECURITY_COUPON_SCHD.YEAR_DAYS
     *
     * @mbggenerated Wed Jul 30 11:48:46 CST 2014
     */
    public BigDecimal getYearDays() {
        return yearDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMSTPLC.SECURITY_COUPON_SCHD.YEAR_DAYS
     *
     * @param yearDays the value for COMSTPLC.SECURITY_COUPON_SCHD.YEAR_DAYS
     *
     * @mbggenerated Wed Jul 30 11:48:46 CST 2014
     */
    public void setYearDays(BigDecimal yearDays) {
        this.yearDays = yearDays;
    }
}