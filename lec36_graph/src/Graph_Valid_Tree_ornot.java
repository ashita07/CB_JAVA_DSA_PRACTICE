import java.util.*;

public class Graph_Valid_Tree_ornot {
    public boolean valid_Tree(int n,int[][] edges) {

        HashMap<Integer, List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int a=edges[i][0];
            int b=edges[i][1];
            map.get(a).add(b);
            map.get(b).add(a);
        }
    }
    public boolean DFT(HashMap<Integer,List<Integer>> map) {
        Stack<Integer> q=new Stack<>();
        HashSet<Integer> visited=new HashSet<>();
        int c=0;
        for(int src:map.keySet()) {
            if(visited.contains(src))
                continue;
            c++;
            q.push(src);
            while (!q.isEmpty()) {
                int r = q.pop();
                if (visited.contains(r))
                    continue;
                visited.add(r);
                System.out.print(r+" ");
                for (int nrbs : map.get(r)) {
                    if (!visited.contains(nrbs)) {
                        q.push(nrbs);
                    }
                }
            }
        }
       return c==1;
    }

}
