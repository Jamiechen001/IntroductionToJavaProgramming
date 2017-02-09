package me.jamiechen.exercise;

import java.util.Scanner;

/**
 * 提示用户输入一个 0 到 1000 之间的整数，将该整数的各位数字相加并打印
 *
 * Created by JamieChen on 2017/2/6 0006.
 */
public class AddDigitsOfInteger {
    public static void main(String[] args) {
        int sum = 0;
        int digit1, digit2, digit3;

        Scanner input = new Scanner(System.in);

        System.out.print("请输入一个 0 到 1000 之间的整数： ");
        int number = input.nextInt();

//        if (number < 10 && number >= 0) {
//            sum = number;
//        } else if (number < 100) {
//            digit1 = number % 10;
//            digit2 = number / 10;
//            sum = digit1 + digit2;
//        } else if (number < 1000) {
//            digit1 = number % 10;
//            digit2 = (number / 10) % 10;
//            digit3 = number / 100;
//            sum = digit1 + digit2 + digit3;
//        } else {
//            System.out.println("无效输入！");
//            System.exit(1);
//        }

        if (number < 1000 && number >= 0) {
            digit1 = number % 10;
            digit2 = (number / 10) % 10;
            digit3 = number / 100;
            sum = digit1 + digit2 + digit3;
        } else {
            System.out.println("无效输入！");
            System.exit(1);
        }

        System.out.println(number + " 的各位数字相加之和为 " + sum);
    }
}
