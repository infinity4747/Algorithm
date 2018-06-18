import java.util.*;
public final class Vasya {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int k=input.nextInt();
		input.nextLine();
		String s=input.nextLine();
		int count=0;
		int a=0,b=0,j=0;
		for(int i=0;i<n;i++){
            if(s.charAt(i)=='a')
				a++;
            else
				b++;
            if(Math.min(a,b)>k){
				if(s.charAt(j)=='a')
                    a--;
				else
                    b--;
				j++;
            }
            else
				count++;
                        
        }
        System.out.println(count);
    
    }
}