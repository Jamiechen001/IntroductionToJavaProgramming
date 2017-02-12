package me.jamiechen.method;

/**
 * 该类用于生成随机字符
 *
 * Created by JamieChen on 2017/2/12 0012.
 */
public class RandomCharacter {

    /** 生成一个位于 ch1 和 ch2 之间的随机字符 */
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /** 生成一个随机小写字符 */
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    /** 生成一个随机大写字符 */
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    /** 生成一个随机数字字符 */
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    /** 生成一个随机字符 */
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
