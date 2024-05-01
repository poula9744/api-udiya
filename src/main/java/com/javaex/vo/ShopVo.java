package com.javaex.vo;

public class ShopVo {
	
	//필드
	private int shop_no; //장바구니
	private int product_no; //상품
	private int users_no; //유저넘버	
	private int hi_no;
	private int count;
	
	private String hoi;
	
	

	//생성자
	public ShopVo() {
		super();
	}



	public ShopVo(int shop_no, int product_no, int users_no, int hi_no, int count, String hoi) {
		super();
		this.shop_no = shop_no;
		this.product_no = product_no;
		this.users_no = users_no;
		this.hi_no = hi_no;
		this.count = count;
		this.hoi = hoi;
	}



	//메소드 - g/s
	public int getShop_no() {
		return shop_no;
	}



	public void setShop_no(int shop_no) {
		this.shop_no = shop_no;
	}



	public int getProduct_no() {
		return product_no;
	}



	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}



	public int getUsers_no() {
		return users_no;
	}



	public void setUsers_no(int users_no) {
		this.users_no = users_no;
	}



	public int getHi_no() {
		return hi_no;
	}



	public void setHi_no(int hi_no) {
		this.hi_no = hi_no;
	}



	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}



	public String getHoi() {
		return hoi;
	}



	public void setHoi(String hoi) {
		this.hoi = hoi;
	}



	//메소드 - 일반
	@Override
	public String toString() {
		return "ShopVo [shop_no=" + shop_no + ", product_no=" + product_no + ", users_no=" + users_no + ", hi_no="
				+ hi_no + ", count=" + count + ", hoi=" + hoi + "]";
	}
	
	
}
