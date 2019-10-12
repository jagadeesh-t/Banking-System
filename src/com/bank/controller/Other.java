package com.bank.controller;

import javax.servlet.annotation.WebServlet;
import com.bank.base.BaseController;
import com.bank.base.ControlKit;
import com.bank.util.Constant;

/**
 * BaseController implementation class Index
 */
@WebServlet("/other.html")
public class Other extends BaseController{

	private static final long serialVersionUID = 2360015804560189694L;

	@Override
	protected void doAction(ControlKit controlKit) throws Exception {
		controlKit.page=Constant.OTHER_PAGE;
		controlKit.layout=Constant.GUEST_LAYOUT;
	}

}
