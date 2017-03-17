package me.jamiechen.inheritance_and_polymorphism;

/**
 * 一个演示多态和类型转换的例子
 *
 * Created by JamieChen on 2017/3/15 0015.
 */
public class CastingDemo {
    public static void main(String[] args) {
        Object object1 = new CircleFromSimpleGeometricObject(1);
        Object object2 = new RectangleFromSimpleGeometricObject(1, 1);

        displayObject(object1);
        displayObject(object2);

    }

    public static void displayObject(Object object) {
        if (object instanceof CircleFromSimpleGeometricObject) {
            System.out.println("The circle area is " + ((CircleFromSimpleGeometricObject) object).getArea());
            System.out.println("The circle diameter is " + ((CircleFromSimpleGeometricObject) object).getDiameter());
        } else if (object instanceof RectangleFromSimpleGeometricObject) {
            System.out.println("The rectangle area is " + ((RectangleFromSimpleGeometricObject) object).getArea());
        }
    }
}
