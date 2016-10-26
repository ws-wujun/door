package com.jd.nj.shop.door.service.internal.worker;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import com.jd.nj.shop.door.service.GetShopDetailInfoService;

@Configuration
@ComponentScan("com.jd.nj.shop.door.service.internal.worker")
public class QuartzConfiguration {

	@Bean
	public JobDetailFactoryBean jobDetailFactoryBean() {
		JobDetailFactoryBean factory = new JobDetailFactoryBean();
		factory.setJobClass(RefreshJDShopDetailInfosJob.class);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("service", getShopDetailInfoServiceImpl);
		factory.setJobDataAsMap(map);
		factory.setGroup("jd-shop");
		factory.setName("refresh-shop-detail-job");
		return factory;
	}

	// Job is scheduled after every 1 minute
	@Bean
	public CronTriggerFactoryBean cronTriggerFactoryBean() {
		CronTriggerFactoryBean stFactory = new CronTriggerFactoryBean();
		stFactory.setJobDetail(jobDetailFactoryBean().getObject());
		stFactory.setStartDelay(3000);
		stFactory.setName("mytrigger");
		stFactory.setGroup("mygroup");
		//stFactory.setCronExpression("0 0/1 * * * ?");
		// 每天早上2:00执行
		stFactory.setCronExpression("0 0 23 * * ? *");
		return stFactory;
	}

	@Bean
	public SchedulerFactoryBean schedulerFactoryBean() {
		SchedulerFactoryBean scheduler = new SchedulerFactoryBean();
		scheduler.setTriggers(cronTriggerFactoryBean().getObject());
		return scheduler;
	}
	
	@Autowired
	private GetShopDetailInfoService getShopDetailInfoServiceImpl;
}
