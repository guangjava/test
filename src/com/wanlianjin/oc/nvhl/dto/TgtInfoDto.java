package com.wanlianjin.oc.nvhl.dto;

import java.io.Serializable;

/**
 * @comment 标的信息
 * @author zhouchenguang
 * @date 2016年8月30日下午5:21:54
 * @version 1.0.0
 */
public class TgtInfoDto implements Serializable{
	private static final long serialVersionUID = 5824043155532506896L;
	/**
	 * 投保户数
	 */
	private int appNum;
	/**
	 * 投保财产坐落地址 
	 */
	private String prodAddr;
	/**
	 * 车架号
	 */
	private String fld3;
	/**
	 * 账户类型 针对081K产品
	 */
	private String accountType;
	/**
	 * 司法管辖 针对081K产品
	 */
	private String sifaAddr;
	public int getAppNum() {
		return appNum;
	}
	public void setAppNum(int appNum) {
		this.appNum = appNum;
	}
	public String getProdAddr() {
		return prodAddr;
	}
	public void setProdAddr(String prodAddr) {
		this.prodAddr = prodAddr;
	}
	public String getFld3() {
		return fld3;
	}
	public void setFld3(String fld3) {
		this.fld3 = fld3;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getSifaAddr() {
		return sifaAddr;
	}
	public void setSifaAddr(String sifaAddr) {
		this.sifaAddr = sifaAddr;
	}
}
