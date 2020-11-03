/*Create a class called Employee with properties name(String),dateOfBirth(java.util.Date),department(String),designation(String) and Salary(double).

Create respective getter and setter methods and constructors (no-argument constructor and parameterized constructor) for the same.

Create an object of the Employee class and save this object in a file called "data" using serialization.
Later using deserialization read this object and print the properties of this object.*/


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Employee implements Serializable{
	String name;
	String dob;
	String dept;
	String desig;
	double salary;
	
	
	public Employee() {
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}

public class ObjectSerialization1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee emp=new Employee();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Employee Details....");
		System.out.println("Name:");
		emp.setName(scan.nextLine());
		System.out.println("Date Of Birth (dd/mm/yyyy):");
		emp.setDob(scan.nextLine());
		System.out.println("Department:");
		emp.setDept(scan.nextLine());
		System.out.println("Designation:");
		emp.setDesig(scan.nextLine());
		System.out.println("Salary:");
		emp.setSalary(scan.nextDouble());
		
		//String fileLocation="D:\data.ser";
		FileOutputStream fos=new FileOutputStream("data.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp);
		oos.close();
		
		FileInputStream fis=new FileInputStream("data.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee emp2= (Employee) ois.readObject();
		ois.close();
		
		System.out.println("\n\nDeserialized Object ....");
		System.out.println("Name: "+emp2.getName());
		System.out.println("DoB: "+emp2.getDob());
		System.out.println("Department: "+emp2.getDept());
		System.out.println("Designation: "+emp2.getDesig());
		System.out.println("Salary: "+emp2.getSalary());
		
		scan.close();
		

	}

}
