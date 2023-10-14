package Dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity

public class Bus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int busId;
	private String busName;
	private int busSeats;
	@Autowired
	@OneToMany(cascade = CascadeType.ALL)
	private List<Passengers> passengers;

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public int getBusSeats() {
		return busSeats;
	}

	public void setBusSeats(int busSeats) {
		this.busSeats = busSeats;
	}

	public List<Passengers> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passengers> passengers) {
		this.passengers = passengers;
	}

}
