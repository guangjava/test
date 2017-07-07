package com.wanlianjin.oc.nvhl.domain;

import java.io.Serializable;
import java.util.Date;
/**
 * @comment 基本信息。
 * @author denghao
 * @date 2016年04月25日 下午3:26:10
 * @version 1.0.0
 */
public abstract class AbstractBase implements Serializable {


	private static final long serialVersionUID = 8649843614463858990L;
	/**
	 * 订单号
	 */
	private String orderId;

	/**
	 * 申请单号
	 */
	private String applicationId;
	/**
	 * 保单号
	 */
	private String policyId;
	/**
	 * 保单状态
	 */
	private String status;
	/**
	 * 投保类型
	 */
	private String applicationType;
	/**
	 * 续保标识
	 */
	private String renewFlag;
	/**
	 * 缴费方式
	 */
	private String paymentType;
	/**
	 * 机构代码
	 */
	private String orgCode;
	/**
	 * 城市名称
	 */
	private String orgName;
	/**
	 * 产品代码
	 */
	private String prodCode;
	/**
	 * 总系数
	 */
	private Double totCoef;
	/**
	 * 商业折前保费
	 */
	private Double totBasePrm;
	/**
	 * 车船税
	 */
	private Double vhlTax;
	/**
	 * 保额合计
	 */
	private Double totAmt;
	/**
	 * 商业折后保费
	 */
	private Double totPrm;
	/**
	 * 费用合计
	 */
	private Double totCost;
	/**
	 * 业务员
	 */
	private String salemanCode;
	/**
	 * 业务名称
	 */
	private String salemanName;
	/**
	 * 代理人/经纪人
	 */
	private String agentCode;
	/**
	 * 代理人/经纪人 名称
	 */
	private String agentName;
	/**
	 * 代理协议或合作协议号
	 */
	private String agentAgrId;
	/**
	 * 中介机构代码
	 */
	private String agentOrgCode;
	/**
	 * 代理业务员
	 */
	private String agentSalemanCode;
	/**
	 * 销售渠道
	 */
	private String saleChannelType;
	/**
	 * 手续比例
	 */
	private Double commissionRatio;
	/**
	 * 联合投保标志
	 */
	private String multiAppMark;
	/**
	 *续保单上年保单号 
	 */
	private String origPlyId;
	/**
	 * 投保日期
	 */
	private Date applicationDate;
	/**
	 * 商业险起期
	 */
	private Date insBeginDate;
	/**
	 * 商业险止期
	 */
	private Date insEndDate;

	/**
	 * 操作员代码
	 */
	private String operationCode;
	/**
	 * 操作日期(报价日期)
	 */
	private Date operationDate;
	/**
	 * 核保日期
	 */
	private Date underwriteDate;
	/**
	 *保单生成日期
	 */
	private Date policyDate;
	/**
	 * 地区标识
	 */
	private String areaMark;
	/**
	 * 报价方案
	 */
	private String offerPlam;
	/**
	 * 服务代码
	 */
	private String serviceCode;
	/**
	 * 特别约定
	 */
	private String appnt;
    /**
     * 特别约定（交强险）
     */
    private String taxAppnt;
	/**
	 * 创建人员
	 */
	private String createCode;
	/**
	 * 创建时间
	 */
	private Date createDate;
	/**
	 * 修改人员
	 */
	private String updateCode;
	/**
	 * 修改时间
	 */
	private Date updateDate;

	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getApplicationType() {
		return applicationType;
	}
	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}
	public String getRenewFlag() {
		return renewFlag;
	}
	public void setRenewFlag(String renewFlag) {
		this.renewFlag = renewFlag;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public Double getTotCoef() {
		return totCoef;
	}
	public void setTotCoef(Double totCoef) {
		this.totCoef = totCoef;
	}
	public Double getTotBasePrm() {
		return totBasePrm;
	}
	public void setTotBasePrm(Double totBasePrm) {
		this.totBasePrm = totBasePrm;
	}
	public Double getVhlTax() {
		return vhlTax;
	}
	public void setVhlTax(Double vhlTax) {
		this.vhlTax = vhlTax;
	}
	public Double getTotAmt() {
		return totAmt;
	}
	public void setTotAmt(Double totAmt) {
		this.totAmt = totAmt;
	}
	public Double getTotPrm() {
		return totPrm;
	}
	public void setTotPrm(Double totPrm) {
		this.totPrm = totPrm;
	}
	public Double getTotCost() {
		return totCost;
	}
	public void setTotCost(Double totCost) {
		this.totCost = totCost;
	}
	public String getSalemanCode() {
		return salemanCode;
	}
	public void setSalemanCode(String salemanCode) {
		this.salemanCode = salemanCode;
	}
	public String getSalemanName() {
		return salemanName;
	}
	public void setSalemanName(String salemanName) {
		this.salemanName = salemanName;
	}
	public String getAgentCode() {
		return agentCode;
	}
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getAgentAgrId() {
		return agentAgrId;
	}
	public void setAgentAgrId(String agentAgrId) {
		this.agentAgrId = agentAgrId;
	}
	public String getAgentOrgCode() {
		return agentOrgCode;
	}
	public void setAgentOrgCode(String agentOrgCode) {
		this.agentOrgCode = agentOrgCode;
	}
	public String getAgentSalemanCode() {
		return agentSalemanCode;
	}
	public void setAgentSalemanCode(String agentSalemanCode) {
		this.agentSalemanCode = agentSalemanCode;
	}
	public String getSaleChannelType() {
		return saleChannelType;
	}
	public void setSaleChannelType(String saleChannelType) {
		this.saleChannelType = saleChannelType;
	}
	public Double getCommissionRatio() {
		return commissionRatio;
	}
	public void setCommissionRatio(Double commissionRatio) {
		this.commissionRatio = commissionRatio;
	}
	public String getMultiAppMark() {
		return multiAppMark;
	}
	public void setMultiAppMark(String multiAppMark) {
		this.multiAppMark = multiAppMark;
	}
	public String getOrigPlyId() {
		return origPlyId;
	}
	public void setOrigPlyId(String origPlyId) {
		this.origPlyId = origPlyId;
	}
	public Date getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}
	public Date getInsBeginDate() {
		return insBeginDate;
	}
	public void setInsBeginDate(Date insBeginDate) {
		this.insBeginDate = insBeginDate;
	}
	public Date getInsEndDate() {
		return insEndDate;
	}
	public void setInsEndDate(Date insEndDate) {
		this.insEndDate = insEndDate;
	}
	public String getOperationCode() {
		return operationCode;
	}
	public void setOperationCode(String operationCode) {
		this.operationCode = operationCode;
	}
	public Date getOperationDate() {
		return operationDate;
	}
	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}
	public Date getUnderwriteDate() {
		return underwriteDate;
	}
	public void setUnderwriteDate(Date underwriteDate) {
		this.underwriteDate = underwriteDate;
	}
	public Date getPolicyDate() {
		return policyDate;
	}
	public void setPolicyDate(Date policyDate) {
		this.policyDate = policyDate;
	}
	public String getAreaMark() {
		return areaMark;
	}
	public void setAreaMark(String areaMark) {
		this.areaMark = areaMark;
	}
	public String getOfferPlam() {
		return offerPlam;
	}
	public void setOfferPlam(String offerPlam) {
		this.offerPlam = offerPlam;
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getCreateCode() {
		return createCode;
	}
	public void setCreateCode(String createCode) {
		this.createCode = createCode;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getUpdateCode() {
		return updateCode;
	}
	public void setUpdateCode(String updateCode) {
		this.updateCode = updateCode;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getAppnt() {
		return appnt;
	}
	public void setAppnt(String appnt) {
		this.appnt = appnt;
	}
	public String getTaxAppnt() {
		return taxAppnt;
	}
	public void setTaxAppnt(String taxAppnt) {
		this.taxAppnt = taxAppnt;
	}

}
