public class Coding03 {
    //数组中的重复数字
    public int findRepeatNumber(int[] nums) {
        int ans = 0;
        if(nums.length <= 0){
            return ans;
        }
        for(int i = 0; i <= nums.length; i++){

            while( i != nums[i]){
                int num = nums[i];
                if(nums[i] == nums[nums[i]]){
                    ans =  nums[i];
                    return ans;
                }
                nums[i] = nums[num];
                nums[num] = num;
            }
        }
        return ans;
    }
}
