import java.util.*;
import java.io.*;
public class Three_way {
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
		sort(arr,0,arr.length-1,0);
		long totalTime = System.currentTimeMillis() - startTime;
		System.out.print(totalTime);
	}
	public static void sort(String[] a,int lo,int hi,int d){
		if(hi<=lo) return;
		int lt=lo,gt=hi;
		int v=charAt(a[lo],d);
		int i=lo+1;
		while(i<=gt){
			int t=charAt(a[i],d);
			if(t<v)
				exch(a,lt++,i++);
			else if (t>v) 
				exch(a,i,gt--);
			else 
				i++;
		}
		sort(a,lo,lt-1,d);
		if (v>=0) sort(a,lt,gt,d+1);
		sort(a,gt+1,hi,d);

	}
	private static void exch(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    private static int charAt(String s, int d) { 
        if (d == s.length()) return -1;
        else return s.charAt(d);
    }
}