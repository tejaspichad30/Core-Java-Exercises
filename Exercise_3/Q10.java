package Exercise_3;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// 10. WAP to calculate the value of given expression:  a*b/a-b  and  (a*b)/(a-b)?
		//(Hint : In Java Operator priority will be followed (left to right) here */% > -+ )
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter second number : "); 
		int b = sc.nextInt();
		
		int result = (a*b/a-b);       
		int result1 = (a*b)/(a-b);
									
		
		System.out.println("The output of (a*b/a-b) is : "+ result);
		System.out.println("The output is (a*b)/(a-b) is : "+ result1);
	}

}
