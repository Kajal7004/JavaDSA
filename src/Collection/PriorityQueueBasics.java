package Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasics {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        //default behaviour --? Integers --> less value --> high priority **** called min Heap
        //maxHeap -> Integers --> high value --> high priority by using Comprator
        pq.offer(40);
        pq.offer(20);
        pq.offer(10);
        pq.offer(30);
        System.out.println(pq);

        System.out.println(pq.poll());

        //maxHeap using comprator(using Lambda expression)
        Queue<Integer> p = new PriorityQueue<>((a,b) -> b-a);
        p.offer(40);
        p.offer(20);
        p.offer(10);
        p.offer(30);
        System.out.println(p);

        System.out.println(p.poll());
    }
}
