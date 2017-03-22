package me.jamiechen.binary_IO;

import java.io.*;

/**
 * Created by JamieChen on 2017/3/21 0021.
 */
public class TestObjectStreamForArray {
    public static void main(String[] args) throws ClassNotFoundException, IOException{
        int[] numbers = {1, 2, 3, 4, 5};
        String[] strs = {"John", "Susan", "Kim"};

        try (
                ObjectOutputStream output = new ObjectOutputStream(
                        new BufferedOutputStream(new FileOutputStream("array.dat")))
        ) {
            output.writeObject(numbers);
            output.writeObject(strs);
        }

        try (
                ObjectInputStream input = new ObjectInputStream(
                        new BufferedInputStream(new FileInputStream("array.dat")))
        ) {
            int[] newNumbers = (int[]) (input.readObject());
            String[] newStrs = (String[]) (input.readObject());

            for (int i = 0; i < newNumbers.length; i++) {
                System.out.print(newNumbers[i] + " ");
            }
            System.out.println();

            for (int i = 0; i < newStrs.length; i++) {
                System.out.print(newStrs[i] + " ");
            }
        }
    }
}
