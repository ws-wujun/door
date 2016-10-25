package com.jd.nj.shop.door.service.internal.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ShopDetailInfo implements Serializable {
	private static final long serialVersionUID = 853045888413402248L;

	/**
	 * 商家ID
	 */
	private long venderId;

	/**
	 * 店铺ID
	 */
	private long shopId;

	/**
	 * 店铺名称
	 */
	private String shopName;

	/**
	 * 店铺M页地址
	 */
	private String url;

	/**
	 * logo地址
	 */
	private String logoUrl;

	/**
	 * 店铺简介
	 */
	private String brief;

	/**
	 * 公司信息
	 */
	private CompanyInfo shopcompany;

	/**
	 * 公司名称
	 */
	private String company;

	/**
	 * 公司电话
	 */
	private String telephone;

	/**
	 * 店铺关注人数
	 */
	private int followCount;

	/**
	 * 用户是否关注
	 */
	private Boolean isFollowed;

	/**
	 * 二维码
	 */
	private String qrCode;

	/**
	 * 商品总数
	 */
	private Integer totalNum;

	/**
	 * 上新数量
	 */
	private Integer newNum;

	/**
	 * 促销数量
	 */
	private Integer promotionNum;

	/**
	 * 热销数量
	 */
	private Integer hotNum;

	/**
	 * 店铺动态总数
	 */
	private Integer shopActivityTotalNum;

	/**
	 * 公司评分
	 */
	private ScoreInfo score;

	/**
	 * 是否有优惠券
	 */
	private boolean hasCoupon;

	/**
	 * 优惠券
	 */
	private List<?> coupons;

	/**
	 * 分享地址
	 */
	private String shareLink;

	/**
	 * 咚咚开关
	 */
	private String imSwitch;

	/**
	 * 客服在线状态
	 */
	private CheckChatResult checkChat;

	/**
	 * 开店时间
	 */
	private Date openTime;

	/**
	 * 公司所在地
	 */
	private Long areaId;

	/**
	 * 公司所在地名称
	 */
	private String areaName;

	/**
	 * 商家入驻类型：0 pop商家,1 自营商家
	 */
	private Integer venderType;

	private String promSwitch;

	/**
	 * 授权品牌
	 */
	private List<BrandInfo> brands;

	/**
	 * 钻石打标
	 */
	private boolean isDiamond;

	/**
	 * 是否全球购
	 */
	private boolean isGlobal;

	/**
	 * 是否落地配
	 */
	private boolean landingDelivery;

	public long getVenderId() {
		return venderId;
	}

	public void setVenderId(long venderId) {
		this.venderId = venderId;
	}

	public long getShopId() {
		return shopId;
	}

	public void setShopId(long shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public CompanyInfo getShopcompany() {
		return shopcompany;
	}

	public void setShopcompany(CompanyInfo shopcompany) {
		this.shopcompany = shopcompany;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getFollowCount() {
		return followCount;
	}

	public void setFollowCount(int followCount) {
		this.followCount = followCount;
	}

	public Boolean getIsFollowed() {
		return isFollowed;
	}

	public void setIsFollowed(Boolean isFollowed) {
		this.isFollowed = isFollowed;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public Integer getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Integer getNewNum() {
		return newNum;
	}

	public void setNewNum(Integer newNum) {
		this.newNum = newNum;
	}

	public Integer getPromotionNum() {
		return promotionNum;
	}

	public void setPromotionNum(Integer promotionNum) {
		this.promotionNum = promotionNum;
	}

	public Integer getHotNum() {
		return hotNum;
	}

	public void setHotNum(Integer hotNum) {
		this.hotNum = hotNum;
	}

	public Integer getShopActivityTotalNum() {
		return shopActivityTotalNum;
	}

	public void setShopActivityTotalNum(Integer shopActivityTotalNum) {
		this.shopActivityTotalNum = shopActivityTotalNum;
	}

	public ScoreInfo getScore() {
		return score;
	}

	public void setScore(ScoreInfo score) {
		this.score = score;
	}

	public boolean isHasCoupon() {
		return hasCoupon;
	}

	public void setHasCoupon(boolean hasCoupon) {
		this.hasCoupon = hasCoupon;
	}

	public List<?> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<?> coupons) {
		this.coupons = coupons;
	}

	public String getShareLink() {
		return shareLink;
	}

	public void setShareLink(String shareLink) {
		this.shareLink = shareLink;
	}

	public String getImSwitch() {
		return imSwitch;
	}

	public void setImSwitch(String imSwitch) {
		this.imSwitch = imSwitch;
	}

	public CheckChatResult getCheckChat() {
		return checkChat;
	}

	public void setCheckChat(CheckChatResult checkChat) {
		this.checkChat = checkChat;
	}

	public Date getOpenTime() {
		return openTime;
	}

	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Integer getVenderType() {
		return venderType;
	}

	public void setVenderType(Integer venderType) {
		this.venderType = venderType;
	}

	public String getPromSwitch() {
		return promSwitch;
	}

	public void setPromSwitch(String promSwitch) {
		this.promSwitch = promSwitch;
	}

	public List<BrandInfo> getBrands() {
		return brands;
	}

	public void setBrands(List<BrandInfo> brands) {
		this.brands = brands;
	}

	public boolean isDiamond() {
		return isDiamond;
	}

	public void setDiamond(boolean isDiamond) {
		this.isDiamond = isDiamond;
	}

	public boolean isGlobal() {
		return isGlobal;
	}

	public void setGlobal(boolean isGlobal) {
		this.isGlobal = isGlobal;
	}

	public boolean isLandingDelivery() {
		return landingDelivery;
	}

	public void setLandingDelivery(boolean landingDelivery) {
		this.landingDelivery = landingDelivery;
	}

}
