import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int [][] buildings= {
                {1,2},{2,2},{3,2},{2,1},{2,3}
        };
int a=countCoveredBuildings(3,buildings);
        System.out.println(a);
    }
    public static int countCoveredBuildings(int n, int[][] buildings) {
        boolean [][] arr=new boolean[n+1][n+1];
        for(int i=0;i<buildings.length;i++){

                arr[buildings[i][0]][buildings[i][1]]=true;
            }
        int c=0;
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[i][j]){
                    if(arr[i-1][j] && arr[i+1][j] && arr[i][j-1] && arr[i][j+1]){
                        c++;
                    }
                }
            }
        }


return c;
    }
}