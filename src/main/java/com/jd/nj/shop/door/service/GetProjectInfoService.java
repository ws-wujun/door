package com.jd.nj.shop.door.service;

import java.util.List;

import com.jd.nj.shop.door.dao.JDProjectInfoDao;

public interface GetProjectInfoService {

	/**
	 * 搜索所有的项目信息
	 * 
	 * @param isShowValidOnly
	 *            是否只显示有效的项目
	 * @return 项目信息列表
	 */
	List<JDProjectInfoDao> getAllProjects(boolean isShowValidOnly);

	/**
	 * 根据project id获取项目信息
	 * 
	 * @param id
	 *            项目id
	 * @return 项目信息
	 */
	JDProjectInfoDao getProjectInfoById(Long id);
	
	

}
