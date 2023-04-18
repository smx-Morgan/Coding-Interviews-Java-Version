public class Coding47 {
    public int maxValue(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == 0 && j == 0){
                    continue;
                }
                if(i == 0){
                    grid[j][i] += grid[j-1][i];
                }
                else if(j == 0){
                    grid[j][i] += grid[j][i-1];
                }
                else {
                    grid[j][i] += Math.max(grid[j][i-1],grid[j-1][i]);
                }
            }
        }
        return grid[m-1][n-1];
    }
}
