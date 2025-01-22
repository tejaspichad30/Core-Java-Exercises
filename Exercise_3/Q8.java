package Exercise_3;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
/* 8. Write a Java program that reads a number in inches and converts it to meters. 
Note: One inch is 0.0254 meter.

Test Data
Input a value for inch: 1000
Expected Output :
1000.0 inch is 25.4 meters */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number(in inches) : ");
		float a = sc.nextFloat();
		
		float result = (a * 0.0254f);
		
		System.out.println(a+ " in meters is : " + result);
		
	}

}
