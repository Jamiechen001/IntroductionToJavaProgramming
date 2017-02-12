package me.jamiechen.method;

/**
 * 另一个测试按值传递参数效果的程序
 *
 * Created by JamieChen on 2017/2/9 0009.
 */
public class TestPassByValue {

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        System.out.println("调用 swap 方法前, num1 是 "
                + num1 + " num2 是 " + num2);

        swap(num1, num2);

        System.out.println("调用 swap 方法后, num1 是 "
                + num1 + " num2 是 " + num2);

    }

    public static void swap(int n1, int n2) {
        System.out.println("\t调用 swap 方法中");
        System.out.println("\t\t换值前, n1 是 " + n1
                + " n2 是 " + n2);

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("\t\t换值后, n1 是 " + n1
                + " n2 是 " + n2);
    }
}
