package dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Nation {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Value("1")
	private int nationId;
	@Value("india")
	private String nationName;
	@Value("janaganamana")
	private String nationAnthem;
	@Value("rupess")
	private String nationCurrency;
	@OneToOne(cascade = CascadeType.ALL)
	@Autowired
	private President president;

	public int getNationId() {
		return nationId;
	}

	public String getNationName() {
		return nationName;
	}

	public String getNationAnthem() {
		return nationAnthem;
	}

	public String getNationCurrency() {
		return nationCurrency;
	}

	public President getPresident() {
		return president;
	}

}
