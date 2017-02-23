package me.jamiechen.array;

/**
 * 测试 将可变长参数列表传递给方法
 *
 * Created by JamieChen on 2017/2/14 0014.
 */
public class VarArgsDemo {
    public static void main(String[] args) {
        printMax(34,3,3,2,56.5);
        printMax(new double[]{1, 2, 3});
    }

    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("没有传入任何值");
            return;
        }

        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result)
                result = numbers[i];
        }

        System.out.println("最大值为 " + result);
    }
}
