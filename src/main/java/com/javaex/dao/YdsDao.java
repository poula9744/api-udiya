package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.javaex.vo.YdsVo;


@Repository
public class YdsDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	//장바구니 리스트
		public List<YdsVo> selectList(int usersNo) {
			System.out.println("YdsDao.selectList()");
			
			List<YdsVo> cList = sqlSession.selectList("yds.selectList", usersNo);
			
			return cList;
		}
	
	//삭제
		public void productDelete(YdsVo ydsVo) {
			System.out.println("YdsDao.cartDelete()");
			
			sqlSession.delete("yds.deleteProduct", ydsVo);
		}
			
	//다솜이꺼~
}
