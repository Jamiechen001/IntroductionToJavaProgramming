package me.jamiechen.array;

import java.util.Scanner;

/**
 * 提示用户输入需要读取的数字的个数，让用户依次输入这些数字，然后计算它们的平均值并找出有多少个数大于平均值。
 *
 * Created by JamieChen on 2017/2/14 0014.
 */
public class AnalyzeNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("请输入数字总个数：");
        int number = input.nextInt();

        double[] numbers = new double[number];
        double sum = 0;

        System.out.print("请依次输入数字：");
        for (int i = 0; i < number; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        double average = sum / number;

        int count = 0;
        for (int i = 0; i < number; i++) {
            if (numbers[i] > average)
                count++;
        }

        System.out.println("平均值为：" + average);
        System.out.println("有 " + count + " 个数大于平均数");
    }
}
