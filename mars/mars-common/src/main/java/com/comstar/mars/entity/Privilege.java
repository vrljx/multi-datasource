package com.comstar.mars.entity;

public class Privilege {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_PRIVILEGE.ID
     *
     * @mbggenerated Mon Sep 22 10:02:18 CST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_PRIVILEGE.CATEGORY
     *
     * @mbggenerated Mon Sep 22 10:02:18 CST 2014
     */
    private String category;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_PRIVILEGE.CODE
     *
     * @mbggenerated Mon Sep 22 10:02:18 CST 2014
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_PRIVILEGE.NAME
     *
     * @mbggenerated Mon Sep 22 10:02:18 CST 2014
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_PRIVILEGE.DESCRIPTION
     *
     * @mbggenerated Mon Sep 22 10:02:18 CST 2014
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PRIVILEGE.ID
     *
     * @return the value of SYS_PRIVILEGE.ID
     *
     * @mbggenerated Mon Sep 22 10:02:18 CST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PRIVILEGE.ID
     *
     * @param id the value for SYS_PRIVILEGE.ID
     *
     * @mbggenerated Mon Sep 22 10:02:18 CST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PRIVILEGE.CATEGORY
     *
     * @return the value of SYS_PRIVILEGE.CATEGORY
     *
     * @mbggenerated Mon Sep 22 10:02:18 CST 2014
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PRIVILEGE.CATEGORY
     *
     * @param category the value for SYS_PRIVILEGE.CATEGORY
     *
     * @mbggenerated Mon Sep 22 10:02:18 CST 2014
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PRIVILEGE.CODE
     *
     * @return the value of SYS_PRIVILEGE.CODE
     *
     * @mbggenerated Mon Sep 22 10:02:18 CST 2014
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PRIVILEGE.CODE
     *
     * @param code the value for SYS_PRIVILEGE.CODE
     *
     * @mbggenerated Mon Sep 22 10:02:18 CST 2014
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PRIVILEGE.NAME
     *
     * @return the value of SYS_PRIVILEGE.NAME
     *
     * @mbggenerated Mon Sep 22 10:02:18 CST 2014
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PRIVILEGE.NAME
     *
     * @param name the value for SYS_PRIVILEGE.NAME
     *
     * @mbggenerated Mon Sep 22 10:02:18 CST 2014
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PRIVILEGE.DESCRIPTION
     *
     * @return the value of SYS_PRIVILEGE.DESCRIPTION
     *
     * @mbggenerated Mon Sep 22 10:02:18 CST 2014
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PRIVILEGE.DESCRIPTION
     *
     * @param description the value for SYS_PRIVILEGE.DESCRIPTION
     *
     * @mbggenerated Mon Sep 22 10:02:18 CST 2014
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}