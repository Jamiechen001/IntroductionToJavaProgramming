package me.jamiechen.binary_IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

/**
 * Created by JamieChen on 2017/3/21 0021.
 */
public class TestObjectInputStream {
    public static void main(String[] args) throws ClassNotFoundException, IOException{
        try (
                ObjectInputStream input = new ObjectInputStream(
                        new BufferedInputStream(new FileInputStream("object.dat")))
        ) {
            String name = input.readUTF();
            double score = input.readDouble();
            Date date = (Date) input.readObject();
            System.out.println(name + " " + score + " " + date);
        }
    }
}
