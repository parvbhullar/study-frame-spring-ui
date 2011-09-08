package com.mitian.airad.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mitian.airad.dao.StatWithdrawDAO;
import com.mitian.airad.dao.support.CustomSqlMapClientDaoSupport;
import com.mitian.airad.model.StatWithdraw;

@Repository
public class StatWithdrawDAOImpl extends CustomSqlMapClientDaoSupport implements StatWithdrawDAO {

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table STAT_WITHDRAW
     * 
     * @ibatorgenerated Sat Apr 02 15:30:14 CST 2011
     */
    public StatWithdrawDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table STAT_WITHDRAW
     * 
     * @ibatorgenerated Sat Apr 02 15:30:14 CST 2011
     */
    public int deleteByPrimaryKey(Integer statDrawId) {
        StatWithdraw key = new StatWithdraw();
        key.setStatDrawId(statDrawId);
        int rows = getSqlMapClientTemplate().delete("STAT_WITHDRAW.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table STAT_WITHDRAW
     * 
     * @ibatorgenerated Sat Apr 02 15:30:14 CST 2011
     */
    public void insert(StatWithdraw record) {
        getSqlMapClientTemplate().insert("STAT_WITHDRAW.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table STAT_WITHDRAW
     * 
     * @ibatorgenerated Sat Apr 02 15:30:14 CST 2011
     */
    public void insertSelective(StatWithdraw record) {
        getSqlMapClientTemplate().insert("STAT_WITHDRAW.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table STAT_WITHDRAW
     * 
     * @ibatorgenerated Sat Apr 02 15:30:14 CST 2011
     */
    public StatWithdraw selectByPrimaryKey(Integer statDrawId) {
        StatWithdraw key = new StatWithdraw();
        key.setStatDrawId(statDrawId);
        StatWithdraw record =
                (StatWithdraw) getSqlMapClientTemplate().queryForObject(
                        "STAT_WITHDRAW.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table STAT_WITHDRAW
     * 
     * @ibatorgenerated Sat Apr 02 15:30:14 CST 2011
     */
    public int updateByPrimaryKeySelective(StatWithdraw record) {
        int rows =
                getSqlMapClientTemplate().update("STAT_WITHDRAW.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table STAT_WITHDRAW
     * 
     * @ibatorgenerated Sat Apr 02 15:30:14 CST 2011
     */
    public int updateByPrimaryKey(StatWithdraw record) {
        int rows = getSqlMapClientTemplate().update("STAT_WITHDRAW.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /*
     * (non-Javadoc)
     * @see com.mitian.airad.dao.StatWithdrawDAO#findByTime(java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public List<StatWithdraw> findByTime(String jobTime) {
        StatWithdraw statWithdraw = new StatWithdraw();
        statWithdraw.setJobTime(jobTime);
        return getSqlMapClientTemplate().queryForList("STAT_WITHDRAW.STAT_ACCOUNT_DRAW", statWithdraw);
    }
}
