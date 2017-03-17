package me.jamiechen.exception_and_io;

import java.io.File;
import java.util.Scanner;

/**
 * 从文件中读取数据
 *
 * Created by JamieChen on 2017/3/17 0017.
 */
public class ReadData {
    public static void main(String[] args) throws Exception{
        File file = new File("scores.txt");

        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(firstName + " " + mi + " " + lastName + " " + score);
        }

        input.close();
    }
}
