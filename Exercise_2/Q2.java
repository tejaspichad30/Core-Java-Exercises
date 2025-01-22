package Exercise_2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		/* Q2.Write a simple calculator program that allows the user to perform addition, 
		 * subtraction, multiplication, and division on two numbers and take input from user.
		 */
		
		//addition of 2 numbers via user input
		
		int num1,num2,result,result1,result2,result3;
		
		//scanner class used for user input
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter value of num1 :");
		num1=sc.nextInt();
		
		System.out.println("Enter value of num2 :");
		num2=sc.nextInt();
		
		//calculation
		result=num1+num2;
		result1=num1-num2;
		result2=num1*num2;
		result3=num1/num2;
		
		System.out.println("Addition of 2 number is : "+result);
		System.out.println("Subtraction of 2 number is : "+result1);
		System.out.println("Multiplication of 2 number is : "+result2);
		System.out.println("division of 2 number is : "+result3);

				
	}

}
