package me.jamiechen.abstract_class_and_interface;

import java.util.Arrays;

/**
 * Created by JamieChen on 2017/3/21 0021.
 */
public class SortRectangles {
    public static void main(String[] args) {
        ComparableRectangle[] rectangles = {
                new ComparableRectangle(3.4,5.4),
                new ComparableRectangle(13.24,55.4),
                new ComparableRectangle(7.4,35.4),
                new ComparableRectangle(1.4,25.4),
        };

        Arrays.sort(rectangles);
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle + " ");
            System.out.println();
        }
    }
}
