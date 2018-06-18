import java.util.*;
public final class LoveHash{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int p=input.nextInt();
		int n=input.nextInt();
		Hashtable<Integer, Integer> arr= new Hashtable<Integer, Integer>();
		int num=-1;
		for (int i=0;i<n;i++) {
			int x=input.nextInt();
			int col=x%p;

			if(arr.get(col)!=null){
				num=i+1;
				break;
			}
			else {
				arr.put(col,1);
			}
		}
		System.out.print(num==-1?-1:num);
	}
}