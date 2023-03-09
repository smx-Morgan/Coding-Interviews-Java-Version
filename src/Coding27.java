public class Coding27 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode right = mirrorTree(root.right);
        TreeNode left = mirrorTree(root.left);
        root.right = left;
        root.left = right;
        return root;
    }
}
