package com.comstar.mars.repository;

import com.comstar.mars.entity.MyTable;
import com.comstar.mars.entity.MyTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MY_TABLE
     *
     * @mbggenerated Thu Dec 24 11:23:12 CST 2015
     */
    int countByExample(MyTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MY_TABLE
     *
     * @mbggenerated Thu Dec 24 11:23:12 CST 2015
     */
    int deleteByExample(MyTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MY_TABLE
     *
     * @mbggenerated Thu Dec 24 11:23:12 CST 2015
     */
    int deleteByPrimaryKey(Integer myTableId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MY_TABLE
     *
     * @mbggenerated Thu Dec 24 11:23:12 CST 2015
     */
    int insert(MyTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MY_TABLE
     *
     * @mbggenerated Thu Dec 24 11:23:12 CST 2015
     */
    int insertSelective(MyTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MY_TABLE
     *
     * @mbggenerated Thu Dec 24 11:23:12 CST 2015
     */
    List<MyTable> selectByExample(MyTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MY_TABLE
     *
     * @mbggenerated Thu Dec 24 11:23:12 CST 2015
     */
    MyTable selectByPrimaryKey(Integer myTableId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MY_TABLE
     *
     * @mbggenerated Thu Dec 24 11:23:12 CST 2015
     */
    int updateByExampleSelective(@Param("record") MyTable record, @Param("example") MyTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MY_TABLE
     *
     * @mbggenerated Thu Dec 24 11:23:12 CST 2015
     */
    int updateByExample(@Param("record") MyTable record, @Param("example") MyTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MY_TABLE
     *
     * @mbggenerated Thu Dec 24 11:23:12 CST 2015
     */
    int updateByPrimaryKeySelective(MyTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MY_TABLE
     *
     * @mbggenerated Thu Dec 24 11:23:12 CST 2015
     */
    int updateByPrimaryKey(MyTable record);
}