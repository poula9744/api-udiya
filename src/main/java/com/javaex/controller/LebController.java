package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

		String franchiseeName = lebService.exeFranSelect();
		System.out.println(franchiseeName);
		return JsonResult.success(franchiseeName);
	}

	// 영수증 만들기 + 마일리지 적립 + 결제상품 리스트 + 장바구니 비우기
	@PostMapping("/api/payment")
	public JsonResult makeReceipt(@RequestBody LebVo lebVo) {
		System.out.println("LebController.InsertOrders()");

		lebService.exeMakeReceipt(lebVo);
		System.out.println("receipt_no:            " + lebVo.getReceipt_no());
		return JsonResult.success(lebVo.getReceipt_no());
	}

	/*
	 * //
	 * 
	 * @PostMapping("/api/payment/shop") public JsonResult makeHistory(@RequestBody
	 * List<LebVo> historyList, @PathVariable("receipt_no") int receipt_no) {
	 * System.out.println("LebController.makeHistory()");
	 * 
	 * int count = lebService.exeMakeHistory(historyList, receipt_no);
	 * System.out.println("count:            " + count); return
	 * JsonResult.success(count); }
	 */

	///////////////////////////////////////////////////////////////////////////////////////
	// 세부페이지
	@GetMapping("/api/payment/{product_no}/{hi_no}")
	public JsonResult selectDirect(@PathVariable("product_no") int product_no, @PathVariable("hi_no") int hi_no) {
		System.out.println("selectDirect22222222222222222222");

		LebVo directVo = lebService.exeSelectDirect(product_no, hi_no);
		System.out.println(directVo);
		return JsonResult.success(directVo);
	}

	// 영수증 만들기 + 마일리지 적립 + 결제상품등록
	@PostMapping("/api/payment/direct")
	public JsonResult makeReceiptDirect(@RequestBody LebVo lebVo) {
		System.out.println("LebController.InsertOrders()");

		lebService.exeMakeReceiptDirect(lebVo);
		System.out.println("receipt_no:            " + lebVo.getReceipt_no());
		return JsonResult.success(lebVo.getReceipt_no());
	}

}
