package me.jamiechen.choose;

import java.util.Scanner;

/**
 * 提示用户输入一个年份，然后判断是否是闰年
 * Created by JamieChen on 2017/1/30 0030.
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入一个年份： ");
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear)
            System.out.println(year + " 年是闰年");
        else
            System.out.println(year + " 年不是闰年");

    }
}
