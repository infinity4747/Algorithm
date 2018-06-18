import java.util.*;
public final class  Max_Min{
	public static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		int n = input.nextInt();
		int k=input.nextInt();
		int[] list=new int[n];
		int min=Integer.MAX_VALUE;
		for (int i=0;i<n ;i++) {
			list[i]=input.nextInt();
		}
	 	Arrays.sort(list);
      for (int i = 0; i < n - k + 1; i++){
      	if (list[i+k-1]-list[i]<min) 
      		min = list[i+k-1]-list[i];
      }
      System.out.print(min);
	} 
}

		