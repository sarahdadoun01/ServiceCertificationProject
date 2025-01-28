package basicClasses;

public class Person {
	
	private String firstName;
	private String lastName;
	private String phone;
	
	// Constructor
	public Person(String fn, String ln, String p) {
		this.firstName = fn;
		this.lastName = ln;
		this.phone = p;
	}

	// Getters & Setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String fn) {
		this.firstName = fn;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String ln) {
		this.lastName = ln;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String p) {
		this.phone = p;
	}

	// Methods
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nFirst Name :"  + firstName + "\tLast Name : " + lastName + "\tPhone : " + phone;
	}
	
}
