import java.util.*;

public class DijkstraAl{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = in.nextInt();
		int[][] arr = new int[n][n];
		int[] dist = new int[n];
		int[] visited = new int[n];
		int min;
		int next = 0;
		System.out.println("Fill the matrix");

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				arr[i][j] = in.nextInt();
				if(arr[i][j] == 0){
					arr[i][j] = 999;
				}
			}
		} 

		for(int i = 0; i < n; i++){
			visited[i] = 0
		}

		dist = matrix[0];
		dist[0] = 0;
		v[0] = 1;

		for(int i = 0; i < n; i++){
			min = 999;
			for(int j = 0; j < n; j++){
				if (min > dist[j] && v[j] != 1){

					min = dist[j]; 
					next = j;
				}
			}

			v[next] = 1;

			for(int k = 0; k < n; k++){
				if (v[k] != 1){
					if(min + matrix[next][k] < dist[k]){
						dist[k] = min + matrix[next][k];
						act[k] = next; 
					}
				}
			}
		}

		for(int i = 0; i < n; i++){
			System.out.print(dist[i]);
		}

	
	}
}