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
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String customerName;
	private long customerPhn;
	private String customerAddress;
	private int customerOrderId;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Food> food;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerPhn() {
		return customerPhn;
	}
	public void setCustomerPhn(long customerPhn) {
		this.customerPhn = customerPhn;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public int getCustomerOrderId() {
		return customerOrderId;
	}
	public void setCustomerOrderId(int customerOrderId) {
		this.customerOrderId = customerOrderId;
	}

}
