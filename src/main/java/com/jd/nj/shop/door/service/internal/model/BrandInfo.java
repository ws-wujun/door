package com.jd.nj.shop.door.service.internal.model;

import java.io.Serializable;

public class BrandInfo implements Serializable {
	private static final long serialVersionUID = 8328822266919040155L;
	private long brandId;
	private String brandName;

	public long getBrandId() {
		return this.brandId;
	}

	public void setBrandId(long brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
}
