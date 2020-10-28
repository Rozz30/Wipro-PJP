package bean;

public class Student {
	 public String name;
	 public int marks[];
	public Student(String name, int[] marks )
	{
		this.setName(name);
		this.setMarks(marks);
	}
	
	public Student() {
		
	}

	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int marks[]) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
