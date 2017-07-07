package com.wanlianjin.oc.nvhl.dto;

import java.io.Serializable;


public class PayInfoDto implements Serializable{

	private static final long serialVersionUID = 5485632188957470264L;
	/**
	 * 支付流水号
	 */
	private String transrnNo;
	/**
	 * 支付账号
	 */
	private String payNo;
	/**
	 * 支付人名称
	 */
	private String payName;
	/**
	 * 第三方支付商
	 */
	private String payBusiness;
	public String getTransrnNo() {
		return transrnNo;
	}
	public void setTransrnNo(String transrnNo) {
		this.transrnNo = transrnNo;
	}
	public String getPayNo() {
		return payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	public String getPayName() {
		return payName;
	}
	public void setPayName(String payName) {
		this.payName = payName;
	}
	public String getPayBusiness() {
		return payBusiness;
	}
	public void setPayBusiness(String payBusiness) {
		this.payBusiness = payBusiness;
	}
}
