package me.jamiechen.exception_and_io;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 要求输入一个 int 型数值，不是则抛出异常并重新输入
 *
 * Created by JamieChen on 2017/3/17 0017.
 */
public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter an integer: ");
                int number = input.nextInt();
                System.out.println("The number entered is " + number);
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Try again. (Incorrect input: an integer is required)");
                input.nextLine();
            }
        } while (continueInput);
    }
}
