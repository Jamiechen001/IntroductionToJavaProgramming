package me.jamiechen.method;

import java.util.Scanner;

/**
 * 提示用户输入一个十六进制数，然后将它转换为十进制数并打印
 *
 * Created by JamieChen on 2017/2/9 0009.
 */
public class Hex2Dec {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("请输入一个十六进制数： ");
        String hex = input.nextLine();

        System.out.println("十六进制数 " + hex + " 转换为十进制数为： " + hexToDecimal(hex.toUpperCase()));
    }

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
}

