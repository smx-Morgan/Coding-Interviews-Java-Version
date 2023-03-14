import java.util.Stack;

public class Coding31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length == 0 && popped.length == 0){
            return true;
        }
        if(pushed.length <= 0 || popped.length <= 0){
            return false;
        }
        boolean isVaild = false;
        int indexPop = 0;
        Stack<Integer> helpStack = new Stack<>();
        for(int i = 0; i < pushed.length; i++){
            helpStack.push(pushed[i]);
            if(popped[indexPop] == helpStack.peek()){
                while(!helpStack.isEmpty() && popped[indexPop] == helpStack.peek()){
                    indexPop++;
                    helpStack.pop();
                    if(indexPop == popped.length){
                        isVaild = true;
                        break;
                    }
                }
            }
        }
        return isVaild;
    }
}
