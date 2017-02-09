package me.jamiechen.loop;

import java.util.Scanner;

/**
 * 产生 5 道减法问题，在用户回答完所有 5 个问题后，报告回答正确的题数
 * 同时显示测试所花的时间，并列出所有的问题与答案
 *
 * Created by JamieChen on 2017/2/5 0005.
 */
public class SubtractionQuizLoop {
    public static void main(String[] args) {

        final int NUMBER_OF_QUESTIONS = 5;
        long startTime = System.currentTimeMillis();
        int correctCount = 0;
        int count = 0;
        String output = " ";
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            // 生成两个随机的一位整数
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            // 如果 number1 小于 number2，将它们的值交换
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            // 提示用户回答问题
            System.out.print(number1 + " - " + number2 + " = ");
            int answer = input.nextInt();

            // 判断答案并显示结果
            if (number1 - number2 == answer) {
                System.out.println("恭喜你，回答正确！\n");
                correctCount++;
            } else {
                System.out.println("很抱歉，回答错误。\n" + number1 + " - "
                        + number2 + " 应该等于 " + (number1 - number2) + "\n");
            }

            count++;

            // 将题目及答案信息以字符串数据类型存储在变量 output 中
            output += "\n" + number1 + " - " + number2 + " = " + answer +
                    ((number1 - number2 == answer) ? " 正确" : " 错误");
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("你总共回答正确 " + correctCount + " 道题" +
                "\n用时为 " + testTime/1000 + " 秒\n" + output);
    }
}
