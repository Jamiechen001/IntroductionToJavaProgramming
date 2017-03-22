package me.jamiechen.abstract_class_and_interface;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by JamieChen on 2017/3/21 0021.
 */
public class LargestNumbers {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();

        list.add(45);
        list.add(3445.21);
        list.add(new BigInteger("2521234341233241341345134"));
        list.add(new BigDecimal("2.23514320813579891737409712589013"));

        System.out.println("The largest number is " + getLargestNumber(list));

    }

    public static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.size() == 0)
            return null;

        Number number = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (number.doubleValue() < list.get(i).doubleValue())
                number = list.get(i);
        }

        return number;
    }
}
