package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.YysDao;
import com.javaex.vo.ProductVo;
import com.javaex.vo.YdsVo;

@Service
public class YysService {

	@Autowired
	private YysDao yysDao;

	// 리스트 가져오기
	public List<ProductVo> exepList(int cate_no) {
		System.out.println("YysService.exepList()");

		List<ProductVo> pList = yysDao.pSelectList(cate_no);

		return pList;
	}



}
