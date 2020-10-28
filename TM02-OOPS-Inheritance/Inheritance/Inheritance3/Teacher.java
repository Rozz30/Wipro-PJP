package Inheritance3;

public class Teacher extends Person{
	double salary;
	String subject;
	Teacher(String name,String dob,double salary,String subject){
		super(name,dob);
		this.salary=salary;
		this.subject=subject;
	}
	void teacherDisplay() {
		System.out.println("Teacher-->");
		System.out.println("Name:"+name+"\tDOB:"+dob+"\tSalary:"+salary+"\tSubject:"+subject);
	}
}
