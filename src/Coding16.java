public class Coding16 {
    //这题很神奇，int最大的负值 不能直接取绝对值所以要么改为long要么单独判断。
    //这里我对其进行单独判断，这部分内容是超出了书中所列举的范围。
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }

        if(n == 1){
            return x;
        }
        boolean flag = false;
        boolean flag2 = false;
        if(n <= -2147483648){
            flag2 = true;
            n = -2147483647;
        }
        if(n < 0){
            flag = true;
            n = -n;
        }
        double result = myPow(x,n >> 1);
        result *= result;
        if(n%2 == 1){
            result = result*x;
        }
        if(flag2){
            result = result*x;
        }
        if(flag){
            result = 1/result;
        }
        return result;
    }
}
