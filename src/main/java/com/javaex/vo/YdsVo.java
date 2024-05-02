package com.javaex.vo;

public class YdsVo {

	//필드
	private int shopNo;
	private int usersNo;
	private int productNo;
	private int hiNo;
	private String hoi;
	private int count;
	private String picture;
	private String productname;
	private String size;
	private int price;
	
	//생성자
	public YdsVo() {
		
	}

	public YdsVo(int shopNo, int usersNo, int productNo, int hiNo, String hoi, int count, String picture,
			String productname, String size, int price) {
		
		this.shopNo = shopNo;
		this.usersNo = usersNo;
		this.productNo = productNo;
		this.hiNo = hiNo;
		this.hoi = hoi;
		this.count = count;
		this.picture = picture;
		this.productname = productname;
		this.size = size;
		this.price = price;
	}
	
	//메서드-g/s
	public int getShopNo() {
		return shopNo;
	}

	public void setShopNo(int shopNo) {
		this.shopNo = shopNo;
	}

	public int getUsersNo() {
		return usersNo;
	}

	public void setUsersNo(int usersNo) {
		this.usersNo = usersNo;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public int getHiNo() {
		return hiNo;
	}

	public void setHiNo(int hiNo) {
		this.hiNo = hiNo;
	}

	public String getHoi() {
		return hoi;
	}

	public void setHoi(String hoi) {
		this.hoi = hoi;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "YdsVo [shopNo=" + shopNo + ", usersNo=" + usersNo + ", productNo=" + productNo + ", hiNo=" + hiNo
				+ ", hoi=" + hoi + ", count=" + count + ", picture=" + picture + ", productname=" + productname
				+ ", size=" + size + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
}
