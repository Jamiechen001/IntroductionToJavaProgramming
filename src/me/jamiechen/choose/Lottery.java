package me.jamiechen.choose;

import java.util.Scanner;

/**
 * 随机产生一个两位数的彩票，提示用户输入一个两位数，然后按照下面的规则判断用户是否中奖
 * 1）如果用户的输入匹配彩票的实际顺序，奖金为 10000 美元
 * 2）如果用户输入的所有数字匹配彩票的所有数字，奖金为 3000 美元
 * 2）如果用户输入的一个数字匹配彩票的一个数字，奖金为 1000 美元
 * 注：两位数字中的位中可能为 0，如果一个数字小于 10，假设这个数字以 0 开头。
 * Created by JamieChen on 2017/1/30 0030.
 */
public class Lottery {
    public static void main(String[] args) {
        int lottery = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        System.out.print("请输入你的两位彩票号： ");
        int guess = input.nextInt();

        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("彩票号码是： " + lottery);


        if (lotteryDigit1 == guessDigit1 && lotteryDigit2 == guessDigit2)
            System.out.println("恭喜你，你中了一等奖，奖金为 10000 美元");
        else if (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1)
            System.out.println("恭喜你，你中了二等奖，奖金为 3000 美元");
        else if (lotteryDigit1 == guessDigit1
                || lotteryDigit1 == guessDigit2
                || lotteryDigit2 == guessDigit1
                || lotteryDigit2 == guessDigit2)
            System.out.println("恭喜你，你中了三等奖，奖金为 1000 美元");
        else
            System.out.println("很抱歉，你没有中奖");

    }
}
