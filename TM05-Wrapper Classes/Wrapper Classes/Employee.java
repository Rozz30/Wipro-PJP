/*Create an employee class with properties of your choice. Create an object of this class 
and also create a clone of the same. After making the clone, change the properties of the 
original employee object and print the properties of both the original and clone object and 
note down your observation.*/


public class Employee implements Cloneable{
	String empName;
	String empId;
	public Employee(String empName) {
		this.empName=empName;
	}
	public void setName(String empName) {
		this.empName=empName;
	}
	public String getEmpName() {
		return empName;
	}
	
	public static void main(String[] args) {
		Employee emp1=new Employee("Rozario");
		try {
			Employee emp2=(Employee) emp1.clone();
			System.out.println("Employee Name(original):"+emp1.getEmpName());
			emp2.setName("Prince");
			System.out.println("Employee Name(cloned):"+emp2.getEmpName());
			System.out.println("Employee Name(original):"+emp1.getEmpName());
		} catch (CloneNotSupportedException e) {
			System.out.println("CloneNotSupported.");
		}

	}

}
