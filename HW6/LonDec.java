import java.util.*;
public class LonDec
{
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("The size of array is:   ");
    int n=input.nextInt();
    int arr[]=new int[n];

    for(int i=0;i<n;i++){
      arr[i]=input.nextInt();
    }
    System.out.print("The largest decreasing size is  "+dec(arr,n));
  }
    public static int dec(int arr[],int n)
    {
      int b[]=new int[n];
      int max=0;
      for (int i= 0;i<n;i++){
        b[i]=1;
      }
      for (int c=1;c<n;c++){
        for (int j=0;j<c;j++){ 
          if(arr[c]<arr[j] && b[c]<b[j]+1){
              b[c]=b[j]+1;
          }
        }
      }
      for (int i = 0; i < n; i++ ){
        if ( max < b[i] )
          max = b[i];
        }
  return max;
    }
}