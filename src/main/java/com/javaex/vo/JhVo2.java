package com.javaex.vo;

public class JhVo2 {
	
	private int receiptNo;
	private String selltime;
	private String franchiseeName;
	private int total;
	
	public JhVo2() {
		super();
	}

	public JhVo2(int receiptNo, String selltime, String franchiseeName, int total) {
		super();
		this.receiptNo = receiptNo;
		this.selltime = selltime;
		this.franchiseeName = franchiseeName;
		this.total = total;
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

	@Override
	public String toString() {
		return "JhVo2 [receiptNo=" + receiptNo + ", selltime=" + selltime + ", franchiseeName=" + franchiseeName
				+ ", total=" + total + "]";
	}
	
	
	
}
