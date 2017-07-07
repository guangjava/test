package com.wanlianjin.oc.nvhl.domain;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class AbstractStatus implements Serializable{
	protected static final long serialVersionUID = 4175853630043658456L;

	/**
	 * 序列号
	 */
	protected String serialDecimal;
	protected Date date;
	/**
	 * 返回码
	 */
	protected String resultCode;
	/**
	 * 返回信息
	 */
	protected String msg;
	/**
	 * 业务类型
	 */
	protected String businessCode;

	public String getSerialDecimal() {
		return serialDecimal;
	}
	public void setSerialDecimal(String serialDecimal) {
		this.serialDecimal = serialDecimal;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDateStr(){
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return format.format(date);
	}
	public String getResultCode() {
		return resultCode;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getBusinessCode() {
		return businessCode;
	}
	public abstract void setResultCode(String resultCode);
	public abstract void setBusinessCode(String businessCode);
}
