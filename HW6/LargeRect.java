import java.util.*;
public class LargeRect{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int y = in.nextInt();
		int x = in.nextInt();
		int[][] array = new int[y][x];
		
		for(int i=0;i<y;i++)
			for(int j=0;j<x;j++){
				array[i][j]=in.nextInt();
			}
		
		int max=array[0][0];
		
		for(int i=1;i<x;i++)
			array[0][i]+=array[0][i-1];
		for(int i=1;i<x;i++)
			array[i][0]+=array[i-1][0];
		for(int i=1;i<y;i++){
			for(int j=1;j<x;j++){
				array[i][j]=array[i-1][j]+array[i][j-1]-array[i-1][j-1];
				
			}	
		}
		
		System.out.println();
		print(array);
	}
	
	
	static void print(int[][] a){
		int max=a[0][0];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]+" ");
				if(max<a[i][j]){
					max=a[i][j];
				}
			}
			System.out.println();
		}
		System.out.println(" Sum: "+max);
	}
}