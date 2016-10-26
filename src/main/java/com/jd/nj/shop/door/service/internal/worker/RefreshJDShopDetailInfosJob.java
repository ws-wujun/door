package com.jd.nj.shop.door.service.internal.worker;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.jd.nj.shop.door.service.GetShopDetailInfoService;

public class RefreshJDShopDetailInfosJob extends QuartzJobBean {

	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("[" + getCurrentTime() + "] executing start...");
		GetShopDetailInfoService getShopDetailInfoServiceImpl = (GetShopDetailInfoService) arg0.getJobDetail().getJobDataMap().get("service");
		getShopDetailInfoServiceImpl.refreshJDShopInfos(0, 5000000, 1000000000, 1000010000);
		System.out.println("[" + getCurrentTime() + "] executing finished...");
	}
	
	private String getCurrentTime() {
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String nowtime = dateFormat.format(now);
		return nowtime;
	}
}
