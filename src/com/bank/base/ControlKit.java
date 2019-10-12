package com.bank.base;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControlKit {
	public String layout;
	public boolean jsonResp=false;
	public String redirectUrl;
	public String page;
	public Map<String,Object> reqData;
	public Map<String,Object> resData;
	public HttpServletRequest request;
	public HttpServletResponse response;
	public ControlKit(Map<String, Object> reqData,
			Map<String, Object> resData, HttpServletRequest request, HttpServletResponse response) {
		super();
		this.jsonResp = false;
		this.reqData = reqData;
		this.resData = resData;
		this.request = request;
		this.response = response;
	}
	
	
	
	
}
