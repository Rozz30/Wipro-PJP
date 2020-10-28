package Inheritance2;

public class Employee extends Person {
	double annualSalary;
	int yearOfJoining;
	String insuranceNo;
	Employee(double salary,int year, String insurance){
		annualSalary=salary;
		yearOfJoining=year;
		insuranceNo=insurance;		
	}
	public void getEmployee() {
		System.out.println("Annual Salary  :"+annualSalary+"\nYear of Joining:"+yearOfJoining+"\nInsurance ID   :"+insuranceNo);
	}
}
