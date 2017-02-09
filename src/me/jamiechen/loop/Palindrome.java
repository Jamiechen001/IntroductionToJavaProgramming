package me.jamiechen.loop;

import java.util.Scanner;

/**
 * 提示用户输入一个字符串，然后判断该字符串是否是回文
 *
 * Created by JamieChen on 2017/2/6 0006.
 */
public class Palindrome {
    public static void main(String[] args) {

        boolean isPalindrome = true;
        Scanner input = new Scanner(System.in);

        System.out.print("请输入一个字符串： ");
        String string = input.nextLine();

        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println(string + " 是回文");
        else
            System.out.println(string + " 不是回文");
    }
}
