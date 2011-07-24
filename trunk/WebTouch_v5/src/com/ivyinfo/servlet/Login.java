package com.ivyinfo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.njdt.gg.ccl.datastructure.Dto;
import org.njdt.gg.ccl.datastructure.impl.BaseDto;

import com.ivyinfo.framework.service.server.SpringContextUtil;
import com.ivyinfo.login.bean.LoginBean;
import com.ivyinfo.user.services.UserServices;

public class Login extends HttpServlet {
	private UserServices userServices = (UserServices) SpringContextUtil
			.getBean("userServices");

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		System.out.println("get");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter   out   =   response.getWriter(); 
		String logname = (String) request.getParameter("logname");
		String password = (String) request.getParameter("password");
		HttpSession session = request.getSession();
		LoginBean loginBean = null;
		try {
			Dto dto=new BaseDto();
			dto.put("logname", logname);
			dto.put("password", password);
			userServices.ValidationLogin(dto);
			
			if("SUCCESS".equals(loginBean.getState())){
				try {
				} catch (Exception e) {
					e.printStackTrace();
				}
				//request.getRequestDispatcher("index.jsp").forward(request, response);
				request.getRequestDispatcher("layout_tree.jsp").forward(request, response);
			}else{
				String errmessage = loginBean.getErrmessage();
				out.print("<script type='text/javascript'>alert('"+errmessage+"');history.go(-1);</script>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
