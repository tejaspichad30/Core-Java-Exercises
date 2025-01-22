package Exercise_5;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10; // Number of terms in the Fibonacci sequence
        int a = 0, b = 1;

        System.out.print("Fibonacci Sequence: ");
        // Generate Fibonacci sequence using a for loop
        for (int i = 0; i < n; i++) {
            System.out.print(a + " "); // Print current term
            int next = a + b; // Calculate next term
            a = b; // Update a
            b = next; // Update b
        }
	}

}
