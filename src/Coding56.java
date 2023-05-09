import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Coding56 {
    public int[] singleNumbers(int[] nums) {
        Set<Integer> numbers =new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(numbers.contains(nums[i])){
                numbers.remove(nums[i]);
            }else{
                numbers.add(nums[i]);
            }

        }
        int[] ans = new int[2];
        int tmp = 0;
        for (Integer i: numbers) {
            ans[tmp] = i;
            tmp++;
        }
        return ans;
    }
    //异或运算
    /*
        public int[] singleNumbers(int[] nums) {
        int x = 0, y = 0, n = 0, m = 1;
        for(int num : nums)               // 1. 遍历异或
            n ^= num;
        while((n & m) == 0)               // 2. 循环左移，计算 m
            m <<= 1;
        for(int num: nums) {              // 3. 遍历 nums 分组
            if((num & m) != 0) x ^= num;  // 4. 当 num & m != 0
            else y ^= num;                // 4. 当 num & m == 0
        }
        return new int[] {x, y};          // 5. 返回出现一次的数字
    }
     */
}
