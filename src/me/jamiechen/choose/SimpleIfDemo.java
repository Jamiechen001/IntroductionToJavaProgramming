package me.jamiechen.choose;

import java.util.Scanner;

/**
 * 提示用户输入一个整数，如果能被 5 整除，输出“该数为 5 的倍数”，如果能被 2 整除，输出“该数为 2 的倍数”
 * Created by JamieChen on 2017/1/26 0026.
 */
public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数： ");
        int number = input.nextInt();

        if (number % 5 == 0) {
            System.out.println(number + " 是 5 的倍数");
        }

        if (number % 2 == 0) {
            System.out.println(number + " 是 2 的倍数");
        }
    }
}
