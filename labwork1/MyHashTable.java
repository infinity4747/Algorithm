import java.util.*;

public class MyHashTable{
	final int size=26;
	ArrayList<HashNode> buckets;
	public MyHashTable(){
		buckets=new ArrayList<>(size);
		for (int i=0;i<size ;i++ ) {
			buckets.add(null);
		}
	}
	public void add(String s,String k){
		HashNode hashNode=new HashNode(s,k);
		int a=s.toLowerCase().charAt(0)-97;
		if(buckets.get(a)==null)
			buckets.add(a,hashNode);
		else{
			hashNode.next=hashNode;
			buckets.add(a,hashNode.next);
		}

	}
	public String get(String s){
		int i=0;
		while(buckets.get(i).key!=s && buckets.get(i).next==null){
			i++;
		}
		return buckets.get(i).value + "  "+i;
	}
	public void remove(String s){
		int i=0;
		while(buckets.get(i).key!=s && buckets.get(i).next==null){
			i++;
		}
		buckets.remove(i);
	}
	public String toString(){
		return buckets.toString();
	}
	public static void main(String[] args) {
		MyHashTable h=new MyHashTable();
		h.add("Alua","All");
		h.add("Alsss","sss");
		h.add("jjjj","jjjj");
		System.out.print(h.get("Alsss")); 
		System.out.print(h.get("Alua"));
	}
}

