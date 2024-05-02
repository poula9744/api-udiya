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

	// 리스트
	public List<YdsVo> exeList(int usersNo) {
		System.out.println("YdsService.exeList()");

		List<YdsVo> cList = ydsDao.selectList(usersNo);

		return cList;
	}

	// 삭제
	public void exeDelete(YdsVo ydsVo) {
		System.out.println("YdsService.exeDelete()");

		ydsDao.productDelete(ydsVo);
	}

	// 수량 수정
	public int exeTypeUpdate(YdsVo updateHI) {
		System.out.println("YdsService.exeTypeUpdate()");

		int count = ydsDao.hiUpdate(updateHI);
		return count;

	}

	// 수정
	public int exeModify(YdsVo ydsVo) {
		System.out.println("YysService.exeModify()");

		int count = ydsDao.shopModify(ydsVo);

		return count;
	}

	// 다솜이꺼
}
