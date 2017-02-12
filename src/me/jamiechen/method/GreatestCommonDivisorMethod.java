package me.jamiechen.method;

import java.util.Scanner;

/**
 * 提示用户输入两个整数，然后显示它们的最大公约数
 *
 * Created by JamieChen on 2017/2/9 0009.
 */
public class GreatestCommonDivisorMethod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("请输入第一个整数： ");
        int n1 = input.nextInt();
        System.out.print("请输入第二个整数： ");
        int n2 = input.nextInt();

        System.out.println(n1 + " 和 " + n2 + " 的最大公约数是 " + gcd(n1, n2));
    }

    public static int gcd(int n1, int n2) {
        int gcd = 1;
        int k = 2;

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k++;
        }

        return gcd;
    }
}
