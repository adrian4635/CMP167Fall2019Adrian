/**
 * 
 * @author Adrian
 *
 */
import java.util.Scanner;
import java.io.StringWriter;
import java.io.PrintWriter;


public class Task {

	public static void main(String[] args) {
		int age = 23;
		Scanner in = new Scanner(age);
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		
		
		pw.print("Adrian Perez");
		String name = sw.toString();
		
		System.out.printf("%s is 23", name);
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		

	}

}
