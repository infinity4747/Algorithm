import java.util.*;
public final class  Sherlock{
	public static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		String s=input.next();
		Map<Character,Integer> map =new HashMap<>();
		int[] arr=new int[s.length()];
		for (int i=0;i<s.length() ;i++ ) {
			char c=s.charAt(i);
			if (map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}
			else {
				map.put(c,1);	
			}
		}
		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
		int remove=0;
		boolean f=true;
		ArrayList<Character> removing=new ArrayList<>();
		 Collection<Set<Integer>> newVariable = map.values();
		if (newVariable.size()==1) {
			System.out.print("YES");
		}
		else if(newVariable.size==2){
			int count=0;
			for (Integer element: set){
			 if(count<element)
			 	count=element;
 			}
 			if (newVariable.contains(1)) {
				System.out.print("YES");
			}
			else
				System.out.print("NO");
		}
		else
			System.out.print("NO");
		/*
		for (Map.Entry<Character, Integer> entry1: entrySet) {
			int n=entry1.getValue();
			removing.add(entry1.getKey());

			for (Map.Entry<Character, Integer> entry2: entrySet){
				if(!removing.contains(entry2.getKey())){
					if (entry2.getValue()==n) {
						continue;
					}
					else if (entry2.getValue()==n+1 ||entry2.getValue()==1  ) {
						remove++;
					}
					else if (entry2.getValue()!=n+1) {
						f=!f;
						break;
					}
					if (remove>map.size()) {
						f=false;
						break;
					}
				}
			}
		}*/
		System.out.print(f?"YES":"NO");
	}
}