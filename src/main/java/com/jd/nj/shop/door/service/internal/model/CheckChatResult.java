package com.jd.nj.shop.door.service.internal.model;

import java.io.Serializable;

public class CheckChatResult implements Serializable {
	private static final long serialVersionUID = 3308683747871097018L;

	/**
	 * 客服状态 0：没有在线客服 1表示在线；2表示客服离线，不允许留言；3表示客服离线，可以留言
	 */
	private int code;

	/**
	 * 表示在线客服跳转的域名,这个参数在手机端那边可能不正确
	 */
	private String chatDomain;
	/**
	 * 表示在线客服跳转的域名,自营商品的品牌名称,其他客服类型中不存在这个
	 */
	private String brandName;
	/**
	 * 表示在线客服跳转的域名,自营商品的三积分类号码，其他客服类型中，这个值为0
	 */
	private int rank3;
	/**
	 * 表示在线客服跳转的域名 .pop商家店铺名、自营客服的品牌名、自住客服的分组名
	 */
	private String seller;
	/**
	 * 表示在线客服跳转的域名 ,pop店铺的ID，其他类型客服值为0
	 */
	private Long shopId;
	/**
	 * 表示在线客服跳转的域名 ,pop商家ID，其他类型客服值为0
	 */
	private Long venderId;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getChatDomain() {
		return chatDomain;
	}

	public void setChatDomain(String chatDomain) {
		this.chatDomain = chatDomain;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getRank3() {
		return rank3;
	}

	public void setRank3(int rank3) {
		this.rank3 = rank3;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public Long getVenderId() {
		return venderId;
	}

	public void setVenderId(Long venderId) {
		this.venderId = venderId;
	}

}
