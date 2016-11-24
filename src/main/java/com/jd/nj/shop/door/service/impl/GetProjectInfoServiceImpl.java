package com.jd.nj.shop.door.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.jd.nj.shop.door.dao.JDProjectInfoDao;
import com.jd.nj.shop.door.dao.service.JDProjectInfoRepository;
import com.jd.nj.shop.door.service.GetProjectInfoService;

@Service
public class GetProjectInfoServiceImpl implements GetProjectInfoService {

	@Autowired
	private JDProjectInfoRepository jdProjectInfoRepository;

	@Override
	public List<JDProjectInfoDao> getAllProjects(boolean isShowValidOnly) {
		// TODO　这里应该加上缓存，或者保存在内存。
		List<JDProjectInfoDao> projects = null;
		if (isShowValidOnly == false) {
			projects = new ArrayList<JDProjectInfoDao>();
			Iterable<JDProjectInfoDao> allIter = jdProjectInfoRepository.findAllByOrderByProjectIdAsc();
			if (allIter == null) {
				return projects;
			}
			Iterator<JDProjectInfoDao> iterator = allIter.iterator();
			while (iterator.hasNext()) {
				JDProjectInfoDao projectInfo = iterator.next();
				projects.add(projectInfo);
			}
		} else {
			// 只查询有效的项目。
			projects = jdProjectInfoRepository.findByIsValidOrderByProjectIdAsc(1);
		}

		return projects;
	}

	@Override
	public JDProjectInfoDao getProjectInfoById(Long id) {
		List<JDProjectInfoDao> projects = jdProjectInfoRepository.findByProjectId(id);
		if (CollectionUtils.isEmpty(projects) == false) {
			return projects.get(0);
		}
		return null;
	}

	@Override
	public boolean addNewProjectInfoIntoDB(JDProjectInfoDao projectInfo) {
		JDProjectInfoDao res = jdProjectInfoRepository.save(projectInfo);
		if (res != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateProjectInfoIntoDB(Long projectId, JDProjectInfoDao newObj) {
		JDProjectInfoDao dbObj = jdProjectInfoRepository.findOne(projectId);
		dbObj.setChargerNames(newObj.getChargerNames());
		dbObj.setDepartmentCode(newObj.getDepartmentCode());
		dbObj.setIsValid(newObj.getIsValid());
		dbObj.setProjectDescription(newObj.getProjectDescription());
		dbObj.setProjectName(newObj.getProjectName());
		
		JDProjectInfoDao res = jdProjectInfoRepository.save(dbObj);
		if (res == null) {
			return false;
		}
		
		return true;
	}

}
