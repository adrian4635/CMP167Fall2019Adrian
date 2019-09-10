/**
 * 
 * @author Adrian Perez
 *
 */
import java.util.Scanner;
public class Addition {
	public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
	//1-- Introduce the program
	System.out.println("Welcome, this programs finds the sum of 3 numbers");
	
	//2-- Ask for user input
	System.out.println("Enter 3 numbers");
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	int num3 = input.nextInt();
	
	//3-- Calculate
	int result = num1 + num2 + num3;
	
	//Display the result
	System.out.print("The result is " + result);
	
}
}
