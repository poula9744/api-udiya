package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.JhVo2;
import com.javaex.vo.JhVo3;
import com.javaex.vo.KjhVo;

@Repository
public class KjhDao {

	//재현이꺼~
	@Autowired SqlSession sqlSession;
	
	//주문번호 가져오기
	public int pickup() {
		
		return sqlSession.selectOne("kjh.pick");
	}
	
	//영수증 리스트 가져오기
	public List<JhVo2> receiptNo() {
		
		return sqlSession.selectList("kjh.receiptNo");
	}
	
	//영수증별 상품이름 사진 가져오기
	public JhVo3 product(int a) {
		System.out.println(a);
		return sqlSession.selectOne("kjh.product", a);
	}
	
	//닉네임+마일리지
	public KjhVo mile() {
		KjhVo a = sqlSession.selectOne("kjh.mile");
		System.out.println(a);
		
		return a;
	}
}
