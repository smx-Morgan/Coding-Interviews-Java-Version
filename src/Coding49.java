public class Coding49 {
    public int nthUglyNumber(int n) {
        int a = 0,b = 0,c = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        if(n <= 0){
            return 1;
        }
        for(int i = 1; i < n; i++){
            int n2 = dp[a]*2;
            int n3 = dp[b]*3;
            int n5 = dp[c]*5;
            int min = Math.min(Math.min(n2,n3),n5);
            if(min == n2) a++;
            if(min == n3) b++;
            if(min == n5) c++;
            dp[i] = min;
        }
        return dp[n-1];
    }
}
