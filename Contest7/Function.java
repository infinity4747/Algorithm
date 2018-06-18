import java.util.*;
public final class Function {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int n=input.nextInt();
		long a=input.nextInt();
		long sum=0,min=0,max=0;
		long b=0;
		for (int i=1;i<n ;i++ ) {
			b=input.nextInt();
			if (i%2==0) {
				sum+=Math.abs(a-b)*(-1);	
			}
			else{
				sum+=Math.abs(a-b);
			}
			max=Math.max(sum,max);
			min=Math.min(sum,min);
			a=b;
		}
		System.out.print(max-min);
	}
}