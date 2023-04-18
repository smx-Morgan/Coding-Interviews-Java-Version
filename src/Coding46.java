public class Coding46 {
    public int translateNum(int num) {
        int a = 1, b = 1, x, y = num % 10;
        while(num != 0) {
            num /= 10;
            x = num % 10;
            int tmp = 10 * x + y;
            int c ;
            if(tmp >= 10 && tmp <= 25){
                c = a + b;
            }else{
                c = a;
            }
            b = a;
            a = c;
            y = x;
        }
        return a;
    }
}
