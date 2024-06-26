package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.YdsService;
import com.javaex.util.JsonResult;
import com.javaex.vo.YdsVo;

@RestController
public class YdsController {

	@Autowired
	private YdsService ydsService;

	// 특정회원의 장바구니 리스트
	@GetMapping("/api/shop/list/{usersNo}")
	public JsonResult list(@PathVariable(value = "usersNo") int usersNo) {
		System.out.println("YdsController.list()");
		//System.out.println(usersNo);
		List<YdsVo> cList = ydsService.exeList(usersNo);
		//System.out.println(cList);

		return JsonResult.success(cList);
	}

	// 삭제
	@DeleteMapping("/api/shop/list/{shopNo}")
	public JsonResult itemDelete(@RequestBody YdsVo ydsVo, @PathVariable("shopNo") int shopNo) {
		System.out.println("YdsController.delete()");

		//System.out.println(shopNo);

		ydsService.exeDelete(ydsVo);

		//System.out.println(shopNo);

		return JsonResult.success("삭제되었습니다.");
	}

	// hiNo 치환
	public String getHoiByHiNo(int hiNo) {
		if (hiNo == 1 || hiNo == 3) {
			return "hot";
		} else if (hiNo == 2 || hiNo == 4) {
			return "ice";
		} else {
			// 다른 값에 대한 처리
			return "기본값";
		}
	}

	// 음료 타입 업데이트
	@PutMapping("/api/shop/list/{shopNo}/type")
	public JsonResult typeUpdate(@RequestBody YdsVo updateHI, @PathVariable("shopNo") int shopNo) {
		System.out.println("YdsController.updateBeverageType()");

		//System.out.println(shopNo);
		//System.out.println(updateHI);

		updateHI.setShopNo(shopNo);
		
		if (updateHI.getHiNo() == 1 || updateHI.getHiNo() == 3) {
			updateHI.setHiNo(2);
			//System.out.println(updateHI);
			ydsService.exeTypeUpdate(updateHI);
			
			
		} else if (updateHI.getHiNo() == 2 || updateHI.getHiNo() == 4) {
			updateHI.setHiNo(1);
			System.out.println(updateHI);
			ydsService.exeTypeUpdate(updateHI);
			
			
		}
		
		
		
		
		

		//System.out.println(shopNo);

		return JsonResult.success("음료 타입이 바뀌었습니다.");
	}

	// 수정
	@PutMapping(value = "/api/shop/modify/{shop_no}")
	public String modify(@RequestBody YdsVo ydsVo, @PathVariable(value = "shop_no") int shop_no) {
		System.out.println("YysController.modify()");

		// System.out.println(ydsVo);
		// System.out.println(shop_no);
		ydsVo.setShopNo(shop_no);
		System.out.println(shop_no);

		int count = ydsService.exeModify(ydsVo);

		String result = "{\"count\": " + count + "}";
		System.out.println(result);

		// return null;
		return result;
	}
	

	// 다솜이꺼
}
