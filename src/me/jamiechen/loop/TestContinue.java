package me.jamiechen.loop;

/**
 * 在循环中使用 continue
 *
 * 计算从 1 到 20 中除去 10 和 11 的所有整数的和
 *
 * Created by JamieChen on 2017/2/6 0006.
 */
public class TestContinue {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            if (number == 10 || number == 11)
                continue;
            sum += number;
        }

        System.out.println("The sum is " + sum);
    }

}
