package me.jamiechen.loop;

import java.util.Scanner;

/**
 * 重写 me.jamiechen.choose.AdditionQuiz 让用户重复输入新的答案,直到答案正确为止
 *
 * 随机产生两个一位整数：number1 和 number2，然后显示比如 “1 + 7 = ”
 * 当用户在输入对话框中输入答案后，程序显示一个信息，表明答案对错与否
 *
 * Created by JamieChen on 2017/2/5 0005.
 */
public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        Scanner input = new Scanner(System.in);

        System.out.print(number1 + " + " + number2 + " = ");
        int answer = input.nextInt();

        while (number1 + number2 != answer) {
            System.out.print("错误，请重新回答：" + number1 + " + " + number2 + " = ");
            answer = input.nextInt();
        }

        System.out.println("正确！");
    }
}
