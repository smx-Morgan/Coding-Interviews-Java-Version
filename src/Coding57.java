public class Coding57 {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        while(left < right){
            if(nums[left] + nums[right] < target){
                left++;
            }else if (nums[left] + nums[right] > target){
                right--;
            }else{
                break;
            }
        }
        return new int[] {nums[left],nums[right]};
    }
}
