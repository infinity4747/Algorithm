import java.util.*;
import java.io.*;
public class MSD {
	public static void main(String[] args)throws Exception {
		File file=new File("london_white_txt.txt");
		Scanner input=new Scanner(file);
		
		ArrayList<String> list=new ArrayList<>();
		int j=0;
		while(input.hasNext()){
			list.add(input.next().replaceAll("[^a-zA-Z]+",""));
		}
		String[] arr=new String[list.size()];
		for (int i=0;i<list.size() ;i++ ) {
			arr[i]=list.get(i);
		}
		String[] aux=new String[arr.length];
		long startTime = System.currentTimeMillis();
		sort(arr,aux,0,arr.length-1,0);
		long totalTime = System.currentTimeMillis() - startTime;
		System.out.print(totalTime);
	}
	public static void sort(String[] a,String[] aux,int lo,int hi,int d){
		int R=256;
		if (hi<=lo) {
			return;
		}
		int[] count=new int[R+4];
		for (int i=lo;i<=hi ;i++ ) {
			count[charAt(a[i],d)+2]++;
		}
		for (int r=0;r<R+1 ;r++ ) {
			count[r+1]+=count[r];
		}
		for (int i=lo;i<=hi ;i++ ) {
			aux[count[charAt(a[i],d)+1]++]=a[i];
		}
		for (int i=lo;i<=hi ;i++ ) {
			a[i]=aux[i-lo];
		}
		for (int r=0;r<R ;r++ ) {
			sort(a,aux,lo+count[r],lo+count[r+1]-1,d+1);
		}
	}
	private static int charAt(String s, int d) {
 		if (d < s.length())
 			return s.charAt(d);
 		else 
 			return -1;
 	}
}