package com.globomart.productcatalogue.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product {
	
	@Column(name = "PRODUCT_DESC")
	private String productDesc;

	@Column(name = "PRODUCT_DISCOUNT")
	private int productDiscount;

	@Id
	@GeneratedValue
	@Column(name = "PRODUCT_ID")
	private Long productId;
	
	@Column(name = "PRODUCT_NAME")
	private String productName;
	
	@Column(name = "PRODUCT_PRICE")
	private BigDecimal productPrice;
	
	@Column(name = "PRODUCT_TYPE")
	private String productType;
	
	@Column(name = "PRODUCT_BRAND")
	private String productBrand;

	public String getProductBrand() {
		return productBrand;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public int getProductDiscount() {
		return productDiscount;
	}

	public Long getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public void setProductDiscount(int productDiscount) {
		this.productDiscount = productDiscount;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}
	
}
