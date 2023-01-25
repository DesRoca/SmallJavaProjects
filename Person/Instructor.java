
public class Instructor extends person{
	
	//Instance Variables
	//name and birthYear are inherited
	//But. they cannot be accessed directly because they are private to Person
	//So, instead we must use the getters and setters(e.g., getName(), etc.)
	private double salary;
	
	//Constructors
	//Constructors are NOT inherited 
	//We have to write them for all subclasses, often calling the superclass constructor, using the keyword, "super"
	public Instructor() {
		//super calls the superclasses contructor, setting name and birthYear
		//super must be the first line of this constructor, will get an error if its not
		//super(); <- Not technically necessary, only works for default super call 
		salary = 0.0;
		
	}
	
	public Instructor(String name, int birthYear, double salary) {
		//calling super here is necessary
		super(name, birthYear);
		this.salary = salary;
	}
	
	//Setters and Getters
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//toString Method
	
	@Override
	public String toString() {
		return super.toString() + "; Salary: $" + salary;
	}

}
