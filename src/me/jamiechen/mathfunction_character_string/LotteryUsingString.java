package me.jamiechen.mathfunction_character_string;

import java.util.Scanner;

/**
 * 见 me.jamiechen.choose.Lottery
 *
 * Lottery 使用整数存储数值，本程序产生两个随机的两位字符串，而不是数字，并且使用字符串而不是数字来接受用户输入。
 *
 * 规则：
 * 随机产生一个两位数的彩票，提示用户输入一个两位数，然后按照下面的规则判断用户是否中奖
 * 1）如果用户的输入匹配彩票的实际顺序，奖金为 10000 美元
 * 2）如果用户输入的所有数字匹配彩票的所有数字，奖金为 3000 美元
 * 2）如果用户输入的一个数字匹配彩票的一个数字，奖金为 1000 美元
 *
 * Created by JamieChen on 2017/2/3 0003.
 */
public class LotteryUsingString {
    public static void main(String[] args) {
        String lottery = "" + (int) (Math.random() * 10) + (int) (Math.random() * 10);

        Scanner input = new Scanner(System.in);

        System.out.print("请输入你的彩票号： ");
        String guess = input.nextLine();

        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);

        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);

        System.out.println("中奖号码为： " + lottery);

        if (guess.equals(lottery)) {
            System.out.println("恭喜你中了一等奖，奖金为 10000 美元");
        } else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1) {
            System.out.println("恭喜你中了二等奖，奖金为 3000 美元");
        } else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2) {
            System.out.println("恭喜你中了三等奖，奖金为 1000 美元");
        } else {
            System.out.println("很抱歉，你没有中奖");
        }

    }
}
