package com.mitian.airad.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.mitian.airad.dao.AccIncomeDAO;
import com.mitian.airad.dao.support.CustomSqlMapClientDaoSupport;
import com.mitian.airad.model.AccIncome;
import com.mitian.airad.utils.StringUtil;

@Repository
public class AccIncomeDAOImpl extends CustomSqlMapClientDaoSupport implements AccIncomeDAO {

    public List<AccIncome> selectByAll(Map<String, String> params) {
        int pageSize = StringUtil.StringToInteger(params.get("pageSize"));
        int currentPage = StringUtil.StringToInteger(params.get("currentPage")) - 1;
        int fromRecord = pageSize * currentPage;
        return getSqlMapClientTemplate().queryForList("ACC_INCOME.selectAll", params, fromRecord, pageSize);
    }

    public int totalCount(Long memberId) {
        return (Integer) getSqlMapClientTemplate().queryForObject("ACC_INCOME.selectAllCount", memberId);
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table ACC_INCOME
     * 
     * @ibatorgenerated Thu Feb 17 14:53:14 CST 2011
     */
    public AccIncomeDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table ACC_INCOME
     * 
     * @ibatorgenerated Thu Feb 17 14:53:14 CST 2011
     */
    public int deleteByPrimaryKey(Integer incomeId) {
        AccIncome key = new AccIncome();
        key.setIncomeId(incomeId);
        int rows = getSqlMapClientTemplate().delete("ACC_INCOME.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table ACC_INCOME
     * 
     * @ibatorgenerated Thu Feb 17 14:53:14 CST 2011
     */
    public void insert(AccIncome record) {
        getSqlMapClientTemplate().insert("ACC_INCOME.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table ACC_INCOME
     * 
     * @ibatorgenerated Thu Feb 17 14:53:14 CST 2011
     */
    public void insertSelective(AccIncome record) {
        getSqlMapClientTemplate().insert("ACC_INCOME.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table ACC_INCOME
     * 
     * @ibatorgenerated Thu Feb 17 14:53:14 CST 2011
     */
    public AccIncome selectByPrimaryKey(Integer incomeId) {
        AccIncome key = new AccIncome();
        key.setIncomeId(incomeId);
        AccIncome record =
                (AccIncome) getSqlMapClientTemplate().queryForObject("ACC_INCOME.ibatorgenerated_selectByPrimaryKey",
                        key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table ACC_INCOME
     * 
     * @ibatorgenerated Thu Feb 17 14:53:14 CST 2011
     */
    public int updateByPrimaryKeySelective(AccIncome record) {
        int rows = getSqlMapClientTemplate().update("ACC_INCOME.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator. This method corresponds to the database table ACC_INCOME
     * 
     * @ibatorgenerated Thu Feb 17 14:53:14 CST 2011
     */
    public int updateByPrimaryKey(AccIncome record) {
        int rows = getSqlMapClientTemplate().update("ACC_INCOME.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }
}
