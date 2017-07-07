package com.kcpt.hessian.service;

import com.caucho.hessian.server.HessianServlet;

public class IHelloImpl extends HessianServlet implements IHello{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4772864636935076630L;

	@Override
	public String sayHello() {
		return "Hello, I am from HessianServer";
	}

}
