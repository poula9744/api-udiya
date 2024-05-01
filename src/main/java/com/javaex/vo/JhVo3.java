package com.javaex.vo;

public class JhVo3 {
	
	private String productName;
	private String picture;
	private int count;
	
	public JhVo3() {
		super();
	}

	public JhVo3(String productName, String picture, int count) {
		super();
		this.productName = productName;
		this.picture = picture;
		this.count = count;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "JhVo3 [productName=" + productName + ", picture=" + picture + ", count=" + count + "]";
	}
	
	
}
