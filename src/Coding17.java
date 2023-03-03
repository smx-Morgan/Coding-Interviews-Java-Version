public class Coding17 {
    //这里是输出测试
    public static void main(String[] args) {
        Coding17 code = new Coding17();
        code.printNumbers(3);
    }
    public void printNumbers(int n){
        char[] number = new char[n];
        for (int i = 0; i < 10; i++) {
            number[0] = (char)('0' +i);
            printMaxDigits(number,n,0);
        }
    }
    //可以通过修改sout函数使得开头的0不输出
    public void printMaxDigits(char[] number,int length,int index){
        if(index == length -1){
            System.out.println(String.valueOf(number));
            return;
        }
        for (int i = 0; i < 10; i++) {
            number[index+1] = (char)('0' +i);
            printMaxDigits(number,length,index+1);
        }
    }
    //力扣答案，题目完全不同，故用最简单的方式实现
    public int[] printNumbersLeetcode(int n) {
        int end = (int)Math.pow(10, n) - 1;
        int[] res = new int[end];
        for(int i = 0; i < end; i++)
            res[i] = i + 1;
        return res;
    }
}
