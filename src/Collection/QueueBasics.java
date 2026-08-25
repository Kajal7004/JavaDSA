package Collection;
import java.util.*;

class QueueBasics {
    public static void main(String[] args) {
        Queue<Integer> q =  new LinkedList<>();

        //offer()
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println("Offering: "+q);

        //peek()
        System.out.println("Peeking: "+q.peek());

        System.out.println(q);

        //poll()
        System.out.println("polling: "+q.poll());
        System.out.println(q);
        
    }
}