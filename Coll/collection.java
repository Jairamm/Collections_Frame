package Coll;

import java.util.ArrayList;
// import java.util.Collection;

public class collection {

    static void Arr(String S) {
        ArrayList<String> string;
        string = new ArrayList<>();
        string.add(S);
        System.out.println(string);

    }

    static void Arr(String S, int value) {
        ArrayList<String> string = new ArrayList<String>();
        string.add(value, S);
        System.out.println(string);

    }

    public static void main(String[] args) {
        // collections C = new collections();
        System.out.println(" Collection frame works of java ");
        Arr("Hariom Pandey ", 0);
        Arr(" Shishir mishra ", 0);
        Arr(" Manmaohan patkak ", 0);
        Arr(" jagmohan pandey ", 0);
        // Arr("Amit Churasiya", 1);
        // C.print();

    }
}
