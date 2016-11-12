package com.jd.nj.shop.door.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jd.nj.shop.door.dao.JDProjectInfoDao;
import com.jd.nj.shop.door.service.GetProjectInfoService;

@Service
public class GetProjectInfoServiceImpl implements GetProjectInfoService {

	@Override
	public List<JDProjectInfoDao> getAllProjects(boolean isShowValidOnly) {
		//TODO 从数据库中获取项目一览
		List<JDProjectInfoDao> projects = new ArrayList<JDProjectInfoDao>();
		JDProjectInfoDao project = new JDProjectInfoDao();
		project.setProjectName("mobile-shop-base");
		project.setProjectId(10L);
		projects.add(project);
		project = new JDProjectInfoDao();
		project.setProjectName("mobile-shop-soa");
		project.setProjectId(11L);
		projects.add(project);
		project = new JDProjectInfoDao();
		project.setProjectName("mobile-nshop-soa");
		project.setProjectId(12L);
		projects.add(project);
		return projects;
	}

	@Override
	public JDProjectInfoDao getProjectInfoById(Long id) {
		return null;
	}

}
