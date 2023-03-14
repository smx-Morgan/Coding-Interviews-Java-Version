import java.util.ArrayList;
import java.util.List;

public class Coding29 {
    List<Integer> list;
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        list = new ArrayList<Integer>();
        int start = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        while(col > start*2 && row > start*2){
            storeInt(matrix,col,row,start);
            start++;
        }
        int[] count = new int[list.size()];
        for(int i = 0; i < list.size();i++){
            count[i] = list.get(i);
        }
        return count;
    }
    public void storeInt (int[][] matrix, int col, int row ,int start){
        int Xend = col - 1 - start;
        int Yend = row - 1 - start;
        for(int i = start ; i <= Xend; i++){
            list.add(matrix[start][i]);
        }
        if(start < Yend){
            for(int i = start + 1; i <= Yend;i++){
                list.add(matrix[i][Xend]);
            }
        }
        if(start < Xend && start < Yend){
            for(int i = Xend -1; i >= start; i--){
                list.add(matrix[Yend][i]);
            }
        }
        if(start < Xend && start < Yend-1){
            for(int i = Yend - 1; i >= start+1; i--){
                list.add(matrix[i][start]);
            }
        }
    }
}
