package com.ivyinfo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.njdt.gg.ccl.datastructure.Dto;
import org.njdt.gg.ccl.datastructure.impl.BaseDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ivyinfo.framework.service.server.SpringContextUtil;
import com.ivyinfo.user.services.UserServices;
import com.ivyinfo.util.Constant;
import com.ivyinfo.util.Page;
  
@Controller  
public class LoginController{   
    protected final Log logger = LogFactory.getLog(getClass());
    private UserServices userServices = (UserServices) SpringContextUtil
			.getBean("userServices");
  
    @RequestMapping("/login")   
    public void helloWorld(HttpServletRequest request, HttpServletResponse response) throws IOException{
    	response.setContentType("text/html;charset=utf-8");
		PrintWriter   out   =   response.getWriter(); 
		String logname = (String) request.getParameter("logname");
		String password = (String) request.getParameter("password");
		HttpSession session = request.getSession();
    	try {
    		logger.info("Return View");
			Dto inDto=new BaseDto();
			inDto.put("logname", logname);
			inDto.put("password", password);
			Dto dto=userServices.ValidationLogin(inDto);
			if("2".equals(dto.get("state"))){
				try {
				} catch (Exception e) {
					e.printStackTrace();
				}
				//request.getRequestDispatcher("index.jsp").forward(request, response);
				request.getRequestDispatcher("layout_tree.jsp").forward(request, response);
			}else{
				String errmessage = (String) dto.get("errmessage");
				out.print("<script type='text/javascript'>alert('"+errmessage+"');history.go(-1);</script>");
			}
		
		} catch (Exception e) {
		}
    }   
    
    @RequestMapping(value="/mail/mailReceive")
	public void mailReceive(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		
		String page1="1";
		String sidx=(String)request.getParameter("sidx");
		String sord=(String)request.getParameter("sord");
		Page page=new Page(Constant.PAGE_SIZE_10);
		
		if("".equals(page1))
			page1="1";
		List arrayList=new ArrayList();
//		int intpage1=new Integer(page1).intValue();
		int intpage1=1;
		int totalCount=0;
		try {
			totalCount=13;
			page.setPageNo(new Integer(page1).intValue());
			page.setTotalCount(totalCount);
			
//			purviewServices.ValidationLogin(logname, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
        // 定义返回的数据类型：json，使用了json-lib
        JSONObject jsonObj = new JSONObject();
        // 根据jqGrid对JSON的数据格式要求给jsonObj赋值
        jsonObj.put("page", page1);                // 当前页
        jsonObj.put("total",page.getTotalPages());        // 总页数
        jsonObj.put("records", totalCount);        // 总记录数
        // 定义rows，存放数据
        JSONArray rows = new JSONArray();
        for(int i=0;i<13;i++)
        {
                // 存放一条记录的对象
                JSONObject cell = new JSONObject();
                cell.put("id", i);
                cell.put("state", 1);
                cell.put("sendname", 2);
                cell.put("subject", 3);
                cell.put("datetime", 4);
                cell.put("filename", "34");
                cell.put("name", "qk");
                // 将该记录放入rows中
                rows.add(cell);
        }
        // 将rows放入json对象中
        jsonObj.put("rows", rows);
        response.getWriter().print(jsonObj);
	}
}