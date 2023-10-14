package Spring_Day5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {
	@Value("1")
	private int companyId;
	@Value("tcs")
	private String companyName;
	@Value("ghj34567kl")
	private String companyGst;
	@Value("098765432")
	private long companyPh;
@Autowired
	private Manager manager;

	public int getCompanyId() {
		return companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getCompanyGst() {
		return companyGst;
	}

	public long getCompanyPh() {
		return companyPh;
	}

	public Manager getManager() {
		return manager;
	}

}
