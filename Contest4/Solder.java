import java.util.Scanner;

public class Solder {
	public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n =scan.nextInt(),k=scan.nextInt();
        int arr[]= new int [n];
        
        for (int i = 0 ; i < n ; ++i)
            arr[i]=scan.nextInt();

        int count=0 , ans=0;
        while (count<n&&arr[0]<k){
            count=0;
            for (int i = 1 ; i<n ; i++){
                if (arr[i]!=arr[i-1]){
                    count++;
                    arr[i-1]++;
                }
            }
            
            arr[n-1]++;
            count++;
            ans++;
        }
        System.out.println(ans+k-arr[0]);
        
    }

}