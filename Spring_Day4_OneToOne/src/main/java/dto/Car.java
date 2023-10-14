package dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int carId;
	private String carName;
	private String carColour;
	private String carModel;
	@OneToOne(cascade = CascadeType.ALL)
	private Engine engine;

	public Car(String carName, String carColour, String carModel, Engine engine) {
		super();
		this.carName = carName;
		this.carColour = carColour;
		this.carModel = carModel;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", carColour=" + carColour + ", carModel=" + carModel
				+ ", engine=" + engine + "]";

	}

}
