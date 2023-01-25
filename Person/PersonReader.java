import java.util.*;
import java.io.*;
public class PersonReader {

	public static void main(String[] args) throws IOException {
		Person[] people= new Person[10];
		File f = new File("person.txt");
		Scanner in= new Scanner(f);
		
		int count=0;
		while(in.hasNext()) {
			String first= in.next();
			String last= in.next();
			String name= first+" "+last;
			int birthYear= in.nextInt();
			
			if(in.hasNextDouble()) {
				double salary= in.nextDouble();
				people[count]=new Instructor(name,birthYear,salary);
			}
			else {
				String major= in.next();
				people[count]=new Student(name,birthYear,major);
			}
			count++;
		}
		in.close();
		for (int i=0; i< count; i++)
			System.out.println(people[i]);
		
		for (int i=0; i< count; i++) {
			if (people[i] instanceof Instructor)
				((Instructor)people[i]).setSalary(100000);
		}
		System.out.println("After raises: ");
		for (int i=0; i< count; i++)
			System.out.println(people[i]);
	}

}
