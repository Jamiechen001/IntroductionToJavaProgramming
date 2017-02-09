package me.jamiechen.basic_programming;

import java.util.Scanner;

/**
 * 从控制台读取半径，然后使用常量计算圆的面积并打印
 * Created by JamieChen on 2017/1/21 0021.
 */
public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159; //声明常量

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        double area = radius * radius * PI;

        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
