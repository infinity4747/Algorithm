import java.util.*;

public final class Browser {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		int pos=input.nextInt();
		int l =input.nextInt();
		int r=input.nextInt();
		int res=0;
		if(l==1 && r==n)
			res=0;
		else if(l==1)
			res=Math.abs(pos-r)+1;
		else if(r==n)
			res=Math.abs(pos-l)+1;
		else
			res=Math.min(Math.abs(pos-l),Math.abs(pos-r))+(r-l)+2;
		System.out.print(res);
	}
}