
public class PersonTester {
	
	public static void main(String[] args) {
		person p = new person("Mary Smith", 1998);
		Instructor i = new Instructor("John Jones", 1978, 70000);
		Student s = new Student("Junior Gamarra", 2000, "CS");
		
		System.out.println("Person p: " + p);
		System.out.println("Instructor i: " + i);
		System.out.println("Student s: " + s);
		
		i.setName("Jonathan Jones");
		System.out.println("Instructor i: " + i); //i.toString is not necessary
		
		s.setMajor("IT");
		System.out.println("Student s: " + s);
		
		String x = "Susan Smith, 2001";
		
		printAge(p);
		printAge(i);
		printAge(s);
		
		//Cannot do that
		//printAge(x);
		
		public static void printAge(person p) {
			int age = 2019 - p.getBirthYear();
			System.out.println(p.getName() + " is or will be " + age + " years old this year.");
		}
		
	}

}
