
// package Coll;
// import java.util.LinkedList;
// import java.util.Queue;
import java.util.*;

// import java.util.Collections;
// linkedList and Array using implement 
public class Linked {
    public static void main(String[] args) {
        System.out.println(" LinedList 's java ");
        Queue<Integer> hio = new LinkedList<>();
        hio.offer(34);
        hio.offer(34);
        hio.offer(45);
        hio.offer(67);
        hio.offer(90);
        hio.offer(78);
        hio.offer(122);
        System.out.println(hio);
        hio.poll();
        System.out.println(hio.peek());
        /*
         * add(); EXception
         * offer() true or false
         * element(); Exception
         * peek(); null
         * remove(); Exception
         * poll(); true or false
         */

    }
}
