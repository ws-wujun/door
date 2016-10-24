package com.jd.nj.shop.door.controller;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DoorController {

	@RequestMapping("/door")
	public ModelAndView index(HttpSession session, Model model) {
		if (session.getAttribute("userName") == null) {
			return new ModelAndView("production/login");
		}

		String userName = session.getAttribute("userName").toString();
		if (StringUtils.isEmpty(userName)) {
			return new ModelAndView("production/login");
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
			// add into session
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
	public String main(@RequestParam(value = "userName", required = true) String userName, Model model) {
		model.addAttribute("userName", userName);
		return "production/index";
	}

	@RequestMapping(value = "/door/queryinfo", method = RequestMethod.GET)
	public String queryInfo(@RequestParam(value = "queryType", required = false) String queryType, Model model) {
		model.addAttribute("queryType", queryType);
		return "production/query_info";
	}
}
