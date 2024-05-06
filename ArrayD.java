import java.util.ArrayDeque;

public class ArrayD {
    public static void main(String[] agrs) {
        System.out.println(" Array Deque 's java ");
        ArrayDeque<Integer> D = new ArrayDeque<>();
        D.offer(2);
        D.offer(3);
        D.offer(4);
        // System.out.println(D);
        D.offerFirst(1);
        D.offerLast(5);
        D.offer(6);
        System.out.println(D.peekLast());
        System.out.println(D.peekFirst());
        System.out.println(" poll Second  " + D.pollLast());
        System.out.println(" poll First  " + D.pollFirst());

    }
}
