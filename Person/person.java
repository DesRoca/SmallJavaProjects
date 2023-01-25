
public class person {
	
	//Instance Variables
	private String name;
	private int birthYear;
	
	public person() {
		name = "";
		birthYear = 0;
	}
	
	//Overloaded(parameterized) constructor
	public person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	
	//Getters
	public String getName() {
		return name;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	//Setters(Mutators)
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	//Other methods 
	@Override
	public String toString() {
		return "Name: " + name + "; Birth Year: " + birthYear;
	}
	
	@Override
	public boolean equals(Object obj) {
		person p2 = (person) obj;
		if(name.equals(p2.getName()) && birthYear == p2.getBirthYear())
			return true;
		
		return false;
	}
	
	//We can add a main method to an object class that we've written to more easily test the class as we're writing it
	//Typically, this main method would be removed before we use the object class in its main purpose(i.e, in a larger program)
	public static void main(String[] args) {
		person p = new person("Mary Smith", 1982);
		System.out.println(p);
		p.setBirthYear(1983);
		System.out.println(p);
	}
}
