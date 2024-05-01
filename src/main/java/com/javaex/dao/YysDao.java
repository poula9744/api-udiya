package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.ProductVo;


@Repository
public class YysDao {
	
	@Autowired
	private SqlSession sqlSession;

	// 리스트 가져오기
		public List<ProductVo> pSelectList() {
			System.out.println("YysDao.pSelectList()");

			List<ProductVo> pList = sqlSession.selectList("yys.selectList");
			System.out.println(pList);

			return pList;
		}
}
