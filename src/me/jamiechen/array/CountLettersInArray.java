package me.jamiechen.array;

import me.jamiechen.method.RandomCharacter;

/**
 * 功能：统计每个字母出现的次数
 *
 * 实现：
 *
 * 1.随机生成 100 个小写字母并将其放入一个字符数组中
 *
 * 2.创建一个具有 26 个 int 值的数组 counts[] 对数组中的每个字母出现的次数进行统计
 *
 * Created by JamieChen on 2017/2/14 0014.
 */
public class CountLettersInArray {
    public static void main(String[] args) {
        char[] chars = createArray();
        System.out.println("生成的小写字母为：");
        displayArray(chars);

        int[] counts = countLetters(chars);

        System.out.println();
        System.out.println("每个字母出现的次数：");
        displayCounts(counts);
    }

    public static char[] createArray() {

        char[] chars = new char[100];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();
        }

        return chars;
    }

    public static void displayArray(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0)
                System.out.println(chars[i]);
            else
                System.out.print(chars[i] + " ");
        }
    }

    public static int[] countLetters(char[] chars) {
        int[] counts = new int[26];

        for (int i = 0; i < chars.length; i++) {
            counts[chars[i] - 'a']++;
        }

        return counts;
    }

    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0)
                System.out.println((char)(i + 'a')+ " " + counts[i]);
            else
                System.out.print((char)(i + 'a')+ " " + counts[i] + " ");
        }
    }
}
