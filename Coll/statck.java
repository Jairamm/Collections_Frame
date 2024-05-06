package Coll;

import java.util.Stack;
import java.io.IOError;
import java.util.Scanner;

public class statck {
    public static void main(String[] args) throws IOError {
        System.out.println(" stack DS 's java ");
        Stack<String> stack = new Stack<>();
        stack.push(" Hariom pandey ");
        stack.push(" Sri Ram sharma  ");
        stack.push(" Ajay kumar  ");
        stack.push(" Amit kuamr ");
        stack.push(" Sri jay mahadav ");
        System.out.println(stack);

        Scanner sc = new Scanner(System.in);
        int option = 0;
        while (option < 3) {
            option = sc.nextInt();
            if (option == 1) {
                stack.pop();
            } else {
                System.out.println(stack.peek());
                System.out.println(" Hello user  once again change if you want termination press except 1  ");
                int option2 = sc.nextInt();
                if (option2 == 1) {
                    main(args);
                }
            }
            option++;
            System.out.println(stack);

        }
        sc.close();

        {
            System.out.println(" Gaya  khatem tata go bey ENDDDDD ");
        }
    }

    static {
        System.out.println(" Gaya  khatem tata go bey ENDDDDD ");
    }
}
