package question2;

public class Citizen {

	String name;
	String addharNumber;
	String mobileNumber;
	
	public Citizen(String name, String addharNumber, String mobileNumber) {
		super();
		this.name = name;
		this.addharNumber = addharNumber;
		this.mobileNumber = mobileNumber;
	}
	
	public Citizen() {
		
	}

	public String getName() {
		return name;
	}

	public String getAddharNumber() {
		return addharNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}
	
	
}
