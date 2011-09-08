package com.mitian.airad.dao.impl;

import com.mitian.airad.dao.CoreRichGuideDAO;
import com.mitian.airad.dao.support.CustomSqlMapClientDaoSupport;
import com.mitian.airad.model.CoreRichGuide;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class CoreRichGuideDAOImpl extends CustomSqlMapClientDaoSupport implements CoreRichGuideDAO {

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_RICH_GUIDE
     * 
     * @ibatorgenerated Thu Mar 03 19:05:52 CST 2011
     */
    public CoreRichGuideDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_RICH_GUIDE
     * 
     * @ibatorgenerated Thu Mar 03 19:05:52 CST 2011
     */
    public int deleteByPrimaryKey(Integer guideId) {
        CoreRichGuide key = new CoreRichGuide();
        key.setGuideId(guideId);
        int rows = getSqlMapClientTemplate().delete("CORE_RICH_GUIDE.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_RICH_GUIDE
     * 
     * @ibatorgenerated Thu Mar 03 19:05:52 CST 2011
     */
    public int insert(CoreRichGuide record) {

        int adId = 0;
        Object obj = getSqlMapClientTemplate().insert("CORE_RICH_GUIDE.ibatorgenerated_insert", record);
        if (null != obj && !"".equals(obj)) {
            adId = Integer.parseInt(obj.toString());
            return adId;
        }
        else {
            return 0;
        }
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_RICH_GUIDE
     * 
     * @ibatorgenerated Thu Mar 03 19:05:52 CST 2011
     */
    public void insertSelective(CoreRichGuide record) {
        getSqlMapClientTemplate().insert("CORE_RICH_GUIDE.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_RICH_GUIDE
     * 
     * @ibatorgenerated Thu Mar 03 19:05:52 CST 2011
     */
    public CoreRichGuide selectByPrimaryKey(Integer guideId) {
        CoreRichGuide key = new CoreRichGuide();
        key.setGuideId(guideId);
        CoreRichGuide record =
                (CoreRichGuide) getSqlMapClientTemplate().queryForObject(
                        "CORE_RICH_GUIDE.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_RICH_GUIDE
     * 
     * @ibatorgenerated Thu Mar 03 19:05:52 CST 2011
     */
    public int updateByPrimaryKeySelective(CoreRichGuide record) {
        int rows =
                getSqlMapClientTemplate().update("CORE_RICH_GUIDE.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_RICH_GUIDE
     * 
     * @ibatorgenerated Thu Mar 03 19:05:52 CST 2011
     */
    public int updateByPrimaryKey(CoreRichGuide record) {
        int rows = getSqlMapClientTemplate().update("CORE_RICH_GUIDE.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }
}
