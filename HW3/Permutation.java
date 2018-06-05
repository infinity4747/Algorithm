
import java.util.*;
public class Permutation{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.next();
		int j=str.indexOf("+");
		int k=str.indexOf("=");
		ArrayList<String> num1=new ArrayList<>();
		ArrayList<String> num2=new ArrayList<>();
		ArrayList<String> answer0=new ArrayList<>();
		String number1=str.substring(0,j);
		String number2=str.substring(j+1,k);
		String answer=str.substring(k+1,str.length());
		int n=answer.length();
		boolean check=false;
		permute(number1, 0, n-1,num1);
		permute(number2, 0, n-1,num2);
		permute(answer, 0, n-1,answer0);
		/*for(int i=0;i<num1.size();i++){
			for(int c=0;c<num2.size();j++){
				System.out.println(num1.get(i));		
					if(answer0.contains(num2.get(c)+num1.get(i)))	{
					System.out.println("Correct");
				}
			}
		}
		System.out.println("Incorrect");
		*/
		for(int i=0;i<num1.size();i++){
			for(int c=0;c<num2.size();c++){
				if(answer0.contains(String.valueOf(Integer.parseInt(num1.get(i))+Integer.parseInt(num2.get(c))))){
					String s="Correct";
					return s;
					
				}
		}
		if(check==true){
			break;
		}
		}
		System.out.println("Incorrect");
	}

	private static void permute(String str, int l, int r,ArrayList<String> a)
	{
		if (l == r)
			a.add(str);
		else
		{
			for (int i = l; i <= r; i++)
			{
				str = swap(str,l,i);
				permute(str, l+1, r,a);
				str = swap(str,l,i);
			}
		}
		}
	public static String swap(String a, int i, int j)
	{
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}

