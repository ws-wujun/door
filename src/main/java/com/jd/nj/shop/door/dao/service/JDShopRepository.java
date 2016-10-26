package com.jd.nj.shop.door.dao.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jd.nj.shop.door.dao.JDShopDao;

public interface JDShopRepository extends CrudRepository<JDShopDao, Long> {

	List<JDShopDao> findByVenderid(Long venderid);
	List<JDShopDao> findByShopid(Long shopId);
}
