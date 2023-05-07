public class Coding55 {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        if(left > right){
            return left + 1;
        }
        return right+1;
    }
}
