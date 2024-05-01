package com.javaex.vo;

public class LebVo {

	//필드
	private int users_no; //유저넘버
	
	private String date; //마일리지
	private int mile;
	private String accumulate;
	private int totalmile;
	
	private int receipt_no; //영수증
	private int total;
	private int usemile;
	private String selltime;
	
	private int franchisee_no;  //프랜차이즈
	private int franchisee_name;
	
	private int history_no; //history
	private int count;
	
	private int product_no; //상품
	private String productname;
	private int price;
	private String text;
	private String picture;
	private String size;
	
	private int cate_no; //카테고리
	private String cate_name;
	
	private int shop_no; //장바구니
	private int shop_count;
	
	private int hi_no;
	private String hoi;
	
	//생성자
	public LebVo() {
		super();
	}
	
	public LebVo(int users_no, String date, int mile, String accumulate, int totalmile, int receipt_no,
			int total, int usemile, String selltime, int franchisee_no, int franchisee_name, int history_no, int count,
			int product_no, String productname, int price, String text, String picture, String size, int cate_no,
			String cate_name, int shop_no, int shop_count, int hi_no, String hoi) {
		super();
		this.users_no = users_no;
		this.date = date;
		this.mile = mile;
		this.accumulate = accumulate;
		this.totalmile = totalmile;
		this.receipt_no = receipt_no;
		this.total = total;
		this.usemile = usemile;
		this.selltime = selltime;
		this.franchisee_no = franchisee_no;
		this.franchisee_name = franchisee_name;
		this.history_no = history_no;
		this.count = count;
		this.product_no = product_no;
		this.productname = productname;
		this.price = price;
		this.text = text;
		this.picture = picture;
		this.size = size;
		this.cate_no = cate_no;
		this.cate_name = cate_name;
		this.shop_no = shop_no;
		this.shop_count = shop_count;
		this.hi_no = hi_no;
		this.hoi = hoi;
	}

	public int getUsers_no() {
		return users_no;
	}

	public void setUsers_no(int users_no) {
		this.users_no = users_no;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getMile() {
		return mile;
	}

	public void setMile(int mile) {
		this.mile = mile;
	}

	public String getAccumulate() {
		return accumulate;
	}

	public void setAccumulate(String accumulate) {
		this.accumulate = accumulate;
	}

	public int getTotalmile() {
		return totalmile;
	}

	public void setTotalmile(int totalmile) {
		this.totalmile = totalmile;
	}

	public int getReceipt_no() {
		return receipt_no;
	}

	public void setReceipt_no(int receipt_no) {
		this.receipt_no = receipt_no;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getUsemile() {
		return usemile;
	}

	public void setUsemile(int usemile) {
		this.usemile = usemile;
	}

	public String getSelltime() {
		return selltime;
	}

	public void setSelltime(String selltime) {
		this.selltime = selltime;
	}

	public int getFranchisee_no() {
		return franchisee_no;
	}

	public void setFranchisee_no(int franchisee_no) {
		this.franchisee_no = franchisee_no;
	}

	public int getFranchisee_name() {
		return franchisee_name;
	}

	public void setFranchisee_name(int franchisee_name) {
		this.franchisee_name = franchisee_name;
	}

	public int getHistory_no() {
		return history_no;
	}

	public void setHistory_no(int history_no) {
		this.history_no = history_no;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

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

	public int getShop_no() {
		return shop_no;
	}

	public void setShop_no(int shop_no) {
		this.shop_no = shop_no;
	}

	public int getShop_count() {
		return shop_count;
	}

	public void setShop_count(int shop_count) {
		this.shop_count = shop_count;
	}

	public int getHi_no() {
		return hi_no;
	}

	public void setHi_no(int hi_no) {
		this.hi_no = hi_no;
	}

	public String getHoi() {
		return hoi;
	}

	public void setHoi(String hoi) {
		this.hoi = hoi;
	}

	@Override
	public String toString() {
		return "LebVo [users_no=" + users_no + ", date=" + date + ", mile=" + mile + ", accumulate=" + accumulate
				+ ", totalmile=" + totalmile + ", receipt_no=" + receipt_no + ", total="
				+ total + ", usemile=" + usemile + ", selltime=" + selltime + ", franchisee_no=" + franchisee_no
				+ ", franchisee_name=" + franchisee_name + ", history_no=" + history_no + ", count=" + count
				+ ", product_no=" + product_no + ", productname=" + productname + ", price=" + price + ", text=" + text
				+ ", picture=" + picture + ", size=" + size + ", cate_no=" + cate_no + ", cate_name=" + cate_name
				+ ", shop_no=" + shop_no + ", shop_count=" + shop_count + ", hi_no=" + hi_no + ", hoi=" + hoi + "]";
	}

	

	
	
	
	
}
