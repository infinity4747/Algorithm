import java.util.*;
public final class  Sherlock  {
	public static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		int T=input.nextInt();
		boolean[] arr=new boolean[T];
		for (int i=0;i<T ;i++ ) {
			int n=input.nextInt();
			arr[i]=elements(n);
		}
		for (int i=0;i<T ;i++ ) {
			System.out.println(arr[i]?"YES":"NO");
		}
	}
	public static boolean elements(int n){
		int[] arr=new int[n];
		int countLeft=0;
		int countRight=0;
		for (int i=0;i<n ;i++ ) {
			arr[i]=input.nextInt();
            countRight += arr[i];
        }
     
        for(int j=0; j<arr.length; j++){
            if(countLeft == countRight - arr[j]-countLeft){
                return true;
            }
            countLeft += arr[j];
        }
		return false;
	}
	
}