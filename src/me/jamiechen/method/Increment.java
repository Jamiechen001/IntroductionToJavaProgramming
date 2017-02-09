package me.jamiechen.method;

/**
 * 测试
 *
 * 无论形参在方法中是否改变，实参都不受影响
 *
 * Created by JamieChen on 2017/2/9 0009.
 */
public class Increment {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the call, x is " + x);
        increment(x);
        System.out.println("After the call, x is " + x);
    }

    public static void increment(int n) {
        n++;
        System.out.println("n inside the method is " + n);
    }
}
