package com.mitian.airad.dao;

import com.mitian.airad.model.ReqAdOnlineTime;

public interface ReqAdOnlineTimeDAO {
    /**
     * 根据条件查询是否存在这个对象
     * 
     * @param adOnlineId
     * @param AppCode
     * @param SoleId
     * @return
     */
    ReqAdOnlineTime selectByAdIdAndAppCodeAndSoleId(ReqAdOnlineTime adtime);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table
     * REQ_AD_ONLINE_TIME
     * 
     * @ibatorgenerated Mon Feb 21 18:54:14 CST 2011
     */
    int deleteByPrimaryKey(Integer adOnlineId);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table
     * REQ_AD_ONLINE_TIME
     * 
     * @ibatorgenerated Mon Feb 21 18:54:14 CST 2011
     */
    void insert(ReqAdOnlineTime record);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table
     * REQ_AD_ONLINE_TIME
     * 
     * @ibatorgenerated Mon Feb 21 18:54:14 CST 2011
     */
    void insertSelective(ReqAdOnlineTime record);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table
     * REQ_AD_ONLINE_TIME
     * 
     * @ibatorgenerated Mon Feb 21 18:54:14 CST 2011
     */
    ReqAdOnlineTime selectByPrimaryKey(Integer adOnlineId);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table
     * REQ_AD_ONLINE_TIME
     * 
     * @ibatorgenerated Mon Feb 21 18:54:14 CST 2011
     */
    int updateByPrimaryKeySelective(ReqAdOnlineTime record);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table
     * REQ_AD_ONLINE_TIME
     * 
     * @ibatorgenerated Mon Feb 21 18:54:14 CST 2011
     */
    int updateByPrimaryKey(ReqAdOnlineTime record);
}
