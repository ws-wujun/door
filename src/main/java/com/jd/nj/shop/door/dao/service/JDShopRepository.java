package com.jd.nj.shop.door.dao.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jd.nj.shop.door.dao.JDShop;

public interface JDShopRepository extends CrudRepository<JDShop, Long> {

	List<JDShop> findByVenderid(Long venderid);
	List<JDShop> findByShopid(Long shopId);
}
