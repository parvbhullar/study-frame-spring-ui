package com.mitian.airad.model;

import java.util.Date;

/**
 * 账户信息
 * 
 * @author chenji
 */
public class CoreAccountInfo {
    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
     * CORE_ACCOUNT_INFO.ACC_ID
     * 
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    private Integer accId;
    private String initPassword;
    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
     * CORE_ACCOUNT_INFO.MEMBER_ID
     * 
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    private Long memberId;

    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
     * CORE_ACCOUNT_INFO.ACC_TYPE
     * 
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    private String accType;

    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
     * CORE_ACCOUNT_INFO.ACC_FLAG
     * 
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    private String accFlag;

    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
     * CORE_ACCOUNT_INFO.ACC_STATUS
     * 
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    private String accStatus;

    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
     * CORE_ACCOUNT_INFO.SECURITY_PROBLEM
     * 
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    private String securityProblem;

    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
     * CORE_ACCOUNT_INFO.SECURITY_ANSWER
     * 
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    private String securityAnswer;

    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
     * CORE_ACCOUNT_INFO.PASSWORD
     * 
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    private String password;

    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
     * CORE_ACCOUNT_INFO.ID_CARD
     * 
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    private String idCard;

    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
     * CORE_ACCOUNT_INFO.REAL_NAME
     * 
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    private String realName;

    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
     * CORE_ACCOUNT_INFO.OPENING_BANK
     * 
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    private String openingBank;

    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
     * CORE_ACCOUNT_INFO.UNIONPAY_ID
     * 
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    private String unionpayId;

    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
     * CORE_ACCOUNT_INFO.APPLY_TIME
     * 
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    private Date applyTime;

    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
     * CORE_ACCOUNT_INFO.ADD_OPER
     * 
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    private String addOper;

    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
     * CORE_ACCOUNT_INFO.ADD_NAME
     * 
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    private String addName;

    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
     * CORE_ACCOUNT_INFO.ADD_TIME
     * 
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    private Date addTime;

    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
     * CORE_ACCOUNT_INFO.UPD_OPER
     * 
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    private String updOper;

    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
     * CORE_ACCOUNT_INFO.UPD_NAME
     * 
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    private String updName;

    /**
     * This field was generated by Apache iBATIS ibator. This field corresponds to the database column
     * CORE_ACCOUNT_INFO.UPD_TIME
     * 
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    private Date updTime;

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_ACCOUNT_INFO.ACC_ID
     * 
     * @return the value of CORE_ACCOUNT_INFO.ACC_ID
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public Integer getAccId() {
        return accId;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_ACCOUNT_INFO.ACC_ID
     * 
     * @param accId the value for CORE_ACCOUNT_INFO.ACC_ID
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    public String getInitPassword() {
        return initPassword;
    }

    public void setInitPassword(String initPassword) {
        this.initPassword = initPassword;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_ACCOUNT_INFO.MEMBER_ID
     * 
     * @return the value of CORE_ACCOUNT_INFO.MEMBER_ID
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_ACCOUNT_INFO.MEMBER_ID
     * 
     * @param memberId the value for CORE_ACCOUNT_INFO.MEMBER_ID
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_ACCOUNT_INFO.ACC_TYPE
     * 
     * @return the value of CORE_ACCOUNT_INFO.ACC_TYPE
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public String getAccType() {
        return accType;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_ACCOUNT_INFO.ACC_TYPE
     * 
     * @param accType the value for CORE_ACCOUNT_INFO.ACC_TYPE
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public void setAccType(String accType) {
        this.accType = accType;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_ACCOUNT_INFO.ACC_FLAG
     * 
     * @return the value of CORE_ACCOUNT_INFO.ACC_FLAG
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public String getAccFlag() {

        return accFlag;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_ACCOUNT_INFO.ACC_FLAG
     * 
     * @param accFlag the value for CORE_ACCOUNT_INFO.ACC_FLAG
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public void setAccFlag(String accFlag) {
        this.accFlag = accFlag;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_ACCOUNT_INFO.ACC_STATUS
     * 
     * @return the value of CORE_ACCOUNT_INFO.ACC_STATUS
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public String getAccStatus() {
        return accStatus;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_ACCOUNT_INFO.ACC_STATUS
     * 
     * @param accStatus the value for CORE_ACCOUNT_INFO.ACC_STATUS
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public void setAccStatus(String accStatus) {
        this.accStatus = accStatus;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_ACCOUNT_INFO.SECURITY_PROBLEM
     * 
     * @return the value of CORE_ACCOUNT_INFO.SECURITY_PROBLEM
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public String getSecurityProblem() {
        return securityProblem;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_ACCOUNT_INFO.SECURITY_PROBLEM
     * 
     * @param securityProblem the value for CORE_ACCOUNT_INFO.SECURITY_PROBLEM
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public void setSecurityProblem(String securityProblem) {
        this.securityProblem = securityProblem;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_ACCOUNT_INFO.SECURITY_ANSWER
     * 
     * @return the value of CORE_ACCOUNT_INFO.SECURITY_ANSWER
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public String getSecurityAnswer() {
        return securityAnswer;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_ACCOUNT_INFO.SECURITY_ANSWER
     * 
     * @param securityAnswer the value for CORE_ACCOUNT_INFO.SECURITY_ANSWER
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_ACCOUNT_INFO.PASSWORD
     * 
     * @return the value of CORE_ACCOUNT_INFO.PASSWORD
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_ACCOUNT_INFO.PASSWORD
     * 
     * @param password the value for CORE_ACCOUNT_INFO.PASSWORD
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_ACCOUNT_INFO.ID_CARD
     * 
     * @return the value of CORE_ACCOUNT_INFO.ID_CARD
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_ACCOUNT_INFO.ID_CARD
     * 
     * @param idCard the value for CORE_ACCOUNT_INFO.ID_CARD
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_ACCOUNT_INFO.REAL_NAME
     * 
     * @return the value of CORE_ACCOUNT_INFO.REAL_NAME
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_ACCOUNT_INFO.REAL_NAME
     * 
     * @param realName the value for CORE_ACCOUNT_INFO.REAL_NAME
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_ACCOUNT_INFO.OPENING_BANK
     * 
     * @return the value of CORE_ACCOUNT_INFO.OPENING_BANK
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public String getOpeningBank() {
        return openingBank;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_ACCOUNT_INFO.OPENING_BANK
     * 
     * @param openingBank the value for CORE_ACCOUNT_INFO.OPENING_BANK
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public void setOpeningBank(String openingBank) {
        this.openingBank = openingBank;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_ACCOUNT_INFO.UNIONPAY_ID
     * 
     * @return the value of CORE_ACCOUNT_INFO.UNIONPAY_ID
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public String getUnionpayId() {
        return unionpayId;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_ACCOUNT_INFO.UNIONPAY_ID
     * 
     * @param unionpayId the value for CORE_ACCOUNT_INFO.UNIONPAY_ID
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public void setUnionpayId(String unionpayId) {
        this.unionpayId = unionpayId;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_ACCOUNT_INFO.APPLY_TIME
     * 
     * @return the value of CORE_ACCOUNT_INFO.APPLY_TIME
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public Date getApplyTime() {
        return applyTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_ACCOUNT_INFO.APPLY_TIME
     * 
     * @param applyTime the value for CORE_ACCOUNT_INFO.APPLY_TIME
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_ACCOUNT_INFO.ADD_OPER
     * 
     * @return the value of CORE_ACCOUNT_INFO.ADD_OPER
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public String getAddOper() {
        return addOper;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_ACCOUNT_INFO.ADD_OPER
     * 
     * @param addOper the value for CORE_ACCOUNT_INFO.ADD_OPER
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public void setAddOper(String addOper) {
        this.addOper = addOper;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_ACCOUNT_INFO.ADD_NAME
     * 
     * @return the value of CORE_ACCOUNT_INFO.ADD_NAME
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public String getAddName() {
        return addName;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_ACCOUNT_INFO.ADD_NAME
     * 
     * @param addName the value for CORE_ACCOUNT_INFO.ADD_NAME
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public void setAddName(String addName) {
        this.addName = addName;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_ACCOUNT_INFO.ADD_TIME
     * 
     * @return the value of CORE_ACCOUNT_INFO.ADD_TIME
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_ACCOUNT_INFO.ADD_TIME
     * 
     * @param addTime the value for CORE_ACCOUNT_INFO.ADD_TIME
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_ACCOUNT_INFO.UPD_OPER
     * 
     * @return the value of CORE_ACCOUNT_INFO.UPD_OPER
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public String getUpdOper() {
        return updOper;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_ACCOUNT_INFO.UPD_OPER
     * 
     * @param updOper the value for CORE_ACCOUNT_INFO.UPD_OPER
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public void setUpdOper(String updOper) {
        this.updOper = updOper;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_ACCOUNT_INFO.UPD_NAME
     * 
     * @return the value of CORE_ACCOUNT_INFO.UPD_NAME
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public String getUpdName() {
        return updName;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_ACCOUNT_INFO.UPD_NAME
     * 
     * @param updName the value for CORE_ACCOUNT_INFO.UPD_NAME
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public void setUpdName(String updName) {
        this.updName = updName;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_ACCOUNT_INFO.UPD_TIME
     * 
     * @return the value of CORE_ACCOUNT_INFO.UPD_TIME
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public Date getUpdTime() {
        return updTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_ACCOUNT_INFO.UPD_TIME
     * 
     * @param updTime the value for CORE_ACCOUNT_INFO.UPD_TIME
     * @ibatorgenerated Sun Jan 30 17:38:54 CST 2011
     */
    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }
}
