package com.comstar.mars.entity;

public class UserRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER_ROLE.USER_ID
     *
     * @mbggenerated Tue Aug 26 11:59:31 CST 2014
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER_ROLE.ROLE_ID
     *
     * @mbggenerated Tue Aug 26 11:59:31 CST 2014
     */
    private Integer roleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER_ROLE.USER_ID
     *
     * @return the value of SYS_USER_ROLE.USER_ID
     *
     * @mbggenerated Tue Aug 26 11:59:31 CST 2014
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER_ROLE.USER_ID
     *
     * @param userId the value for SYS_USER_ROLE.USER_ID
     *
     * @mbggenerated Tue Aug 26 11:59:31 CST 2014
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER_ROLE.ROLE_ID
     *
     * @return the value of SYS_USER_ROLE.ROLE_ID
     *
     * @mbggenerated Tue Aug 26 11:59:31 CST 2014
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER_ROLE.ROLE_ID
     *
     * @param roleId the value for SYS_USER_ROLE.ROLE_ID
     *
     * @mbggenerated Tue Aug 26 11:59:31 CST 2014
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}