package me.jamiechen.basic_programming;

/**
 * 计算指定圆的半径
 * Created by JamieChen on 2017/1/21 0021.
 */
public class ComputeArea {
    public static void main(String[] args) {
        double radius, area;

        radius = 20;

        area = radius * radius * 3.14159;

        System.out.println("The area for the circle of the radius " + radius + " is " + area);
    }
}
