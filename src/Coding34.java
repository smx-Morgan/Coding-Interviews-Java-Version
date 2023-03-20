import java.util.ArrayList;
import java.util.List;

public class Coding34 {
    static List<List<Integer>> ans;
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        ans = new ArrayList<List<Integer>>();
        List<Integer> nums = new ArrayList<Integer>();
        findPath(root,target,0,nums);
        return ans;
    }
    public void findPath(TreeNode node,int target, int currentSum,List<Integer> nums){
        if(node == null){
            return;
        }
        nums.add(node.val);
        int value = currentSum + node.val;
        if(value == target && node.left == null && node.right == null){
            ans.add(new ArrayList<>(nums));
        }else{
            findPath(node.left,target,value,nums);
            findPath(node.right,target,value,nums);
        }
        nums.remove(nums.size()-1);
    }
}
