package Exercise_3;

public class Q1 {

	public static void main(String[] args) {
      //	Q1. WAP to swap values of 2 numbers using third variable?
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before swapping: a = " + a + ", b = " + b);
		
		int c = a;
		a = b;
		b = c;
		
		System.out.println("After swapping : a = "+ a + ", b = "+ b);

	}

}
