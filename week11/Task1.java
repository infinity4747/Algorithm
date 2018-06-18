import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Task1{
    public static void main(String[]args) {
        Map<String, Integer> edges = new HashMap();
        Map<String, Integer> sortedEdges = new HashMap();
        ArrayList<Character> vertices = new ArrayList();
        Set<Character> finalVertices = new HashSet();
        edges.put("AA", 8);
        edges.put("BC", 1);
        edges.put("AB", 2);
        edges.put("BD", 5);
        edges.put("DD", 4);
        edges.put("AC", 12);
        edges.put("AC", 2);
        edges.put("DC", 3);
        for(String key: edges.keySet()) {
            if(!vertices.contains(key.charAt(0))) {  //vertex
                vertices.add(key.charAt(0));
            }
            if(!vertices.contains(key.charAt(1))) {  //vertex
                vertices.add(key.charAt(1));
            }
            if(key.charAt(0) == key.charAt(1)) {  //to check loops and repetitions(put minimum weight)
                
            }
            else if(sortedEdges.containsKey(key)) {
                if(sortedEdges.get(key) > edges.get(key)) {
                    sortedEdges.remove(key, sortedEdges.get(key));
                    sortedEdges.put(key, edges.get(key));
                }
            }
            else {
                sortedEdges.put(key, edges.get(key));
            }
        }
        
        ValueComparator bvc = new ValueComparator(sortedEdges);
        TreeMap<String, Integer> sorted_map = new TreeMap<String, Integer>(bvc);
        sorted_map.putAll(sortedEdges);
        System.out.println(sorted_map);
        
        int count = 0;
        
        for(int i = 0; i < vertices.size() - 1; i++) {
             
            String s = (String) sorted_map.keySet().toArray()[count];
            while(finalVertices.contains(s.charAt(0)) && finalVertices.contains(s.charAt(1))) {
                count++;
                s = (String) sorted_map.keySet().toArray()[count];
                
            }
             
            finalVertices.add(s.charAt(0));
            finalVertices.add(s.charAt(1));
            System.out.println(s + " " + edges.get(s));
            count++;
        }
        
        
        
    }
    
     
}
class ValueComparator implements Comparator<String> {
    Map<String, Integer> base;

    public ValueComparator(Map<String, Integer> base) {
        this.base = base;
    }

    public int compare(String a, String b) {
        if (base.get(a) <= base.get(b)) {
            return -1;
        } else {
            return 1;
        }
    }
}