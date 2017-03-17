package me.jamiechen.exception_and_io;

/**
 * CircleWithException 类的测试类
 *
 * Created by JamieChen on 2017/3/17 0017.
 */
public class TestCircleWithException {
    public static void main(String[] args) {
        try {
            CircleWithException c1 = new CircleWithException(5);
            CircleWithException c2 = new CircleWithException(-5);
            CircleWithException c3 = new CircleWithException(0);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }

        System.out.println("Number of objects created: " + CircleWithException.getNumberOfObjects());
    }
}
