package com.mitian.airad.dao;

import com.mitian.airad.model.CoreRichGuide;

public interface CoreRichGuideDAO {
    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_RICH_GUIDE
     * 
     * @ibatorgenerated Thu Mar 03 19:05:52 CST 2011
     */
    int deleteByPrimaryKey(Integer guideId);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_RICH_GUIDE
     * 
     * @ibatorgenerated Thu Mar 03 19:05:52 CST 2011
     */
    int insert(CoreRichGuide record);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_RICH_GUIDE
     * 
     * @ibatorgenerated Thu Mar 03 19:05:52 CST 2011
     */
    void insertSelective(CoreRichGuide record);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_RICH_GUIDE
     * 
     * @ibatorgenerated Thu Mar 03 19:05:52 CST 2011
     */
    CoreRichGuide selectByPrimaryKey(Integer guideId);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_RICH_GUIDE
     * 
     * @ibatorgenerated Thu Mar 03 19:05:52 CST 2011
     */
    int updateByPrimaryKeySelective(CoreRichGuide record);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_RICH_GUIDE
     * 
     * @ibatorgenerated Thu Mar 03 19:05:52 CST 2011
     */
    int updateByPrimaryKey(CoreRichGuide record);
}
