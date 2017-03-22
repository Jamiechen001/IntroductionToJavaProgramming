package me.jamiechen.abstract_class_and_interface;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by JamieChen on 2017/3/21 0021.
 */
public class SortComparableObject {
    public static void main(String[] args) {
        String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
        Arrays.sort(cities);
        for (String city : cities) {
            System.out.print(city + " ");
        }
        System.out.println();

        BigInteger[] hugeNumbers = {new BigInteger("2323232323"),
                new BigInteger("3434343434"),
                new BigInteger("4545454545")};
        Arrays.sort(hugeNumbers);
        for (BigInteger number : hugeNumbers) {
            System.out.print(number + " ");
        }
    }
}
