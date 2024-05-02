package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.YdsDao;
import com.javaex.vo.YdsVo;


@Service
public class YdsService {
	
	@Autowired
	private YdsDao ydsDao;
	
	//리스트
		public List<YdsVo> exeList(int usersNo) {
			System.out.println("YdsService.exeList()");
			
			List<YdsVo> cList = ydsDao.selectList(usersNo);
		
			return cList;
		}
	//삭제
		public void exeDelete(YdsVo ydsVo) {
			System.out.println("YdsService.exeDelete()");
			
			ydsDao.productDelete(ydsVo);
		}	

	//다솜이꺼
}
