import java.util.*;
public class Rectangle{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("The number of column");
		int column=input.nextInt();
		System.out.println("The number of row");
		int row=input.nextInt();
		int arr[][]=new int[row][column];
		int sum[][]=new int[row][column];
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<row;i++){
			for (int j=0;j<column ;j++) {
				arr[i][j]=input.nextInt();
			}
		}
		sum[0][0]=arr[0][0];
		for(int i=0;i<row;i++){
			if(i!=0){
				sum[i][0]=arr[i][0]+sum[i-1][0];
			}
			for (int j=0;j<column;j++ ) {
				if(i!=0 && j!=0){
					sum[i][j]=sum[i][j-1]+arr[i-1][j]+arr[i][j];
				}
				else if(i==0 && j!=0){
					sum[i][j]+=sum[i][j-1]+arr[i][j];
				}
			}
		}
		/*TreeSet sortedSet = new TreeSet<Integer>(set);
		System.out.print((Integer)sortedSet.last());*/
		for (int i=0;i<row;i++) {
			for (int j=0;j<column;j++) {
				System.out.print(sum[i][j]+" ");	
			}
			System.out.println();
			
		}
	}

	
}