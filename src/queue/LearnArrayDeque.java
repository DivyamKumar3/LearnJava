package queue;

import java.util.ArrayDeque;

public class LearnArrayDeque {


    public static void main (String[] args)
    {
        ArrayDeque<Integer> adq=new ArrayDeque<Integer>();
        {
            adq.offer(1);
            adq.offerFirst(21);
            adq.offerLast(22);
            adq.offer(11);
            System.out.println(adq);

            System.out.println(adq.peek());
            System.out.println(adq.peekFirst());
            System.out.println(adq.peekLast());

            System.out.println(adq.poll());
            System.out.println(adq.pollFirst());
            System.out.println(adq.pollLast());

            System.out.println(adq);
        }
    }
}
