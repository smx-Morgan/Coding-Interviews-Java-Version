public class Coding04 {
    //二维数组中的查找
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length <= 0){
            return false;
        }
        if(matrix[0].length <= 0){
            return false;
        }
        int col = matrix[0].length;
        int row = matrix.length;
        int index = col-1;
        for(int i = 0 ; i < col; i++){
            if(matrix[0][i] == target){
                return true;
            }
            if(matrix[0][i]> target){
                index = i - 1;
            }
        }
        for(int j = 1 ; j < row; j ++){
            for(int x = 0; x <= index; x++){
                if(matrix[j][x] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
