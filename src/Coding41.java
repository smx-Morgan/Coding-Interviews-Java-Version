import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Coding41 {
    class MedianFinder {
        Queue<Integer> A,B;
        /** initialize your data structure here. */
        public MedianFinder() {
            A = new PriorityQueue<>();//小根堆
            B= new PriorityQueue<>(Comparator.reverseOrder());//大顶堆
        }
        public void addNum(int num) {
            if(A.size() != B.size()){
                A.add(num);
                B.add(A.poll());
            }else {
                B.add(num);
                A.add(B.poll());
            }
        }

        public double findMedian() {
            if(A.size() != B.size()){
                return A.peek();
            }else{
                return (A.peek() + B.peek())/2;
            }
        }
    }

}
