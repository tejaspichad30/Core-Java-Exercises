package Exercise_2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		//Q5. WAP to print area of a rectangle (A=width*height)?
		
		int height,width,result;
		//scanner class used for user input
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the height : ");
		height=sc.nextInt();
		
		System.out.println("Enter the width : ");
		width=sc.nextInt();
		
		result=height*width;
		
		System.out.println("Area of rectangle is : "+result);
		
	}

}
