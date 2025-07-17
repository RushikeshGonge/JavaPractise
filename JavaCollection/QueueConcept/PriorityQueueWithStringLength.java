package QueueConcept;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}
public class PriorityQueueWithStringLength {
    public static void main(String[] args) {
        MyComparator comparator = new MyComparator();
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>(10,comparator);

        priorityQueue.add("Rushikesh");
        priorityQueue.add("RushikeshTesting");
        priorityQueue.add("Rushi");
        priorityQueue.add("Rushikesh Gonge");
        priorityQueue.add("Rushikesh Patil");
        priorityQueue.add("RushiPatil");

        System.out.println(priorityQueue.poll()); //prints the least length string and remove it from the queue

    }
}
