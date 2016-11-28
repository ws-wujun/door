package com.jd.nj.shop.door.dao;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jd_shop_interface_info")
public class JDShopInterfaceInfoDao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	/*
	 * 接口名
	 */
	@Column(name = "interface_name")
	private String interfaceName;

	/*
	 * 接口概要说明
	 */
	@Column(name = "interface_description")
	private String interfaceDesciption;

	/*
	 * ump监控key
	 */
	@Column(name = "ump_key")
	private String umpKey;

	/*
	 * 接口负责人
	 */
	@Column(name = "charger")
	private String charger;

	/*
	 * 预发布url/预发布alias
	 */
	@Column(name = "yf_url")
	private String yfUrl;

	/*
	 * 线上url/线上alias
	 */
	@Column(name = "xs_url")
	private String xsUrl;

	/*
	 * cf文档地址
	 */
	@Column(name = "doc_url")
	private String docUrl;

	/*
	 * 接口类型 0: jsf 1: http
	 */
	@Column(name = "interface_type")
	private Integer interfaceType;

	/*
	 * 下游调用者信息
	 */
	@Column(name = "caller_info")
	private String callerInfo;

	/*
	 * 输入参数列表
	 */
	private List<InterfaceParameterDao> params;

	/*
	 * 返回值
	 */
	@Column(name = "return_value")
	private String returnValue;
	
	/*
	 * json格式返回值示例
	 */
	@Column(name = "json_return_value")
	private String jsonReturnValue;
	
	/*
	 * 接口所属项目id
	 */
	@Column(name = "project_id")
	private Long parentProjectId;
	
	/*
	 * 接口是否有效
	 */
	@Column(name = "is_valid")
	private Integer isValid;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInterfaceName() {
		return interfaceName;
	}

	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

	public String getInterfaceDesciption() {
		return interfaceDesciption;
	}

	public void setInterfaceDesciption(String interfaceDesciption) {
		this.interfaceDesciption = interfaceDesciption;
	}

	public String getUmpKey() {
		return umpKey;
	}

	public void setUmpKey(String umpKey) {
		this.umpKey = umpKey;
	}

	public String getCharger() {
		return charger;
	}

	public void setCharger(String charger) {
		this.charger = charger;
	}

	public String getYfUrl() {
		return yfUrl;
	}

	public void setYfUrl(String yfUrl) {
		this.yfUrl = yfUrl;
	}

	public String getXsUrl() {
		return xsUrl;
	}

	public void setXsUrl(String xsUrl) {
		this.xsUrl = xsUrl;
	}

	public String getDocUrl() {
		return docUrl;
	}

	public void setDocUrl(String docUrl) {
		this.docUrl = docUrl;
	}

	public Integer getInterfaceType() {
		return interfaceType;
	}

	public void setInterfaceType(Integer interfaceType) {
		this.interfaceType = interfaceType;
	}

	public String getCallerInfo() {
		return callerInfo;
	}

	public void setCallerInfo(String callerInfo) {
		this.callerInfo = callerInfo;
	}

	public List<InterfaceParameterDao> getParams() {
		return params;
	}

	public void setParams(List<InterfaceParameterDao> params) {
		this.params = params;
	}

	public String getReturnValue() {
		return returnValue;
	}

	public void setReturnValue(String returnValue) {
		this.returnValue = returnValue;
	}

	public String getJsonReturnValue() {
		return jsonReturnValue;
	}

	public void setJsonReturnValue(String jsonReturnValue) {
		this.jsonReturnValue = jsonReturnValue;
	}

	public Long getParentProjectId() {
		return parentProjectId;
	}

	public void setParentProjectId(Long parentProjectId) {
		this.parentProjectId = parentProjectId;
	}

	public Integer getIsValid() {
		return isValid;
	}

	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}

}
