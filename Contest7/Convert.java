import java.util.*;
public final class Convert {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int a= input.nextInt();
		int b=input.nextInt();
		ArrayList<Integer> stack = new ArrayList<>();
		while(b>a){
			stack.add(b);
			if(b%2==0){
				b/=2;
			}
			else if(b%10==1){
				b/=10;
			}
			else
				break;
		}
		if (a!=b) {
			System.out.print("NO");
		}
		else{
			System.out.println("YES");
			System.out.println(stack.size()+1);
			System.out.print(a+"   ");
			for (int i=stack.size()-1;i>=0 ;i-- ) {
				System.out.print(stack.get(i)+"   ");
			}
		}

	}
}