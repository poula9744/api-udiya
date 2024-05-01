package com.javaex.vo;

public class KsbVo {

	//필드
	private int product_no;
	private int cate_no;
	private String productname;
	private int price;
	private String text;
	private String picture;
	private String size;
	private int hi_no;
	private int shop_no;
	private int users_no;
	private int count;
	
	
	//생성자
	public KsbVo() {	
	}
	
	public KsbVo(int product_no, int cate_no, String productname, int price, String text, String picture, String size,
			int hi_no, int shop_no, int users_no, int count) {
		super();
		this.product_no = product_no;
		this.cate_no = cate_no;
		this.productname = productname;
		this.price = price;
		this.text = text;
		this.picture = picture;
		this.size = size;
		this.hi_no = hi_no;
		this.shop_no = shop_no;
		this.users_no = users_no;
		this.count = count;
	}


	//메소드  - g/s
	
	public int getProduct_no() {
		return product_no;
	}


	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}


	public int getCate_no() {
		return cate_no;
	}


	public void setCate_no(int cate_no) {
		this.cate_no = cate_no;
	}


	public String getProductname() {
		return productname;
	}


	public void setProductname(String productname) {
		this.productname = productname;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public String getPicture() {
		return picture;
	}


	public void setPicture(String picture) {
		this.picture = picture;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public int getHi_no() {
		return hi_no;
	}


	public void setHi_no(int hi_no) {
		this.hi_no = hi_no;
	}


	public int getShop_no() {
		return shop_no;
	}


	public void setShop_no(int shop_no) {
		this.shop_no = shop_no;
	}


	public int getUsers_no() {
		return users_no;
	}


	public void setUsers_no(int users_no) {
		this.users_no = users_no;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}
	
	//메소드 - 일반
	
	@Override
	public String toString() {
		return "KsbVo [product_no=" + product_no + ", cate_no=" + cate_no + ", productname=" + productname + ", price="
				+ price + ", text=" + text + ", picture=" + picture + ", size=" + size + ", hi_no=" + hi_no
				+ ", shop_no=" + shop_no + ", users_no=" + users_no + ", count=" + count + "]";
	}

	
	
}
