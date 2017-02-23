package me.jamiechen.array;

/**
 * 数组的线性查找
 *
 * Created by JamieChen on 2017/2/14 0014.
 */
public class LinearSearch {
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }
        return -1;
    }
}
