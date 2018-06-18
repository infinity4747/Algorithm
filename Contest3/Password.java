import java.util.*;
public final class Password {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=input.next();
		int i=1;
		String s1="a";
		while(true){
			String obelix=s.substring(1,s.length()-2);
			String prefix=s.substring(0,i);
			String suffix=s.substring(s.length()-i,s.length());
			if (obelix.contains(prefix) && obelix.contains(suffix) && prefix.equals(suffix)) {
				s1=suffix;
				break;
			}
			else {
				i++;
			}
			if(i==s.length()){
				break;
			}
		}
	System.out.print(s1.equals("a")?"Just a legend":s1);
	}
}