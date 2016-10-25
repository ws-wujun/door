package com.jd.nj.shop.door.service.internal.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CompanyInfo implements Serializable {
	private static final long serialVersionUID = 6832622741211437842L;

	/*
	 * 公司名称
	 */
	private String name;

	/*
	 * 营业执照号
	 */
	private String licenseNo;

	/*
	 * 法人
	 */
	private String legalPerson;

	/*
	 * 营业执照所在地
	 */
	private String licenseAddress;

	/*
	 * 注册资金
	 */
	private Float registeredCapital;

	/*
	 * 营业执照有效期
	 */
	private Date licenseExpDate;

	/**
	 * 营业执照有效期(字符串)
	 */
	private String licenseExpDateStr;

	/*
	 * 公司地址
	 */
	private String companyAddress;

	/*
	 * 营业执照范围
	 */
	private String licenseArea;

	private String title;

	private String note;

	/**
	 * 是否具有食品资质
	 */
	private boolean hasFoodQuality;

	/**
	 * 食品资质
	 */
	private List<FoodQuality> foodQuality;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getLegalPerson() {
		return legalPerson;
	}

	public void setLegalPerson(String legalPerson) {
		this.legalPerson = legalPerson;
	}

	public String getLicenseAddress() {
		return licenseAddress;
	}

	public void setLicenseAddress(String licenseAddress) {
		this.licenseAddress = licenseAddress;
	}

	public Float getRegisteredCapital() {
		return registeredCapital;
	}

	public void setRegisteredCapital(Float registeredCapital) {
		this.registeredCapital = registeredCapital;
	}

	public Date getLicenseExpDate() {
		return licenseExpDate;
	}

	public void setLicenseExpDate(Date licenseExpDate) {
		this.licenseExpDate = licenseExpDate;
	}

	public String getLicenseExpDateStr() {
		return licenseExpDateStr;
	}

	public void setLicenseExpDateStr(String licenseExpDateStr) {
		this.licenseExpDateStr = licenseExpDateStr;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getLicenseArea() {
		return licenseArea;
	}

	public void setLicenseArea(String licenseArea) {
		this.licenseArea = licenseArea;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public boolean isHasFoodQuality() {
		return hasFoodQuality;
	}

	public void setHasFoodQuality(boolean hasFoodQuality) {
		this.hasFoodQuality = hasFoodQuality;
	}

	public List<FoodQuality> getFoodQuality() {
		return foodQuality;
	}

	public void setFoodQuality(List<FoodQuality> foodQuality) {
		this.foodQuality = foodQuality;
	}

}
