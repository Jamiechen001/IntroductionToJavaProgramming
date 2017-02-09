package me.jamiechen.basic_programming;

import java.util.Scanner;

/**
 * 将营业税值显示为小数点后两位
 * Created by JamieChen on 2017/1/22 0022.
 */
public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();
        double tax = purchaseAmount * 0.06; // tax为销售额的6%
        System.out.println("Sales tax is $" + (int) (tax * 100) / 100.0);
        // 注意到，通过 (int)(tax * 100) 将小数点向右移动两位后取整，截去小数点后的所有数字，
        // 然后再除以一个浮点数 100.0 已达到显示小数点后两位的作用
    }
}
