package com.mitian.airad.model;

import java.math.BigDecimal;
import java.util.Date;

public class CoreCampaign {

    /** 广告活动id not null */
    private Integer campaignId;
    /** 会员id not null */
    private Long memberId;
    /** 活动名称 */
    private String campaignName;
    /** 开始时间 */
    private Date startTime;
    /** 结束时间 */
    private Date endTime;
    /** 每日预算 */
    private Long buggetDay;
    /** 投放方式 */
    private String pubKind;
    /** 活动说明 */
    private String campaignState;
    /** 暂停标记 */
    private String suspendType;

    /** 冻结标志 */
    private String blocking;
    /** 添加人 */
    private String addOper;
    /** 添加时间 */
    private Date addTime;
    /** 更新人 */
    private String updOper;
    /** 更新时间 */
    private Date updTime;
    /** 删除人 */
    private String delOper;
    /** 删除时间 */
    private Date delTime;
    /** 删除标记 */
    private String delFlag;

    /** 广告组ID */
    private String inGroupId;

    /** 广告ID */
    private String inAdId;

    /** 审核 标志 */
    private String flag;

    /** 返回的活动ID主健 */
    private Long id;

    // 自定义
    // 平均每次点击费用（CPC）
    private BigDecimal avgAdOffer;
    // 广告展示次数
    private int showNum;
    // 点击数
    private int clickNum;
    // 点击率（CTR）
    private BigDecimal clickRate;
    // 成本
    private BigDecimal sumAdOffer;
    // 广告组数量
    private int count;
    // 不同状态的广告数
    // 已发布广告数
    private Integer adNum;
    // 待审核广告数
    private Integer checkAdNum;
    // 未审核通过广告数
    private Integer noCheckAdNum;
    // 是否有结束时间标示
    private String endTimeFlag;
    /**
     * 冻结的广告数
     */
    private String blockingCount;
    /**
     * 发布的广告数
     */
    private String issuCount;
    /**
     * 暂停的广告数
     */
    private String suspendCount;

    /**
     * @param noCheckAdNum the noCheckAdNum to set
     */
    public void setNoCheckAdNum(Integer noCheckAdNum) {
        this.noCheckAdNum = noCheckAdNum;
    }

    /**
     * @param checkAdNum the checkAdNum to set
     */
    public void setCheckAdNum(Integer checkAdNum) {
        this.checkAdNum = checkAdNum;
    }

    /**
     * @param adNum the adNum to set
     */
    public void setAdNum(Integer adNum) {
        this.adNum = adNum;
    }

    /**
     * @return the noCheckAdNum
     */
    public Integer getNoCheckAdNum() {
        return noCheckAdNum;
    }

    /**
     * @return the checkAdNum
     */
    public Integer getCheckAdNum() {
        return checkAdNum;
    }

    /**
     * @return the adNum
     */
    public Integer getAdNum() {
        return adNum;
    }

    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the flag
     */
    public String getFlag() {
        return flag;
    }

    /**
     * @param flag the flag to set
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

    /**
     * @return the inGroupId
     */
    public String getInGroupId() {
        return inGroupId;
    }

    /**
     * @param inGroupId the inGroupId to set
     */
    public void setInGroupId(String inGroupId) {
        this.inGroupId = inGroupId;
    }

    /**
     * @return the inAdId
     */
    public String getInAdId() {
        return inAdId;
    }

    /**
     * @param inAdId the inAdId to set
     */
    public void setInAdId(String inAdId) {
        this.inAdId = inAdId;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_CAMPAIGN.CAMPAIGN_ID
     * 
     * @return the value of CORE_CAMPAIGN.CAMPAIGN_ID
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public Integer getCampaignId() {
        return campaignId;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_CAMPAIGN.CAMPAIGN_ID
     * 
     * @param campaignId the value for CORE_CAMPAIGN.CAMPAIGN_ID
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public void setCampaignId(Integer campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_CAMPAIGN.MEMBER_ID
     * 
     * @return the value of CORE_CAMPAIGN.MEMBER_ID
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_CAMPAIGN.MEMBER_ID
     * 
     * @param memberId the value for CORE_CAMPAIGN.MEMBER_ID
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_CAMPAIGN.CAMPAIGN_NAME
     * 
     * @return the value of CORE_CAMPAIGN.CAMPAIGN_NAME
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_CAMPAIGN.CAMPAIGN_NAME
     * 
     * @param campaignName the value for CORE_CAMPAIGN.CAMPAIGN_NAME
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_CAMPAIGN.START_TIME
     * 
     * @return the value of CORE_CAMPAIGN.START_TIME
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_CAMPAIGN.START_TIME
     * 
     * @param startTime the value for CORE_CAMPAIGN.START_TIME
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_CAMPAIGN.END_TIME
     * 
     * @return the value of CORE_CAMPAIGN.END_TIME
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_CAMPAIGN.END_TIME
     * 
     * @param endTime the value for CORE_CAMPAIGN.END_TIME
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_CAMPAIGN.BUGGET_DAY
     * 
     * @return the value of CORE_CAMPAIGN.BUGGET_DAY
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public Long getBuggetDay() {
        return buggetDay;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_CAMPAIGN.BUGGET_DAY
     * 
     * @param buggetDay the value for CORE_CAMPAIGN.BUGGET_DAY
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public void setBuggetDay(Long buggetDay) {
        this.buggetDay = buggetDay;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_CAMPAIGN.PUB_KIND
     * 
     * @return the value of CORE_CAMPAIGN.PUB_KIND
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public String getPubKind() {
        return pubKind;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_CAMPAIGN.PUB_KIND
     * 
     * @param pubKind the value for CORE_CAMPAIGN.PUB_KIND
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public void setPubKind(String pubKind) {
        this.pubKind = pubKind;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_CAMPAIGN.CAMPAIGN_STATE
     * 
     * @return the value of CORE_CAMPAIGN.CAMPAIGN_STATE
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public String getCampaignState() {
        return campaignState;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_CAMPAIGN.CAMPAIGN_STATE
     * 
     * @param campaignState the value for CORE_CAMPAIGN.CAMPAIGN_STATE
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public void setCampaignState(String campaignState) {
        this.campaignState = campaignState;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_CAMPAIGN.SUSPEND_TYPE
     * 
     * @return the value of CORE_CAMPAIGN.SUSPEND_TYPE
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public String getSuspendType() {
        return suspendType;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_CAMPAIGN.SUSPEND_TYPE
     * 
     * @param suspendType the value for CORE_CAMPAIGN.SUSPEND_TYPE
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public void setSuspendType(String suspendType) {
        this.suspendType = suspendType;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_CAMPAIGN.BLOCKING
     * 
     * @return the value of CORE_CAMPAIGN.BLOCKING
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public String getBlocking() {
        return blocking;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_CAMPAIGN.BLOCKING
     * 
     * @param blocking the value for CORE_CAMPAIGN.BLOCKING
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public void setBlocking(String blocking) {
        this.blocking = blocking;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_CAMPAIGN.ADD_OPER
     * 
     * @return the value of CORE_CAMPAIGN.ADD_OPER
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public String getAddOper() {
        return addOper;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_CAMPAIGN.ADD_OPER
     * 
     * @param addOper the value for CORE_CAMPAIGN.ADD_OPER
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public void setAddOper(String addOper) {
        this.addOper = addOper;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_CAMPAIGN.ADD_TIME
     * 
     * @return the value of CORE_CAMPAIGN.ADD_TIME
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_CAMPAIGN.ADD_TIME
     * 
     * @param addTime the value for CORE_CAMPAIGN.ADD_TIME
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_CAMPAIGN.UPD_OPER
     * 
     * @return the value of CORE_CAMPAIGN.UPD_OPER
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public String getUpdOper() {
        return updOper;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_CAMPAIGN.UPD_OPER
     * 
     * @param updOper the value for CORE_CAMPAIGN.UPD_OPER
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public void setUpdOper(String updOper) {
        this.updOper = updOper;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_CAMPAIGN.UPD_TIME
     * 
     * @return the value of CORE_CAMPAIGN.UPD_TIME
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public Date getUpdTime() {
        return updTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_CAMPAIGN.UPD_TIME
     * 
     * @param updTime the value for CORE_CAMPAIGN.UPD_TIME
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_CAMPAIGN.DEL_OPER
     * 
     * @return the value of CORE_CAMPAIGN.DEL_OPER
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public String getDelOper() {
        return delOper;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_CAMPAIGN.DEL_OPER
     * 
     * @param delOper the value for CORE_CAMPAIGN.DEL_OPER
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public void setDelOper(String delOper) {
        this.delOper = delOper;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_CAMPAIGN.DEL_TIME
     * 
     * @return the value of CORE_CAMPAIGN.DEL_TIME
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public Date getDelTime() {
        return delTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_CAMPAIGN.DEL_TIME
     * 
     * @param delTime the value for CORE_CAMPAIGN.DEL_TIME
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public void setDelTime(Date delTime) {
        this.delTime = delTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method returns the value of the database column
     * CORE_CAMPAIGN.DEL_FLAG
     * 
     * @return the value of CORE_CAMPAIGN.DEL_FLAG
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method sets the value of the database column
     * CORE_CAMPAIGN.DEL_FLAG
     * 
     * @param delFlag the value for CORE_CAMPAIGN.DEL_FLAG
     * @ibatorgenerated Tue Jan 25 17:28:52 CST 2011
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * @return the avgAdOffer
     */
    public BigDecimal getAvgAdOffer() {
        return avgAdOffer;
    }

    /**
     * @param avgAdOffer the avgAdOffer to set
     */
    public void setAvgAdOffer(BigDecimal avgAdOffer) {
        this.avgAdOffer = avgAdOffer;
    }

    /**
     * @return the showNum
     */
    public int getShowNum() {
        return showNum;
    }

    /**
     * @param showNum the showNum to set
     */
    public void setShowNum(int showNum) {
        this.showNum = showNum;
    }

    /**
     * @return the clickNum
     */
    public int getClickNum() {
        return clickNum;
    }

    /**
     * @param clickNum the clickNum to set
     */
    public void setClickNum(int clickNum) {
        this.clickNum = clickNum;
    }

    /**
     * @return the clickRate
     */
    public BigDecimal getClickRate() {
        return clickRate;
    }

    /**
     * @param clickRate the clickRate to set
     */
    public void setClickRate(BigDecimal clickRate) {
        this.clickRate = clickRate;
    }

    /**
     * @return the sumAdOffer
     */
    public BigDecimal getSumAdOffer() {
        return sumAdOffer;
    }

    /**
     * @param sumAdOffer the sumAdOffer to set
     */
    public void setSumAdOffer(BigDecimal sumAdOffer) {
        this.sumAdOffer = sumAdOffer;
    }

    /**
     * @return the endTimeFlag
     */
    public String getEndTimeFlag() {
        return endTimeFlag;
    }

    /**
     * @param endTimeFlag the endTimeFlag to set
     */
    public void setEndTimeFlag(String endTimeFlag) {
        this.endTimeFlag = endTimeFlag;
    }

    /**
     * @return the blockingCount
     */
    public String getBlockingCount() {
        return blockingCount;
    }

    /**
     * @param blockingCount the blockingCount to set
     */
    public void setBlockingCount(String blockingCount) {
        this.blockingCount = blockingCount;
    }

    /**
     * @return the issuCount
     */
    public String getIssuCount() {
        return issuCount;
    }

    /**
     * @param issuCount the issuCount to set
     */
    public void setIssuCount(String issuCount) {
        this.issuCount = issuCount;
    }

    /**
     * @return the suspendCount
     */
    public String getSuspendCount() {
        return suspendCount;
    }

    /**
     * @param suspendCount the suspendCount to set
     */
    public void setSuspendCount(String suspendCount) {
        this.suspendCount = suspendCount;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((campaignId == null) ? 0 : campaignId.hashCode());
        result = prime * result + ((delFlag == null) ? 0 : delFlag.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        CoreCampaign other = (CoreCampaign) obj;
        if (campaignId == null) {
            if (other.campaignId != null) {
                return false;
            }
        }
        else if (!campaignId.equals(other.campaignId)) {
            return false;
        }
        if (delFlag == null) {
            if (other.delFlag != null) {
                return false;
            }
        }
        else if (!delFlag.equals(other.delFlag)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        }
        else if (!id.equals(other.id)) {
            return false;
        }
        if (memberId == null) {
            if (other.memberId != null) {
                return false;
            }
        }
        else if (!memberId.equals(other.memberId)) {
            return false;
        }
        return true;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "CoreCampaign [adNum=" + adNum + ", addOper=" + addOper + ", addTime=" + addTime + ", avgAdOffer="
                + avgAdOffer + ", blocking=" + blocking + ", blockingCount=" + blockingCount + ", buggetDay="
                + buggetDay + ", campaignId=" + campaignId + ", campaignName=" + campaignName + ", campaignState="
                + campaignState + ", checkAdNum=" + checkAdNum + ", clickNum=" + clickNum + ", clickRate=" + clickRate
                + ", count=" + count + ", delFlag=" + delFlag + ", delOper=" + delOper + ", delTime=" + delTime
                + ", endTime=" + endTime + ", endTimeFlag=" + endTimeFlag + ", flag=" + flag + ", id=" + id
                + ", inAdId=" + inAdId + ", inGroupId=" + inGroupId + ", issuCount=" + issuCount + ", memberId="
                + memberId + ", noCheckAdNum=" + noCheckAdNum + ", pubKind=" + pubKind + ", showNum=" + showNum
                + ", startTime=" + startTime + ", sumAdOffer=" + sumAdOffer + ", suspendCount=" + suspendCount
                + ", suspendType=" + suspendType + ", updOper=" + updOper + ", updTime=" + updTime + "]";
    }

}
