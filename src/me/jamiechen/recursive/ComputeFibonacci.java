package me.jamiechen.recursive;

import java.util.Scanner;

/**
 * Created by JamieChen on 2017/3/22 0022.
 */
public class ComputeFibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for a Fibonacci number: ");
        int index = input.nextInt();

        System.out.println("The Fibonacci number ar index " + index + " is " + fib(index));
    }

    public static long fib(long index) {
        if (index == 0)
            return 0;
        else if (index == 1)
            return 1;
        else
            return fib(index - 2) + fib(index - 1);
    }
}
