package me.jamiechen.recursive;

/**
 * Created by JamieChen on 2017/3/22 0022.
 */
public class RecursiveSelectionSort {
    public static void sort(double[] list) {
        sort(list, 0, list.length - 1);
    }

    private static void sort(double[] list, int low, int high) {
        if (low < high) {
            int indexOfMin = low;
            double min = list[low];
            for (int i = low + 1; i <= high; i++) {
                if (list[i] < min) {
                    min = list[i];
                    indexOfMin = i;
                }
            }

            list[indexOfMin] = list[low];
            list[low] = min;

            sort(list, low + 1, high);
        }
    }

    public static void main(String[] args) {
        double[] list = {2.4, 3.8, 1.5, -3.9, 19, 0.7, -7, 88};
        sort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
