public class Coding11 {
    //旋转数组最小数字
    public int minArray(int[] numbers) {
        if(numbers.length <= 0){
            return 0;
        }
        if(numbers.length  == 1){
            return numbers[0];
        }
        int index = 0;
        int indexLast = numbers.length - 1;
        int indexMid = index;
        while(numbers[index] >= numbers[indexLast]){
            indexMid = indexLast;
            if(indexLast - index == 1){
                indexMid = indexLast;
                break;
            }
            index++;
            indexMid--;
        }
        if(numbers[index] < numbers[indexLast]){
            indexMid = index;
        }
        return numbers[indexMid];
    }
}
