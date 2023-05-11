public class Coding58 {
    public String reverseWords(String s) {
        String[] strs = s.trim().split(" "); // 删除首尾空格，分割字符串
        StringBuilder res = new StringBuilder();
        for(int i = strs.length - 1; i >= 0; i--){
            if(strs[i].equals("")) continue;
            res.append(strs[i] + " ");
        }
        return res.toString().trim();
    }
}
