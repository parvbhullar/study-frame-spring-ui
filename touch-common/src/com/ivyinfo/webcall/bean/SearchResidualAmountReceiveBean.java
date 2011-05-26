package com.ivyinfo.webcall.bean;

import com.ivyinfo.framework.service.base.BaseBean;

public class SearchResidualAmountReceiveBean extends BaseBean implements java.io.Serializable{
	private static final long serialVersionUID = -4433034043604684265L;
	
	private String sessionid;
	private String result;
	private String code;
	private String currency;
	private String amount;
	private String timestamp;
	private String authenticator;
	private ErrorReceiveBean erBean;
	public String getSessionid() {
		return sessionid;
	}
	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getAuthenticator() {
		return authenticator;
	}
	public void setAuthenticator(String authenticator) {
		this.authenticator = authenticator;
	}
	public ErrorReceiveBean getErBean() {
		return erBean;
	}
	public void setErBean(ErrorReceiveBean erBean) {
		this.erBean = erBean;
	}
	
}
