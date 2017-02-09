package me.jamiechen.loop;

/**
 * 计算从 0.01 到 1.0 的数列之和
 *
 * Created by JamieChen on 2017/2/6 0006.
 */
public class TestSum {
    public static void main(String[] args) {
        float sum = 0;

        for (float i = 0.01f; i <= 1.0f; i += 0.01f)
            sum += i;

        System.out.println("The sum is " + sum);
    }
}
