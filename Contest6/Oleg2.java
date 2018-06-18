import java.util.*;
public final class Oleg2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int[] arr = new int[n];
		long sum = 0,min=1000000000;
		boolean b = true;
		for(int i=0;i<n;i++){
			arr[i] = input.nextInt();
			min=Math.min(min,arr[i]);
		}
		for(int i=0;i<n;i++){
			if((arr[i]-min)%k==0)
				sum+=(arr[i]-min)/k;
			else{
				b = false;
				break;
			}
		}	
		System.out.print(b?sum:-1);
	}
}