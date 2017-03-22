package me.jamiechen.abstract_class_and_interface;

import java.util.Comparator;

/**
 * Created by JamieChen on 2017/3/21 0021.
 */
public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {
    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public int compareTo(ComparableRectangle o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Width: " + getWidth() + " Height: " + getHeight() +  " Area: " + getArea();
    }
}
