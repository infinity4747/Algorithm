import java.util.*;
public final class Robot {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		String r=input.next();
		char[] arr=r.toCharArray();
		int R=0;
		int D=0;
		int U=0;
		int L=0;
		for (int i=0;i<n ;i++ ) {
			switch(arr[i]){
				case 'R':
					R++;
					break;
				case 'U':
					U++;
					break;
				case 'D':
					D++;
					break;
				case 'L':
					L++;
					break;
			}
		}
		int count=(Math.min(L,R)+Math.min(D,U))*2;
		System.out.print(count);
	}
}