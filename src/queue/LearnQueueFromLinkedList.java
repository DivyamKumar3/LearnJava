package queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueueFromLinkedList {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
            //to add elements in queue use offer
            queue.offer(1);
            queue.offer(2);
            queue.offer(3);
        System.out.println(queue);
        //to remove elements in queue use poll
            queue.poll();
        System.out.println(queue);
        //to check which elements in queue at top
        System.out.println(queue.peek());


        //if we use add() or element() or remove() and element is missing or not added then it will throw exception
        // offer and peek can return null as well in case of missing element
    }
}