package com.jd.nj.shop.door.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "interface_parameter")
public class InterfaceParameterDao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	/*
	 * 参数名
	 */
	@Column(name = "param_name")
	private String paramName;
	
	/*
	 * 参数默认值
	 */
	@Column(name = "param_default_value")
	private String paramDefaultValue;
	
	/*
	 * 参数类型
	 */
	@Column(name = "param_type")
	private String paramType;
	
	/*
	 * 参数说明
	 */
	@Column(name = "param_des")
	private String paramDescription;
	
	/*
	 * 是否必填
	 * 0: 不必填
	 * 1: 必填
	 */
	@Column(name = "is_nullable")
	private Integer isNuallable;
	
	/*
	 * 所属接口id
	 */
	@Column(name = "interface_id")
	private Long interfaceId;
	
	/*
	 * 是否包含在body参数中 1: 包含在body中； 0: 不包含
	 */
	@Column(name = "is_in_body")
	private Integer isInBody;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public String getParamType() {
		return paramType;
	}

	public void setParamType(String paramType) {
		this.paramType = paramType;
	}

	public String getParamDescription() {
		return paramDescription;
	}

	public void setParamDescription(String paramDescription) {
		this.paramDescription = paramDescription;
	}

	public Integer getIsNuallable() {
		return isNuallable;
	}

	public void setIsNuallable(Integer isNuallable) {
		this.isNuallable = isNuallable;
	}

	public Long getInterfaceId() {
		return interfaceId;
	}

	public void setInterfaceId(Long interfaceId) {
		this.interfaceId = interfaceId;
	}

	public String getParamDefaultValue() {
		return paramDefaultValue;
	}

	public void setParamDefaultValue(String paramDefaultValue) {
		this.paramDefaultValue = paramDefaultValue;
	}

	public Integer getIsInBody() {
		return isInBody;
	}

	public void setIsInBody(Integer isInBody) {
		this.isInBody = isInBody;
	}
	
}
