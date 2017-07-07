package com.wanlianjin.oc.nvhl.dto;


import java.io.Serializable;
/**
 * @comment 车辆信息类
 * @author zhouchenguang
 * @date 2016年4月25日下午2:59:12
 * @version 1.0.0
 */
public class VhlDto implements Serializable {
	private static final long serialVersionUID = 8499429812067150450L;
	/**
	 * 车牌号
	 */
	private String plateNo;
	/**
	 * 车架号
	 */
	private String frameNo;

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public String getFrameNo() {
		return frameNo;
	}

	public void setFrameNo(String frameNo) {
		this.frameNo = frameNo;
	}

}
