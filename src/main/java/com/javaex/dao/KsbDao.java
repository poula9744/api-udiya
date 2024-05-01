package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.KsbVo;
import com.javaex.vo.ProductVo;

@Repository
public class KsbDao {

	// 수빈이꺼
	@Autowired
	private SqlSession sqlSession;

	// 전체리스트 폼 부르기
	public List<ProductVo> selectList() {
		List<ProductVo> productList = sqlSession.selectList("ksb.selectList");
		System.out.println(productList);

		return productList;
	}

	// 상세 폼 부르기
	public ProductVo selectOne(ProductVo pVo) {
		System.out.println("KsbDao.selectOne()");

		ProductVo productVo = sqlSession.selectOne("ksb.selectOne", pVo);

		System.out.println(productVo);

		return productVo;
	}

	// 장바구니 등록
	public int insertCart(KsbVo ksbVo) {
		System.out.println("KsbDao.insertCart()");

		int count = sqlSession.insert("ksb.insertCart", ksbVo);

		return count;
	}
}
