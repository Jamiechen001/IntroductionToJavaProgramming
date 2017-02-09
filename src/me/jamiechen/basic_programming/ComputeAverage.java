package me.jamiechen.basic_programming;

import java.util.Scanner;

/**
 * 从控制台读取三个数，然后显示它们的平均值
 * Created by JamieChen on 2017/1/21 0021.
 */
public class ComputeAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double average = (number1 + number2 + number3) / 3;

        System.out.println("The average of " + number1+ " " + number2 + " " + number3 + " is " + average);
    }
}
