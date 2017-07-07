package com.wanlianjin.oc.nvhl.domain;

import java.io.Serializable;
import java.util.Date;

public abstract class AbstractProduct implements Serializable{
	private static final long serialVersionUID = -4256160201190100531L;
	/**
	 * 产品代码
	 */
	private String productCode;
	/**
	 * 产品名称
	 */
	private String productName;
	/**
	 * 产品保费
	 */
	private Double premium;
	/**
	 * 产品保额
	 */
	private Double amount;
	/**
	 * 保险期间类型
	 */
	private String benefitPeriodType;
	/**
	 * 保障年期
	 */
	private String benefitPeriod;
	/**
	 * 保险生效日期
	 */
	private Date insuranceStartPeriod;
	/**
	 * 保险终止日期
	 */
	private Date insuranceEndPeriod;
	/**
	 * 缴费频率
	 */
	private String paymentMode;
	/**
	 * 缴费期间类型
	 */
	private String paymentDurationMode;
	/**
	 * 缴费期间
	 */
	private String paymentDuration;
	/**
	 * 折扣率
	 */
	private String discountRate;
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getPremium() {
		return premium;
	}
	public void setPremium(Double  premium) {
		this.premium = premium;
	}
	public Double  getAmount() {
		return amount;
	}
	public void setAmount(Double  amount) {
		this.amount = amount;
	}
	public String getBenefitPeriodType() {
		return benefitPeriodType;
	}
	public void setBenefitPeriodType(String benefitPeriodType) {
		this.benefitPeriodType = benefitPeriodType;
	}
	public String getBenefitPeriod() {
		return benefitPeriod;
	}
	public void setBenefitPeriod(String benefitPeriod) {
		this.benefitPeriod = benefitPeriod;
	}
	public Date getInsuranceStartPeriod() {
		return insuranceStartPeriod;
	}
	public void setInsuranceStartPeriod(Date insuranceStartPeriod) {
		this.insuranceStartPeriod = insuranceStartPeriod;
	}
	public Date getInsuranceEndPeriod() {
		return insuranceEndPeriod;
	}
	public void setInsuranceEndPeriod(Date insuranceEndPeriod) {
		this.insuranceEndPeriod = insuranceEndPeriod;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getPaymentDurationMode() {
		return paymentDurationMode;
	}
	public void setPaymentDurationMode(String paymentDurationMode) {
		this.paymentDurationMode = paymentDurationMode;
	}
	public String getPaymentDuration() {
		return paymentDuration;
	}
	public void setPaymentDuration(String paymentDuration) {
		this.paymentDuration = paymentDuration;
	}
	public String getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(String discountRate) {
		this.discountRate = discountRate;
	}
}
