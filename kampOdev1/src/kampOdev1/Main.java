package kampOdev1;

public class Main {

	public static void main(String[] args) {
		
		//özellik nesnesi olarak course örneði..
		//course nesnesi oluþturup özelliklerinin tanýmlanmasý..
		Course course1 = new Course();
		course1.id=1;
		course1.name="Programlamaya Giriþ Ýçin Temel Kurs";
		course1.unitPrice = 0.00;
		course1.instructor = "Engin Demiroð";
		course1.detail = "Yeni ögrenenler için güzel baþlangýç.";
		
		Course course2 = new Course(2, "Java Kampý", "Engin Demiroð",0.00,"Ýþ imkanýn varr..");
		Course course3 = new Course(3, "C# Kampý", "Engin Demiroð",0.00,"Gerçek hayatla iliþkilendirilmiþ c# ile programlamaya giriþ..");

		//özellik nesnesi olarak category örneði..
		//category nesnesi oluþturup özelliklerinin tanýmlanmasý..
		Category category1 = new Category(1, "Programlama");
		Category category2 = new Category(2, "Kurslarým");
		Category category3 = new Category(2, "Kampa Hazýrlýk");

		
		//course nesnelerinin diziye atýlýp listelenmesi..
		Course[] courses = { course1, course2, course3 };
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		//category nesnelerinin diziye atýlýp listelenmesi..
		Category[] categories = { category1, category2, category3 };
		for (Category category : categories) {
			System.out.println(category.name);
		}
				
		CourseManager courseManager = new CourseManager();
		courseManager.Register(course1);
		courseManager.Login(course2);
		courseManager.Start(course3);
				
	}

}
