package me.jamiechen.object_and_class;

/**
 * 本程序定义了一个 Circle 类并使用该类创建了三个圆对象，其半径为 1、25 和 125，然后显示这三个圆的半径和面积
 *
 * 然后将第二个对象的半径改为 100 并显示它的新半径和面积。
 *
 * Created by JamieChen on 2017/2/24 0024.
 */
public class TestSimpleCircle {
    public static void main(String[] args) {

        SimpleCircle1 circle1 = new SimpleCircle1();
        System.out.println("The area of the circle of radius "
                + circle1.radius + " is " + circle1.getArea());

        SimpleCircle1 circle2 = new SimpleCircle1(25);
        System.out.println("The area of the circle of radius "
                + circle2.radius + " is " + circle2.getArea());

        SimpleCircle1 circle3 = new SimpleCircle1(125);
        System.out.println("The area of the circle of radius "
                + circle3.radius + " is " + circle3.getArea());

        circle2.radius = 100;
        System.out.println("The area of the circle of radius "
                + circle2.radius + " is " + circle2.getArea());


    }
}



class SimpleCircle1 {

    double radius;

    SimpleCircle1() {
        radius = 1;
    }

    SimpleCircle1(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double gerPerimeter() {
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
