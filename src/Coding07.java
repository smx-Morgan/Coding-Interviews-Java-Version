public class Coding07 {
    //重建二叉树
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length <= 0 || inorder.length <= 0){
            return null;
        }
        int val = preorder[0];
        int index = 0;
        for(int i = 0; i < inorder.length; i++){
            if(val == inorder[i]){
                index = i;
                break;
            }
        }
        int[] Lpreorder =new int[index];
        int[] Linorder = new int[index];
        int[] Rpreorder = new int[inorder.length - index-1];
        int[] Rinorder = new int[inorder.length - index-1];
        for(int i = 1; i < preorder.length; i++){
            if(index >= i){
                Lpreorder[i-1] = preorder[i];
            }else{
                Rpreorder[i - 1 - index] = preorder[i];
            }
        }
        for(int i = 0; i < inorder.length; i++){
            if(index > i){
                Linorder[i] = inorder[i];
            }else if (index < i){
                Rinorder[i - index - 1] = inorder[i];
            }
        }
        TreeNode root  = new TreeNode(val);
        if(index == 0){
            root.left = null;
        }else{
            root.left = dfs(Lpreorder,Linorder);
        }
        if(inorder.length-index == 1){
            root.right = null;
        }else{
            root.right = dfs(Rpreorder,Rinorder);
        }
        return root;
    }
    public TreeNode dfs (int[] preorder , int[] inorder){
        if(preorder.length <= 0 || inorder.length <= 0){
            return new TreeNode(0);
        }
        int val = preorder[0];
        int index = 0;
        for(int i = 0; i < inorder.length; i++){
            if(val == inorder[i]){
                index = i;
                break;
            }
        }
        int[] Lpreorder =new int[index];
        int[] Linorder = new int[index];
        int[] Rpreorder = new int[inorder.length - index-1];
        int[] Rinorder = new int[inorder.length - index-1];
        for(int i = 1; i < preorder.length; i++){
            if(index >= i){
                Lpreorder[i-1] = preorder[i];
            }else{
                Rpreorder[i - 1 - index] = preorder[i];
            }
        }
        for(int i = 0; i < inorder.length; i++){
            if(index > i){
                Linorder[i] = inorder[i];
            }
            if (index < i){
                Rinorder[i - index - 1] = inorder[i];
            }
        }
        TreeNode root  = new TreeNode(val);
        if(index == 0){
            root.left = null;
        }else{
            root.left = dfs(Lpreorder,Linorder);
        }
        if(inorder.length-index == 1){
            root.right = null;
        }else{
            root.right = dfs(Rpreorder,Rinorder);
        }
        return root;
    }
}
