package queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

    public static void main(String[] args)
    {
        Queue<Integer> pq=new PriorityQueue<>();
        pq.offer(1);
        pq.offer(4);
        pq.offer(3);
        pq.offer(7);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        // PriorityQueue uses min heap which bring max value at first

        // to convert min heap to max heap
        Queue<Integer> pqr=new PriorityQueue<>(Comparator.reverseOrder());
        pqr.offer(2);
        pqr.offer(1);
        pqr.offer(3);
        pqr.offer(346);
        System.out.println(pqr);
    }
}
