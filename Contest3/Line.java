import java.util.*;
public final class Line{
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		int[] arr=new int[n];
		int count25=0;
		int count50=0;
		boolean f=true;
		for (int i=0;i<n ;i++) {
			arr[i]=input.nextInt();
		}
		for (int i=0;i<n ;i++ ) {
			if(arr[i]==25)
				count25++;
			else if(arr[i]==50){
				if(count25>=1){
					count25--;
					count50++;
				}
				else{
					f=false;
				}
			}
			else
				if(count50>=1 && count25>=1){
					count25--;
					count50--;
				}
				else if(count50==0 && count25>=3)
					count25-=3;
				else {
					f=false;
				}
		}
		System.out.print(f?"YES":"NO");

	}
}