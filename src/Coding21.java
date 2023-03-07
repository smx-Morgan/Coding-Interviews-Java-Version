public class Coding21 {
    public int[] exchange(int[] nums) {
        if(nums.length <= 1){
            return nums;
        }
        int fron = 0;
        int back = nums.length-1;
        while(back > fron){
            while(nums[fron] % 2 == 1 && back > fron){
                fron++;
            }
            while(nums[back] % 2 == 0 && back > fron){
                back--;
            }
            if(back > fron){
                int tmp = nums[back];
                nums[back] = nums[fron];
                nums[fron] = tmp;
            }
        }
        return nums;
    }
}
