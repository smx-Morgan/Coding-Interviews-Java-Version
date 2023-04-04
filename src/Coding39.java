public class Coding39 {
    public int majorityElement(int[] nums) {
        int x = 0, votes = 0, count = 0;
        for(int num : nums){
            if(votes == 0) x = num;
            if(num == x){
                votes = votes +1;
            }else{
                votes = votes -1;
            }
        }
        for(int num : nums)
            if(num == x) count++;
        if (count > nums.length / 2){
            return x;
        }
        return 0;
    }
}
