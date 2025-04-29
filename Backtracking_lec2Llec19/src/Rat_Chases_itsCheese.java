import java.sql.SQLOutput;
import java.util.Scanner;

public class Rat_Chases_itsCheese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] maze = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < maze[0].length; j++) {
                maze[i][j] = s.charAt(j);
            }
        }
        int[][] ans=new int[n][m];
        printpath(maze,0,0,ans);
        if(!path)
            System.out.println("Path not found");
    }
static boolean path=false;
    public static void printpath(char[][] maze, int cr, int cc,int[][] ans) {

        if (cr >= maze.length || cc >= maze[0].length || cr<0 ||cc<0 || maze[cr][cc]=='X') {
            return ;
        }
        if(cr==maze.length-1 && cc==maze[0].length-1) {
          ans[cr][cc]=1;
         Display(ans);
         path=true;
         return;
        }
        maze[cr][cc]='X';
        ans[cr][cc]=1;
        int[] r={-1,0,0,1};
        int[] c={0,1,-1,0};
        for (int i = 0; i < c.length; i++) {
            printpath(maze, cr +r[i], cc+c[i],ans);
        }
//            printpath(maze, cr - 1, cc,ans);
//            printpath(maze, cr, cc - 1,ans);
//            printpath(maze, cr + 1, cc,ans);
//            printpath(maze, cr, cc + 1,ans);
        maze[cr][cc]='O';
        ans[cr][cc]=0;
    }

    private static void Display(int[][] ans) {
        for (int i = 0; i < ans.length; i++) {

            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
