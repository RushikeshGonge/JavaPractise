package QueueConcept;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {

        PriorityQueue<Integer> pr = new PriorityQueue<Integer>();

        pr.add(750);
        pr.add(900);
        pr.add(500);
        pr.add(100);
        pr.add(50);

        System.out.println(pr.size());
        System.out.println(pr);
        System.out.println(pr.poll()); // sots the data in non-increasing order and returns the least element that is from the rear end
        System.out.println(pr);

        pr.add(150);
        System.out.println(pr);
        System.out.println(pr.poll());
        System.out.println(pr);

    }
}
