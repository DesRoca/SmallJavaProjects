import java.util.*;
import java.io.*;
public class DataReader {

	public static void main(String[] args) throws IOException {
	
		File f = new File("names.txt");
		Scanner in = new Scanner(f);
		
		while(in.hasNext()) {
			String name = in.nextLine();
			System.out.println(name);
		}
		
		in.close();
		
	}

}
