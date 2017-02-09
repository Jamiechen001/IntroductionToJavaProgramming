package me.jamiechen.loop;

/**
 * 使用嵌套 for 循环打印一个乘法表
 *
 * Created by JamieChen on 2017/2/6 0006.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.printf("%70s","Multiplication Table");

        System.out.print("\n      ");

        for (int j = 1; j <= 15; j++)
            System.out.printf("%8d", j);

        System.out.println();

        for (int i = 1; i <= 127; i++) {
                System.out.print("-");
        }

        System.out.println();

        for (int i = 1; i <= 15; i++) {
            System.out.printf("%4d%2s", i, "|");
            for (int j = 1; j <= 15; j++) {
                System.out.printf("%8d", i*j);
            }
            System.out.println();
        }
    }
}
