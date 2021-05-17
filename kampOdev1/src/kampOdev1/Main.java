package kampOdev1;

public class Main {

	public static void main(String[] args) {
		
		//�zellik nesnesi olarak course �rne�i..
		//course nesnesi olu�turup �zelliklerinin tan�mlanmas�..
		Course course1 = new Course();
		course1.id=1;
		course1.name="Programlamaya Giri� ��in Temel Kurs";
		course1.unitPrice = 0.00;
		course1.instructor = "Engin Demiro�";
		course1.detail = "Yeni �grenenler i�in g�zel ba�lang��.";
		
		Course course2 = new Course(2, "Java Kamp�", "Engin Demiro�",0.00,"�� imkan�n varr..");
		Course course3 = new Course(3, "C# Kamp�", "Engin Demiro�",0.00,"Ger�ek hayatla ili�kilendirilmi� c# ile programlamaya giri�..");

		//�zellik nesnesi olarak category �rne�i..
		//category nesnesi olu�turup �zelliklerinin tan�mlanmas�..
		Category category1 = new Category(1, "Programlama");
		Category category2 = new Category(2, "Kurslar�m");
		Category category3 = new Category(2, "Kampa Haz�rl�k");

		
		//course nesnelerinin diziye at�l�p listelenmesi..
		Course[] courses = { course1, course2, course3 };
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		//category nesnelerinin diziye at�l�p listelenmesi..
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
