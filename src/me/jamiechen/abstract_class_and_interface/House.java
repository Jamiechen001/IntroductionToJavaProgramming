package me.jamiechen.abstract_class_and_interface;

import java.util.Date;

/**
 * Created by JamieChen on 2017/3/21 0021.
 */
public class House implements Cloneable, Comparable<House> {
    private int id;
    private double area;
    private Date whenBuilt;

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(House o) {
        if (area > o.area)
            return 1;
        else if (area < o.area)
            return -1;
        else
            return 0;
    }
}
