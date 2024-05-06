
// import java.util.HashSet;
import java.util.Set;
// import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {

        /*
         * System.out.println(" Sets 's java Collections (O(N))");
         * Set<Integer> S = new HashSet<>();
         * 
         * // S.add(" HARIOM PANDEY");
         * // S.add(" HARIOM PANDEY ");
         * // S.add(" Jay Prakash Pandey ");
         * S.add(0);
         * S.add(1);
         * S.add(2);
         * S.add(3);
         * S.add(7);
         * S.add(7);
         * S.add(4);
         * S.remove(3);
         * S.add(8);
         * // S.clear();
         * System.out.println(S);
         * // System.out.println(S.contains(3));
         */

        /*
         * System.out.
         * println(" Sets + LinkedList  's java Collections  (Only order maintain )");
         * Set<Integer> S = new LinkedHashSet<>();
         * /*
         * S.add(" HARIOM PANDEY");
         * S.add(" HARIOM PANDEY ");
         * S.add(" Jay Prakash Pandey ");
         * 
         * S.add(1);
         * S.add(2);
         * S.add(3);
         * S.add(3);
         * S.add(4);
         * // S.remove(3);
         * // S.clear();
         * System.out.println(S);
         * System.out.println(S.contains(3));
         */
        System.out.println(" TreeSet's  java Collections Framework (log n ) ");
        Set<Integer> S = new TreeSet<>();
        /*
         * S.add(" HARIOM PANDEY");
         * S.add(" HARIOM PANDEY ");
         * S.add(" Jay Prakash Pandey ");
         */
        S.add(1);
        S.add(2);
        S.add(3);
        S.add(3);
        S.add(4);
        // S.remove(3);
        // S.clear();
        System.out.println(S);
        System.out.println(S.contains(3));

    }
}
