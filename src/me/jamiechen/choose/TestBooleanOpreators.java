package me.jamiechen.choose;

import java.util.Scanner;

/**
 * 检验一个数是否能同时被 2 或 3 整除，或是否能被 2 或 3 整除，或是否只能被 2 或 3 两者中的一个整除
 * Created by JamieChen on 2017/1/30 0030.
 */
public class TestBooleanOpreators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入一个整数： ");
        int number = input.nextInt();

        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println(number + " 能被2和3同时整除");
        }

        if (number % 2 == 0 || number % 3 == 0) {
            System.out.println(number + " 能被2或3整除");
        }

        if (number % 2 == 0 ^ number % 3 == 0) {
            System.out.println(number + " 只能被2和3中的一个整除");
        }
    }
}
