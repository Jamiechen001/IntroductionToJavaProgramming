package me.jamiechen.exception_and_io;

/**
 * 设置半径时如果是负值则抛出异常
 *
 * Created by JamieChen on 2017/3/17 0017.
 */
public class CircleWithException {
    private double radius;
    private static int numberOfObjects = 0;

    public CircleWithException() {
        this(1.0);
    }

    public CircleWithException(double radius) {
        setRadius(radius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException{
        if (radius >= 0)
            this.radius = radius;
        else
            throw new IllegalArgumentException("Radius cannot be negative");
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double finArea() {
        return radius * radius * Math.PI;
    }
}
