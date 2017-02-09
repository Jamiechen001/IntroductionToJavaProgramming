package me.jamiechen.basic_programming;

import java.util.Scanner;

/**
 * 获取用户输入的利率、贷款额度和支付的年数，计算并显示用户所需支付的月支付额度和总支付额度
 * Created by JamieChen on 2017/1/25 0025.
 */
public class ComputeLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入年利率，如 7.5%： ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.print("请输入贷款年数： ");
        int numberOfYears = input.nextInt();

        System.out.print("请输入贷款总额： ");
        int loanAmount = input.nextInt();

        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println("月支付额度为： " + (int) (monthlyPayment * 100) / 100.0);
        System.out.println("总支付额度为： " + (int) (totalPayment * 100) / 100.0);

    }
}
