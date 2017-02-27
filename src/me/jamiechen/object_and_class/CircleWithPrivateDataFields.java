package me.jamiechen.object_and_class;

/**
 * 重新定义 Circle 类，将原来的数据域进行封装，并提供了 get/set 方法
 *
 * Created by JamieChen on 2017/2/24 0024.
 */
public class CircleWithPrivateDataFields {

    private double radius = 1;

    private static int numberOfObjects = 0;

    public CircleWithPrivateDataFields() {
        numberOfObjects++;
    }

    public CircleWithPrivateDataFields(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
