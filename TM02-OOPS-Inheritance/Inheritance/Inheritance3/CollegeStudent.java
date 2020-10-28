package Inheritance3;

public class CollegeStudent extends Student {
	String collegeName;
	String year;
	CollegeStudent(String name,String dob,String stuID,String collegeName,String year){
		super(name,dob,stuID);
		this.collegeName=collegeName;
		this.year=year;		
	}
	void collegeStudentDisplay() {
		System.out.println("CollegeStudent-->");
		System.out.println("Name:"+name+"\tDOB:"+dob+"\tStudentID:"+stuID+"\tCollege:"+collegeName+"\tYear:"+year);
	}

}
