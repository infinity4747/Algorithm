import java.util.*;
public final class Volume {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		input.nextLine();  
		String s=input.nextLine();
		int a=0;
		String[] parts = s.split(" ");
		int[] arr=new int[parts.length];
		for (int i=0;i<parts.length;i++ ) {
			a=find(parts[i]);
			arr[i]=a;
		}
		Arrays.sort(arr);

		System.out.print(arr[parts.length-1]);
	}

	public static  int find(String s){
		char[] arr=s.toCharArray();
		int max=0;
		for (int i=0;i<arr.length ;i++ ) {
			if(arr[i]<'a'){
				max++;

			}
		}
		return max;
	}
}