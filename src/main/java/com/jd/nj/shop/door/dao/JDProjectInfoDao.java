package com.jd.nj.shop.door.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jd_project_info")
public class JDProjectInfoDao {
	/**
	 * 项目id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long projectId;
	/**
	 * 项目名
	 */
	@Column(name = "projectname")
	private String projectName;
	/**
	 * 项目负责人
	 */
	@Column(name = "chargernames")
	private String chargerNames;
	/**
	 * 项目描述
	 */
	@Column(name = "projectdes")
	private String projectDescription;
	/**
	 * 項目是否有效，无效的项目将不会显示。
	 */
	@Column(name = "isvalid")
	private Integer isValid;
	/**
	 * 部门编号
	 */
	@Column(name = "department")
	private Integer departmentCode;

	public JDProjectInfoDao() {
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getChargerNames() {
		return chargerNames;
	}

	public void setChargerNames(String chargerNames) {
		this.chargerNames = chargerNames;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public Integer getIsValid() {
		return isValid;
	}

	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}

	public Integer getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(Integer departmentCode) {
		this.departmentCode = departmentCode;
	}

}
