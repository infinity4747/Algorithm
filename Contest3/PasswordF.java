import java.util.*;
public final class PasswordF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int []arr=F(s);
        int lfix=0;
        for (int i = 1; i <s.length(); i++) {
            if (arr[i]==s.length()-i && lfix>=arr[i]) {
                System.out.println(s.substring(0,arr[i]));
                return;
            }
            lfix=Math.max(lfix, arr[i]);
        }
        System.out.println("Just a legend");
             
    }
    public static int[] F(String string){
        char[] a= string.toCharArray();
        int n =string.length();
        int [] s=new int[string.length()];
        int b=0;
        int f=0;
        s[0]=n;
        for (int i =1; i<n; i++) {
            if (i>f) {
                b=i;
                f=i-1;
                while(f+1<n && a[f+1]==a[f+1-b]){
                    f++;
                }
                s[i]=f-b+1;
            }
            else{
                int k=i-b;
                if (s[k]<f-i+1) {
                    s[i]=s[k];
                }
                else{
                    b=i;
                    while(f+1<n && a[f+1]==a[f+1-b]){
                        f++;
                    }
                    s[i]=f-b+1;
                }
            }
        }
        return s;
    }
}