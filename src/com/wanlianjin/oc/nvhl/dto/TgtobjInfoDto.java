package com.wanlianjin.oc.nvhl.dto;

import java.io.Serializable;

/**
 * @comment 清单信息
 * @author zhouchenguang
 * @date 2016年8月31日下午4:36:50
 * @version 1.0.0
 */
public class TgtobjInfoDto implements Serializable{

	private static final long serialVersionUID = 449830616272353111L;
	/**
	 * 序号
	 */
	private String seqNo;
	/**
	 * 户主
	 */
	private String houseOwner;
	/**
	 * 身份证号码 
	 */
	private String idNo;
	/**
	 * 家庭地址
	 */
	private String homeAddr;
	/**
	 * 财产类型 
	 */
	private String propType;
	/**
	 * 财产名称
	 */
	private String propName;
	/**
	 * 型号
	 */
	private String propModel;
	/**
	 * 品牌 
	 */
	private String propBrand;
	/**
	 * 数量
	 */
	private Integer quantity;
	/**
	 * 已使用年限
	 */
	private String usedYear;
	/**
	 * 价值(元)
	 */
	private Double price;
	public String getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}
	public String getHouseOwner() {
		return houseOwner;
	}
	public void setHouseOwner(String houseOwner) {
		this.houseOwner = houseOwner;
	}
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	public String getHomeAddr() {
		return homeAddr;
	}
	public void setHomeAddr(String homeAddr) {
		this.homeAddr = homeAddr;
	}
	public String getPropType() {
		return propType;
	}
	public void setPropType(String propType) {
		this.propType = propType;
	}
	public String getPropName() {
		return propName;
	}
	public void setPropName(String propName) {
		this.propName = propName;
	}
	public String getPropModel() {
		return propModel;
	}
	public void setPropModel(String propModel) {
		this.propModel = propModel;
	}
	public String getPropBrand() {
		return propBrand;
	}
	public void setPropBrand(String propBrand) {
		this.propBrand = propBrand;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getUsedYear() {
		return usedYear;
	}
	public void setUsedYear(String usedYear) {
		this.usedYear = usedYear;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
