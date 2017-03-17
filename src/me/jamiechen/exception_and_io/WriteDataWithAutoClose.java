package me.jamiechen.exception_and_io;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 重写 WriteData 类
 *
 * 使用 try-with-resources 语法自动关闭资源
 *
 * Created by JamieChen on 2017/3/17 0017.
 */
public class WriteDataWithAutoClose {
    public static void main(String[] args) throws IOException{
        File file = new File("newSocres.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        try (
                PrintWriter output = new PrintWriter(file)
        ) {
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
        }
    }
}
