package odev2;

public class Student extends User{

	
	String courses;
	String membership;
	public Student(int id, String firstName, String lastName, String email, String courses, String membership) {
		super(id, firstName, lastName, email);
		this.courses = courses;
		this.membership = membership;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public String getMembership() {
		return membership;
	}
	public void setMembership(String membership) {
		this.membership = membership;
	}

	
}
