package Dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Entity
@Scope(value = "prototype")
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int foodId;
	private String foodName;
	private String foodQuantity;
	private double foodCost;
	private String foodOffer;
	@Autowired
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Customer> customer;
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodQuantity() {
		return foodQuantity;
	}
	public void setFoodQuantity(String foodQuantity) {
		this.foodQuantity = foodQuantity;
	}
	public double getFoodCost() {
		return foodCost;
	}
	public void setFoodCost(double foodCost) {
		this.foodCost = foodCost;
	}
	public String getFoodOffer() {
		return foodOffer;
	}
	public void setFoodOffer(String foodOffer) {
		this.foodOffer = foodOffer;
	}
	public List<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
}
