package Exercise_14;

// Multidimensional Arrays 
// An array of arrays, allowing for more complex data structures.

public class A11 {

	public static void main(String[] args) {
		// Declare and initilize a 2D array 
		int [][] matrix = 
			{
					{1,2,3},
					{4,5,6},
					{7,8,9}
			};
		
		//Accesing elements in a 2D array 
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
				
		}

	}

}
