package me.jamiechen.exception_and_io;

/**
 * 使用自定义异常 InvalidRadiusException 的 Circle 类和它的测试类
 *
 * Created by JamieChen on 2017/3/17 0017.
 */
public class TestCircleWithCustomException {
    public static void main(String[] args) {

        try {
            new CircleWithCustomException(5);
            new CircleWithCustomException(-5);
            new CircleWithCustomException(0);
        } catch (InvalidRadiusException ex) {
            System.out.println(ex);
        }

        System.out.println("Number of objects created " + CircleWithCustomException.getNumberOfObjects());
    }
}

class CircleWithCustomException {
    private double radius;
    private static int numberOfObjects = 0;

    public CircleWithCustomException() throws InvalidRadiusException{
        this(1.0);
    }

    public CircleWithCustomException(double radius) throws InvalidRadiusException{
        setRadius(radius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws InvalidRadiusException {
        if (radius >= 0)
            this.radius = radius;
        else
            throw new InvalidRadiusException(radius);
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double fingArea() {
        return radius * radius * Math.PI;
    }
}
