package Prob2A;

public class GradeReport {
	private String grade;
	private Student owner;
	GradeReport(Student student) {
		owner = student;
	}
	public void SetGrade(String grade) {
		this.grade = grade;
	}
	public String getGrade() {
		return this.grade;
	}
	public Student getOwner() {
		return owner;
	}
}
