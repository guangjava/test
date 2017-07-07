package com.wanlianjin.oc.nvhl.dto;

import com.wanlianjin.oc.nvhl.domain.AbstractBase;

public class BaseDto extends AbstractBase{
	private static final long serialVersionUID = 4154515990163060396L;
	/**
	 * 商业类型代码
	 */
	private String businessCode;
	/**
	 * 投保份数
	 */
	private int count;
	/**
	 * 合作代码
	 */
	private String cooperate;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getCooperate() {
		return cooperate;
	}
	public void setCooperate(String cooperate) {
		this.cooperate = cooperate;
	}
	public String getBusinessCode() {
		return businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}

}
