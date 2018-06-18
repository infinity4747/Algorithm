import java.util.*;
public final class  MaxSubArray{
	public static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
  	int T = input.nextInt();
   	for(int i=0;i<T;i++){
	    long MaxArray =0;
	    long sumSet = 0;
	    int n = input.nextInt();
	    long[] arr = new long[n];
	    long set = 0;
    	for(int j=0; j< n; j++){
       		if(j == 0){
          		int temp2 = input.nextInt();
          		set += temp2;
           		arr[j] = temp2;
           		MaxArray = temp2;
           		sumSet = temp2;
           	}
	       else{
	           	int temp = input.nextInt();
	           	if(temp >= 0){
	               if(set >= 0){
	               		set += temp; 
	               	}
	                else{
	                    set = temp;
	                }
	            }
	           	else{
	           		if(temp > sumSet){
	                   sumSet = temp;
	              	}

	           	}

	           	if((arr[j-1]+temp) >= temp){

	               arr[j] = arr[j-1]+temp;
	               if(arr[j] > MaxArray)
	                   {MaxArray = arr[j];}
	           	}
	           	else{
	                arr[j] = temp;
	                if(arr[j] > MaxArray){
	                    MaxArray = temp;
	                }
	            }
	        }

     	}
        if(sumSet > set)
        {set = sumSet;}
        System.out.println(MaxArray + " " + set);
    }
	}
}