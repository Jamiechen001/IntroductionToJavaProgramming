package me.jamiechen.exception_and_io;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * 提示用户输入一个 URL ，然后显示文件大小
 *
 * Created by JamieChen on 2017/3/17 0017.
 */
public class ReadFileFromURL {
    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        String URLString = new Scanner(System.in).next();

        try {
            URL url = new URL(URLString);

            int count = 0;

            Scanner input = new Scanner(url.openStream());

            while (input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
            }

            System.out.println("The file size is " + count + " characters");

        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (IOException ex) {
            System.out.println("I/O Errors: no such file");
        }
    }
}
