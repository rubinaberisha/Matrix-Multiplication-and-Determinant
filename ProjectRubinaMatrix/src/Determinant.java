public class Determinant
{

	public static void main(String[] args)
	{
	
	 int[][] matrix2x2 = {{1,2},
	                      {3,4}};
	 int[][] matrix3x3 = {{1,4,7},
	                     {2,5,8},
	                    {3,6,9}};
	 int[][] matrix4x4 = {{1,2,3,4},
	                     {0,5,6,7},
	                     {0,0,8,9},
	                     {0,0,0,10}};
	 int[][] matrix5x5 = {{5,2,0,0,-2},
	                     {0,1,4,3,2},
	                     {0,0,2,6,3},
	                     {0,0,3,4,1},
	                     {0,0,0,0,2}};
	
	int determinant = findDeterminant(matrix2x2);
	printDeterminant(matrix2x2, determinant);
	
	determinant = findDeterminant(matrix3x3);
	printDeterminant(matrix3x3, determinant);
	
	determinant = findDeterminant(matrix4x4);
	printDeterminant(matrix4x4, determinant);
	
	determinant = findDeterminant(matrix5x5);
	printDeterminant(matrix5x5, determinant);
	}
	
	
	public static int findDeterminant(int[][] matrix)
	{

	 int size = matrix.length;
	 int determinant = 0;
	
	 for (int i = 0; i < size; i++)
	{
	
	 if (size > 2)
	{
	 int[][] nextMatrix = deleteRowAndColumn(i, 0, matrix);
	//Laplace expansion
	determinant += matrix[i][0] * Math.pow(-1, i)* findDeterminant(nextMatrix);
	}
	
	 else if (size == 2)
	{
	  determinant = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
	}
	}
	return determinant;
	}
	
	
	public static int[][] deleteRowAndColumn(int row, int column,
			int[][] matrix)
			{
			int oldSize = matrix.length;
			int newSize = matrix.length - 1;
			
			int[][] tempMatrix = new int[newSize][oldSize];
			
			for (int i = 0; i < row; i++)
			{
			  for (int j = 0; j < oldSize; j++)
			 {
			  tempMatrix[i][j] = matrix[i][j];
			 }
			}
			for (int i = row; i < newSize; i++)
			{
			  for (int j = 0; j < oldSize; j++)
			 {
			  tempMatrix[i][j] = matrix[i+1][j];
			 }
			}
			int[][] newMatrix = new int[newSize][newSize];
			for (int i = 0; i < newSize; i++)
			{
			  for (int j = 0; j < column; j++)
			 {
			  newMatrix[i][j] = tempMatrix[i][j];
			 }
			}
			for (int i = 0; i < newSize; i++)
			{
			  for (int j = column; j < newSize; j++)
			 {
			newMatrix[i][j] = tempMatrix[i][j+1];
			 }
			}
			return newMatrix;
			}
	
 public static void printDeterminant(int[][] matrix, int determinant)
{

   int size = matrix.length;

   String print = "The determinant of the " + size + "x" + size + " matrix: ";

   int numSpaces = print.length();
   String spaces = "";
     for (int i = 0; i < numSpaces; i++)
{
    spaces += " ";
}

 for (int i = 0; i < matrix.length; i++)
{
    print += matrix[0][i] + " ";
}

    print += "is: " + determinant + "\n" + spaces;

    for (int i = 1; i < matrix.length; i++)
{
      for (int j = 0; j < matrix.length; j++)
{
     print += matrix[i][j] + " ";
}
     print += "\n" + spaces;
}

    System.out.println(print);
  }
}

		