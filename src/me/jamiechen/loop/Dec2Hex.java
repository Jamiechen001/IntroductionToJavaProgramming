package me.jamiechen.loop;

import java.util.Scanner;

/**
 * 提示用户输入一个十进制数，然后将它转换为一个字符串形式的十六进制数
 *
 * Created by JamieChen on 2017/2/6 0006.
 */
public class Dec2Hex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("请输入一个十进制数： ");
        int decimal = input.nextInt();

        String hex = "";

        while (decimal != 0) {
            int hexValue = decimal % 16;
            char hexDigit = (hexValue <= 9 && hexValue >= 0) ?
                    (char) (hexValue + '0') : (char) (hexValue - 10 + 'A');
            hex = hexDigit + hex;
            decimal /= 16;
        }

        System.out.println("The hex number is " + hex);
    }
}
