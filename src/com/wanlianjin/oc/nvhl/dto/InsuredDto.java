package com.wanlianjin.oc.nvhl.dto;

import com.wanlianjin.oc.nvhl.domain.AbstractInsured;

public class InsuredDto extends AbstractInsured{

	private static final long serialVersionUID = -555591991630169762L;
	/**
	 * 被保险人对应的承保方案号被保险人险种信息相同就可以是同 一个承保方案。例如：未成年人和成年人就有可能不是同一个承保方案
	 */
	private String catalogNo;
	/**
	 * 北京健康险必传
	 */
	private String isWork;
	/**
	 * 被保人是否成年
	 * 01：成年   02：未成年
	 */
	private String isAdult;
	public String getCatalogNo() {
		return catalogNo;
	}
	public void setCatalogNo(String catalogNo) {
		this.catalogNo = catalogNo;
	}
	public String getIsWork() {
		return isWork;
	}
	public void setIsWork(String isWork) {
		this.isWork = isWork;
	}
	public String getIsAdult() {
		return isAdult;
	}
	public void setIsAdult(String isAdult) {
		this.isAdult = isAdult;
	}
}
