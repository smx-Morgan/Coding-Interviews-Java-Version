public class Coding13 {
    //机器人的运动范围
    //没有做边界检查的原因是力扣给了边界检查
    public int movingCount(int m, int n, int k) {
        boolean[] visited = new boolean[m*n];
        for(int i = 0; i < m*n; i++){
            visited[i] = false;
        }
        int ans = movingCounting(k,m,n,0,0,visited);
        return ans;
    }
    //计算一共能走多少
    public int movingCounting(int hold , int rows ,int cols ,int row, int col, boolean[] visited){
        int count = 0;
        if(check(hold,rows,cols,row,col,visited)){
            visited[row*cols + col] = true;
            count = 1 + movingCounting(hold,rows,cols,row-1,col,visited) + movingCounting(hold,rows,cols,row,col-1,visited)+movingCounting(hold,rows,cols,row+1,col,visited)+movingCounting(hold,rows,cols,row,col+1,visited);
        }
        return count;
    }
    //检查是否能走
    public boolean check(int hold, int rows, int cols,int row,int col,boolean[] visited){
        if(row >= 0 && col >= 0 &&rows > row && cols > col && !visited[row*cols + col] && DigitCount(col)+DigitCount(row) <= hold){
            return true;
        }
        return false;
    }
    //计算十位+个位值
    public int DigitCount(int num){
        if(num >=10){
            return num%10 + num/10;
        }
        return num;

    }
}
