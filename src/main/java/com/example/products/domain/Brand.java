package com.example.products.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Products")

public class Brand implements Serializable{
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="brand_id")
	private Long brand_id;

	
	@Column(name="brand_name")
	public String brandName;
	
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name="brand_id")
	public List<Product> products;
	
	@Column(name="status")
	public String status;
	
	
	@Column(name="crt_dt")
	public Date crtDt;
	
	@Column(name="crt_user")
	public String crtUser;
	
	@Column(name="last_modify_dt")
	public Date lastModifyDt;
	
	@Column(name="last_modify_user")
	public String lastModifyUser;

	public Long getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(Long brand_id) {
		this.brand_id = brand_id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Date getCrtDt() {
		return crtDt;
	}

	public void setCrtDt(Date crtDt) {
		this.crtDt = crtDt;
	}

	public String getCrtUser() {
		return crtUser;
	}

	public void setCrtUser(String crtUser) {
		this.crtUser = crtUser;
	}

	public Date getLastModifyDt() {
		return lastModifyDt;
	}

	public void setLastModifyDt(Date lastModifyDt) {
		this.lastModifyDt = lastModifyDt;
	}

	public String getLastModifyUser() {
		return lastModifyUser;
	}

	public void setLastModifyUser(String lastModifyUser) {
		this.lastModifyUser = lastModifyUser;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

}
