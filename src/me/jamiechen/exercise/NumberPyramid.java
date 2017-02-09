package me.jamiechen.exercise;

import java.util.Scanner;

/**
 * 提示用户输入一个整数作为金字塔的层数，然后显示一个金字塔
 *
 * Created by JamieChen on 2017/2/7 0007.
 */
public class NumberPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.print("请输入一个整数： ");
        int number = 10;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j < 6 * (number - i + 1); j++) {
                System.out.print(" ");
            }

            int count = 0;
            int temp = 1;

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.printf("%6d", temp);
                count++;
                if (count >= i)
                    temp /= 2;
                else
                    temp *= 2;
            }

            System.out.println();

        }
    }
}
