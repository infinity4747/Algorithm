import java.util.*;
public final class Oleg {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int n=input.nextInt();
		int k=input.nextInt();
		int[] arr=new int[n];
		long s=0;
		for (int i=0;i<n ;i++ ) {
			arr[i]=input.nextInt();
		}
		int min=arr[0];
		for (int i=0;i<n ;i++ ) {
			if (min>arr[i]) {
				min=arr[i];
			}
		}

		for (int j=0;j<n ;j++ ) {
			if (arr[j]!=min){
				arr[j]-=min;
				s+=arr[j];
			}
		}
		if (arr.length!=1 ) {			
			System.out.print(s/k<1?-1:s/k);
		}
		else {
			System.out.print(0);
		}
	}
}