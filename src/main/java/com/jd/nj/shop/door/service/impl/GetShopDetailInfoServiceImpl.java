package com.jd.nj.shop.door.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jd.nj.shop.door.dao.JDShopDetailInfoDao;
import com.jd.nj.shop.door.dao.service.JDShopDetailInfoRepository;
import com.jd.nj.shop.door.service.GetShopDetailInfoService;
import com.jd.nj.shop.door.service.internal.HttpUtils;
import com.jd.nj.shop.door.service.internal.model.ShopDetailInfo;

@Service
public class GetShopDetailInfoServiceImpl implements GetShopDetailInfoService {

	private static final Logger logger = LogManager.getLogger(GetShopDetailInfoServiceImpl.class);
	private static final short UPDATE_DB_OK = 0;
	private static final short UPDATE_DB_ERROR = 1;
	private static final Object syncObject = new Object();

	@Autowired
	private JDShopDetailInfoRepository jdShopDetailInfoRep;

	@Override
	public void refreshJDShopInfos(long minpop, long maxpop, long minzy, long maxzy) {
		if (minpop < 0 || maxpop < 0 || minzy < 0 || maxzy < 0 || minpop > maxpop || minzy > maxzy) {
			// TODO log
			return;
		}

		for (long shopId = minpop; shopId <= maxpop; shopId++) {
			logger.info("refreshing pop shopId=" + shopId);
			ShopDetailInfo info = getShopDetailInfoByShopId(shopId);
			short dbRes = updateDbTableJdShop(info);
			if (dbRes == UPDATE_DB_OK) {
				// TODO log
				// update db ok
				logger.info("refresh pop finished ok shopid=" + shopId);
				System.out.println("refresh pop finished ok. shopId=" + shopId);
			} else {
				// TODO log
				// update db error
				logger.info("refresh pop finished error shopid=" + shopId);
				System.out.println("refresh pop finished error. shopid=" + shopId);
			}
		}
		
		for (long shopId = minzy; shopId <= maxzy; shopId++) {
			logger.info("refreshing zy shopId=" + shopId);
			ShopDetailInfo info = getShopDetailInfoByShopId(shopId);
			short dbRes = updateDbTableJdShop(info);
			if (dbRes == UPDATE_DB_OK) {
				// update db ok
				logger.info("refresh zy finished ok shopid=" + shopId);
				System.out.println("refresh zy finished ok.");
			} else {
				// update db error
				logger.info("refresh zy finished error shopid=" + shopId);
				System.out.println("refresh zy finished error.");
			}
		}
	}

	/*
	 * 从getShopDetail接口获取店铺详细信息。
	 * 需要说明的是，如果这里的shopId指定的店铺不存在，则ShopDetailInfo的对象还是会返回， 只是说返回值中的很多值都是默认值。比如：
	 * shopId=0；
	 */
	@SuppressWarnings({ "unchecked" })
	private ShopDetailInfo getShopDetailInfoByShopId(long shopId) {
		String url = "http://shopbeta.m.jd.care/getShopDetail";
		Map<String, String> params = new HashMap<String, String>();
		params.put("body", "{\"shopId\":\"" + shopId + "\"}");
		// invoke get http request
		String result = HttpUtils.get(url, params);
		Map<String, Object> map = (Map<String, Object>) JSON.parseObject(result, Map.class);
		JSONObject jsonObj = (JSONObject) map.get("result");
		ShopDetailInfo info = (ShopDetailInfo) JSON.parseObject(jsonObj.toString(), ShopDetailInfo.class);
		return info;
	}

	/*
	 * 更新数据库数据
	 */
	private short updateDbTableJdShop(ShopDetailInfo info) {
		if (info == null || info.getVenderId() == 0L || info.getShopId() == 0L) {
			return UPDATE_DB_ERROR;
		}
		
		long shopId = info.getShopId();
		/*
		 * 避免数据库数据的多线程脏数据
		 */
		synchronized (syncObject) {
			try {
				jdShopDetailInfoRep.deleteByShopId(shopId);
				jdShopDetailInfoRep.save(convertShopDetailInfoIntoDaoBean(info));
			} catch(Exception ex) {
				logger.error("update db error: shopId=" + shopId);
				logger.error("exception:" + ex.getMessage());
			}
		}

		return UPDATE_DB_OK;
	}
	
	/*
	 * 从http返回的数据转换成dao数据，为插入数据库做准备。
	 */
	private JDShopDetailInfoDao convertShopDetailInfoIntoDaoBean(ShopDetailInfo info) {
		JDShopDetailInfoDao jdShopDetailInfoDao = new JDShopDetailInfoDao();
		jdShopDetailInfoDao.setAreaId(info.getAreaId());
		jdShopDetailInfoDao.setAreaName(info.getAreaName());
		jdShopDetailInfoDao.setBrief(info.getBrief());
		jdShopDetailInfoDao.setCompany(info.getCompany());
		jdShopDetailInfoDao.setDiamond(info.isDiamond());
		jdShopDetailInfoDao.setFollowCount(info.getFollowCount());
		jdShopDetailInfoDao.setGlobal(info.isGlobal());
		jdShopDetailInfoDao.setHasCoupon(info.isHasCoupon());
		jdShopDetailInfoDao.setHotNum(info.getHotNum());
		jdShopDetailInfoDao.setLogoUrl(info.getLogoUrl());
		jdShopDetailInfoDao.setNewNum(info.getNewNum());
		jdShopDetailInfoDao.setOpenTime(info.getOpenTime());
		jdShopDetailInfoDao.setPromotionNum(info.getPromotionNum());
		jdShopDetailInfoDao.setQrCode(info.getQrCode());
		jdShopDetailInfoDao.setShopActivityTotalNum(info.getShopActivityTotalNum());
		jdShopDetailInfoDao.setShopId(info.getShopId());
		jdShopDetailInfoDao.setShopName(info.getShopName());
		jdShopDetailInfoDao.setTelephone(info.getTelephone());
		jdShopDetailInfoDao.setTotalNum(info.getTotalNum());
		jdShopDetailInfoDao.setUrl(info.getUrl());
		jdShopDetailInfoDao.setVenderId(info.getVenderId());
		jdShopDetailInfoDao.setVenderType(info.getVenderType());
		return jdShopDetailInfoDao;
	}

}
