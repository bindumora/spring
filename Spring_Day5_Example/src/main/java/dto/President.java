package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Entity
public class President {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Value("1")
	private int presidentId;
	@Value("Dravthapthi murmu")
	private String presidentName;
	@Value("50")
	private int presidentAge;
	@Value("1000000")
	private double presidentSalary;
	@Value("98768766543")
	private long presidentPhn;

	public int getPresidentId() {
		return presidentId;
	}

	public String getPresidentName() {
		return presidentName;
	}

	public int getPresidentAge() {
		return presidentAge;
	}

	public double getPresidentSalary() {
		return presidentSalary;
	}

	public long getPresidentPhn() {
		return presidentPhn;
	}

}
