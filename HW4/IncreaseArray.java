import java.util.*;
public class IncreaseArray{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int n=input.nextInt();
		int[] Arr= new int[n];
		Stack<Integer> stack=new Stack<>();
			for(int i=0;i<n;i++){
				Arr[i]=input.nextInt();
			}
			for(int j=0;j<n;j++){

				while(!stack.empty()&&Arr[stack.peek()]<Arr[j]){
					int x=stack.pop();
					Arr[x]=Arr[j];
				}
					stack.push(j);
				}
				while(!stack.empty()){
					int x=stack.pop();
					Arr[x]=0;
				}
			for (int c=0;c<n;c++ ) {
				System.out.print(Arr[c]);
				
			}
	}	
}