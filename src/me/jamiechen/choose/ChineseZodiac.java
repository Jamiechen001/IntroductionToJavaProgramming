package me.jamiechen.choose;

import java.util.Scanner;

/**
 * 提示用户输入一个年份，然后判断该年份所属的生肖
 * Created by JamieChen on 2017/1/30 0030.
 */
public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入一个年份： ");
        int year = input.nextInt();

        switch (year % 12) {
            case 0:
                System.out.println(year + " 年是猴年");break;
            case 1:
                System.out.println(year + " 年是鸡年");break;
            case 2:
                System.out.println(year + " 年是狗年");break;
            case 3:
                System.out.println(year + " 年是猪年");break;
            case 4:
                System.out.println(year + " 年是鼠年");break;
            case 5:
                System.out.println(year + " 年是牛年");break;
            case 6:
                System.out.println(year + " 年是虎年");break;
            case 7:
                System.out.println(year + " 年是兔年");break;
            case 8:
                System.out.println(year + " 年是龙年");break;
            case 9:
                System.out.println(year + " 年是蛇年");break;
            case 10:
                System.out.println(year + " 年是马年");break;
            case 11:
                System.out.println(year + " 年是羊年");break;
        }
    }
}
