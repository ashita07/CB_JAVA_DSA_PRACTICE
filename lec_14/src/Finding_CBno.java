public class Finding_CBno {
    public static void main(String[] args) {
        PrintSub("127");
    }
    public static void PrintSub(String s) {
        int c=0;
        boolean[] visited=new boolean[s.length()];
        for(int len=1;len<=s.length();len++){
            for(int j=len;j<=s.length();j++){
                int i=j-len;
               long num= Long.parseLong(s.substring(i,j));
               if(IsCBNo(num) && isVisited(visited,i,j)){

                   c++;
                   //visited marker
                   for(int k=i;k<j;k++){
                       visited[k]=true;
                   }
               }
            }
        }
        System.out.println(c);
    }

    private static boolean isVisited(boolean[] visited, int i, int j) {
        for(int a=i;a<=j-1;a++){
            if(visited[a]){
                return false;
            }
        }
        return true;
    }

    public static boolean IsCBNo(long num) {

        int[] arr={2,3,5,7,11,13,17,23,19,19};
        if(num==0 || num==1){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return true;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(num%arr[i]==0)
                return false;
        }
        return true;
    }
}
