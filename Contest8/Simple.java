import java.util.*;
public final class Simple{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int n=input.nextInt();
		int q=input.nextInt();
		input.nextLine();
		int[] arr=new int[q*3];
		String s=input.nextLine();
		for (int c=0;c<q ;c++ ) {
			int i=input.nextInt();
			arr[c]=i;
			int j=input.nextInt();
			arr[c+1]=j;
			int k=input.nextInt();
			arr[c+2]=k;
		}
		String rev="";
		for (int c=0;c<q ;c++ ) {
			rev=sort(s,arr[c+2],arr[c],arr[c+1]);
		}
		System.out.print(rev);

	}
	/*public static String sort(String s,int k,int a,int b){
		char[] charArr=s.toCharArray();
		char temp='a';
		if(k==1){
			for (int i=a;i<b ;i++ ) {
				for (int j=a+1;j<b ;j++ ) {
					if(charArr[i]>charArr[j]){
						temp = charArr[i];
						charArr[i] = charArr[j];
						charArr[j] = temp;
					}
				}
			}
		}
		else {
			for (int i=a;i<b ;i++ ) {
				for (int j=a+1;j<b;j++ ) {
					if(charArr[i]<charArr[j]){
						temp = charArr[i];
						charArr[i] = charArr[j];
						charArr[j] = temp;
					}
				}
			}
		}
		String str = String.valueOf(charArr);
		return str;
	}*/
}