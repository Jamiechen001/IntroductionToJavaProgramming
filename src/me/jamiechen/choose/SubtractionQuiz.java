package me.jamiechen.choose;

import java.util.Scanner;

/**
 * 随机产生两个一位整数：number1 和 number2，且令 number1 >= number2，
 * 然后显示问题 “7 - 2 = ”，当用户输入答案后，显示一个信息，表明答案对错与否。
 *
 * 关键：随机数的产生
 * 这里使用 Math 类中的 random 方法，调用这个方法会返回一个 double 型的随机浮点数 d，且该数满足 0.0 <= d < 1.0
 * 这样，(int)(Math.random()*10) 会返回一个位于 0-9 的随机整数。
 * Created by JamieChen on 2017/1/26 0026.
 */
public class SubtractionQuiz {
    public static void main(String[] args) {
        //生成两个一位整数
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        //判断两数大小，将大数赋值给 number1，小数赋值给 number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        //显示问题
        System.out.print("请回答：" + number1 + " - " + number2 + " = ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        //判断答案正确与否并显示结果
        if (number1 - number2 == answer) {
            System.out.println("恭喜你，答对了！");
        } else {
            System.out.println("很遗憾，你答错了，正确答案应该是 " + (number1 - number2));
        }



    }
}
