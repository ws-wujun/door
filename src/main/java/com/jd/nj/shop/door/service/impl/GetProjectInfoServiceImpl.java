package com.jd.nj.shop.door.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jd.nj.shop.door.dao.JDProjectInfoDao;
import com.jd.nj.shop.door.dao.service.JDProjectInfoRepository;
import com.jd.nj.shop.door.service.GetProjectInfoService;

@Service
public class GetProjectInfoServiceImpl implements GetProjectInfoService {
	
	@Autowired
	private JDProjectInfoRepository jdProjectInfoRepository;

	@Override
	public List<JDProjectInfoDao> getAllProjects(boolean isShowValidOnly) {
		//TODO 从数据库中获取项目一览
		List<JDProjectInfoDao> projects = new ArrayList<JDProjectInfoDao>();
		JDProjectInfoDao project = new JDProjectInfoDao();
		project.setProjectName("mobile-shop-base");
		project.setProjectId(10L);
		project.setProjectDescription("店铺soa基础服务，聚合了店铺的基础信息查询服务。");
		project.setIsValid(1);
		projects.add(project);
		project = new JDProjectInfoDao();
		project.setProjectName("mobile-shop-soa");
		project.setProjectId(11L);
		project.setProjectDescription("店铺soa服务，聚合了JD所有的店铺服务。");
		project.setIsValid(1);
		projects.add(project);
		project = new JDProjectInfoDao();
		project.setProjectName("mobile-nshop-soa");
		project.setProjectId(12L);
		project.setProjectDescription("店铺nshop-soa服务，聚合了JD其他方面的服务。");
		project.setIsValid(0);
		projects.add(project);
//		Iterable<JDProjectInfoDao> allIter = jdProjectInfoRepository.findAll();
//		if (allIter == null) {
//			return projects;
//		}
//		while(allIter.iterator().hasNext()) {
//			JDProjectInfoDao projectInfo = allIter.iterator().next();
//			projects.add(projectInfo);
//		}
		
		return projects;
	}

	@Override
	public JDProjectInfoDao getProjectInfoById(Long id) {
		return null;
	}

}
