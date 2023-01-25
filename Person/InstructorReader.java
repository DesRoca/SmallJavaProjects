import java.util.*;
import java.io.*;

public class InstructorReader {
	
	public static void main(String[] args) throws IOException {
		
		Instructor[] instructors = new Instructor[10];
		File f = new File("instructors.txt");
		Scanner in = new Scanner(f);
		
		int count=0;
		while(in.hasNext()) {
			String first = in.next();
			String last = in.next();
			int birthYear = in.nextInt();
			double salary = in.nextDouble();
			String name= first+ " "+ last;
			instructors[count]= new Instructor (name,birthYear,salary);
			count++;
		}
		
		in.close();
		for (int i=0; i< instructors.length; i++)
			System.out.println(instructors[i]);
		
	}

}
