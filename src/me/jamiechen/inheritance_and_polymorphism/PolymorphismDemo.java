package me.jamiechen.inheritance_and_polymorphism;

/**
 * 一个小例子简单解释多态的定义
 *
 * 方法 displayObject 的参数类型为父类型 SimpleGeometric 类
 *
 * 在使用时可以传入子类型 CircleFromSimpleGeometric 类和 RectangleFromSimpleGeometric 类的对象
 *
 * Created by JamieChen on 2017/3/15 0015.
 */
public class PolymorphismDemo {
    public static void main(String[] args) {
        displayObject(new CircleFromSimpleGeometricObject("red", false,1));
        displayObject(new RectangleFromSimpleGeometricObject("black",true,1,1));
    }

    public static void displayObject(SimpleGeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() + ". Color is "
                + object.getColor());
    }
}
