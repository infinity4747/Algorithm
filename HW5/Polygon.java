import java.util.*;
public class Polygon{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("How many side of your polygon? ");
		int n=input.nextInt();
		
		double[] xarr=new double[2*n];
		double[] yarr=new double[2*n];
		for(int i=0;i<n;i++){
			System.out.print("X axis of "+i+" ");
			xarr[i]=input.nextDouble();
			System.out.print("Y axis of "+i+" ");
			yarr[i]=input.nextDouble();
		}
		int area1=Area(xarr,yarr,n);
		System.out.println("First version  "+Math.abs(area1));
		System.out.println("Second version  "+Math.ceil(Heron(xarr,yarr,n)));
	}
	public static int Area(double[]x,double[]y,int n){
		int area=0;
		int i=0;
		x[n]=x[0];
		y[n]=y[0];
		while(i!=n+1){
			area+=x[i]*y[i+1]-y[i]*x[i+1];
			i++;
		}
		return area/2;
	}	
	public static double Heron(double[]x,double[]y,int n){
		double halfx=0;
		double halfy=0;
		double subArea=0;
		double p=0;
		for(int i=0;i<n;i++){
			halfx+=x[i];
			halfy+=y[i];
		}
		halfy=halfy/n;
		halfx=halfx/n;
		for(int j=0;j<n;j++){
			double a=Line(x[j],x[j+1],y[j],y[j+1]);
			double b=Line(x[j],halfx,y[j],halfy);
			double c=Line(x[j+1],halfx,y[j+1],halfy);
			p=(a+c+b)/2;
			subArea+=(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
		}
		return  subArea;	
	}
	public static double Line(double x1,double x2,double y1,double y2){
		double line=Math.abs(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		return Math.sqrt(line);
	}
}