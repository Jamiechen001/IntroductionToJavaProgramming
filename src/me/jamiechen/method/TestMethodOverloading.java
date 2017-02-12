package me.jamiechen.method;

/**
 * 测试 方法的重载
 *
 * 本程序创建了三个方法用来求最大数
 *
 * 第一个方法求最大整数
 *
 * 第二个方法求最大双精度数
 *
 * 第三个方法求三个双精度数中的最大数
 *
 * Created by JamieChen on 2017/2/12 0012.
 */
public class TestMethodOverloading {
    public static void main(String[] args) {
        System.out.println("3 和 4 中较大的数为：" + max(3,4));
        System.out.println("3.0 和 5.4 中较大的数为：" + max(3.0,5.4));
        System.out.println("3.0、5.4 和 10.14 中较大的数为：" + max(3.0,5.4, 10.14));


    }

    public static int max(int num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    public static double max(double num1, double num2, double num3) {
        return max(max(num1, num2), num3);
    }
}
