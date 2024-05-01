package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.YysService;
import com.javaex.util.JsonResult;
import com.javaex.vo.ProductVo;

@RestController
public class YysController {
	@Autowired
	private YysService yysService;

	// 리스트 가져오기
	@GetMapping(value = "/api/product/list")
	public List<ProductVo> plist() {
		System.out.println("YysController.plist()");

		List<ProductVo> productList = yysService.exepList();

		System.out.println(productList);

		return productList;
	}

}
