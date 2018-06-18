import java.util.*;

public class Progres {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sr.nextInt();
		}
		Arrays.sort(arr);
		
		if (n == 1) {
			System.out.println("-1");
			System.exit(0);
		}
		int diff = arr[1] - arr[0];
		if (n == 2) {
			if (diff%2 == 1) {
				System.out.println("2");
				System.out.println(arr[0] - diff + " " + (arr[1] + diff));
			} else if (diff == 0) {
				System.out.println("1");
				System.out.println(arr[0]);
			} else {
				System.out.println("3");
				System.out.println(arr[0] - diff + " " + (arr[0] + diff/2) + " " + (arr[1] + diff));
				System.exit(0);
			}
		}
		boolean f = false;
		int index = 0;
		for (int i = 2; i < n; i++) {
			int temp = arr[i] - arr[i-1];

			if (temp != diff && f) {
				System.out.println("0");
				System.exit(0);
			} else if (temp < diff) {
				if (i != 2) {
					System.out.println("0");
					System.exit(0);
				}
				
				index = 0;
				f = true;
				if (temp*2 != diff) {
					System.out.println("0");
					System.exit(0);
				}
				diff = temp;
			}
			if (temp > diff) {
				index = i - 1;
				
				if (temp != 2*diff) {
					System.out.println("0");
					System.exit(0);
				}
				f=true;
			}
		}
		if (f) {
			System.out.println("1");
			System.out.println(arr[index] + diff);
			System.exit(0);
		}
		if(diff == 0) {
			System.out.println("1");
			System.out.println(arr[0]);
			System.exit(0);
		}
		System.out.println("2");
		System.out.println(arr[0] - diff + " " + (arr[n-1] + diff));	
	}
}