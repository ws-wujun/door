package com.jd.nj.shop.door.service.internal.model;

import java.io.Serializable;

public class FoodQuality implements Serializable {
	private static final long serialVersionUID = -5760527126363784534L;

	private String qualityName;

	private String qualityPic;

	public String getQualityName() {
		return qualityName;
	}

	public void setQualityName(String qualityName) {
		this.qualityName = qualityName;
	}

	public String getQualityPic() {
		return qualityPic;
	}

	public void setQualityPic(String qualityPic) {
		this.qualityPic = qualityPic;
	}
}
