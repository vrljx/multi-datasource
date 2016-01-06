package com.comstar.mars.repository;

import com.comstar.mars.entity.SecurityPaymentSchedule;
import com.comstar.mars.entity.SecurityPaymentScheduleExample;
import com.comstar.mars.entity.SecurityPaymentScheduleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecurityPaymentScheduleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMSTPLC.SECURITY_PYMN_SCHD
     *
     * @mbggenerated Wed Jul 30 13:56:40 CST 2014
     */
    int countByExample(SecurityPaymentScheduleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMSTPLC.SECURITY_PYMN_SCHD
     *
     * @mbggenerated Wed Jul 30 13:56:40 CST 2014
     */
    int deleteByExample(SecurityPaymentScheduleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMSTPLC.SECURITY_PYMN_SCHD
     *
     * @mbggenerated Wed Jul 30 13:56:40 CST 2014
     */
    int deleteByPrimaryKey(SecurityPaymentScheduleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMSTPLC.SECURITY_PYMN_SCHD
     *
     * @mbggenerated Wed Jul 30 13:56:40 CST 2014
     */
    int insert(SecurityPaymentSchedule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMSTPLC.SECURITY_PYMN_SCHD
     *
     * @mbggenerated Wed Jul 30 13:56:40 CST 2014
     */
    int insertSelective(SecurityPaymentSchedule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMSTPLC.SECURITY_PYMN_SCHD
     *
     * @mbggenerated Wed Jul 30 13:56:40 CST 2014
     */
    List<SecurityPaymentSchedule> selectByExample(SecurityPaymentScheduleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMSTPLC.SECURITY_PYMN_SCHD
     *
     * @mbggenerated Wed Jul 30 13:56:40 CST 2014
     */
    SecurityPaymentSchedule selectByPrimaryKey(SecurityPaymentScheduleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMSTPLC.SECURITY_PYMN_SCHD
     *
     * @mbggenerated Wed Jul 30 13:56:40 CST 2014
     */
    int updateByExampleSelective(@Param("record") SecurityPaymentSchedule record, @Param("example") SecurityPaymentScheduleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMSTPLC.SECURITY_PYMN_SCHD
     *
     * @mbggenerated Wed Jul 30 13:56:40 CST 2014
     */
    int updateByExample(@Param("record") SecurityPaymentSchedule record, @Param("example") SecurityPaymentScheduleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMSTPLC.SECURITY_PYMN_SCHD
     *
     * @mbggenerated Wed Jul 30 13:56:40 CST 2014
     */
    int updateByPrimaryKeySelective(SecurityPaymentSchedule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMSTPLC.SECURITY_PYMN_SCHD
     *
     * @mbggenerated Wed Jul 30 13:56:40 CST 2014
     */
    int updateByPrimaryKey(SecurityPaymentSchedule record);
}