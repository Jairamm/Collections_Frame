package Coll;

// import java.util.Collections;
import java.util.Iterator;
// import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Lists {
    // static void List_in(int number) // 1.
    // IN.add(number);
    // System.out.println(number);
    // System.out.println(" size of list is " + List.size());
    // }
    // static void List_in(int i, int number) {
    // List<Integer> IN = new ArrayList<Integer>();
    // IN.add(i, number);
    // System.out.println(number);
    // }

    static void print(List<Integer> IN) // 2.
    {
        Iterator<Integer> it = IN.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        List<Integer> IN = new ArrayList<>();
        // List<Integer> IN1 = new LinkedList<>(); Only interface change hai
        System.out.println(" List is a collections 's java  ");
        IN.add(23);
        IN.add(45);
        IN.add(0, 47);
        IN.add(0, 122);
        // System.out.println(IN);
        print(IN);

    }
}
