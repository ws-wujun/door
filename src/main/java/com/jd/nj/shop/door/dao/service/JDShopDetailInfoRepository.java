package com.jd.nj.shop.door.dao.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.jd.nj.shop.door.dao.JDShopDetailInfoDao;

public interface JDShopDetailInfoRepository extends CrudRepository<JDShopDetailInfoDao, Long> {
	
	List<JDShopDetailInfoDao> findByShopId(long shopId);
	
	@Transactional
	Long deleteByShopId(long shopId);
}
