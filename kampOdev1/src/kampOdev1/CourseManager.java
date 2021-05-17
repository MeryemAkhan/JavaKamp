package kampOdev1;

public class CourseManager {

	public void Register(Course course) {
		System.out.println( course.name + "Kayýt baþarýlý. ");
	}
	
	public void Login(Course course) {
		System.out.println( course.name + "Giriþ yapýldý.");
	}
	
	public void Start(Course course) {
		System.out.println( course.name + "Dersine baþlandý. ");
	}
}
