package me.jamiechen.loop;

/**
 * 在循环中使用 break
 *
 * 计算从 1 到 20 的整数依次相加之和，直到和大于等于 100 时打印出和与最后一个整数
 *
 * Created by JamieChen on 2017/2/6 0006.
 */
public class TestBreak {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            sum +=  number;
            if (sum >= 100)
                break;
        }

        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    }
}
