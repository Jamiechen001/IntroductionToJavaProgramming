package me.jamiechen.mathfunction_character_string;

import java.util.Scanner;

/**
 * 提示用户回答生日是否在集合 1 2 3 4 5 中，然后判断并显示用户的生日在一个月的第几天
 * Created by JamieChen on 2017/2/1 0001.
 */
public class GuessBirthday {
    public static void main(String[] args) {
        String set1 =
                " 1  3  5  7\n" +
                " 9 11 13 15\n" +
                "17 19 21 23\n" +
                "25 27 29 31";

        String set2 =
                " 2  3  6  7\n" +
                "10 11 14 15\n" +
                "18 19 22 23\n" +
                "26 27 30 31";

        String set3 =
                " 4  5  6  7\n" +
                "12 13 14 15\n" +
                "20 21 22 23\n" +
                "28 29 30 31";

        String set4 =
                " 8  9 10 11\n" +
                "12 13 14 15\n" +
                "24 25 26 27\n" +
                "28 29 30 31";

        String set5 =
                "16 17 18 19\n" +
                "20 21 22 23\n" +
                "24 25 26 27\n" +
                "28 29 30 31";

        int day = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("你的生日在下表中吗？\n");
        System.out.print(set1);
        System.out.print("\n输入 0 表示否，输入 1 表示是：");
        int answer = input.nextInt();

        if (answer == 1)
            day += 1;

        System.out.print("你的生日在下表中吗？\n");
        System.out.print(set2);
        System.out.print("\n输入 0 表示否，输入 1 表示是：");
        answer = input.nextInt();

        if (answer == 1)
            day += 2;

        System.out.print("你的生日在下表中吗？\n");
        System.out.print(set3);
        System.out.print("\n输入 0 表示否，输入 1 表示是：");
        answer = input.nextInt();

        if (answer == 1)
            day += 4;

        System.out.print("你的生日在下表中吗？\n");
        System.out.print(set4);
        System.out.print("\n输入 0 表示否，输入 1 表示是：");
        answer = input.nextInt();

        if (answer == 1)
            day += 8;

        System.out.print("你的生日在下表中吗？\n");
        System.out.print(set5);
        System.out.print("\n输入 0 表示否，输入 1 表示是：");
        answer = input.nextInt();

        if (answer == 1)
            day += 16;

        System.out.println("\n你的生日是 " + day + "!");
    }
}
