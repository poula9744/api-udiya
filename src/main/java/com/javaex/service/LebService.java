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

	//지점 정보 가져오기
	public String exeFranSelect() {
		System.out.println("LebService.exeFranSelect()");

		String franchiseeName = lebDao.selectFran();

		return franchiseeName;
	}
}
