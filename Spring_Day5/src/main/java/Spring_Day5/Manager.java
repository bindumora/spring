package Spring_Day5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Manager {
	@Value("1")
	private int managerId;
	@Value("bindu")
	private String managerName;
	@Value("hyd")
	private String managerAddress;
	@Value("345670")
	private double managerSalary;

	public int getManagerId() {
		return managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public String getManagerAddress() {
		return managerAddress;
	}

	public double getManagerSalary() {
		return managerSalary;
	}

}
