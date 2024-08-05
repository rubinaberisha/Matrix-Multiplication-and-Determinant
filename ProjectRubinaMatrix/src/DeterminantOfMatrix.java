
import java.util.Scanner;

public class DeterminantOfMatrix {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		
		int rows, columns, x, y, z, determinant = 0;
		
		sc= new Scanner(System.in);
		
		System.out.println("Please Enter the 3 * 3 Matrix Elements: ");
		for(rows = 0; rows < 3; rows++) {
			for(columns = 0; columns < 3; columns++) {
				arr[rows][columns] = sc.nextInt();
			}		
		}
		
		x = (arr[1][1] * arr[2][2]) - (arr[2][1] * arr[1][2]);
		y = (arr[1][0] * arr[2][2]) - (arr[2][0] * arr[1][2]);
		z = (arr[1][0] * arr[2][1]) - (arr[2][0] * arr[1][1]);
		
		determinant = (arr[0][0] * x)- (arr[0][1] * y) + (arr[0][2] * z);

		System.out.println("The Determinant of 3 * 3 Matrix = " + determinant );
	}
}