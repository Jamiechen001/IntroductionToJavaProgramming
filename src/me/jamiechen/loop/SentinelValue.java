package me.jamiechen.loop;

import java.util.Scanner;

/**
 * 读取和计算个数不确定的整数之和，并以输入 0 表示输入结束
 * 显示结果包含输入的整数
 *
 * Created by JamieChen on 2017/2/5 0005.
 */
public class SentinelValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = 0;
        String output = " ";

        System.out.print("请输入一个整数，并以输入 0 作为结束： ");

        number = input.nextInt();

        output += number;

        int sum = 0;
        while (number != 0) {
            sum += number;
            System.out.print("请输入一个整数，并以输入 0 作为结束： ");
            number = input.nextInt();
            if (number != 0)
                output += " + " + number;
        }

        System.out.println(output + " = " + sum);
    }
}
