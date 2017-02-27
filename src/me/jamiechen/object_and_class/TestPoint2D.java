package me.jamiechen.object_and_class;

import javafx.geometry.Point2D;

import java.util.Scanner;

/**
 * 根据给定的 x 和 y 坐标的点创建两个 Point2D 对象，使用 distance 方法计算它们之间的距离
 *
 * Created by JamieChen on 2017/2/24 0024.
 */
public class TestPoint2D {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("请输入点 1 的 x 和 y 坐标：");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("请输入点 2 的 x 和 y 坐标：");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);
        System.out.println("点 1 ：" + p1.toString());
        System.out.println("点 2 ：" + p2.toString());
        System.out.println("点 1 和点 2 之间的距离：" + p1.distance(p2));

    }
}
