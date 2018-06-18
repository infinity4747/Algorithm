import java.util.*;
public final class  Ice_Creame{
	public static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
	 int t = input.nextInt();
        for(int i = 0; i < t; i++)
        {
            int m = input.nextInt();
            int n = input.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            for(int j = 1; j <= n; j++)
            {
                int p = input.nextInt();
                if(map.containsKey(p))
                    System.out.println(map.get(p) + " " + j);
                else
                    map.put(m-p, j);
            }
        }
	}
}