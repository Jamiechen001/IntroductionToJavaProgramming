package me.jamiechen.mathfunction_character_string;

import java.util.Scanner;

/**
 * 提示用户输入一个十六进制数字，显示他对应的十进制数
 * Created by JamieChen on 2017/2/3 0003.
 */
public class HexDigit2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入一个十六进制数字： ");
        String hexString = input.nextLine();

        //检查是否只输入一个字符，不是则报告错误
        if (hexString.length() != 1) {
            System.out.println("只能输入一个数字");
            System.exit(1);
        }

        char ch = Character.toUpperCase(hexString.charAt(0));
        if (ch <= 'F' && ch >= 'A') {
            int value = ch - 'A' + 10;
            System.out.println(ch + " 对应的十进制数为 " + value);
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " 对应的十进制数为 " + ch);
        } else {
            System.out.println(ch + " 为无效输入");
        }
    }
}
