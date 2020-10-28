package Inheritance3;

public class SchoolApplication {

	public static void main(String[] args) {
		Person p1=new Person("Rozario","01/01/1998");
		Teacher t1=new Teacher("Jaisankar","02/02/1998",50000,"Mathematics");
		Student s1= new Student("Dhilip","03/03/1998","412716106030RP");
		CollegeStudent c1=new CollegeStudent("Prince","04/04/1998","412716106030RP","TEC","Fourth");
		p1.personDisplay();
		t1.teacherDisplay();
		s1.studentDisplay();
		c1.collegeStudentDisplay();
		c1.personDisplay();
	}

}
