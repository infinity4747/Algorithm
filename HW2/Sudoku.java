import java.util.*;
public class Sudoku{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int [][] arr= new int[n*n][n*n];
		boolean f= true;
		for(int i=0;i<(n*n);i++){
			for(int j=0;j<(n*n);j++){
				arr[i][j]=input.nextInt();
			}
		}
		for(int i =0;i<n*n;i++){
			for(int j=0;j<n*n;j++){
				for (int column = 0; column < n*n; column++)
			 		if (column != j && arr[i][column] == arr[i][j])
			 			f=false;
			 	for (int row = 0; row < n*n; row++)
			 		if (row != i && arr[row][j] == arr[i][j])
			 			f=false;
			 	for (int row = (i / n) * n; row < (i / n) * n + n; row++)
					for (int col = (j / n) * n; col < (j / n) * n + n; col++)
			 			if (( row != i || col != j) && arr[row][col] == arr[i][j])
							f=false;
					}
				}
		System.out.print(f);
	}
}