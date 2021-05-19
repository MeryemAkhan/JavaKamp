package odev2;

public class Instructor extends User {

	String about;
	int phoneNumber;
	
	public Instructor(int id, String firstName, String lastName, String email, String about, int phoneNumber) {
		super(id, firstName, lastName, email);
		this.about = about;
		this.phoneNumber = phoneNumber;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
