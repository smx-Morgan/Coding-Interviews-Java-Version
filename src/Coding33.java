public class Coding33 {
    public boolean verifyPostorder(int[] postorder) {
        if(postorder.length <= 0){
            return true;
        }
        int length = postorder.length;
        int head = postorder[length-1];
        int count= 0;
        for(; count < length - 1; count++){
            if(postorder[count] > head){
                count = count;
                break;
            }
        }
        for(int i = count; i <length - 1; i++){
            if(postorder[i] < head){
                return false;
            }
        }
        boolean left = true;
        if(count > 0){
            int[] leftCount = new int[count];
            for(int i = 0; i <count;i++){
                leftCount[i] = postorder[i];
            }
            left = verifyPostorder(leftCount);
        }
        boolean right = true;
        if(count < length -1){
            int[] rightCount = new int[length -  count - 1];
            for(int i = count; i < length - 1; i++){
                rightCount[i-count] = postorder[i];
            }
            right = verifyPostorder(rightCount);
        }
        return left&&right;
    }
}

