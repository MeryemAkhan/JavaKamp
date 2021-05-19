package odev2;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1, "meryem", "akhn", "akhn.mry@gmail.com", "Java", "yes");
		StudentManager studentManager = new StudentManager();
		studentManager.start(student);
		
		
		Instructor instructor = new Instructor(1, "Engin", "Demiroğ", " ", " ", 05555555);
		InstructorManager instructorManager = new InstructorManager();
	    instructorManager.about(instructor);
	    
	    UserManager userManager = new UserManager();
	    userManager.add(student);
	    userManager.update(instructor);

	}

}
