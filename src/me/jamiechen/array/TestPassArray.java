package me.jamiechen.array;

/**
 * 测试 将一维数组作为实参传递给方法后数组的变化
 *
 * Created by JamieChen on 2017/2/14 0014.
 */
public class TestPassArray {
    public static void main(String[] args) {

        int[] a = {1, 2};

        System.out.println("将数组的前两个数据作为实参传入交换方法前：");
        System.out.println("数组为 {" + a[0] + ", " + a[1] + "}");
        swap(a[0], a[1]);
        System.out.println("将数组的前两个数据作为实参传入交换方法后：");
        System.out.println("数组为 {" + a[0] + ", " + a[1] + "}");

        System.out.println("将数组作为实参传入交换方法前：");
        System.out.println("数组为 {" + a[0] + ", " + a[1] + "}");
        swapFirstTwoInArray(a);
        System.out.println("将数组作为实参传入交换方法后：");
        System.out.println("数组为 {" + a[0] + ", " + a[1] + "}");

    }

    // 交换两个变量的值
    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    // 交换数组的前两个数据的值
    public static void swapFirstTwoInArray(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}
