package me.jamiechen.method;

/**
 * Created by JamieChen on 2017/2/12 0012.
 */
public class TestRandomCharacter {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175;
        final int CHARS_PER_LINE = 25;

        RandomCharacter rc = new RandomCharacter();

        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch = rc.getRandomLowerCaseLetter();
            if ((i + 1) % CHARS_PER_LINE == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }
    }
}
