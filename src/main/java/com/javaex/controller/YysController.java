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

	// //////////////////////////////////////////////////////////////////////////
	// 수정
	@PutMapping(value = "/api/shop/modify/{shop_no}")
	public String modify(@RequestBody YdsVo ydsVo, @PathVariable(value = "shop_no") int shop_no) {
		System.out.println("YysController.modify()");

		//System.out.println(ydsVo);
		//System.out.println(shop_no);
		ydsVo.setShopNo(shop_no);
		System.out.println(shop_no);

		// 삭제
		// 코드작성할것
		int count = yysService.exeModify(ydsVo);

		String result = "{\"count\": " + count + "}";
		System.out.println(result);

		//return null;
		return result;
	}

}
