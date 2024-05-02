package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.LebVo;

@Repository
public class LebDao {

	@Autowired
	private SqlSession sqlSession;

	// 장바구니에 담긴 정보 불러오기
	public List<LebVo> selectShop() {
		System.out.println("LebDao.selectShop()");
		List<LebVo> shopList = sqlSession.selectList("leb.selectShop");
		return shopList;
	}

	// 마일리지 정보 불러오기
	public int selectMile() {
		System.out.println("LebDao.selectMile()");
		int mile = sqlSession.selectOne("leb.selectMile");
		return mile;
	}

	// 지점 정보 불러오기
	public String selectFran() {
		System.out.println("LebDao.selectFran()");
		String franchiseeName = sqlSession.selectOne("leb.selectFran");
		return franchiseeName;
	}

	// 영수증 만들기
	public int makeReceipt(LebVo lebVo) {
		System.out.println("LebDao.makeReceipt()");

		return sqlSession.insert("leb.makeReceipt", lebVo);
	}

	// 마일리지 차감
	public int downMile(LebVo lebVo) {
		System.out.println("LebDao.downMile()");
		int count = sqlSession.insert("leb.downMile", lebVo);
		return count;
	}

	// 마일리지 증가
	public int upMile(LebVo lebVo) {
		System.out.println("LebDao.downMile()");
		int count = sqlSession.insert("leb.upMile", lebVo);
		return count;
	}

	// 상품 history 만들기
	public int makeHistory(LebVo lebVo) {
		System.out.println("LebDao.makeHistory()");
		System.out.println(lebVo);
		int count = sqlSession.insert("leb.makeHistory", lebVo);
		return count;
	}

	// 장바구니 비우기
	public int deleteCart() {
		System.out.println("LebDao.makeHistory()");
		int count = sqlSession.insert("leb.deleteCart");
		return count;
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	//세부페이지 바로 구매 버튼
	public LebVo selectDirect(int product_no) {
		System.out.println("LebDao.selectDirect()");
		LebVo directVo = sqlSession.selectOne("leb.selectDirect", product_no);
		System.out.println("directVo:        " + directVo);
		return directVo;
	}
	
	public String hoi(int hi_no) {
		System.out.println("LebDao.hoi()");
		String hoi = sqlSession.selectOne("leb.hoi", hi_no);
		return hoi;
	}

}
