public class Coding53 {
    public int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        int mid = 0;
        while(i <= j){
            mid = (i+j)/2;
            if(nums[mid] <= target){
                i = mid + 1;
            }else{
                j = mid - 1;
            }
        }
        if (j >= 0 && nums[j] != target){
            return 0;
        }
        int right = i;
        i = 0; j = nums.length - 1;
        while(i <= j){
            mid = (i+j)/2;
            if(nums[mid] < target){
                i = mid + 1;
            }else{
                j = mid - 1;
            }
        }
        int left = j;
        return right - left -1;
    }
    /*
    53.2
        public int missingNumber(int[] nums) {
        int i = 0;
        int j =  nums.length -1;
        while(i <= j){
            int mid = (i + j)/2;
            if(mid==nums[mid]){
                i = mid +1;
            }else{
                j = mid -1;
            }
        }
        return i;
    }
     */
}
