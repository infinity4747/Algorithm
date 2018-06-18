import java.util.*;
public class Design {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String [] min = new String[n];
		String [] max = new String[n];
		for(int i=0;i<n;i++) {
			String s1 = input.next();
			String s2 = input.next();
			min[i] = s1.compareTo(s2) < 0 ? s1 : s2;
			max[i] = s1.compareTo(s2) < 0 ? s2 : s1;
		}
		String prev = "";
		for(int i=0;i<n;i++) {
			int j= input.nextInt() - 1;
			if(prev.compareTo(min[j]) < 0)
				prev=min[j];
			else if(prev.compareTo(max[j]) < 0)
				prev=max[j];
			else {
				System.out.println("NO");
				return;
			}
				
		}
		System.out.println("YES");
	}

}