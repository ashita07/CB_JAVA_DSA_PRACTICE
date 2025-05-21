public class N_Queen {
    public static void main(String[] args) {
        int n=4;
        boolean [][]board=new boolean[n][n];
        int tq=n;
        print(board,tq,0);
    }
    public static void print(boolean[][] board,int n,int row){

        if(n==0){
            Display(board);
            System.out.println();
            return;
        }

        for(int col=0;col<board[0].length;col++){
            if(isitsafe(board,row,col)){
                board[row][col]=true;
                print(board,n-1,row+1);
                board[row][col]=false;
            }
        }
    }
    public static void Display(boolean[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isitsafe(boolean[][] board,int row,int col){
        for(int r=row;r>=0;r--){
            if(board[r][col])
                return false;
        }
        for(int r=row,c=col;c>=0&& r>=0;r--,c--){
            if(board[r][c])
                return false;
        }
        for(int r=row,c=col;c<board.length&& r>=0;r--,c++){
            if(board[r][c])
                return false;
        }
        return true;
    }

}
