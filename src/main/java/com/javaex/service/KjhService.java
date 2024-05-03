package com.javaex.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.KjhDao;
import com.javaex.util.JsonResult;
import com.javaex.vo.JhVo2;
import com.javaex.vo.JhVo3;
import com.javaex.vo.JhVo4;
import com.javaex.vo.KjhVo;

@Service
public class KjhService {

	//제현이꺼
	@Autowired KjhDao kd;
	
	
	public JsonResult exePickup() {
		
		int a = kd.pickup();
		
		if(a > 0) {
			return JsonResult.success(a);
		}else {
			return JsonResult.fail("주문이 실패했습니다");
		}
	}
	
	public JsonResult exeOrderlist() {
		
		List<JhVo2> olist = kd.receiptNo();
		System.out.println(olist);
		
		List<JhVo3> plist = new ArrayList();
		
		for(int i = 0; i<olist.size(); i++) {
			
			int a = olist.get(i).getReceiptNo();
			System.out.println(a);
			System.out.println(kd.product(a));
			
			JhVo3 j = kd.product(a);
			//System.out.println(j);
			
			plist.add(j);
		}
		//System.out.println(plist);
		
		List<JhVo4> orderList = new ArrayList<JhVo4>();
		
		for(int i = 0; i<olist.size(); i++) {
			JhVo4 j = new JhVo4();
			int receiptNo = olist.get(i).getReceiptNo();
			String sellTime = olist.get(i).getSelltime();
			String franchiseeName = olist.get(i).getFranchiseeName();
			int total = olist.get(i).getTotal();
			String productName = plist.get(i).getProductName();
			String picture = plist.get(i).getPicture();
			int count = plist.get(i).getCount();
						
			j.setCount(count);
			j.setFranchiseeName(franchiseeName);
			j.setPicture(picture);
			j.setProductName(productName);
			j.setReceiptNo(receiptNo);
			j.setSelltime(sellTime);
			j.setTotal(total);
			orderList.add(i, j);
			
		}
		System.out.println(orderList);
		
		if(orderList != null) {
			return JsonResult.success(orderList);
		}else {
			return JsonResult.fail("실패");
		}
	}
	
	public JsonResult exeMile() {
		
		KjhVo a = kd.mile();
		
		if(a !=null) {
			return JsonResult.success(a);
		}else {
			return JsonResult.fail("실패");
		}
	}
}
