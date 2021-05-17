package kampOdev1;

public class Course {

	//parametresiz constructor..
	public Course() {
		
	}
	//parametreli constructor..
    public Course(int id, String name, String instructor, double unitPrice, String detail) {
    	this();
    	this.id=id;
        this.name=name;
        this.instructor = instructor;
        this.unitPrice=unitPrice;
        this.detail=detail;
	}
	
	int id;
	String name;
	String instructor;
	double unitPrice; 
	String detail; 
}
