import java.util.List;

public class Coding26 {
    List<Integer> list;
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return dfs(A,B);
    }
    public boolean dfs(TreeNode A, TreeNode B){
        boolean result = false;
        if(A == null || B == null){
            return false;
        }
        if(A.val == B.val){
            result = checkSub(A,B);
        }
        if(!result){
            result = dfs(A.left,B) || dfs(A.right,B);
        }
        return result;
    }
    public boolean checkSub(TreeNode A, TreeNode B){
        if(B == null){
            return true;
        }
        if(A == null){
            return false;
        }
        if(A.val != B.val){
            return false;
        }
        return checkSub(A.left,B.left) && checkSub(A.right,B.right);
    }
}
