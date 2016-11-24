package com.jd.nj.shop.door.dao.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jd.nj.shop.door.dao.JDProjectInfoDao;

public interface JDProjectInfoRepository extends CrudRepository<JDProjectInfoDao, Long> {
	
	List<JDProjectInfoDao> findByProjectId(Long projectId);
	
	List<JDProjectInfoDao> findByIsValidOrderByProjectIdAsc(Integer isValid);
	
	List<JDProjectInfoDao> findAllByOrderByProjectIdAsc();
}
