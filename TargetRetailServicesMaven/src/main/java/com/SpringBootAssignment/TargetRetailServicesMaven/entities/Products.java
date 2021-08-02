package com.SpringBootAssignment.TargetRetailServicesMaven.entities;

import lombok.Data;

public class Products {
	private long productId;
	private String productName;
	private float sellingPrice;
	private String productType;
	private String sellingChannel;
	private float DiscountPercent;
	private float DiscountedPrice;
	
	public Products(long productId, String productName, float sellingPrice, String productType, String sellingChannel, float DiscountPercent) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.sellingPrice = sellingPrice;
		this.productType = productType;
		this.sellingChannel = sellingChannel;
		this.DiscountPercent = DiscountPercent;
		this.DiscountedPrice = this.sellingPrice-(this.sellingPrice*(this.DiscountPercent/100));
		
	}

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Float getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Float sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getSellingChannel() {
		return sellingChannel;
	}

	public void setSellingChannel(String sellingChannel) {
		this.sellingChannel = sellingChannel;
	}

	public Float getDiscountPercent() {
		return DiscountPercent;
	}

	public float getDiscountedPrice() {
		return DiscountedPrice;
	}

	public void setDiscountedPrice(float discountedPrice) {
		DiscountedPrice = discountedPrice;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public void setSellingPrice(float sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public void setDiscountPercent(float discountPercent) {
		DiscountPercent = discountPercent;
	}

	
}
