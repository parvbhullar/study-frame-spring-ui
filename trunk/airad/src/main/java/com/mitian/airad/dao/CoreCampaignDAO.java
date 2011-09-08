package com.mitian.airad.dao;

import java.util.List;
import java.util.Map;

import com.mitian.airad.common.exception.InvalidInfoException;
import com.mitian.airad.model.CoreAd;
import com.mitian.airad.model.CoreAdGroup;
import com.mitian.airad.model.CoreCampaign;

public interface CoreCampaignDAO {

    /**
     * 根据时间段统计收益排序
     * 
     * @param params
     * @return
     */
    List<CoreCampaign> selectStatisticByTimeSlot(Map<String, String> params);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_CAMPAIGN
     * 
     * @ibatorgenerated Thu Jan 20 16:39:10 CST 2011
     */
    int deleteByPrimaryKey(Integer campaignId, Long memberId);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_CAMPAIGN
     * 
     * @ibatorgenerated Thu Jan 20 16:39:10 CST 2011
     */
    void insert(CoreCampaign record);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_CAMPAIGN
     * 
     * @ibatorgenerated Thu Jan 20 16:39:10 CST 2011
     * @param memberId TODO
     */
    CoreCampaign selectByPrimaryKey(Integer campaignId, Long memberId);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_CAMPAIGN
     * 
     * @ibatorgenerated Thu Jan 20 16:39:10 CST 2011
     */
    int updateByPrimaryKeySelective(CoreCampaign record, Long memberId);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_CAMPAIGN
     * 
     * @ibatorgenerated Thu Jan 20 16:39:10 CST 2011
     */
    int updateByPrimaryKey(CoreCampaign record, Long memberId);

    /**
     * 广告活动下所有广告暂停
     * 
     * @param campaignId 活动ID
     * @return
     */
    int txSuspend(CoreCampaign coreCampaign);

    /**
     * 查找广告组ID
     * 
     * @param campaignId
     * @return
     */
    List<CoreAdGroup> selectAdGroupId(CoreCampaign key);

    /**
     * copy活动
     * 
     * @param key
     * @return
     * @throws InvalidInfoException
     */
    void txCopy(CoreCampaign key) throws InvalidInfoException;

    /**
     * 查找所有广告
     * 
     * @param inGroupId 广告组ID
     * @return
     */
    public List<CoreAd> selectAdAll(String inGroupId, Long memberId);

    /**
     * 删除广告活动
     * 
     * @param key
     * @return
     */
    public int txDel(CoreCampaign key);

    public List<CoreCampaign> queryBycondition(CoreCampaign campaign);

    /**
     * 增加活动,返回campaignId
     * 
     * @param record
     * @return
     */
    public int insertReturnId(CoreCampaign record);

    /**
     * 查找活动，分页
     * 
     * @param form
     * @return
     */
    public List<CoreCampaign> selectByAll(Map<String, String> params);

    /**
     * 根据条件查询所有
     * 
     * @param form
     * @return
     */
    public List<CoreCampaign> findByNameList(CoreCampaign campaign);

    /**
     * 查找总共条数
     * 
     * @param
     * @return
     */
    public int totalCount(Map<String, String> params);

    /**
     * 查找总共条数
     * 
     * @param
     * @return
     */
    public int totalCountByTimeSlot(Map<String, String> params);

}
