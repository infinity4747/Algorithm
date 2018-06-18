import java.util.*;

public class Power {
	public static void main(String [] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=in.nextInt();
		HashMap<Long, Integer> data = new HashMap<Long, Integer>();
	    long count = 0;
	    for (int i = 0; i < n; ++i) {
	      long x = arr[i];
	      for (long pow = 1; pow <= Integer.MAX_VALUE; pow *= 2)
	        if (data.containsKey(pow - x))
	          count += data.get(pow - x);
	      if (!data.containsKey(x))
	        data.put(x, 0);
	      data.put(x, data.get(x) + 1);
	    }
	    System.out.println(count);
		
	}

}