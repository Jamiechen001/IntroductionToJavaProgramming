package me.jamiechen.recursive;

import java.util.Scanner;

/**
 * Created by JamieChen on 2017/3/21 0021.
 */
public class ComputeFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a nonnegative integer: ");
        int n = input.nextInt();

        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

    public static long factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
