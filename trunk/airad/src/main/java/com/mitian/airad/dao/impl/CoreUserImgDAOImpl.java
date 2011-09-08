package com.mitian.airad.dao.impl;

import com.mitian.airad.dao.CoreUserImgDAO;
import com.mitian.airad.model.CoreUserImg;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class CoreUserImgDAOImpl extends SqlMapClientDaoSupport implements CoreUserImgDAO {

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_USER_IMG
     * 
     * @ibatorgenerated Sun Jan 30 11:18:10 CST 2011
     */
    public CoreUserImgDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_USER_IMG
     * 
     * @ibatorgenerated Sun Jan 30 11:18:10 CST 2011
     */
    public int deleteByPrimaryKey(Integer imgId) {
        CoreUserImg key = new CoreUserImg();
        key.setImgId(imgId);
        int rows = getSqlMapClientTemplate().delete("CORE_USER_IMG.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_USER_IMG
     * 
     * @ibatorgenerated Sun Jan 30 11:18:10 CST 2011
     */
    public void insert(CoreUserImg record) {
        getSqlMapClientTemplate().insert("CORE_USER_IMG.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_USER_IMG
     * 
     * @ibatorgenerated Sun Jan 30 11:18:10 CST 2011
     */
    public void insertSelective(CoreUserImg record) {
        getSqlMapClientTemplate().insert("CORE_USER_IMG.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_USER_IMG
     * 
     * @ibatorgenerated Sun Jan 30 11:18:10 CST 2011
     */
    public CoreUserImg selectByPrimaryKey(Integer imgId) {
        CoreUserImg key = new CoreUserImg();
        key.setImgId(imgId);
        CoreUserImg record =
                (CoreUserImg) getSqlMapClientTemplate().queryForObject(
                        "CORE_USER_IMG.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_USER_IMG
     * 
     * @ibatorgenerated Sun Jan 30 11:18:10 CST 2011
     */
    public int updateByPrimaryKeySelective(CoreUserImg record) {
        int rows =
                getSqlMapClientTemplate().update("CORE_USER_IMG.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table CORE_USER_IMG
     * 
     * @ibatorgenerated Sun Jan 30 11:18:10 CST 2011
     */
    public int updateByPrimaryKey(CoreUserImg record) {
        int rows = getSqlMapClientTemplate().update("CORE_USER_IMG.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }
}
