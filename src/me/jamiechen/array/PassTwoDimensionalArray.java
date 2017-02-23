package me.jamiechen.array;

import java.util.Scanner;

/**
 * 将一个二维数组传递给方法
 *
 * Created by JamieChen on 2017/2/14 0014.
 */
public class PassTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] m = getArray();
        System.out.println("\n所有元素的和为：" + sum(m));
    }

    public static int[][] getArray() {
        Scanner input = new Scanner(System.in);

        int[][] m = new int[3][4];
        System.out.println("请输入一个 " + m.length + " 行 " + m[0].length + " 列的数组：");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextInt();
            }
        }

        return m;
    }

    public static int sum(int[][] m) {
        int total = 0;
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                total += m[row][column];
            }
        }

        return total;
    }
}
