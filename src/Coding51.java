public class Coding51 {
    int count = 0;
    public int reversePairs(int[] nums) {
        this.count = 0;
        mergeSort(nums,0,nums.length -1);
        return count;
    }
    public void mergeSort(int[] nums,int left,int right){
        if(left>=right){
            return;
        }
        int mid = (left + right)/2;
        mergeSort(nums,left,mid);
        mergeSort(nums,mid+1,right);
        merge(nums,left,mid,right);
    }
    public void merge(int[] nums, int left,int mid,int right){
        int[] temp = new int[right - left +1];
        //定义一个指针，指向第一个数组的第一个元素
        int i = left;
        //定义一个指针，指向第二个数组的第一个元素
        int j = mid+1;
        //定义一个指针，指向临时数组的第一个元素
        int t = 0;
        while(i <= mid && j <= right){
            if(nums[i] <= nums[j]){
                temp[t++] = nums[i++];
            }else{
                count += mid - i + 1;
                temp[t++] = nums[j++];
            }
        }
        while(i <= mid){
            temp[t++] = nums[i++];
        }
        while(j <= right){
            temp[t++] = nums[j++];
        }
        for(int k = 0; k < temp.length; k++){
            nums[left + k] = temp [k];
        }
    }
}
