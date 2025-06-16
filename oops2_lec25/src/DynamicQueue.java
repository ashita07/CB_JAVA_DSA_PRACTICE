

public class DynamicQueue extends Queue{
    public void Enqueue(int item) throws Exception{
        if(isFull()){
            int[] n_arr=new int[2* arr.length];
            for (int i=0;i<arr.length;i++){
                int idx=(front+i)%arr.length;

            }
        }
        super.Enqueue(item);
    }
}
