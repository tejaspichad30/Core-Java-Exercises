package Exercise_6;
//Star Pattern with Zigzag
public class p19 {
	 public static void main(String[] args) {
	        int n = 5; // Number of rows
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (i % 2 == 0) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}