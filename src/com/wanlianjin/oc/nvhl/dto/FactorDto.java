package com.wanlianjin.oc.nvhl.dto;

import java.io.Serializable;

/**
 * @comment 调整系数
 * @author zhouchenguang
 * @date 2016年8月31日下午3:14:32
 * @version 1.0.0
 */
public class FactorDto implements Serializable{
	private static final long serialVersionUID = 4041002222466033477L;
	/**
	 * 风险管理水平系数(F1)
	 */
	private Double riskmanaRate;
	/**
	 * 住宅区安保状况系数(F2)
	 */
	private Double securityRate;
	/**
	 * 费率调整系数 默认1
	 */
	private Double tgtFld1;
	/**
	 * 保额区间调整因子（F1）默认值1 ，针对081K产品
	 */
	private Double amtRange;
	/**
	 * 销售渠道调整因子（F2）默认值1，针对081K产品
	 */
	private Double saleRange;
	/**
	 * 安全管理调整因子（F3）
	 */
	private Double safeRange;
	public Double getRiskmanaRate() {
		return riskmanaRate;
	}
	public void setRiskmanaRate(Double riskmanaRate) {
		this.riskmanaRate = riskmanaRate;
	}
	public Double getSecurityRate() {
		return securityRate;
	}
	public void setSecurityRate(Double securityRate) {
		this.securityRate = securityRate;
	}
	public Double getTgtFld1() {
		return tgtFld1;
	}
	public void setTgtFld1(Double tgtFld1) {
		this.tgtFld1 = tgtFld1;
	}
	public Double getAmtRange() {
		return amtRange;
	}
	public void setAmtRange(Double amtRange) {
		this.amtRange = amtRange;
	}
	public Double getSaleRange() {
		return saleRange;
	}
	public void setSaleRange(Double saleRange) {
		this.saleRange = saleRange;
	}
	public Double getSafeRange() {
		return safeRange;
	}
	public void setSafeRange(Double safeRange) {
		this.safeRange = safeRange;
	}
}
