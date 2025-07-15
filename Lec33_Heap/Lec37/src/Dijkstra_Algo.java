import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijkstra_Algo {
    public static void main(String[] args) {
        Dijkstra_Algo pa = new Dijkstra_Algo(7);
        pa.AddEdge(1, 2, 2);
        pa.AddEdge(2, 3, 3);
        pa.AddEdge(1, 4, 10);
        pa.AddEdge(4, 5, 8);
        pa.AddEdge(3, 4, 1);
        pa.AddEdge(5, 6, 5);
        pa.AddEdge(5, 7, 6);
        pa.AddEdge(6, 7, 4);
        pa.Dj_Algo(1);

    }
    private HashMap<Integer, HashMap<Integer,Integer>> map;
    public Dijkstra_Algo(int v){
        map=new HashMap<>();
        for (int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    class DjkPair{
        int vtx;
        String acqpath;
        int cost;

        public DjkPair(int vtx,String acqpath,int cost){
            this.vtx=vtx;
            this.acqpath=acqpath;
            this.cost=cost;
        }
        public String toString(){
            return vtx+" "+acqpath+"@"+cost;
        }
    }

    public void Dj_Algo(int src) {
        PriorityQueue<DjkPair> pq = new PriorityQueue<>(new Comparator<>() {
            @Override
            public int compare(DjkPair o1, DjkPair o2) {
                return o1.cost - o2.cost;
            }
        });
        HashSet<Integer> visited = new HashSet<>();
        pq.add(new DjkPair(src, "" + src, 0));
        while (!pq.isEmpty()) {
            DjkPair pr = pq.poll();
            if (visited.contains(pr.vtx)) {
                continue;
            }
            visited.add(pr.vtx);
            System.out.println(pr);
            for (int nrbs : map.get(pr.vtx).keySet()) {
                if (!visited.contains(nrbs)) {
                    int cost = map.get(pr.vtx).get(nrbs);
                    pq.add(new DjkPair(nrbs, pr.acqpath + nrbs, pr.cost + cost));
                }
            }
        }
    }}
