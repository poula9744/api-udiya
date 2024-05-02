package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.YysService;
import com.javaex.vo.ProductVo;
import com.javaex.vo.YdsVo;

@RestController
public class YysController {
	@Autowired
	private YysService yysService;

	// 리스트 가져오기
	@GetMapping(value = "/api/product/list/{cate_no}")
	public List<ProductVo> plist(@PathVariable("cate_no") int cate_no) {
		System.out.println("YysController.plist()");

		List<ProductVo> productList = yysService.exepList(cate_no);
		System.out.println(productList);

		return productList;
	}



}
