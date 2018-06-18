import java.util.*;
public class Hackerland {

  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }
        
        Arrays.sort(x);
        
        int i = 0;
        int range = 0;
        int count = 0;
        
        while(i < n){
            
            if(x[i] < range){
                
            }
            else{
                count++;
                int j = x[i] + k;
                int l = i;

                // transmitter can not be placed farther than j to cover current house,
                // check for the last house within j
                while(l < n && x[l] <= j){
                    l++;
                }
                
                // transmitter is placed at l-1 house
                range = x[--l] + k + 1;
                
                // move counter to l as houses till l are already in range of new transmitter
                i = l;
            }
            
            i++;
        }
        
        System.out.println(count);
    }
}