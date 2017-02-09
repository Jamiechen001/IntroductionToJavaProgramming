package me.jamiechen.loop;

/**
 * 假设某个大学今年的学费是 10000 美元，且每年以 7% 的速度增加，编程计算多少年后学费会翻倍
 *
 * Created by JamieChen on 2017/2/6 0006.
 */
public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 10000;
        int year = 0;

        while (tuition < 20000) {
            tuition *= 1.07;
            year++;
        }

        System.out.println("Tuition will be doubles in " + year + " years");
        System.out.printf("Tuition will be $%.2f in %1d years", tuition, year);
    }
}
