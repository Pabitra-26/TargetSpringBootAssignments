package com.SpringBootAssignment.TargetRetailServicesMaven.entities;

public class UpdateProducts {
	private long productId;
	private String productName;
	private float sellingPrice;
	private String productType;
	private String sellingChannel;
	private float DiscountPercent;
	private float DiscountedPrice;
	
	public UpdateProducts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(float sellingPrice) {
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
	public float getDiscountPercent() {
		return DiscountPercent;
	}
	public void setDiscountPercent(float discountPercent) {
		DiscountPercent = discountPercent;
	}
	public float getDiscountedPrice() {
		return DiscountedPrice;
	}
	public void setDiscountedPrice(float discountedPrice) {
		DiscountedPrice = discountedPrice;
	}
	
	
}

