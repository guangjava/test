package com.wanlianjin.oc.nvhl.dto;

import java.io.Serializable;
import java.util.Date;
/**
 * @comment 投保人信息
 * @author denghao
 * @date 2016年04月25日 下午3:26:10
 * @version 1.0.0
 */
public class ApplicantDto implements Serializable {

	private static final long serialVersionUID = -5483750129211624320L;
	/**
	 * 申请单号
	 */
	private String applicationId;
	/**
	 * 申请人代码
	 */
	private String applicantCode;
	/**
	 * 申请人名称
	 */
	private String applicantName;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 证件类型
	 */
	private String certfCls;
	/**
	 * 证件号码
	 */
	private String certfCode;
	/**
	 * 客户分类,客户分类
	 */
	private String customerMark;
	/**
	 * 联系人,投保人联系人
	 */
	private String contactsName;
	/**
	 * 出生日期,出生年月
	 */
	private Date birthday;
	/**
	 * 职业代码
	 */
	private String professionCode;
	/**
	 * 文化程度代码,文化程度
	 */
	private String eduLevelCode;
	/**
	 * 固定电话,电话
	 */
	private String fixPhone;
	/**
	 * 移动电话
	 */
	private String mobilePhone;
	/**
	 * 工作单位
	 */
	private String workDept;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 邮编
	 */
	private String zipCode;
	/**
	 * 国家
	 */
	private String country;
	/**
	 * 省份
	 */
	private String province;
	/**
	 * 地市
	 */
	private String city;
	/**
	 * 县
	 */
	private String county;
	/**
	 * 地址
	 */
	private String contactsAddr;
	/**
	 * 修改时间
	 */
	private Date updateDate;
	/**
	 * 修改人代码
	 */
	private String updateCode;
	/**
	 * 创建时间
	 */
	private Date createDate;
	/**
	 * 创建人代码
	 */
	private String createCode;
	/**
	 * 投保人与被保人关系
	 */
	private String relationToInsured;
	/**
	 * 社保保险登记证号 北京健康险团单必传
	 */
	private String socialSecurityNo;

	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public String getApplicantCode() {
		return applicantCode;
	}
	public void setApplicantCode(String applicantCode) {
		this.applicantCode = applicantCode;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCertfCls() {
		return certfCls;
	}
	public void setCertfCls(String certfCls) {
		this.certfCls = certfCls;
	}
	public String getCertfCode() {
		return certfCode;
	}
	public void setCertfCode(String certfCode) {
		this.certfCode = certfCode;
	}
	public String getCustomerMark() {
		return customerMark;
	}
	public void setCustomerMark(String customerMark) {
		this.customerMark = customerMark;
	}
	public String getContactsName() {
		return contactsName;
	}
	public void setContactsName(String contactsName) {
		this.contactsName = contactsName;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getProfessionCode() {
		return professionCode;
	}
	public void setProfessionCode(String professionCode) {
		this.professionCode = professionCode;
	}
	public String getEduLevelCode() {
		return eduLevelCode;
	}
	public void setEduLevelCode(String eduLevelCode) {
		this.eduLevelCode = eduLevelCode;
	}
	public String getFixPhone() {
		return fixPhone;
	}
	public void setFixPhone(String fixPhone) {
		this.fixPhone = fixPhone;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getWorkDept() {
		return workDept;
	}
	public void setWorkDept(String workDept) {
		this.workDept = workDept;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getContactsAddr() {
		return contactsAddr;
	}
	public void setContactsAddr(String contactsAddr) {
		this.contactsAddr = contactsAddr;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getUpdateCode() {
		return updateCode;
	}
	public void setUpdateCode(String updateCode) {
		this.updateCode = updateCode;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getCreateCode() {
		return createCode;
	}
	public void setCreateCode(String createCode) {
		this.createCode = createCode;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getRelationToInsured() {
		return relationToInsured;
	}
	public void setRelationToInsured(String relationToInsured) {
		this.relationToInsured = relationToInsured;
	}
	public String getSocialSecurityNo() {
		return socialSecurityNo;
	}
	public void setSocialSecurityNo(String socialSecurityNo) {
		this.socialSecurityNo = socialSecurityNo;
	}

}
