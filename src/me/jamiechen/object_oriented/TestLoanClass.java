package me.jamiechen.object_oriented;

import java.util.Scanner;

/**
 * 使用进行抽象和封装后的 Loan 类进行测试
 *
 * Created by JamieChen on 2017/2/28 0028.
 */
public class TestLoanClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入贷款年利率：");
        double annualInterestRate = input.nextDouble();

        System.out.print("请输入贷款年数：");
        int numberOfYears = input.nextInt();

        System.out.print("请输入贷款总额：");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.printf("贷款日期为 %s\n每月需还款 %.2f 元\n共需还款 %.2f 元\n",
                loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
    }
}
