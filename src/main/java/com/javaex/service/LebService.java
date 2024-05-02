package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.LebDao;
import com.javaex.vo.LebVo;

@Service
public class LebService {

	@Autowired
	private LebDao lebDao;

	// 장바구니 정보 가져오기
	public List<LebVo> exeShopSelect() {
		System.out.println("LebService.exeShopMileSelect()");

		List<LebVo> shopList = lebDao.selectShop();

		return shopList;
	}

	// 마일리지 정보 가져오기
	public int exeMileSelect() {
		System.out.println("LebService.exeMileSelect()");

		// 마일리지
		int totalmile = lebDao.selectMile();

		return totalmile;
	}

	// 지점 정보 가져오기
	public String exeFranSelect() {
		System.out.println("LebService.exeFranSelect()");

		String franchiseeName = lebDao.selectFran();

		return franchiseeName;
	}

	// 결제하기
	public int exeMakeReceipt(LebVo lebVo) {
		System.out.println("LebService.exeMakeReceipt()");

		// 1. 영수증 만들기
		int receipt_no = lebDao.makeReceipt(lebVo);

		// 2. 마일리지 증감
		if (lebVo.getUsemile() > 0) {
			lebVo.setTotalmile(lebVo.getTotalmile() - lebVo.getUsemile());
			lebDao.downMile(lebVo);
		} else {
			lebVo.setTotalmile(lebVo.getTotalmile() + (lebVo.getTotal() / 10));
			lebDao.upMile(lebVo);
		}

		// 3. 상품 히스토리 만들기
		List<LebVo> shopList = lebDao.selectShop();

		for (int i = 0; i < shopList.size(); i++) {
			shopList.get(i).setReceipt_no(lebVo.getReceipt_no());
			lebDao.makeHistory(shopList.get(i));
		}

		// 4. 장바구니 비우기
		lebDao.deleteCart();

		return receipt_no; // receipt_no 반환
	}

	//////////////////////////////////////////////////////////////////////////////////////////
	// 세부페이지 정보 가져오기
	public LebVo exeSelectDirect(int product_no, int hi_no) {
		System.out.println("LebService.exeSelectDirect()");

		String hoi = lebDao.hoi(hi_no);
		LebVo directVo = lebDao.selectDirect(product_no);

		directVo.setHoi(hoi);
		return directVo;
	}
	
	public int exeMakeReceiptDirect(LebVo lebVo) {
		System.out.println("LebService.exeMakeReceipt()");

		// 1. 영수증 만들기
		lebDao.makeReceipt(lebVo);

		// 2. 마일리지 증감
		if (lebVo.getUsemile() > 0) {
			lebVo.setTotalmile(lebVo.getTotalmile() - lebVo.getUsemile());
			lebDao.downMile(lebVo);
		} else {
			lebVo.setTotalmile(lebVo.getTotalmile() + (lebVo.getTotal() / 10));
			lebDao.upMile(lebVo);
		}

		// 3. 상품 히스토리 만들기
		int count = lebDao.makeHistory(lebVo);
	
		return count;
	}
	

}
