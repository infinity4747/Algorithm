import java.util.*;
public final class Box{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int arr[]=new int[n];
		int count=1;
		for (int i=0;i<n ;i++ ) {
			arr[i]=input.nextInt();
		}
		Arrays.sort(arr);
		for (int i=1;i<n ;i++ ) {
				if((arr[i-1]==arr[i])){
					count++;
				}	
			}
		
		System.out.print(count);
	}
}