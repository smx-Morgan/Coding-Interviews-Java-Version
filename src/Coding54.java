public class Coding54 {
    int res;
    int k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        if(root == null){
            return 0;
        }
        dfs(root);
        return res;
    }
    public void dfs(TreeNode node){
        if(node == null){
            return;
        }
        dfs(node.right);
        if(k == 0){
            return;
        }
        if(--k == 0){
            res = node.val;
        }
        dfs(node.left);
    }
}
