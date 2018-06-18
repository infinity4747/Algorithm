import java.util.*;
public class Goodland {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int result=0;
        int firstNotCovered = 0;
        int lastTower = -1;
        for (int i=0;i<n;i++) {
            int cov = in.nextInt();
            if (cov == 1) {
                lastTower = i;
            }
            if ((i-k+1)>=firstNotCovered || (i==(n-1) && i>=firstNotCovered)) {
                if (lastTower!=-1) {
                    result++;
                    firstNotCovered = lastTower+k;
                    lastTower = -1;
                }
                
            else {
                result = -1;
                break;
            }}
        }
        System.out.println(result);
    }
}