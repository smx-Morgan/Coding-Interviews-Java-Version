import java.util.Arrays;

public class Coding40 {
    //快排
    public int[] getLeastNumbers(int[] arr, int k) {
        quikSort(arr,0,arr.length-1);
        return Arrays.copyOf(arr,k);
    }
    private void quikSort(int[] arr, int l, int r){
        if(l >= r) return;
        int i = l, j =r;
        while(i < j){
            while(i < j && arr[j] >= arr[l]) j--;
            while(i < j && arr[i] <= arr[l]) i++;
            swap(arr,i,j);
        }
        swap(arr,i,l);
        quikSort(arr,l,i-1);
        quikSort(arr,i+1,r);
    }
    private void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
