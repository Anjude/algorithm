package solution.jzoffer.day11;

import solution.jzoffer.JZ4;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * JZ41  大顶堆+小顶堆
 *
 * @author Anjude
 * @date 2021/7/18 12:25
 */
public class JZ41 {

    Queue<Integer> A, B;

    public JZ41() {
        A = new PriorityQueue<>(); // 小顶堆，保存较大的一半
        B = new PriorityQueue<>((x, y) -> (y - x)); // 大顶堆，保存较小的一半
    }

    public void addNum(int num) {
        if (A.size() != B.size()) {
            A.add(num);
            B.add(A.poll());
        } else {
            B.add(num);
            A.add(B.poll());
        }
    }

    public double findMedian() {
        return A.size() != B.size() ? A.peek() : (A.peek() + B.peek()) / 2.0;
    }
}
















