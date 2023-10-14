package com.qsp.springboot_foodApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.springboot_foodApp.dao.FoodOrderDao;
import com.qsp.springboot_foodApp.dto.FoodOrder;
import com.qsp.springboot_foodApp.service.FoodOrderService;
import com.qsp.springboot_foodApp.util.ResponseStructure;

@RestController
public class FoodOrderMain {

	
	@Autowired
	private FoodOrderService foodOrderService;
	@PostMapping("/saveFoodOrder")
	public ResponseEntity<ResponseStructure<FoodOrder>> saveFoodOrder(@RequestBody FoodOrder foodOrder) {
		return foodOrderService.saveFoodOrder(foodOrder);
		
	}
	@GetMapping("fetchFoodOrder")
	public ResponseEntity<ResponseStructure<FoodOrder>> fetchFoodOrder(@RequestParam int id) {
		return foodOrderService.fetchFoodOrder(id);
		
	}
	@DeleteMapping("/deleteFoodOrder")
	public ResponseEntity<ResponseStructure<FoodOrder>> deleteFoodOrder(@RequestParam int id) {
		return foodOrderService.deleteFoodOrder(id);
		
	}
	@PutMapping("/updateFoodOrder")
	public ResponseEntity<ResponseStructure<FoodOrder>> updateFoodOrder(@RequestParam int id, @RequestBody FoodOrder foodOrder) {
		return foodOrderService.updateFoodOrder(id, foodOrder);
		
	}
	@GetMapping("/fetchAllFoodOrder")
	public List<FoodOrder>  fetchAllFoodOrder(FoodOrder foodOrder){
		return foodOrderService.fetchAllFoodOrder(foodOrder);
		
	}
}
