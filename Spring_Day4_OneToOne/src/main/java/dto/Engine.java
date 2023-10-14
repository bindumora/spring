package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Engine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int engineId;
	private String engineName;
	private double enginePrice;

	public Engine(String engineName, double enginePrice) {
		super();

		this.engineName = engineName;
		this.enginePrice = enginePrice;
	}

	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", engineName=" + engineName + ", enginePrice=" + enginePrice + "]";
	}

}
