package service;

import bean.Student;

public class StudentService {
	int nullMarks=0;
	int nullNames=0;
	int nullObjects = 0;
	public int findNumberOfNullMarks(Student data[]){
		for(int i=0;i<data.length;i++) {
			if(data[i].getMarks()==null) {
				nullMarks++;
			}
		}
		return nullMarks;
	}
	public int findNumberOfNullNames(Student data []){
		for(int j=0;j<data.length;j++) {
			if(data[j].getName()==null) {
				nullNames++;
			}
		}
		return nullNames;
	}
	public int findNumberOfNullObjects(Student data []){
		for(int k=0;k<data.length;k++) {
			if(data[k]==null) {
				nullObjects++;
			}
		}
		return nullObjects;
	}




}
