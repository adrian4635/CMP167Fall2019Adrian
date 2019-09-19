/**
 * 
 * @author Adrian
 * @description This program checks the user's age and sees if the user can drink alcohol
 */

import java.util.Scanner;

public class Unit4 {
	public static void main(String[] args) {
		int age;
		String name;
		Scanner in = new Scanner(System.in);
		
		//input
		System.out.println("This program will check if you are legal to drink alcohol");
		System.out.print("Enter you name: ");
		name = in.next();
		System.out.printf("OK %s, Enter your age: ", name);
		age = in.nextInt();
		
		//logic
		if(age >= 21) {
			System.out.println("You can drink alcohol");
		}else {
			
			//outpout
			System.out.println("You can't drink alcohol");
		}
		
		
	}

}
