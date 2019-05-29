package Prob2A.extpackage;

import Prob2A.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Bob");
		student.getGradeReport().SetGrade("A");
		
		System.out.println("Bob's grade report: " + student.getGradeReport().getGrade());
		
		GradeReport report = student.getGradeReport();
		System.out.println("Owner of grade report: " + report.getOwner());
	}

}
