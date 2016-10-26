package com.jd.nj.shop.door.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jd_shop_detail_info")
public class JDShopDetailInfoDao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	/**
	 * 商家ID
	 */
	@Column(name = "venderid")
	private long venderId;

	/**
	 * 店铺ID
	 */
	@Column(name = "shopid")
	private long shopId;

	/**
	 * 店铺名称
	 */
	@Column(name = "shopname")
	private String shopName;

	/**
	 * 店铺M页地址
	 */
	@Column(name = "shopmurl")
	private String url;

	/**
	 * logo地址
	 */
	@Column(name = "logourl")
	private String logoUrl;

	/**
	 * 店铺简介
	 */
	@Column(name = "brief")
	private String brief;

	/**
	 * 公司名称
	 */
	@Column(name = "companyname")
	private String company;

	/**
	 * 公司电话
	 */
	@Column(name = "companytel")
	private String telephone;

	/**
	 * 店铺关注人数
	 */
	@Column(name = "followcount")
	private int followCount;

	/**
	 * 二维码
	 */
	@Column(name = "qrcode")
	private String qrCode;

	/**
	 * 商品总数
	 */
	@Column(name = "totalnum")
	private Integer totalNum;

	/**
	 * 上新数量
	 */
	@Column(name = "newnum")
	private Integer newNum;

	/**
	 * 促销数量
	 */
	@Column(name = "promotionnum")
	private Integer promotionNum;

	/**
	 * 热销数量
	 */
	@Column(name = "hotnum")
	private Integer hotNum;

	/**
	 * 店铺动态总数
	 */
	@Column(name = "shopactivitynum")
	private Integer shopActivityTotalNum;

	/**
	 * 是否有优惠券
	 */
	@Column(name = "hascoupon")
	private boolean hasCoupon;

	/**
	 * 开店时间
	 */
	@Column(name = "opentime")
	private Date openTime;

	/**
	 * 公司所在地
	 */
	@Column(name = "areaid")
	private Long areaId;

	/**
	 * 公司所在地名称
	 */
	@Column(name = "areaname")
	private String areaName;

	/**
	 * 商家入驻类型：0 pop商家,1 自营商家
	 */
	@Column(name = "vendertype")
	private Integer venderType;

	/**
	 * 钻石打标
	 */
	@Column(name = "isdiamond")
	private boolean isDiamond;

	/**
	 * 是否全球购
	 */
	@Column(name = "isglobal")
	private boolean isGlobal;

	public JDShopDetailInfoDao() {
	}

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

	public boolean isHasCoupon() {
		return hasCoupon;
	}

	public void setHasCoupon(boolean hasCoupon) {
		this.hasCoupon = hasCoupon;
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
}
