package me.jamiechen.loop;

import java.util.Scanner;

/**
 * 随机产生一个 0 到 100 间且包含 0 和 100 的整数，提示用户连续输入一个数字，直到它和计算机产生的数字匹配为止。
 * 对每次用户输入的数字，程序将告知用户该输入值是大于还是小于目标值，以便用户进行下轮的猜测。
 *
 * 对猜测次数进行统计，可以实现一个猜数游戏
 *
 * Created by JamieChen on 2017/2/5 0005.
 */
public class GuessNumber {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 101);
        int numberOfGuesses = 0;

        System.out.print("这里有一个位于 0 到 100（包括 0 和 100）的神奇数字，请你猜一下： ");

        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        numberOfGuesses++;

        while (guess != number) {
            if (guess < number) {
                System.out.print("你猜的数字偏小： ");
                guess = input.nextInt();
                numberOfGuesses++;
            } else {
                System.out.print("你猜的数字偏大： ");
                guess = input.nextInt();
                numberOfGuesses++;
            }
        }

        System.out.println("恭喜你，你只用了 " + numberOfGuesses + " 次就猜对了！");

    }
}
