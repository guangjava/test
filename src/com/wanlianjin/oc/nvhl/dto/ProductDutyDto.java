package com.wanlianjin.oc.nvhl.dto;

import java.io.Serializable;

public class ProductDutyDto implements Serializable{
	private static final long serialVersionUID = 3788132420731137075L;
	/**
	 * 所属产品代码
	 */
	private String productCode;
	/**
	 * 责任编码（核心定义责任编码）
	 */
	private String dutyCode;
	/**
	 * 承保方案名字
	 */
	private String dutyName;
	/**
	 * 责任保费
	 */
	private Double dutyPrem;
	/**
	 * 责任保额
	 */
	private Double dutyAmnt;
	/**
	 * 保险期间标志
	 */
	private String insuYearFlag;
	/**
	 * 保险期间
	 */
	private String insuYear;
	/**
	 * 缴费期间标志
	 */
	private String payEndYearFlag;
	/**
	 * 缴费期间
	 */
	private  String payEndYear;
	/**
	 * 缴费频率
	 */
	private String payIntv;
	public String getDutyCode() {
		return dutyCode;
	}
	public void setDutyCode(String dutyCode) {
		this.dutyCode = dutyCode;
	}
	public Double getDutyPrem() {
		return dutyPrem;
	}
	public void setDutyPrem(Double dutyPrem) {
		this.dutyPrem = dutyPrem;
	}
	public Double getDutyAmnt() {
		return dutyAmnt;
	}
	public void setDutyAmnt(Double dutyAmnt) {
		this.dutyAmnt = dutyAmnt;
	}
	public String getInsuYearFlag() {
		return insuYearFlag;
	}
	public void setInsuYearFlag(String insuYearFlag) {
		this.insuYearFlag = insuYearFlag;
	}
	public String getInsuYear() {
		return insuYear;
	}
	public void setInsuYear(String insuYear) {
		this.insuYear = insuYear;
	}
	public String getPayEndYearFlag() {
		return payEndYearFlag;
	}
	public void setPayEndYearFlag(String payEndYearFlag) {
		this.payEndYearFlag = payEndYearFlag;
	}
	public String getPayEndYear() {
		return payEndYear;
	}
	public void setPayEndYear(String payEndYear) {
		this.payEndYear = payEndYear;
	}
	public String getPayIntv() {
		return payIntv;
	}
	public void setPayIntv(String payIntv) {
		this.payIntv = payIntv;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getDutyName() {
		return dutyName;
	}
	public void setDutyName(String dutyName) {
		this.dutyName = dutyName;
	}
}
