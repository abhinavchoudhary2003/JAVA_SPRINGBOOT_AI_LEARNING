import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo{
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(220);
        pq.add(20);
        pq.add(2);

        // smaller value gets highest priority
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());


        System.out.println("-----------------------------------");

        Queue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        pq1.add(10);
        pq1.add(220);
        pq1.add(20);
        pq1.add(2);

        // highest value gets highest priority because of Comparator.reverseOrder()
        System.out.println(pq1);
        System.out.println(pq1.poll());
        System.out.println(pq1.poll());


    }
}
