/**
 * 
 * @author Adrian Perez
 *
 */
import java.util.Scanner;
public class Subtraction {
	public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
	//1-- Introduce the program
	System.out.println("Welcome, this program finds the difference between 5 numbers");
	
	//2-- Ask for user input
	System.out.println("Enter 5 numbers");
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	int num3 = input.nextInt();
	int num4 = input.nextInt();
	int num5 = input.nextInt();
	
	//3-- Calculate
	int result = num5 - num4 - num3 - num2 - num1;
	
	//4-- Display the result
	System.out.print("The result is " + result);
	
	
			
			
			

}
}
