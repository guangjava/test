package com.wanlianjin.oc.nvhl.dto;

import com.wanlianjin.oc.nvhl.domain.AbstractStatus;

public class StatusDto extends AbstractStatus{
	private static final long serialVersionUID = 6457245118813009854L;

	@Override
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
		
	}

	@Override
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
		
	}

}
