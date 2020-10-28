package Inheritance3;

public class Student extends Person{
	String stuID;
	Student(String name,String dob,String stuID){
		super(name,dob);
		this.stuID=stuID;
	}
	void studentDisplay() {
		System.out.println("Student-->");
		System.out.println("Name:"+name+"\tDOB:"+dob+"\tStudentID:"+stuID);
	}
}
