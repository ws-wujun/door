package com.jd.nj.shop.door.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jd_shop")
public class JDShopDao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long shopid;
	private Long venderid;
	private String name;
	private Integer type;

	public JDShopDao() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getShopid() {
		return shopid;
	}

	public void setShopid(Long shopid) {
		this.shopid = shopid;
	}

	public Long getVenderid() {
		return venderid;
	}

	public void setVenderid(Long venderid) {
		this.venderid = venderid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

}
