package Exercise_2;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		/*Q4. WAP to print area of circle 
		 * (A=pi*r^2 where pi=3.141)?
		 */
		
		int radius;
		double result;
		
		//scanner class used for user input
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the radius : ");
		radius=sc.nextInt();
		
		result=3.141*radius*radius;
				
		System.out.println("The area of circle is : "+result);
		
		
	}

}
