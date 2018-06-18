import java.util.Scanner;

public class Carrot{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long h = input.nextLong();
        double ans=0;
        for (long i = 1; i < n; i++) {
            ans = (double) (h * h * i) / (double) (n);
            System.out.print(Math.sqrt(ans) + " ");
        }
    }
}