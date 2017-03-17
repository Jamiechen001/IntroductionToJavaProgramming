package me.jamiechen.exception_and_io;

import java.util.Scanner;

/**
 * 计算两个整数相除的结果，除数为 0 时抛出异常
 *
 * Created by JamieChen on 2017/3/17 0017.
 */
public class QuotientWithException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try {
            int result = quotient(number1, number2);
            System.out.println(number1 + " / " + number2 + " is " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Exception: an integer cannot be divided by zero ");
        }

        System.out.println("Execution continues ... ");
    }

    public static int quotient(int number1, int number2) {
        if (number2 == 0)
            throw new ArithmeticException("Divisor cannot be zero");

        return number1 / number2;
    }
}
