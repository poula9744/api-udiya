package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.KjhService;
import com.javaex.util.JsonResult;

@RestController
public class KjhController {
	
	@Autowired KjhService ks;
	
	@GetMapping("/api/pick")
	public JsonResult pickupNo() {
		
		return ks.exePickup();
	}
	
	@GetMapping("/api/orderlist")
	public JsonResult orderlist() {
		return ks.exeOrderlist();
	}
	
	@GetMapping("/api/mile")
	public JsonResult mile() {
		return ks.exeMile();
	}
}
