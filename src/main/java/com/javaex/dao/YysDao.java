package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.ProductVo;
import com.javaex.vo.YdsVo;

@Repository
public class YysDao {

	@Autowired
	private SqlSession sqlSession;

	// 리스트 가져오기
	public List<ProductVo> pSelectList(int cate_no) {
		System.out.println("YysDao.pSelectList()");

		List<ProductVo> pList = sqlSession.selectList("yys.selectList", cate_no);

		return pList;
	}

	// //////////////////////////////////////////////////////////////////////////
	
	// 수정
	public int shopModify(YdsVo ydsVo) {
		System.out.println("YysDao.shopModify()");

		int count = sqlSession.update("yys.update", ydsVo);
		return count;
	}

}
