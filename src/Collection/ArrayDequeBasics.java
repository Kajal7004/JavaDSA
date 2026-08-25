package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeBasics{
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(2);
        q.offer(3);
        q.offerFirst(1);
        q.offerLast(10);
        System.out.println(q);

        System.out.println("GettingFirst: "+q.getFirst());
        System.out.println("GettingLast: "+q.getLast());

        System.out.println("peeking: "+q.peek());

        System.out.println("Polling: "+q.poll());
        System.out.println(q);
        System.out.println("Polling First: "+q.pollFirst());
        System.out.println(q);
        System.out.println("Polling Last: "+q.pollLast());
        System.out.println(q);
    }
}