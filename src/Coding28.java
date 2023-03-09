public class Coding28 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return symmetric(root.left,root.right);
    }
    public boolean symmetric(TreeNode left,TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null || left.val != right.val){
            return false;
        }
        return symmetric(left.left,right.right) && symmetric(right.left,left.right);
    }
}
