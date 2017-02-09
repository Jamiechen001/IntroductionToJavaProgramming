package me.jamiechen.basic_programming;

import java.util.Scanner;

/**
 * 将以秒为单位的时间量转换为分钟数与所余的秒数
 * Created by JamieChen on 2017/1/21 0021.
 */
public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");

    }
}
