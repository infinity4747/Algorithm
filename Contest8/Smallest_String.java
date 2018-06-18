import java.util.*;
public class Smallest_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = input.next();
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String a = o1 + o2;
                String b = o2 + o1;
                return a.compareTo(b);
            }
        });
        String res="";
        for (int i = 0; i <n ; i++) {
            res+=arr[i];
        }
        System.out.println(res);
    }

}