/*Create a school application with a class called Person. Create name and dateOfBirth as member variables.
Create a class called Teacher that inherits from the Person class. The teacher will have additional properties like salary, and the subject that the teacher teaches.
Create a class called Student that inherits from Person class. This class will have a member variable called studentId. 
Create a class called College Student that inherits from Student class. This class will have collegeName, the year in which the student is studying (first/second/third/fourth) etc.
Create objects of each of this classes, invoke and test the methods that are available in these classes.
*/


package Inheritance3;

public class Person {
	String name;
	String dob;
	Person(String name,String dob){
		this.name=name;
		this.dob=dob;
	}
	void personDisplay() {
		System.out.println("Person-->");
		System.out.println("Name:"+name+"\tDOB:"+dob);
	}

}
