package com.kaige123.daomu.eureka_client_video_user.DAO.Bean;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.uid
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    private Long uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.recommendUid
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    private String recommenduid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.mony
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    private Long mony;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.nickName
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.phone
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.identify
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    private String identify;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.payPassword
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    private String paypassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.passsword
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    private String passsword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.openid
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    private String openid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sex
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.createDate
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    private Date createdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.lastLoginDate
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    private Date lastlogindate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.headimg
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    private String headimg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.loginAddress
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    private String loginaddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.loginErrorNumber
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    private Integer loginerrornumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.lockState
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    private String lockstate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.lockDate
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    private Date lockdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.uid
     *
     * @return the value of user.uid
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.uid
     *
     * @param uid the value for user.uid
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.recommendUid
     *
     * @return the value of user.recommendUid
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public String getRecommenduid() {
        return recommenduid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.recommendUid
     *
     * @param recommenduid the value for user.recommendUid
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void setRecommenduid(String recommenduid) {
        this.recommenduid = recommenduid == null ? null : recommenduid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.mony
     *
     * @return the value of user.mony
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public Long getMony() {
        return mony;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.mony
     *
     * @param mony the value for user.mony
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void setMony(Long mony) {
        this.mony = mony;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.nickName
     *
     * @return the value of user.nickName
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.nickName
     *
     * @param nickname the value for user.nickName
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.phone
     *
     * @return the value of user.phone
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.phone
     *
     * @param phone the value for user.phone
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.identify
     *
     * @return the value of user.identify
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public String getIdentify() {
        return identify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.identify
     *
     * @param identify the value for user.identify
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void setIdentify(String identify) {
        this.identify = identify == null ? null : identify.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.payPassword
     *
     * @return the value of user.payPassword
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public String getPaypassword() {
        return paypassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.payPassword
     *
     * @param paypassword the value for user.payPassword
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void setPaypassword(String paypassword) {
        this.paypassword = paypassword == null ? null : paypassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.passsword
     *
     * @return the value of user.passsword
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public String getPasssword() {
        return passsword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.passsword
     *
     * @param passsword the value for user.passsword
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void setPasssword(String passsword) {
        this.passsword = passsword == null ? null : passsword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.openid
     *
     * @return the value of user.openid
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.openid
     *
     * @param openid the value for user.openid
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sex
     *
     * @return the value of user.sex
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sex
     *
     * @param sex the value for user.sex
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.createDate
     *
     * @return the value of user.createDate
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.createDate
     *
     * @param createdate the value for user.createDate
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.lastLoginDate
     *
     * @return the value of user.lastLoginDate
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public Date getLastlogindate() {
        return lastlogindate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.lastLoginDate
     *
     * @param lastlogindate the value for user.lastLoginDate
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void setLastlogindate(Date lastlogindate) {
        this.lastlogindate = lastlogindate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.headimg
     *
     * @return the value of user.headimg
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public String getHeadimg() {
        return headimg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.headimg
     *
     * @param headimg the value for user.headimg
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void setHeadimg(String headimg) {
        this.headimg = headimg == null ? null : headimg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.loginAddress
     *
     * @return the value of user.loginAddress
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public String getLoginaddress() {
        return loginaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.loginAddress
     *
     * @param loginaddress the value for user.loginAddress
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void setLoginaddress(String loginaddress) {
        this.loginaddress = loginaddress == null ? null : loginaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.loginErrorNumber
     *
     * @return the value of user.loginErrorNumber
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public Integer getLoginerrornumber() {
        return loginerrornumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.loginErrorNumber
     *
     * @param loginerrornumber the value for user.loginErrorNumber
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void setLoginerrornumber(Integer loginerrornumber) {
        this.loginerrornumber = loginerrornumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.lockState
     *
     * @return the value of user.lockState
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public String getLockstate() {
        return lockstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.lockState
     *
     * @param lockstate the value for user.lockState
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void setLockstate(String lockstate) {
        this.lockstate = lockstate == null ? null : lockstate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.lockDate
     *
     * @return the value of user.lockDate
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public Date getLockdate() {
        return lockdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.lockDate
     *
     * @param lockdate the value for user.lockDate
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void setLockdate(Date lockdate) {
        this.lockdate = lockdate;
    }
}