package com.jd.nj.shop.door.service.internal.model;

import java.io.Serializable;

public class ScoreInfo implements Serializable {
	private static final long serialVersionUID = 858171566816245549L;

	/**
	 * 店铺综合评分
	 */
	private float aggregateScore;

	/**
	 * 商品评分
	 */
	private float wareScore;

	/**
	 * 行业平均的商品评分
	 */
	private float avgWareScore;

	/**
	 * 商品评分与业内平均评分比较，-1：小于平均值，0，与平均值相等，1：大于平均值
	 */
	private int wareScoreTrend;

	/**
	 * 服务评分
	 */
	private float serviceScore;

	/**
	 * 行业平均的服务评分
	 */
	private float avgServiceScore;

	/**
	 * 服务评分与业内平均评分比较，-1：小于平均值，0，与平均值相等，1：大于平均值
	 */
	private int serviceScoreTrend;

	/**
	 * 时效评分
	 */
	private float efficiencyScore;

	/**
	 * 行业平均的时效评分
	 */
	private float avgEfficiencyScore;

	/**
	 * 时效评分与业内平均评分比较，-1：小于平均值，0，与平均值相等，1：大于平均值
	 */
	private int efficiencyScoreTrend;

	/**
	 * 商品对比值
	 */
	private String warePercent;

	/**
	 * 
	 */
	private String servicePercent;

	/**
	 * 
	 */
	private String efficiencyPercent;

	public float getAggregateScore() {
		return aggregateScore;
	}

	public void setAggregateScore(float aggregateScore) {
		this.aggregateScore = aggregateScore;
	}

	public float getWareScore() {
		return wareScore;
	}

	public void setWareScore(float wareScore) {
		this.wareScore = wareScore;
	}

	public float getAvgWareScore() {
		return avgWareScore;
	}

	public void setAvgWareScore(float avgWareScore) {
		this.avgWareScore = avgWareScore;
	}

	public int getWareScoreTrend() {
		return wareScoreTrend;
	}

	public void setWareScoreTrend(int wareScoreTrend) {
		this.wareScoreTrend = wareScoreTrend;
	}

	public float getServiceScore() {
		return serviceScore;
	}

	public void setServiceScore(float serviceScore) {
		this.serviceScore = serviceScore;
	}

	public float getAvgServiceScore() {
		return avgServiceScore;
	}

	public void setAvgServiceScore(float avgServiceScore) {
		this.avgServiceScore = avgServiceScore;
	}

	public int getServiceScoreTrend() {
		return serviceScoreTrend;
	}

	public void setServiceScoreTrend(int serviceScoreTrend) {
		this.serviceScoreTrend = serviceScoreTrend;
	}

	public float getEfficiencyScore() {
		return efficiencyScore;
	}

	public void setEfficiencyScore(float efficiencyScore) {
		this.efficiencyScore = efficiencyScore;
	}

	public float getAvgEfficiencyScore() {
		return avgEfficiencyScore;
	}

	public void setAvgEfficiencyScore(float avgEfficiencyScore) {
		this.avgEfficiencyScore = avgEfficiencyScore;
	}

	public int getEfficiencyScoreTrend() {
		return efficiencyScoreTrend;
	}

	public void setEfficiencyScoreTrend(int efficiencyScoreTrend) {
		this.efficiencyScoreTrend = efficiencyScoreTrend;
	}

	public String getWarePercent() {
		return warePercent;
	}

	public void setWarePercent(String warePercent) {
		this.warePercent = warePercent;
	}

	public String getServicePercent() {
		return servicePercent;
	}

	public void setServicePercent(String servicePercent) {
		this.servicePercent = servicePercent;
	}

	public String getEfficiencyPercent() {
		return efficiencyPercent;
	}

	public void setEfficiencyPercent(String efficiencyPercent) {
		this.efficiencyPercent = efficiencyPercent;
	}

}
