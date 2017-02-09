package me.jamiechen.basic_programming;

import java.util.Scanner;

/**
 * 从控制台获取半径并计算圆的面积
 * Created by JamieChen on 2017/1/21 0021.
 */
public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * 3.14159;
        System.out.println("The area for the circle of radius " + radius + " is " + area);

    }
}
