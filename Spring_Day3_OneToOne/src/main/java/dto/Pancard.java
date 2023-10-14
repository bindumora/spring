package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pancard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pancardId;
	private String pancardAuthority;
	private String pancardNumber;

	public int getPancardId() {
		return pancardId;
	}

	public void setPancardId(int pancardId) {
		this.pancardId = pancardId;
	}

	public String getPancardAuthority() {
		return pancardAuthority;
	}

	public void setPancardAuthority(String pancardAuthority) {
		this.pancardAuthority = pancardAuthority;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}

	public void setPancardNumber(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

}
