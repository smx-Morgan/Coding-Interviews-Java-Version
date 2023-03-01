public class Coding15 {
    public int hammingWeight(int n) {
        int count = 0;
        boolean flag = true;
        if(n == 0){
            flag = false;
        }
        while(flag){
            ++count;
            n = (n-1)&n;
            if(n == 0){
                flag = false;
            }
        }
        return count;
    }
}
