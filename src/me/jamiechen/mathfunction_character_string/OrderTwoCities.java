package me.jamiechen.mathfunction_character_string;

import java.util.Scanner;

/**
 * 提示用户输入两个城市，然后以字母表顺序进行显示(限英文)
 * Created by JamieChen on 2017/2/1 0001.
 */
public class OrderTwoCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入第一个城市： ");
        String city1 = input.nextLine();
        System.out.print("请输入第二个城市： ");
        String city2 = input.nextLine();

        if (city1.compareTo(city2) < 0) {
            System.out.println("城市名称以字母表排序为： " + city1 + " " + city2);
        }else
            System.out.println("城市名称以字母表排序为： " + city2 + " " + city1);
    }
}
