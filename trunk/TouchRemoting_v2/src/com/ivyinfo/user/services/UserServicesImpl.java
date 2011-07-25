package com.ivyinfo.user.services;

import java.util.List;

import org.njdt.gg.ccl.datastructure.Dto;

import com.ivyinfo.framework.service.base.BaseService;
import com.ivyinfo.framework.service.server.SpringContextUtil;
import com.ivyinfo.user.bean.UserBean;
import com.ivyinfo.user.dao.UserDAO;

public class UserServicesImpl extends BaseService implements UserServices{

	public void saveUserItem(Dto inDto) throws Exception {
		UserDAO userDAO =(UserDAO) SpringContextUtil.getBean("userDAO");
		this.iDao.insert("saveEausersubinfoItem", inDto);
//		userDAO.UpdCardCZJE(userid, czje);
	}

	public Dto ValidationLogin(UserBean userBean) throws Exception {
		return (Dto)this.iDao.queryForObject("validateAccount",userBean);
	}
}
