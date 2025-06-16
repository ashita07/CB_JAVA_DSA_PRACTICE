

public class Dynamic_Stack extends Stack {



   public void push (int item) throws Exception{
       int[] new_arr=new int[arr.length];
       if(isFull()){
           int[] n_arr=new int[2* arr.length];
           for(int i=0;i<arr.length;i++){
               n_arr[i]=arr[i];
           }
           arr=new_arr;
       }
       super.push(item);
   }
    }

