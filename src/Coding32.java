import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Coding32 {
    public int[] levelOrder(TreeNode root) {
        if(root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> ans = new ArrayList<>();
        while(!queue.isEmpty()){
            root = queue.poll();
            ans.add(root.val);
            if(root.left != null) queue.add(root.left);
            if(root.right != null) queue.add(root.right);
        }
        int[] res = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}
