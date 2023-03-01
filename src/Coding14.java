public class Coding14 {
    //剑指 Offer 14- I. 剪绳子
    public int cuttingRope(int n) {
        if(n == 2){
            return 1;
        }
        if(n == 3){
            return 2;
        }
        int[] products = new int[n + 1];
        products[0] = 0;
        products[1] = 1;
        products[2] = 2;
        products[3] = 3;
        products[4] = 4;
        //动态规划，找到每个product的最佳值，并输出
        for(int i = 4 ; i <= n;++i){
            int max = 0;
            for(int j = 1; j <= i/2; ++j){
                int temp = products[j]*products[i-j];
                if(temp > max){
                    products[i] = temp;
                    max = temp;
                }
            }
        }
        return products[n];
    }
    //贪婪算法，优先取3
    public int cuttingRopeGreedy(int n) {
        if(n == 2){
            return 1;
        }
        if(n == 3){
            return 2;
        }
        int ans = 1;
        while(n > 4){
            n = n - 3;
            ans = ans*3;
        }
        ans = ans*n;
        return ans;

    }
}
