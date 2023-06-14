public class Coding62 {
    //约瑟夫环问题
    public int lastRemaining(int n, int m) {
        int f = 0;
        for(int i = 2; i != n +1 ; i++){
            f = (m + f) % i;
        }
        return f;
    }
}
