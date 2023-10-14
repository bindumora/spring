package com.qsp.springboot_foodApp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.springboot_foodApp.dto.FoodOrder;
import com.qsp.springboot_foodApp.dto.Item;
import com.qsp.springboot_foodApp.repo.FoodOrderRepo;

@Repository
public class FoodOrderDao {

	@Autowired
	private FoodOrderRepo foodOrderRepo;
	
	public FoodOrder saveFoodOrder(FoodOrder foodOrder) {
		return foodOrderRepo.save(foodOrder);
		
	}
	
	public FoodOrder fetchFoodOrder(int id) {
		return foodOrderRepo.findById(id).get();
		
		
	}
	public FoodOrder deleteFoodOrder(int id) {
		 FoodOrder foodOrder=foodOrderRepo.findById(id).get();
		 foodOrderRepo.deleteById(id);
		return foodOrder;
		 
		
	}
	public FoodOrder updateFoodOrder(int id, FoodOrder foodOrder) {
//		 FoodOrder dbFoodOrder=foodOrderRepo.findById(id).get();
//		 if(dbFoodOrder!=null) {
			 foodOrder.setCustomerId(id);
			 foodOrder.setItems(foodOrder.getItems());
			 return foodOrderRepo.save(foodOrder);
		 }
//		 else {
//			 return foodOrder;
//		 }
		
//}
	public List<FoodOrder> fetchAllFoodOrder(FoodOrder foodOrder) {
		return foodOrderRepo.findAll();
		
	}
}
