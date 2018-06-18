import java.util.*;
public final  class Mahmud {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number[] = new int[26];
        int arr[] = new int[1001];
        int arr2[] = new int[1001];

        int n = input.nextInt();
        input.nextLine();
        String s = input.nextLine();
        for (int i = 0; i < 26; i++) {
            number[i] = input.nextInt();
        }

        arr[0] = 1;
        arr2[0] = 0;
        int mod= 1000000007;
        int max = 0;
        for (int i = 1;i<=n;i++) {
            int num = 0;
            arr2[i] = n;
            System.out.println("i:  "+i);
            for (int j=i-1;j>=0;j--) {
                num = Math.max(num,i - number[s.charAt(j) - 'a']);
                System.out.println(num+"  j: "+j);
                if (num > j) {
                    continue;
                }

                arr[i] = (arr[i] + arr[j])% mod ;
                System.out.println("arr"+i+"   "+arr[i]);
                arr2[i] = Math.min(arr2[i], arr2[j]+1);
                System.out.println("arr2  "+arr2[i]+ "  j+1: "+(arr2[j]+1));
                max=Math.max(max, i - j);
                System.out.println("max  "+max+" i-j "+(i-j));
            }
        }

        System.out.println(arr[n]);
        System.out.println(max);
        System.out.println(arr2[n]);
    }
}