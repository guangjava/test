package com.wanlianjin.oc.nvhl.dto;

import java.util.List;

import com.wanlianjin.oc.nvhl.domain.AbstractPolicy;

public class VhlPolicyApplicationDto extends AbstractPolicy {
	private static final long serialVersionUID = -8267757488595856290L;

	public static final String COMPONENT_NAME_BASE = "Base";
	public static final String COMPONENT_NAME_COVERAGE = "Cvrg";
	public static final String COMPONENT_NAME_FACTOR = "Factor";
	public static final String COMPONENT_NAME_APPLICANT = "Applicant";
	public static final String COMPONENT_NAME_INSURED = "Insured";
	public static final String COMPONENT_NAME_TGTOBJINFO = "TgtobjInfo";
	public static final String COMPONENT_NAME_PRODUCT = "Product";
	public static final String COMPONENT_NAME_STATUS = "Status";
	public static final String COMPONENT_NAME_PAYINFO = "PayInfo";
	public static final String COMPONENT_NAME_TGTINFO = "TgtInfo";
	public static final String COMPONENT_NAME_PRODUCTDUTY = "ProductDuty";
	public static final String COMPONENT_NAME_VHL = "Vhl";
	// ///////////////////////////////
	// 特定方法 - 操作具体组件或属性 //
	// ///////////////////////////////
	/**
     *获取车辆信息Dto
     * @return
     */
    public VhlDto getVhl() {
        Object vhlObj = this.getMonoComponent(COMPONENT_NAME_VHL);
        if (vhlObj == null) {
            return null;
        } else {
            return (VhlDto) vhlObj;
        }
    }
    /**
     * 设置车辆信息Dto
     * @param vhlDto
     */
    public void setVhl(VhlDto vhlDto) {
    	this.putMonoComponent(COMPONENT_NAME_VHL, vhlDto);
    }
	/**
	 * 获取基本信息Dto
	 * @return
	 */
	public BaseDto getBase() {
		return (BaseDto) this.getMonoComponent(COMPONENT_NAME_BASE);
	}
	/**
	 * 设置基本信息Dto
	 * @param base
	 */
	public void setBase(BaseDto base) {
		this.putMonoComponent(COMPONENT_NAME_BASE, base);
	}
	/**
	 * 获取险别Dto集合
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<CvrgDto> getCvrg(){
		return this.getComponent(COMPONENT_NAME_COVERAGE);
	}
	/**
	 * 设置险别Dto
	 * @param cvrgDto
	 */
	public void setCvrg(List<CvrgDto> list){
		this.putComponent(COMPONENT_NAME_COVERAGE,list );
	}
	/**
	 * 获取投保人Dto
	 * @return
	 */
	public ApplicantDto getApplicant() {
		Object applicantObj = this.getMonoComponent(COMPONENT_NAME_APPLICANT);
		if (applicantObj == null) {
			return null;
		} else {
			return (ApplicantDto) applicantObj;
		}
	}
	/**
	 * 设置投保人Dto
	 * @param applicantDto
	 */
	public void setApplicant(ApplicantDto applicantDto){
		this.putMonoComponent(COMPONENT_NAME_APPLICANT, applicantDto);
	}
	/**
	 *获取被保人Dto
	 * @return
	 */
	public List<InsuredDto> getInsured(){
		return (List<InsuredDto>) this.getComponent(COMPONENT_NAME_INSURED);
	}
	/**
	 * 设置被保人Dto
	 * @param insured
	 */
	public void setInsured(List<InsuredDto> insured){
		this.putComponent(COMPONENT_NAME_INSURED, insured);
	}
	/**
	 * 获取清单信息
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<TgtobjInfoDto> getTgtobjInfo(){
		return (List<TgtobjInfoDto>) this.getMonoComponent(COMPONENT_NAME_TGTOBJINFO);
	}
	/**
	 * 设置清单信息
	 * @param info
	 */
	public void setTgtobjInfo(List<TgtobjInfoDto> info) {
		this.putComponent(COMPONENT_NAME_TGTOBJINFO, info);
	}
	public PayInfoDto getPayInfo(){
		return (PayInfoDto) getMonoComponent(COMPONENT_NAME_PAYINFO);
	}
	public void setPayInfo(PayInfoDto payInfo){
		putMonoComponent(COMPONENT_NAME_PAYINFO,payInfo);
	}


	/**获取标的信息
	 * @return
	 * @exception
	 * @author zhouchenguang
	 * @date 2016年6月28日上午10:44:18
	 * @since 1.0.0
	 */
	public TgtInfoDto getTgtInfo(){
		return (TgtInfoDto) getMonoComponent(COMPONENT_NAME_TGTINFO);
	}

	/**设置标的信息
	 * @param info
	 * @exception
	 * @author zhouchenguang
	 * @date 2016年6月28日上午10:44:44
	 * @since 1.0.0
	 */
	public void setCheckInfo(TgtInfoDto info){
		putMonoComponent(COMPONENT_NAME_TGTINFO, info);
	}

	/**获取调整系数
	 * @return
	 * @exception
	 * @author zhouchenguang
	 * @date 2016年8月31日下午3:19:50
	 * @since 1.0.0
	 */
	public FactorDto getFactor() {
		return (FactorDto)getMonoComponent(COMPONENT_NAME_FACTOR);
	}

	public void setFactor(FactorDto factor) {
		putMonoComponent(COMPONENT_NAME_FACTOR, factor);
	}

	public ProductDto getProduct(){
		return (ProductDto)getMonoComponent(COMPONENT_NAME_PRODUCT);
	}

	public void setProduct(ProductDto product) {
		putMonoComponent(COMPONENT_NAME_PRODUCT, product);
	}
	public StatusDto getStatus(){
		return (StatusDto)getMonoComponent(COMPONENT_NAME_STATUS);
	}
	public void setStatus(StatusDto status){
		putMonoComponent(COMPONENT_NAME_STATUS,status);
	}
}
