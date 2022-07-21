
public class Customer {
	private String name;
	private int dob;
	private String address;
	
	public Customer() {
		name = "";
		dob = 0;
		address = "";
	}
	
	public String returnName() {
		return name;
	}
	
	public int returnDob() {
		return dob;
	}
	
	public String returnAddress() {
		return address;
	}
	
	public void enterName(String fullName) {
		if(!(fullName.equals(""))){
			name = fullName;
		}
		else {
			System.out.println("A name has already been submitted");
		}
	}
	
	public void enterDob(int date) {
		String dateLength = Integer.toString(date);
		if(dateLength.length() == 6) {
			dob = date;
		}
		else {
			System.out.println("Please enter your date of birth in the format DD/MM/YY");
		}
	}
	
	public void enterAddress(String fullAddress) {
		if(!(fullAddress.equals(""))) {
			address = fullAddress;
		}
		else {
			System.out.println("An address has already been submitted");
		}
	}
}
