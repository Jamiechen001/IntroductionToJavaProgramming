package me.jamiechen.object_and_class;

/**
 * 为 Circle 类添加一个静态变量 numberOfObjects 和静态方法 getNumberOfObjects
 *
 * Created by JamieChen on 2017/2/24 0024.
 */
public class CirlcleWithStaticMembers {

    double radius;

    static int numberOfObjects = 0;

    CirlcleWithStaticMembers() {
        radius = 1;
        numberOfObjects++;
    }

    CirlcleWithStaticMembers(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }
}
