import java.util.Scanner;

public class DeterminantOfMatrix2 {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int[][] arr = new int[2][2];
		
		int rows, cols, determinant = 0;
		
		sc= new Scanner(System.in);
		
		System.out.println("Please Enter the 2 * 2  Matrix Elements :  ");
		for(rows = 0; rows < 2; rows++) {
			for(cols = 0; cols < 2; cols++) {
				arr[rows][cols] = sc.nextInt();
			}		
		
		  
		
		determinant = (arr[0][0] * arr[1][1]) - (arr[0][1] * arr[1][0]);

		System.out.println("The Determinant of 2 * 2 Matrix = " + determinant );
		}
	}
}
