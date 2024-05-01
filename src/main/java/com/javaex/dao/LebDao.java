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

	//지점 정보 불러오기
	public String selectFran() {
		System.out.println("LebDao.selectFran()");
		String franchiseeName = sqlSession.selectOne("leb.selectFran");
		return franchiseeName;
	}
}
