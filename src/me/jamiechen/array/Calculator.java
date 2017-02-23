package me.jamiechen.array;

/**
 * 从命令行读取三个参数：一个整数、一个操作符和另一个整数，然后使用命令行进行算数运算
 *
 * Created by JamieChen on 2017/2/14 0014.
 */
public class Calculator {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Usege: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        int result = 0;

        switch (args[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case '-':
                result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case '.':
                result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case '/':
                result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
        }

        System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
    }

}
