import java.util.*;
public class Museum{
	public static  void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int []arr=new int[n*2];
		Set <Integer> set= new HashSet<>();

		for(int i=0;i<n*2;i++){
			String s= input.next();
			int j=s.indexOf(":");
			String hours = s.substring(0, j);
			String minute =s.substring(j + 1);
			int second=Integer.parseInt(hours)*3600+Integer.parseInt(minute)*60;
			arr[i]=second;
		}
		int count=0;
		int time=0;
		for(int i=0;i<n*2;i++){
			if(i%2==0){
				time=arr[i];	
				count=0;
				for(int j=0;j<n*2;j++){
					if(j%2==0){
						if(arr[j]<=time && arr[j+1]>=time)
							count++;
			}
		}
	}
		set.add(count);
	}
	TreeSet sortedSet = new TreeSet<Integer>(set);
	System.out.print((Integer)sortedSet.last());
	
}
}
