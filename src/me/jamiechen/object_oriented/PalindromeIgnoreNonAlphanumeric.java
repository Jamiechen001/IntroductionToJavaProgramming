package me.jamiechen.object_oriented;

import java.util.Scanner;

/**
 * 检测一个字符串在忽略既非字母又非数字的字符后是否是回文字符串
 *
 * Created by JamieChen on 2017/3/1 0001.
 */
public class PalindromeIgnoreNonAlphanumeric {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println("Ignoring nonalphanumeric character, \nis "
                + s + " a palindrome? " + isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {

        String s1 = filter(s);

        String s2 = reverse(s1);

        return s2.equals(s1);
    }

    public static String filter(String s) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            }
        }

        return stringBuilder.toString();
    }

    public static String reverse(String s) {

        StringBuilder stringBuilder = new StringBuilder(s);

        stringBuilder.reverse();

        return stringBuilder.toString();
    }
}
