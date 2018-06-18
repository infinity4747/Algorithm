import java.util.*;
public final class Petya {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] heights=new int[n];
		for (int i = 0; i < n; i++)
			heights[i] = input.nextInt();
		int count = 0;
		int temp = 0;
		for (int i = 0; i < n; i++) { 
			for (int j = i; j > 0; j--) { 
				if (heights[j] >= heights[j - 1])
					temp++;
				else
					break;
			}
			for (int j = i; j < n - 1; j++) {      
				if (heights[j] >= heights[j + 1])
					temp++;
				else
					break;
			}
			if (temp > count) {
				count = temp;
			}
			temp = 0;
		}
		System.out.print`(count + 1);
	}
}
