
public class Student extends person {
	
private String major;
	
	public Student() {
		
		super(); 
		major = "";
		
	}
	
	public Student(String name, int birthYear, String major) {
		super(name, birthYear);
		this.major = major;
	}
	
	//Setters and Getters
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return super.toString() + "; Major: " + major;
	}


}
