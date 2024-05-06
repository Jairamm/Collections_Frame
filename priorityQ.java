import java.util.PriorityQueue;
import java.util.Comparator;

public class priorityQ {
    public static void main(String[] args) {
        System.out.println(" Priority queue 's java ");
        PriorityQueue<Integer> it = new PriorityQueue<>(Comparator.reverseOrder());
        it.offer(23);
        it.offer(24);
        it.offer(25);
        // it.poll();

        System.out.println(it);

    }
}
