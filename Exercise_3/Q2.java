package Exercise_3;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
// Q2. Implement a program that checks if a number is positive, negative, or zero 
// using relational operators.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		String result = (number > 0) ? "The number is positive." :
						(number < 0) ? "The number is negative." :
						"The number is zero";
		
		System.out.println("Result :" + result);
	
	}

}
