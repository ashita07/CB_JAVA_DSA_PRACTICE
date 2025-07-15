import java.util.*;

public class Graph {
    HashMap<Integer, HashMap<Integer,Integer>> map;
public Graph(int v){
    map=new HashMap<>();
    for(int i=1;i<=v;i++){
        map.put(i,new HashMap<>());
    }
}
   public void AddEdge(int v1,int v2,int cost) {
    map.get(v1).put(v2,cost);
    map.get(v2).put(v1,cost);
   }

   public boolean ContainsEdge(int v1,int v2){
    return map.get(v1).containsKey(v2);
   }
   public boolean Containsvertex(int v1){
    return map.containsKey(v1);
   }
   public int noofEdge() {
    int sum=0;
    for(int vtx : map.keySet()){
        sum+=map.get(vtx).size();
    }
    return sum/2;
   }
   public void remove(int v1,int v2){
    map.get(v1).remove(v2);
    map.get(v2).remove(v1);
   }
   public void removevertex(int v1){
    for(int nbrs: map.get(v1).keySet()){
        map.get(nbrs).remove(v1);
    }
    map.remove(v1);
   }
   public void Display(){
    for(int vtx: map.keySet()){
        System.out.println(vtx+" "+map.get(vtx));
    }
   }

public boolean has_Path(int src, int des, HashSet<Integer> visited) {
    if (src == des) {
        return true;
    }
    visited.add(src);
    for (int nrbs : map.get(src).keySet()) {
        if (!visited.contains(nrbs)) {
            boolean path = has_Path(nrbs, des, visited);
            if (path)
                return true;
        }
    }
    return false;
}
public void PrintPath(int src,int des,HashSet<Integer> visited,String ans) {
  if(src==des){
      System.out.println(ans);
      return;
  }
  visited.add(src);
  for(int nrbs:map.get(src).keySet()){
      if(!visited.contains(nrbs)){
          PrintPath(nrbs,des,visited,ans+src);
      }
  }
visited.remove(src);
}

public boolean BFS(int src,int des) {
  Queue<Integer> q=new LinkedList<>();
   HashSet<Integer> visited=new HashSet<>();
   q.add(src);
   while(!q.isEmpty()){
      int r= q.poll();
       if(visited.contains(r))
continue;
       visited.add(r);
       if(r==des){
           return true;
       }
       for(int nrbs:map.get(r).keySet()){
           if(!visited.contains(nrbs)){
               q.add(nrbs);
           }
       }
   }
   return false;
}
    public boolean DFS(int src,int des) {
        Stack<Integer> q=new Stack<>();
        HashSet<Integer> visited=new HashSet<>();
        q.push(src);
        while(!q.isEmpty()){
            int r= q.pop();
            if(visited.contains(r))
                continue;
            visited.add(r);
            if(r==des){
                return true;
            }
            for(int nrbs:map.get(r).keySet()){
                if(!visited.contains(nrbs)){
                    q.push(nrbs);
                }
            }
        }
        return false;
    }

    public void BFT() {
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        for(int src:map.keySet()) {
            if (visited.contains(src)) {
                continue;
            }

            q.add(src);
            while (!q.isEmpty()) {
                int r = q.poll();
                if (visited.contains(r))
                    continue;
                visited.add(r);
                System.out.print(r+" ");
                for (int nrbs : map.get(r).keySet()) {
                    if (!visited.contains(nrbs)) {
                        q.add(nrbs);
                    }
                }
            }
        }
        System.out.println();
    }
    public void DFT() {
        Stack<Integer> q=new Stack<>();
        HashSet<Integer> visited=new HashSet<>();
        for(int src:map.keySet()) {
            if(visited.contains(src))
                continue;
            q.push(src);
            while (!q.isEmpty()) {
                int r = q.pop();
                if (visited.contains(r))
                    continue;
                visited.add(r);
                System.out.print(r+" ");
                for (int nrbs : map.get(r).keySet()) {
                    if (!visited.contains(nrbs)) {
                        q.push(nrbs);
                    }
                }
            }
        }
        System.out.println();
    }
}

