package com.wanlianjin.oc.nvhl.dto;

import java.util.List;

import com.wanlianjin.oc.nvhl.domain.AbstractCvrg;

public class CvrgDto extends AbstractCvrg{

	private static final long serialVersionUID = 3223095487512195189L;
	/**
	 * 版本号
	 */
	private String instCode;
	/**
	 * 投保份数
	 */
	private int amtUnit;
	/**
	 * 每户保险金额(元)
	 */
	private Double amtEach;
	/**
	 * 基准费率(‰)
	 */
	private Double brfRate;
	/**
	 * 实际费率(‰)
	 */
	private Double rate;
	/**
	 * 免赔条件
	 */
	private String nopayCon;
	/**
	 * 免赔额 
	 */
	private String deductible;
	/**
	 * 每次事故赔偿限额 
	 */
	private Double yl1;
	/**
	 * 每次事故每人责任限额 
	 */
	private Double yl2;
	/**
	 *每人每次事故死亡伤残赔偿限额
	 */
	private Double yl3;
	/**
	 * 每人每次事故医疗费用赔偿限额
	 */
	private Double yl4;
	/**
	 * 每次事故每人财产损失责任限额 
	 */
	private Double yl15;
	/**
	 * 每次事故法律费用责任限额
	 */
	private Double yl6;
	/**
	 * 每次事故财产损失赔偿限额 
	 */
	private Double yl9;
	/**
	 * 不含税保费 
	 */
	private Double notaxPrm;
	/**
	 * 增值税额
	 */
	private Double addedTax;
	/**
	 * 驾照类别或旅行类别
	 * 驾照类型：1001.货车，营运车;1002.;货车，营运车以外
		旅游类别：2001.境内;2002.境外

	 */
	private String CATEGORY;
	private List<CoverageDto> coverages;
	public Double getAmtEach() {
		return amtEach;
	}
	public void setAmtEach(Double amtEach) {
		this.amtEach = amtEach;
	}
	public Double getBrfRate() {
		return brfRate;
	}
	public void setBrfRate(Double brfRate) {
		this.brfRate = brfRate;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public String getNopayCon() {
		return nopayCon;
	}
	public void setNopayCon(String nopayCon) {
		this.nopayCon = nopayCon;
	}
	public String getDeductible() {
		return deductible;
	}
	public void setDeductible(String deductible) {
		this.deductible = deductible;
	}
	public Double getYl1() {
		return yl1;
	}
	public void setYl1(Double yl1) {
		this.yl1 = yl1;
	}
	public Double getYl2() {
		return yl2;
	}
	public void setYl2(Double yl2) {
		this.yl2 = yl2;
	}
	public Double getYl3() {
		return yl3;
	}
	public void setYl3(Double yl3) {
		this.yl3 = yl3;
	}
	public Double getYl4() {
		return yl4;
	}
	public void setYl4(Double yl4) {
		this.yl4 = yl4;
	}
	public Double getYl15() {
		return yl15;
	}
	public void setYl15(Double yl15) {
		this.yl15 = yl15;
	}
	public Double getYl6() {
		return yl6;
	}
	public void setYl6(Double yl6) {
		this.yl6 = yl6;
	}
	public Double getYl9() {
		return yl9;
	}
	public void setYl9(Double yl9) {
		this.yl9 = yl9;
	}
	public Double getNotaxPrm() {
		return notaxPrm;
	}
	public void setNotaxPrm(Double notaxPrm) {
		this.notaxPrm = notaxPrm;
	}
	public Double getAddedTax() {
		return addedTax;
	}
	public void setAddedTax(Double addedTax) {
		this.addedTax = addedTax;
	}
	public String getInstCode() {
		return instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}
	public int getAmtUnit() {
		return amtUnit;
	}
	public void setAmtUnit(int amtUnit) {
		this.amtUnit = amtUnit;
	}
	public String getCATEGORY() {
		return CATEGORY;
	}
	public void setCATEGORY(String cATEGORY) {
		CATEGORY = cATEGORY;
	}
	public List<CoverageDto> getCoverages() {
		return coverages;
	}
	public void setCoverages(List<CoverageDto> coverages) {
		this.coverages = coverages;
	}
}
