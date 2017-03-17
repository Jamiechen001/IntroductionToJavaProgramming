package me.jamiechen.exception_and_io;

/**
 * 自定义异常
 *
 * 当半径为负时，setRadius 方法抛出一个异常
 *
 * Created by JamieChen on 2017/3/17 0017.
 */
public class InvalidRadiusException extends Exception{
    private double radius;

    public InvalidRadiusException(double radius) {
        super("Invalid radius " + radius);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
