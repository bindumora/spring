package Spring_Day2;

public class Chaitanya implements School {
	private double fee;
	private String address;

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("this is chaitanya school");

	}
}
