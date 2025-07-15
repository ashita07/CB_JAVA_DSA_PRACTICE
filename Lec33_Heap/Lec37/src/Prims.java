import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Prims {
    private HashMap<Integer,HashMap<Integer,Integer>> map;
    public Prims(int v){
        map=new HashMap<>();
        for (int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public void PrimsAlgo(){
        PriorityQueue<PrimsPair> pq=new PriorityQueue<>(new Comparator<>() {
            @Override
            public int compare(PrimsPair o1, PrimsPair o2) {
                return o1.cost-o2.cost;
            }
        });
        HashSet<Integer> visited=new HashSet<>();
        pq.add(new PrimsPair(1,1,0));
        while(!pq.isEmpty()){
             PrimsPair pr=pq.poll();
             if(visited.contains(pr.vtx)){
                 continue;
             }
             visited.add(pr.vtx);
            System.out.println(pr);
            for(int nrbs: map.get(pr.vtx).keySet()){
                if(!visited.contains(nrbs)){
                    int cost=map.get(pr.vtx).get(nrbs);
                    pq.add(new PrimsPair(nrbs,pr.vtx,cost));
                }
            }
        }
    }
    class PrimsPair{
        int vtx;
        int acqvtx;
        int cost;

        public PrimsPair(int vtx,int acqvtx,int cost){
            this.vtx=vtx;
            this.acqvtx=acqvtx;
            this.cost=cost;
        }
        public String toString(){
            return vtx+" "+acqvtx+"@"+cost;
        }
    }
    public static void main(String[] args) {
        Prims pa = new Prims(7);
        pa.AddEdge(1, 2, 2);
        pa.AddEdge(2, 3, 3);
        pa.AddEdge(1, 4, 10);
        pa.AddEdge(4, 5, 8);
        pa.AddEdge(3, 4, 1);
        pa.AddEdge(5, 6, 5);
        pa.AddEdge(5, 7, 6);
        pa.AddEdge(6, 7, 4);
        pa.PrimsAlgo();

    }

}
