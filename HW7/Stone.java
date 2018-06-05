import java.util.*;
public class Stone{
	public static void main (String [] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int w=input.nextInt();
		int p[]=new int[n];
		int a[][]=new int[n][w+1];
		for(int i=0;i<n;i++){
			p[i]=input.nextInt();
		}
		for(int i=p[0];i<w+1;i++){
			a[0][i]=p[0];
		}
		for(int i=1;i<n;i++){
			for(int j=0;j<w;j++){
				if(j-p[i]>=0){
					a[i][j]=Math.max(a[i-1][j],a[i-1][j-p[i]]+p[i]);
				}
				else
					a[i][j]=a[i-1][j];
			}
		}
		int max=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<w;j++){
				if(max<a[i][j])
					max=a[i][j];
			}
		}
		System.out.println("Max is "+ max);
}
}