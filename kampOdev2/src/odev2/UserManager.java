package odev2;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName()+user.getLastName()+" baþarýyla kayýt edildi.");
	}
	public void signIn(User user) {
		System.out.println(user.getEmail()+" baþarýyla  giriþ yaptý.");
	}
	public void signOut(User user) {
		System.out.println(user.getEmail()+" baþarýyla çýkýþ yaptý.");
	}
	public void update(User user) {
		System.out.println(user.getId()+" baþarýyla güncellendi.");
	}
	public void delete(User user) {
		System.out.println(user.getEmail()+" baþarýyla silindi.");
	}
	 
}
