import java.util.*;
public class ShortPalindrom {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String s = in.next();
        StringBuilder rev=new StringBuilder();
        for (int i=s.length()-1;i>0 ;i-- ) {
        	rev.append(s.charAt(i));
        }
        int k=2,c=2,j=0,i=0;
        int count=0;
        while(k!=s.length()){
        	String a=s.substring(i,k);
        	while(c!=s.length()){
        		String b=rev.substring(j,c);
        		if (isPalindrom(a,b)) {
        			count++;
        		}
        		c++;
        		j++;
        	}
        	k++;
        	i++;

        }
        System.out.print(count);

    }
    public static boolean isPalindrom(String s,String d){
    	int count=0;
    	for (int i=0;i<s.length()-1 ;i++ ) {
    		if(s.charAt(i)==d.charAt(s.length()-1-i))
    			count++;
    	}
    	if (count==s.length()) {
    		return true;
    	}
    	return false;
    }
}