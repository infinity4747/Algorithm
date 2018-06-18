import java.util.*;
public class Minimum_Lost {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        long[] arr = new long[n];
        
        Map<Long,Integer> index = new HashMap<>();
        
        for(int i=0; i < n; i++){
            arr[i] = in.nextLong();
            index.put(arr[i], i);
        }
        
        Arrays.sort(arr);
        
        long min = Long.MAX_VALUE;
        
        for(int i=0; i < n-1; i++){
            if(arr[i+1] - arr[i] < min && index.get(arr[i+1]) < index.get(arr[i])){
                min = arr[i+1] - arr[i];
            }
        }
        
        System.out.println(min);
    }
}
