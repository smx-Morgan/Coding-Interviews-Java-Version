public class Coding12 {
    //矩阵中的路径
    public boolean exist(char[][] board, String word) {
        if(board.length < 0){return false;}
        if(board[0].length < 0){return false;}
        if(board.length == 1 && board[0].length == 1 && word.length() == 1){
            return word.charAt(0) == board[0][0];
        }
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] matr = new boolean[rows][cols];
        int pathLength = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j< cols; j++){
                if(dfs(board,i,j,pathLength,word,matr)){
                    return true;
                }
            }
        }
        return false;

    }
    public boolean dfs(char[][] board,int row, int col, int pathLength,String words,boolean[][] visted){
        if(row < 0 || col < 0 || row >= board.length|| col >= board[0].length){
            return false;
        }
        if(pathLength == words.length()){
            return true;
        }
        if(board[row][col] != words.charAt(pathLength)){
            return false;
        }

        if(visted[row][col] == true){
            return false;
        }
        visted[row][col] = true;
        boolean hasPath = false;

        pathLength++;
        hasPath = dfs(board,row,col+1,pathLength,words,visted)||dfs(board,row,col-1,pathLength,words,visted)||dfs(board,row+1,col,pathLength,words,visted)||dfs(board,row-1,col,pathLength,words,visted);
        if(!hasPath){
            visted[row][col] = false;
            pathLength--;
        }

        return hasPath;
    }
}
