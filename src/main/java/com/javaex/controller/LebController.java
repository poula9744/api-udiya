package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.LebService;
import com.javaex.util.JsonResult;
import com.javaex.vo.LebVo;

@RestController
public class LebController {

	@Autowired
	private LebService lebService;

	// 장바구니 정보 가져오기
	@GetMapping("/api/payment/shop")
	public JsonResult shopSelect() {
		System.out.println("shopSelect");

		List<LebVo> shopList = lebService.exeShopSelect();
		System.out.println(shopList);
		return JsonResult.success(shopList);
	}

	// 마일리지 정보 가져오기
	@GetMapping("/api/payment/mile")
	public JsonResult mileSelect() {
		System.out.println("mileSelect");

		int mile = lebService.exeMileSelect();

		return JsonResult.success(mile);
	}

	// 지점 정보 가져오기
	@GetMapping("/api/payment/fran")
	public JsonResult franSelect() {
		System.out.println("franSelect");

		String franchiseeName  = lebService.exeFranSelect();
		System.out.println(franchiseeName);
		return JsonResult.success(franchiseeName);
	}

}
