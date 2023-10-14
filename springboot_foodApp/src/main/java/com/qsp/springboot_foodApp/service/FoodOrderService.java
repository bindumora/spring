package com.qsp.springboot_foodApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.qsp.springboot_foodApp.dao.FoodOrderDao;
import com.qsp.springboot_foodApp.dto.FoodOrder;
import com.qsp.springboot_foodApp.dto.Item;
import com.qsp.springboot_foodApp.dto.Menu;
import com.qsp.springboot_foodApp.util.ResponseStructure;

@Service
public class FoodOrderService {

	@Autowired
	private FoodOrderDao foodOrderDao;
	
	public ResponseEntity< ResponseStructure<FoodOrder> > saveFoodOrder(FoodOrder foodOrder) {
		
		List<Item> list=foodOrder.getItems();
		double totalPrice=0;
		for(Item item:list) {
			totalPrice=totalPrice+item.getItemPrice()*item.getItemQuantity();
			
		}
		foodOrder.setTotalPrice(totalPrice);
		ResponseStructure<FoodOrder> responseStructure=new ResponseStructure<FoodOrder>();
		responseStructure.setStatus(HttpStatus.CREATED.value());
		responseStructure.setMessage("successfully inserted");
		responseStructure.setData(foodOrderDao.saveFoodOrder(foodOrder));
		return new ResponseEntity<ResponseStructure<FoodOrder>>(responseStructure,HttpStatus.CREATED);
		
		
	}
	public ResponseEntity<ResponseStructure<FoodOrder>>  fetchFoodOrder(int id) {
		ResponseStructure<FoodOrder> responseStructure=new ResponseStructure<FoodOrder>();
		responseStructure.setStatus(HttpStatus.FOUND.value());
		responseStructure.setMessage("successfully fetched");
		responseStructure.setData(foodOrderDao.fetchFoodOrder(id));
		return new ResponseEntity<ResponseStructure<FoodOrder>>(responseStructure,HttpStatus.FOUND);
		
	}
	public ResponseEntity< ResponseStructure<FoodOrder>>  deleteFoodOrder(int id) {
		ResponseStructure<FoodOrder> responseStructure=new ResponseStructure<FoodOrder>();
		responseStructure.setStatus(HttpStatus.OK.value());
		responseStructure.setMessage("successfully deleted");
		responseStructure.setData(foodOrderDao.deleteFoodOrder(id));
		return new ResponseEntity<ResponseStructure<FoodOrder>>(responseStructure,HttpStatus.OK);
		
	}

	public ResponseEntity< ResponseStructure<FoodOrder> > updateFoodOrder(int id, FoodOrder foodOrder) {
		List<Item> list=foodOrder.getItems();
		double totalPrice=0;
		for(Item item:list) {
			totalPrice=totalPrice+item.getItemPrice()*item.getItemQuantity();
			
	}
	foodOrder.setTotalPrice(totalPrice);
	ResponseStructure<FoodOrder> responseStructure=new ResponseStructure<FoodOrder>();
	responseStructure.setStatus(HttpStatus.OK.value());
	responseStructure.setMessage("successfully updated");
	responseStructure.setData(foodOrderDao.updateFoodOrder(id, foodOrder));
	return new ResponseEntity<ResponseStructure<FoodOrder>>(responseStructure,HttpStatus.OK);
	}
	public List<FoodOrder> fetchAllFoodOrder(FoodOrder foodOrder){
	return foodOrderDao.fetchAllFoodOrder(foodOrder);
	
	}
		
}