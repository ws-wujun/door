package com.jd.nj.shop.door.service;

public interface GetShopDetailInfoService {

	/**
	 * 刷新京东店铺的基本信息。由于没有京东店铺的shopId范围，所以，只能指定一个搜索范围，在这个范围内去查询店铺信息。
	 * 当店铺的getShopDetail接口能够检索到店铺信息的时候，就写进数据库。搜索范围根据参数指定。
	 * 
	 * @param minpop
	 *            pop店铺shopId的最小值
	 * @param maxpop
	 *            pop店铺shopId的最大值
	 * @param minzy
	 *            自营店铺shopId的最小值
	 * @param maxzy
	 *            自营店铺shopId的最大值
	 */
	void refreshJDShopInfos(long minpop, long maxpop, long minzy, long maxzy);
}
