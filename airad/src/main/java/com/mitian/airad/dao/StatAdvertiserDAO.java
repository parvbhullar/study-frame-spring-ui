package com.mitian.airad.dao;

import com.mitian.airad.model.StatAdvertiser;

public interface StatAdvertiserDAO {
    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table STAT_ADVERTISER
     * 
     * @ibatorgenerated Tue Feb 15 13:33:26 CST 2011
     */
    int deleteByPrimaryKey(Integer shatAngenId);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table STAT_ADVERTISER
     * 
     * @ibatorgenerated Tue Feb 15 13:33:26 CST 2011
     */
    void insert(StatAdvertiser record);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table STAT_ADVERTISER
     * 
     * @ibatorgenerated Tue Feb 15 13:33:26 CST 2011
     */
    void insertSelective(StatAdvertiser record);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table STAT_ADVERTISER
     * 
     * @ibatorgenerated Tue Feb 15 13:33:26 CST 2011
     */
    StatAdvertiser selectByPrimaryKey(Integer shatAngenId);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table STAT_ADVERTISER
     * 
     * @ibatorgenerated Tue Feb 15 13:33:26 CST 2011
     */
    int updateByPrimaryKeySelective(StatAdvertiser record);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table STAT_ADVERTISER
     * 
     * @ibatorgenerated Tue Feb 15 13:33:26 CST 2011
     */
    int updateByPrimaryKey(StatAdvertiser record);
}
