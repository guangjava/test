package com.wanlianjin.oc.nvhl.domain;


import java.io.Serializable;
import java.util.Date;

/**
 * @comment 险别信息类
 * @author zhouchenguang
 * @date 2016年4月25日下午2:52:12
 * @version 1.0.0
 */
public abstract class AbstractCvrg implements Serializable {
	private static final long serialVersionUID = -4452595538349907509L;
	/**
	 * 保额list
	 */
	private String amtList;
	/**
	 * 主键
	 */
	private String id;
	/**
	 * 申请单号
	 */
	private String applicationId;
	/**
	 * 保单号
	 */
	private String policyId;
	/**
	 * 序号
	 */
	private String cvrgNo;
	/**
	 * 险别编号
	 */
	private String cvrgCode;
	/**
	 * 险别名称
	 */
	private String cvrgName;
	/**
	 * 保额
	 */
	private Double amt;
	/**
	 * 基准保费
	 */
	private Double befPrm;
	/**
	 * 应缴保费
	 */
	private Double prm;
	/**
	 * 有效起期,险别的有效起期，保单为保单的保险起期
	 */
	private Date insBeginDate;
	/**
	 * 有效止期,险别的有效止期，保单为保单的保险止期
	 */
	private Date insEndDate;
	/**
	 * 折扣系数,优惠系数
	 */
	private Double discCoef;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
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
	public String getCvrgNo() {
		return cvrgNo;
	}

	public void setCvrgNo(String cvrgNo) {
		this.cvrgNo = cvrgNo;
	}
	public String getCvrgCode() {
		return cvrgCode;
	}

	public void setCvrgCode(String cvrgCode) {
		this.cvrgCode = cvrgCode;
	}
	public Double getAmt() {
		return amt;
	}

	public void setAmt(Double amt) {
		this.amt = amt;
	}
	public Double getBefPrm() {
		return befPrm;
	}

	public void setBefPrm(Double befPrm) {
		this.befPrm = befPrm;
	}
	public Double getPrm() {
		return prm;
	}

	public void setPrm(Double prm) {
		this.prm = prm;
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
	public Double getDiscCoef() {
		return discCoef;
	}

	public void setDiscCoef(Double discCoef) {
		this.discCoef = discCoef;
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

	public String getCvrgName() {
		return cvrgName;
	}

	public void setCvrgName(String cvrgName) {
		this.cvrgName = cvrgName;
	}

	public String getAmtList() {
		return amtList;
	}

	public void setAmtList(String amtList) {
		this.amtList = amtList;
	}




}
