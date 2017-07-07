package com.wanlianjin.oc.nvhl.dto;

import java.util.List;

import com.wanlianjin.oc.nvhl.domain.AbstractProduct;

public class ProductDto extends AbstractProduct{
	private static final long serialVersionUID = -4170780765643301098L;
	
	private List<ProductDutyDto> dutyList;
	private List<CvrgDto> plans;
	/**
	 * 套餐代码
	 */
	private String comboCode;
	
	public List<ProductDutyDto> getDutyList() {
		return dutyList;
	}

	public void setDutyList(List<ProductDutyDto> dutyList) {
		this.dutyList = dutyList;
	}

	public List<CvrgDto> getPlans() {
		return plans;
	}

	public void setPlans(List<CvrgDto> plans) {
		this.plans = plans;
	}

	public String getComboCode() {
		return comboCode;
	}

	public void setComboCode(String comboCode) {
		this.comboCode = comboCode;
	}

}
