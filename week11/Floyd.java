public class Floyd{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				arr[i][j] = in.nextInt();
			}
		} 
		for(int k = 0; k <arr.length; k++){
			for(int i = 0; i <arr.length; i++){
				for(int j = 0; j <arr.length; j++){
					if(arr[i][j] >arr[i][k] +arr[k][j]){
					arr[i][j] =arr[i][k] +arr[k][j];
					}
				}
			}
		}
		for(int i = 0; i <arr.length; i++){
			for(int j = 0; j <arr.length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	} 
}