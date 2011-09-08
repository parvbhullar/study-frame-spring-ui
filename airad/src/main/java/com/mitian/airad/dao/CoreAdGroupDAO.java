package com.mitian.airad.dao;

import java.util.List;
import java.util.Map;

import com.mitian.airad.model.CoreAdGroup;

public interface CoreAdGroupDAO {
    /**
     * 根据时间段统计
     *
     * @param params
     * @return
     */
    public List<CoreAdGroup> findAllGroupByTimeSlot(Map<String, String> params);

    public int findCountByTimeSlot(Map<String, String> params);

    /**
     * 广告组删除
     *
     * @param coreAd
     */
    public void batchDelete(final CoreAdGroup coreAdGroup);

    /**
     * 广告组复制
     *
     * @param key
     */
    public void txCopy(CoreAdGroup key, Long memberId);

    /**
     * 查询所有的广告组信息
     *
     * @return
     */
    public List<CoreAdGroup> findAllGroup(Map params, int record, int pageSize);

    int countTotal(Map params);

    /**
     * 根据会员id 查询活动下的所有广告组信息 ibatorgenerated_selectAllGroupByMemberId
     *
     * @return
     */
    public List<CoreAdGroup> findAllGroupByMemberId(Long memberId);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_AD_GROUP
     *
     * @ibatorgenerated Thu Jan 20 16:39:10 CST 2011
     */
    // int deleteByPrimaryKey(Integer adGroupId);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_AD_GROUP
     *
     * @ibatorgenerated Thu Jan 20 16:39:10 CST 2011
     */
    int insert(CoreAdGroup record);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_AD_GROUP
     *
     * @ibatorgenerated Thu Jan 20 16:39:10 CST 2011
     */
    int insertSelective(CoreAdGroup record);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_AD_GROUP
     *
     * @param memberId
     * @ibatorgenerated Thu Jan 20 16:39:10 CST 2011
     */
    CoreAdGroup findByPrimaryKey(Integer adGroupId, Long memberId);

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_AD_GROUP
     *
     * @ibatorgenerated Thu Jan 20 16:39:10 CST 2011
     */
    int updateByPrimaryKeySelective(CoreAdGroup record);

    /**
     *广告组分页查询
     * @param memeberId
     * @param map
     * @return
     */
    public List<CoreAdGroup> findGroupByMemberIdByPage(Long memberId,Map map) ;
}
