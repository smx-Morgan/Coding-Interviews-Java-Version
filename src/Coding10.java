public class Coding10 {
    //斐波那契数列
    public int fib(int n) {
        final int MOD = 1000000007;
        if(n  < 2 ){
            return n ;
        }
        int one = 1;
        int two = 0;
        int res = 0;
        for(int i = 2; i <= n; ++i){
            res = (one + two)% MOD;

            two = one;
            one = res;
        }
        return res;
    }
}
