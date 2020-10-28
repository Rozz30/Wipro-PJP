package service;
import exception.*;
import bean.*;

public class StudentReport {
	public String findGrade(Student studentObject) {
		int[] m=studentObject.marks;
		int sum=0;
		String grade=null;
		for(int i=0;i<m.length;i++) {
			if(m[i]<35) {
				return "F";
			}else {
				sum=sum+m[i];
			}
		}
		if(sum<=150) {
			grade= "D";
		}else if(sum>150 && sum<=200) {
			grade= "C";
		}else if(sum>200 && sum<=250) {
			grade= "B";
		}else if(sum>250 && sum<=300) {
			grade= "A";
		}
		return grade;
	}
	public String validate(Student studentObject)throws NullStudentException, NullNameException, NullMarksArrayException{
		if(studentObject.marks==null) {
			throw new NullMarksArrayException();
		}else if(studentObject.name == null && studentObject.marks==null) {
			throw new NullStudentException();
		}else if(studentObject.name==null) {
			throw new NullNameException();
		}
		return findGrade(studentObject);
	}


}
