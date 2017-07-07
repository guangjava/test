package com.wanlianjin.oc.nvhl.dto;

import java.io.Serializable;

/**
 * @comment 险种责任信息
 * @author zhouchenguang
 * @date 2016年9月7日下午2:58:16
 * @version 1.0.0
 */
public class CoverageDto implements Serializable{
	private static final long serialVersionUID = 4250290603506403994L;
	/**
	 * 责任代码
	 */
	private String covCode;
	/**
	 * 每份责任保费 
	 */
	private double covPremium;
	/**
	 * 每份责任保额
	 */
	private double covAmount;
	/**
	 * 每份责任费率
	 */
	private double covRate;
	public String getCovCode() {
		return covCode;
	}
	public void setCovCode(String covCode) {
		this.covCode = covCode;
	}
	public double getCovPremium() {
		return covPremium;
	}
	public void setCovPremium(double covPremium) {
		this.covPremium = covPremium;
	}
	public double getCovAmount() {
		return covAmount;
	}
	public void setCovAmount(double covAmount) {
		this.covAmount = covAmount;
	}
	public double getCovRate() {
		return covRate;
	}
	public void setCovRate(double covRate) {
		this.covRate = covRate;
	}

}
