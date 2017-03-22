package me.jamiechen.binary_IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * Created by JamieChen on 2017/3/21 0021.
 */
public class TestObjectOutputStream {
    public static void main(String[] args) throws IOException{
        try (
                ObjectOutputStream output = new ObjectOutputStream(
                        new BufferedOutputStream(new FileOutputStream("object.dat")))
        ) {
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeObject(new Date());
        }
    }
}
