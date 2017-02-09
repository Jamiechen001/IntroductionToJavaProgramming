package me.jamiechen.loop;

import java.util.Scanner;

/**
 * 使用 do-while 循环改写 me.jamiechen.loop.SentinelValue
 *
 * Created by JamieChen on 2017/2/6 0006.
 */
public class TestDoWhile {
    public static void main(String[] args) {
        int data;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("请输入一个整数，并以输入 0 作为结束： ");
            data = input.nextInt();
            sum += data;
        } while (data != 0);

        System.out.println("The sum is " + sum);
    }
}
