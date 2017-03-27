package d0327.jessie;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 单向队列和双向队列
 */
public class QueueDeque {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("abc");
        q.offer("efg");
        q.offer("xyz");
        while (q.size() > 0) {
            String str = q.poll();
            System.out.print(str + ", ");
        }

        System.out.println();
        Deque<String> deque = new LinkedList<>();
        deque.push("abc"); //push压栈
        deque.push("efg");
        deque.push("xyz");
        while (deque.size() > 0) {
            String str = deque.pop();//pop出栈/弹出
            System.out.print(str + ", ");
        }
    }
}
