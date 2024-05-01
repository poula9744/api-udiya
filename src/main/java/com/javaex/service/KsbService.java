package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.KsbDao;
import com.javaex.vo.KsbVo;
import com.javaex.vo.ProductVo;

@Service
public class KsbService {
	@Autowired
	private KsbDao ksbDao;

	//수빈이꺼
	
	//상세 폼 부르기
	public ProductVo exeDetailForm(ProductVo pVo) {
		System.out.println("KsbService.exeDetailForm()");
		
		
		//전체 가져오기
		List<ProductVo> productList = ksbDao.selectList();
		System.out.println(productList);
		
		//1개 가져오기
		ProductVo productVo = ksbDao.selectOne(pVo);
		
		return productVo;
	}
	
	//장바구니 등록
	public int exeAddCart(KsbVo ksbVo) {
		System.out.println("KsbService.exeAddCart()");
		
		int count = ksbDao.insertCart(ksbVo);
		
		return count;
	}
	
}
