package com.jd.nj.shop.door.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jd.nj.shop.door.dao.JDProjectInfoDao;
import com.jd.nj.shop.door.dao.JDShopDao;
import com.jd.nj.shop.door.dao.service.JDShopRepository;
import com.jd.nj.shop.door.service.GetProjectInfoService;
import com.jd.nj.shop.door.service.GetShopDetailInfoService;

@Controller
public class DoorController {

	@RequestMapping("/door")
	public ModelAndView index(HttpSession session, Model model) {
		if (session.getAttribute("userName") == null) {
			return new ModelAndView("/production/login");
		}

		String userName = session.getAttribute("userName").toString();
		if (StringUtils.isEmpty(userName)) {
			return new ModelAndView("/production/login");
		} else {
			ModelAndView mav = new ModelAndView("redirect:/door/main");
			mav.addObject("userName", userName);
			return mav;
		}
	}

	@RequestMapping(value = "/door/login", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "password", required = false) String password, HttpSession session, Model model) {
		// TODO login logic
		if ("wujun93".equals(name) && "asdf1234".equals(password)) {
			// 增加到session中以后，所有的页面都能够看到该属性
			session.setAttribute("userName", name);

			ModelAndView mav = new ModelAndView("redirect:/door/main");
			mav.addObject("userName", name);
			return mav;
		} else {
			ModelAndView mav = new ModelAndView("redirect:/door");
			mav.addObject("errMsg", "输入的用户名或者密码错误。");
			return mav;
		}
	}

	@RequestMapping(value = "/door/main", method = RequestMethod.GET)
	public ModelAndView main(@RequestParam(value = "userName", required = true) String userName) {
		
		/*
		 * 组装传入到页面中的Model值。
		 */
		ModelAndView mav = new ModelAndView("production/index");
		// 获取项目一览以显示项目一览
		addProjectInfosIntoModelAndView(mav);

		return mav;
	}

	@RequestMapping(value = "/door/queryinfo", method = RequestMethod.GET)
	public ModelAndView queryInfo(@RequestParam(value = "queryType", required = false) String queryType,
			@RequestParam(value = "queryKey", required = false) String queryKey, Model model) {
		model.addAttribute("queryType", queryType);

		Long venderId = 22904L;
		List<JDShopDao> res = jdshopRepository.findByVenderid(venderId);
		if (CollectionUtils.isEmpty(res) != true) {
			JDShopDao shopInfo = res.get(0);
			Long shopId = shopInfo.getShopid();
			String shopName = shopInfo.getName();
			model.addAttribute("shopName", shopName);
			model.addAttribute("shopId", shopId);
			model.addAttribute("venderId", venderId);
			System.out.println("queried value");
		}

		// getShopDetailInfoServiceImpl.refreshJDShopInfos(50000, 51000, 0, 0);
		
		
		/*
		 * 组装传入到页面中的Model值。
		 */
		ModelAndView mav = new ModelAndView("production/query_info");
		// 获取项目一览以显示项目一览
		addProjectInfosIntoModelAndView(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "/door/projects", method = RequestMethod.GET)
	public ModelAndView projects() {
		
		/*
		 * 组装传入到页面中的Model值。
		 */
		ModelAndView mav = new ModelAndView("production/projects");
		// 获取项目一览以显示项目一览
		addProjectInfosIntoModelAndView(mav);
		
		/*
		 * 查询所有的项目（包含有效和无效的项目）
		 */
		List<JDProjectInfoDao> rprojects = getProjectInfoService.getAllProjects(true);
		mav.addObject("rprojects", rprojects);

		return mav;
	}
	
	@RequestMapping(value = "/door/addProjects", method = RequestMethod.GET)
	public ModelAndView addProjectsGetRequest(@RequestParam(value = "projectId", required = false) String projectId) {
		/*
		 * 组装传入到页面中的Model值。
		 */
		ModelAndView mav = new ModelAndView("production/addProject");
		// 获取项目一览以显示项目一览
		addProjectInfosIntoModelAndView(mav);
		
		/*
		 * 看是否传入了projectId，如果传入了，从数据库查询出来，显示在页面中
		 */
		if (StringUtils.isEmpty(projectId) == false) {
			try {
				Long pId = Long.valueOf(projectId);
				JDProjectInfoDao project = getProjectInfoService.getProjectInfoById(pId);
				mav.addObject("project", project);
			} catch (NumberFormatException ex) {
				ex.printStackTrace();
			}
			
			mav.addObject("modifyProject", "true");
		} else {
			JDProjectInfoDao project = new JDProjectInfoDao();
			mav.addObject("project", project);
			mav.addObject("modifyProject", "false");
		}

		return mav;
	}
	
	/**
	 * 新增项目
	 */
	@RequestMapping(value = "/door/addProjects", method = RequestMethod.POST)
	@ResponseBody
	public String addProjectsPostRequest(@RequestParam(value = "projectName", required = true) String projectName,
			@RequestParam(value = "chargerNames", required = true) String chargerNames,
			@RequestParam(value = "projectDes", required = true) String projectDescription,
			@RequestParam(value = "projectValid", required = true) String projectValid) {
		String result = "ok";
		JDProjectInfoDao projectInfo = new JDProjectInfoDao();
		projectInfo.setProjectId(0L);
		projectInfo.setChargerNames(chargerNames);
		projectInfo.setProjectName(projectName);
		projectInfo.setProjectDescription(projectDescription);
		projectInfo.setDepartmentCode(1);
		if ("true".equals(projectValid)) {
			projectInfo.setIsValid(1);
		} else {
			projectInfo.setIsValid(0);
		}
		if (!getProjectInfoService.addNewProjectInfoIntoDB(projectInfo)) {
			result = "error";
		}

		return result;
	}
	
	/**
	 * 新增项目
	 */
	@RequestMapping(value = "/door/modifyProjects", method = RequestMethod.POST)
	@ResponseBody
	public String modifyProjectsPostRequest(@RequestParam(value = "projectId", required = true) String projectId,
			@RequestParam(value = "projectName", required = true) String projectName,
			@RequestParam(value = "chargerNames", required = true) String chargerNames,
			@RequestParam(value = "projectDes", required = true) String projectDescription,
			@RequestParam(value = "projectValid", required = true) String projectValid) {
		String result = "ok";
		
		Long pId = null;
		try {
			pId = Long.valueOf(projectId);
		} catch (Exception ex) {
			ex.printStackTrace();
			return "error";
		}
		
		JDProjectInfoDao projectInfo = new JDProjectInfoDao();
		projectInfo.setProjectId(pId);
		projectInfo.setChargerNames(chargerNames);
		projectInfo.setProjectName(projectName);
		projectInfo.setProjectDescription(projectDescription);
		projectInfo.setDepartmentCode(1);
		if ("true".equals(projectValid)) {
			projectInfo.setIsValid(1);
		} else {
			projectInfo.setIsValid(0);
		}
		if (!getProjectInfoService.updateProjectInfoIntoDB(pId, projectInfo)) {
			result = "error";
		}

		return result;
	}
	
	/**
	 * 删除某个项目（实际是无效某些项目）
	 */
	@RequestMapping(value = "/door/invalidProjects", method = RequestMethod.POST)
	@ResponseBody
	public String invalidProjects(@RequestParam(value = "projectId", required = true) String projectId) {		
		Long pId = null;
		try {
			pId = Long.valueOf(projectId);
		} catch (Exception ex) {
			ex.printStackTrace();
			return "error";
		}
		
		// 先查询出记录，再更新成无效记录
		JDProjectInfoDao projectInfo = getProjectInfoService.getProjectInfoById(pId);
		projectInfo.setIsValid(0);
		getProjectInfoService.updateProjectInfoIntoDB(pId, projectInfo);
		
		return "ok";
	}
	
	
	/**
	 * 主页面中，存在左边菜单，需要显示项目一览。
	 * 这里从数据库中获取项目一览，而且只返回有效的项目。
	 */
	private void addProjectInfosIntoModelAndView(ModelAndView mav) {
		List<JDProjectInfoDao> projects = getProjectInfoService.getAllProjects(true);
		mav.addObject("projects", projects);
	}

	@Autowired
	private JDShopRepository jdshopRepository;

	@Autowired
	private GetShopDetailInfoService getShopDetailInfoServiceImpl;
	
	@Autowired
	private GetProjectInfoService getProjectInfoService;
}
