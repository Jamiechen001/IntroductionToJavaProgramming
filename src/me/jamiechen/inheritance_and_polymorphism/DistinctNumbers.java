package me.jamiechen.inheritance_and_polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 提示用户输入一个数字序列，输入 0 作为结束，然后显示该序列中的不同数字，0 不计入系列。
 *
 * Created by JamieChen on 2017/3/15 0015.
 */
public class DistinctNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (input ends with 0): ");
        int value;

        do {
            value = input.nextInt();

            if (!list.contains(value) && value != 0)
                list.add(value);
        }while (value != 0);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }
    }
}
