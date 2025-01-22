package Exercise_3;

public class Q9 {

	public static void main(String[] args) {
		// 9. WAP to swap values of 2 numbers without using third variables?
		
		int a = 10;
		int b = 20;
		
		System.out.println("Number before swapping : a = "+a + ", b = " + b);
		
		// Swap values without using a third variable
        a = a + b; // a now holds the sum of a and b                  a= 30
        b = a - b; // b is now assigned the original value of a       b=10
        a = a - b; // a is now assigned the original value of b       a=20
		
		System.out.println("Number after swapping : a = "+a + ", b = " + b);

	}

}
