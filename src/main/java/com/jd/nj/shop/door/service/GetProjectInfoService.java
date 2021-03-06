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

	/**
	 * 保存项目信息
	 * 
	 * @param projectInfo
	 *            项目信息
	 * @return 保存成功，返回true；否则返回false。
	 */
	boolean addNewProjectInfoIntoDB(JDProjectInfoDao projectInfo);
	
	/**
	 * 更新项目信息
	 * @param projectId 项目id
	 * @param newObj 项目新值
	 * @return 更新成功，返回true；否则返回false。
	 */
	boolean updateProjectInfoIntoDB(Long projectId, JDProjectInfoDao newObj);

}
