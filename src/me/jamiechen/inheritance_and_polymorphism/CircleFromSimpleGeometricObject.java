package me.jamiechen.inheritance_and_polymorphism;

/**
 * 继承自通用几何类的 Circle 类
 *
 * Created by JamieChen on 2017/3/15 0015.
 */
public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
    private double radius;

    public CircleFromSimpleGeometricObject() {

    }

    public CircleFromSimpleGeometricObject(double radius) {
        this.radius = radius;
    }

    public CircleFromSimpleGeometricObject(String color, boolean filled, double radius) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated()
                + " and the radius is " + radius);
    }
}
