package com.javaex.vo;

public class ProductVo {

	//필드
	private int product_no; //상품
	private String productname;
	private int price;
	private String text;
	private String picture;
	private String size;
	
	private int cate_no; //카테고리
	private String cate_name;
	
	
	//생성자
	public ProductVo() {
		super();
	}


	public ProductVo(int product_no, String productname, int price, String text, String picture, String size,
			int cate_no, String cate_name) {
		super();
		this.product_no = product_no;
		this.productname = productname;
		this.price = price;
		this.text = text;
		this.picture = picture;
		this.size = size;
		this.cate_no = cate_no;
		this.cate_name = cate_name;
	}


	//메소드 - g/s
	public int getProduct_no() {
		return product_no;
	}


	public void setProduct_no(int product_no) {
		this.product_no = product_no;
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


	public int getCate_no() {
		return cate_no;
	}


	public void setCate_no(int cate_no) {
		this.cate_no = cate_no;
	}


	public String getCate_name() {
		return cate_name;
	}


	public void setCate_name(String cate_name) {
		this.cate_name = cate_name;
	}


	//메소드 - 일반
	@Override
	public String toString() {
		return "ProductVo [product_no=" + product_no + ", productname=" + productname + ", price=" + price + ", text="
				+ text + ", picture=" + picture + ", size=" + size + ", cate_no=" + cate_no + ", cate_name=" + cate_name
				+ "]";
	}
	
	
	
	
}
