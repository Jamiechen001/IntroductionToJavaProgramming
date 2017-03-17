package me.jamiechen.exception_and_io;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 向文件中写入数据
 *
 * Created by JamieChen on 2017/3/17 0017.
 */
public class WriteData {
    public static void main(String[] args) throws IOException{
        File file = new File("Scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        PrintWriter output = new PrintWriter(file);

        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);

        output.close();
    }
}
