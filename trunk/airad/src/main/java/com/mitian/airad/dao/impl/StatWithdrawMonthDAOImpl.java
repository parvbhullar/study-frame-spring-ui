package com.mitian.airad.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.mitian.airad.dao.StatWithdrawMonthDAO;
import com.mitian.airad.dao.support.CustomSqlMapClientDaoSupport;
import com.mitian.airad.model.StatWithdrawMonth;

/**
 * 财务管理模块
 * 
 * @author 李丰光
 */
@Repository
public class StatWithdrawMonthDAOImpl extends CustomSqlMapClientDaoSupport implements StatWithdrawMonthDAO {

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table
     * STAT_WITHDRAW_MONTH
     * 
     * @ibatorgenerated Sun Jan 30 10:16:21 CST 2011
     */
    public StatWithdrawMonthDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table
     * STAT_WITHDRAW_MONTH
     * 
     * @ibatorgenerated Sun Jan 30 10:16:21 CST 2011
     */
    public int deleteByPrimaryKey(Integer drawSumId) {
        StatWithdrawMonth key = new StatWithdrawMonth();
        key.setDrawSumId(drawSumId);
        int rows = getSqlMapClientTemplate().delete("STAT_WITHDRAW_MONTH.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table
     * STAT_WITHDRAW_MONTH
     * 
     * @ibatorgenerated Sun Jan 30 10:16:21 CST 2011
     */
    public void insert(StatWithdrawMonth record) {
        getSqlMapClientTemplate().insert("STAT_WITHDRAW_MONTH.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table
     * STAT_WITHDRAW_MONTH
     * 
     * @ibatorgenerated Sun Jan 30 10:16:21 CST 2011
     */
    public void insertSelective(StatWithdrawMonth record) {
        getSqlMapClientTemplate().insert("STAT_WITHDRAW_MONTH.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table
     * STAT_WITHDRAW_MONTH
     * 
     * @ibatorgenerated Sun Jan 30 10:16:21 CST 2011
     */
    public StatWithdrawMonth selectByPrimaryKey(Integer drawSumId) {
        StatWithdrawMonth key = new StatWithdrawMonth();
        key.setDrawSumId(drawSumId);
        StatWithdrawMonth record =
                (StatWithdrawMonth) getSqlMapClientTemplate().queryForObject(
                        "STAT_WITHDRAW_MONTH.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table
     * STAT_WITHDRAW_MONTH
     * 
     * @ibatorgenerated Sun Jan 30 10:16:21 CST 2011
     */
    public int updateByPrimaryKeySelective(StatWithdrawMonth record) {
        int rows =
                getSqlMapClientTemplate().update("STAT_WITHDRAW_MONTH.ibatorgenerated_updateByPrimaryKeySelective",
                        record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table
     * STAT_WITHDRAW_MONTH
     * 
     * @ibatorgenerated Sun Jan 30 10:16:21 CST 2011
     */
    public int updateByPrimaryKey(StatWithdrawMonth record) {
        int rows = getSqlMapClientTemplate().update("STAT_WITHDRAW_MONTH.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /** 查询记录数量 */
    public int queryCount(StatWithdrawMonth swdm) {

        int rows = (Integer) getSqlMapClientTemplate().queryForObject("STAT_WITHDRAW_MONTH.selectRecordCount", swdm);
        return rows;
    }

    /** 查询提现申请列表 */
    public List<StatWithdrawMonth> pageQueryStatWithdrawMonthDAO(StatWithdrawMonth swdm, int fromRecord, int pageSize) {

        return getSqlMapClientTemplate().queryForList("STAT_WITHDRAW_MONTH.selectRecordList", fromRecord, pageSize);

    }

    /* 汇款标示位处理* */
    public int updateByPrimaryKey(Integer drawSumId) {
        StatWithdrawMonth key = new StatWithdrawMonth();
        key.setDrawSumId(drawSumId);
        // '1'代表已经付款
        key.setStatus("1");
        return getSqlMapClientTemplate().update("STAT_WITHDRAW_MONTH.updateStatWithdrawMonthStatus", key);
    }

    /** 汇款历史数 */
    public int queryWithdrawHistoryCount(StatWithdrawMonth swdm) {
        int count = 0;
        swdm.setStatus("1");
        count =
                (Integer) getSqlMapClientTemplate().queryForObject("STAT_WITHDRAW_MONTH.selectWithDrawHistoryCount",
                        swdm);
        return count;
    }

    /** 汇款历史记录列表 */
    public List<StatWithdrawMonth> pageQueryWithdrawHistoryDAO(StatWithdrawMonth swdm, int fromRecord, int pageSize) {
        swdm.setStatus("1");
        return getSqlMapClientTemplate().queryForList("STAT_WITHDRAW_MONTH.selectwithdrawhistoryList", swdm,
                fromRecord, pageSize);
    }
}
