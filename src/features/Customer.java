package features;

import interfaces.iCustomer;

public class Customer implements iCustomer {
	private String fullName;
	private int dob;

	public Customer() {
		fullName = "";
		dob = 0;
	}

	@Override
	public String returnName() {
		return fullName;
	}

	@Override
	public int returnDOB() {
		return dob;
	}

	@Override
	public void enterName(String name) {
		if (name.length() > 3) {
			System.out.println("A name has already been submitted");
		}
		fullName = name.trim();
	}

	@Override
	public void enterDOB(int date) {
		String dateLength = Integer.toString(date);
		if (dateLength.length() != 6) {
			System.out.println("Please enter your date of birth in the format DD/MM/YY");
		}
		dob = date;
	}

}
