package me.jamiechen.choose;

import java.util.Scanner;

/**
 * 随机产生两个一位整数：number1 和 number2，然后显示比如 “1 + 7 = ”
 * 当用户在输入对话框中输入答案后，程序显示一个信息，表明答案对错与否
 *
 * 关键：随机数的产生
 * 产生随机数的方法很多，这里使用 System.currentTimeMillis() % 10 产生第一个整数，
 * 使用 System.currentTimeMillis() * 7 % 10 产生第二个整数。
 * Created by JamieChen on 2017/1/26 0026.
 */
public class AdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() * 7 % 10);

        Scanner input = new Scanner(System.in);

        System.out.print(number1 + " + " + number2 + " = ");

        int answer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));

    }
}
