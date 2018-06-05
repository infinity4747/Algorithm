import java.util.*;
public class Zero{
	public static void main(String[]args){
		Scanner input= new Scanner(System.in);
		String number=input.next();
		int count=0;
		Set<Integer> set=new LinkedHashSet<>();
		for(int i=0; i<number.length();i++){
			if(number.charAt(i)=='0'){
				count++;
			}
			else{
				set.add(count);
				count=0;
			}
		}
		set.add(count);
		TreeSet sortedSet = new TreeSet<Integer>(set);
		System.out.print((Integer)sortedSet.last());
	
	}
}

