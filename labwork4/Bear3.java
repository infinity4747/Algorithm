import java.util.*;
public final class Bear3 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		int d=input.nextInt();
		int h=input.nextInt();
		if (d>2*h||(d==1&&h==1&n>2)) {
			System.out.print(-1);
		}
		else {
			if (d==h) {
				for (int i=1;i<d+1 ;i++ ) {
					System.out.println(i+"  "+(i+1));
				}
				for (int i=d+2;i<n+1;i++ ) {
					System.out.println(2+"  "+i);
				}
			}
			else{
				for (int i=1;i<h+1 ;i++ ) {
					System.out.println(i+"  "+(i+1));
				}
				for (int i=h+1;i<d+1;i++ ) {
					if (i==h+1) {
						System.out.println("1  "+(i+1))	;
					}
					else {
						System.out.println(i+"  "+(i+1));
					}
				}
				for (int i=d+2;i<n+1 ;i++ ) {
					System.out.println(1+"  "+i);
				}
			}
		}
	}
}