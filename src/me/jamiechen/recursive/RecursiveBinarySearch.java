package me.jamiechen.recursive;

import static me.jamiechen.recursive.RecursiveSelectionSort.sort;

/**
 * Created by JamieChen on 2017/3/22 0022.
 */
public class RecursiveBinarySearch {
    public static int recursiveBinarySearch(double[] list, double key) {
        int low = 0;
        int high = list.length - 1;
        return recursiveBinarySearch(list, key, low, high);
    }

    private static int recursiveBinarySearch(double[] list, double key, int low, int high) {
        if (low > high)
            return - low - 1;

        int mid = (low + high) / 2;
        if (key < list[mid])
            return recursiveBinarySearch(list, key, low, mid - 1);
        else if (key == list[mid])
            return mid;
        else
            return recursiveBinarySearch(list, key, mid + 1, high);
    }

    public static void main(String[] args) {
        double[] list = {2.4, 3.8, 1.5, -3.9, 19, 0.7, -7, 88};
        sort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();

        System.out.println(recursiveBinarySearch(list, 19) + 1);
    }
}
