import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Task2{
    public static void main(String[]args) {
        Map<String, Integer> edges = new HashMap();
        Map<String, Integer> sortedEdges = new HashMap();
        ArrayList<Character> vertices = new ArrayList();
        edges.put("AA", 8);
        edges.put("BC", 4);
        edges.put("AB", 5);
        edges.put("BD", 11);
        edges.put("DD", 4);
        edges.put("AC", 12);
        edges.put("AC", 10);
        edges.put("DC", 5);
        //edges.put("BD", 8);
        for(String key: edges.keySet()) {
            if(!vertices.contains(key.charAt(0))) {  //vertex
                vertices.add(key.charAt(0));
            }
            if(!vertices.contains(key.charAt(1))) {  //vertex
                vertices.add(key.charAt(1));
            }
            if(key.charAt(0) == key.charAt(1)) {  // to check loops
                
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
        
        Collections.sort(vertices);
        //System.out.print(vertices);
        ArrayList<Integer> values = new ArrayList();
        int map[][] = new int[vertices.size()][vertices.size()];
        Map(vertices, values, map, edges);
        
        for(int i = 0; i < vertices.size(); i++) {
            for(int j = 0; j < vertices.size(); j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println("");
        }
        
        ArrayList<Character> shortestPath = new ArrayList();
        int posX = vertices.size() - 1;
        while(posX != 0) {
            findShort(shortestPath, vertices, map, posX);
            posX--;
        }
        
    }
    public static void findShort(ArrayList<Character> shortestPath, ArrayList<Character> vertices, int[][] map, int posX) {
        shortestPath.clear();
        shortestPath.add(vertices.get(posX));
        int location = posX;
        for(int j = posX; j >= 0; j--) {
            for(int i = location; i >= 0; i--) {
                if(i == 0) {
                    if(!shortestPath.contains(vertices.get(i))) {
                        shortestPath.add(vertices.get(i));
                    }
                    break;
                }
                if(map[i][j] != map[i - 1][j] && !shortestPath.contains(vertices.get(i - 1))) {
                    shortestPath.add(vertices.get(i - 1));
                    location = i;
                    break;
                }
            }
        }
        Collections.sort(shortestPath);
        System.out.println(shortestPath);
        
    }
    
    public static void Map(ArrayList<Character> vertices, ArrayList<Integer> values, int[][] map, Map<String, Integer> edges) {
        values.clear();
        for(int i = 0; i < vertices.size(); i++) {
            int size = values.size();
            int position = 0;
            for(int j = 0; j < vertices.size(); j++) {
                if(i == 0 && j == 0) {
                    map[i][j] = 0;
                }
                else if(i == 0) {
                    map[i][j] = -1;
                }
                else {
                    if(position != size) {
                        map[i][j] = values.get(position);
                        position++;
                    } 
                    else {
                        String s = "" + vertices.get(i - 1) + vertices.get(j);
                        String b = "" + vertices.get(j) + vertices.get(i - 1);
                        //System.out.print(s + " ");
                        if(edges.containsKey(s)) {
                            if(map[i - 1][j] != -1) {
                                map[i][j] = Math.min(edges.get(s) + map[i][i - 1], map[i - 1][j]);
                            }
                            else {
                                map[i][j] = edges.get(s) + map[i][i - 1];
                            }
                        }
                        else if(edges.containsKey(b)) {
                            if(map[i - 1][j] != -1) {
                                map[i][j] = Math.min(edges.get(b) + map[i][i - 1], map[i - 1][j]);
                            }
                            else {
                                map[i][j] = edges.get(b) + map[i][i - 1];
                            }
                        }
                        else {
                            map[i][j] = -1;
                        }
                    }
                }
                 
            }
            int a = i;
            int min = map[i][a];
            while(a != values.size()) {
                if(min > map[i][a]) {
                    min = map[i][a];
                }
                a++;
            }
            //System.out.print(min + " ");
            values.add(min);
        }
        
    }
}