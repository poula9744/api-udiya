package com.javaex.vo;

public class JhVo4 {
	
	private int receiptNo;
	private String selltime;
	private String franchiseeName;
	private int total;
	private String productName;
	private String picture;
	private int count;
	
	public JhVo4() {
		super();
	}

	public JhVo4(int receiptNo, String selltime, String franchiseeName, int total, String productName, String picture,
			int count) {
		super();
		this.receiptNo = receiptNo;
		this.selltime = selltime;
		this.franchiseeName = franchiseeName;
		this.total = total;
		this.productName = productName;
		this.picture = picture;
		this.count = count;
	}

	public int getReceiptNo() {
		return receiptNo;
	}

	public void setReceiptNo(int receiptNo) {
		this.receiptNo = receiptNo;
	}

	public String getSelltime() {
		return selltime;
	}

	public void setSelltime(String selltime) {
		this.selltime = selltime;
	}

	public String getFranchiseeName() {
		return franchiseeName;
	}

	public void setFranchiseeName(String franchiseeName) {
		this.franchiseeName = franchiseeName;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
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
		return "JhVo4 [receiptNo=" + receiptNo + ", selltime=" + selltime + ", franchiseeName=" + franchiseeName
				+ ", total=" + total + ", productName=" + productName + ", picture=" + picture + ", count=" + count
				+ "]";
	}
	
	
}
