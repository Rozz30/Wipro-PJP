
public class Employee implements Comparable<Employee>{
	String firstName;
	String lastName;
	long number;
	String mailId;
	String address;
	
	public Employee(String firstName, String lastName, long number, String mailId, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.mailId = mailId;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", number=" + number + ", mailId="
				+ mailId + ", address=" + address + "]";
	}

	@Override
	public int compareTo(Employee emp2) {
		if(this.getFirstName().compareTo(emp2.getFirstName())>=1)
			return 1;
		else 
			return -1;
	}
	
	
}
