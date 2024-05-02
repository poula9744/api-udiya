package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.KsbService;
import com.javaex.vo.KsbVo;
import com.javaex.vo.ProductVo;

@RestController
public class KsbController {

	//김수빈
	@Autowired
	private KsbService ksbService;
	
	//상세 폼 부르기
	@GetMapping(value="/api/udiya/detail/{cate_no}/{product_no}")
	public ProductVo detailForm(@PathVariable("product_no") int product_no,
							    @PathVariable("cate_no") int cate_no) {
		System.out.println("KsbController.detailForm()");
		System.out.println(product_no);
		System.out.println(cate_no);
		
		ProductVo pVo = new ProductVo();
		pVo.setCate_no(cate_no);
		pVo.setProduct_no(product_no);
		
		ProductVo productVo = ksbService.exeDetailForm(pVo);
		
		return productVo;
	}
	
	//장바구니에 추가하기
	@PostMapping(value="/api/udiya/addCart")
	public int addCart(@RequestBody KsbVo ksbVo) {
		System.out.println("KsbController.insertShopping");
		
		int count = ksbService.exeAddCart(ksbVo);
		//String result = "{\"count\":"+count+"}";
		
		return count;
	}
}
