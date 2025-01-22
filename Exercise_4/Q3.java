package Exercise_4;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
/*3. Switch Case for Weather Advisory
 Create a program that provides weather advisors based on the weather condition.
Use a switch statement to provide advisors for: 
1: "Sunny - Stay hydrated."
2: "Rainy - Carry an umbrella."
3: "Snowy - Wear warm clothes."
4: "Windy - Secure loose items."
If the number is not between 1 and 4, print "Invalid weather condition."*/
		
		
		System.out.println("---------- Switch Case for Weather Advisory ------------");
		System.out.println("");
		System.out.println("1. Sunny  \n2. Rainy  \n3. Snowy  \n4.Widy");
		System.out.println("");
		int weathercondition;
		String weatherName;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a weather condition(1-4) : ");
		weathercondition=sc.nextInt();
		
		//switchcase for weather
		switch(weathercondition)
		{
		case 1 :
		{
			System.out.println("Sunny : Stay hydrated.");
			break;
		}
		case 2 :
		{
			System.out.println("Rainy : Carry an umbrella.");
			break;
		}
		case 3 :
		{
			System.out.println("Snowy - Wear warm clothes.");
			break;
		}
		case 4 :
		{
			System.out.println("Windy : Secure loose items.");
			break;
		}
		
		default :
		{
			System.out.println("Invalid weather condition");
		}
		
		}

	}

}