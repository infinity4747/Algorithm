import java.util.*;
class Gold{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				arr[i][j]=input.nextInt();
			}
		}
		System.out.print("Give a point of start");
		int a1=input.nextInt();
		int a2=input.nextInt();
		int a=MaxGold(m,arr,n,a1,a2);
		System.out.println(a);

	}
	public static int MaxGold(int m,int arr[][],int n,int a1,int a2){
		int maximum=0;
		for(int i=a1;i<n;i++){
			for (int j=a2;j<m ;j++ ) {
				int right=j==m-1? 0 :arr[i][j+1];
				int rightUp=(j==m-1 || i==0 ? 0 : arr[i-1][j+1]);
				int rightDown=(i==n-1 || j==m-1? 0: arr[i+1][j+1]);
				arr[i][j]=arr[i][j]+Math.max(right,Math.max(rightUp,rightDown));
			}
		}
		for (int i=0;i<n ;i++) {
			for (int j=0;j<m;j++) {
				if(maximum<arr[i][j])
					maximum=arr[i][j];
			}
			
		}
		return maximum;

	}
}