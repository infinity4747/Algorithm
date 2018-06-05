import java.util.*;
public class Find{
	public static void main(String[]args){
		Scanner input= new Scanner(System.in);
		long sum=input.nextLong();
		long prod=input.nextLong();
		long Disc=sum*sum-4*prod;
		if(Disc<0){
			System.out.print("NO SUCH NUMBER");
		}
		else{
			double x=(sum-Math.sqrt(Disc))/2;
			double y=(sum+Math.sqrt(Disc))/2;
			System.out.println(x+"  "+y);
		}

	}
}