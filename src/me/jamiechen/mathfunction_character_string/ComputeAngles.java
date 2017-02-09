package me.jamiechen.mathfunction_character_string;

import java.util.Scanner;

/**
 * 提示用户输入三角形的三个顶点的 x 和 y 的坐标值，然后显示三个角
 * Created by JamieChen on 2017/2/1 0001.
 */
public class ComputeAngles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请依次输入三个顶点的坐标： ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double c = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));

        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - a * a - b * b) / (-2 * a * b)));

        System.out.println("三个角分别是： " +
                Math.round(A * 100) / 100.0 + " " +
                Math.round(B * 100) / 100.0 + " " +
                Math.round(C * 100) / 100.0);
    }
}
