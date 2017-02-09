package me.jamiechen.loop;

import java.util.Scanner;

/**
 * 提示用户输入两个正整数，然后显示它们的最大公约数
 *
 * Created by JamieChen on 2017/2/6 0006.
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("请输入第一个整数： ");
        int number1 = input.nextInt();
        System.out.print("请输入第二个整数： ");
        int number2 = input.nextInt();

        int gcd = 1;
        int k = 2;
        while (k <= number1 && k <= number2) {
            if (number1 % k == 0 && number2 % k == 0)
                gcd = k;
            k++;
        }

        System.out.println("The greatest common divisor for " + number1
                + " and " + number2 + " is " + gcd);
    }
}
