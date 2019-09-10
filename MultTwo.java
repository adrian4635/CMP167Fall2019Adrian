/**
 * 
 * @author Adrian Perez
 *
 */
import java.util.Scanner;
public class MultTwo {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		//1-- Introduce the program
		System.out.print("Welcome, this program generates the product of 2 numbers");
		
		//2. Ask user for input
		System.out.println("Enter two numbers");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		//3.Calculate
		int result = num1*num2;
		
		//4.Display the result
		System.out.print = ("Result is " + result);
		

}
}
