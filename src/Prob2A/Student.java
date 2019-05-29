package Prob2A;

public class Student {
	private String name;
	private GradeReport gradeReport;
	public Student(String name){
		this.name = name;
		gradeReport = new GradeReport(this);
	}
	public String getName() {
		return this.name;
	}
	public GradeReport getGradeReport() {
		return gradeReport;
	}
	public String toString() {
		return name;
	}
}
