package me.jamiechen.object_oriented;

import java.math.BigInteger;

/**
 * 计算任意整数的阶乘
 *
 * 使用了 BigInteger 进行大数计算
 *
 * Created by JamieChen on 2017/2/28 0028.
 */
public class LargeFactorial {
    public static void main(String[] args) {
        System.out.println("50! is \n" + factorial(50));
    }

    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++)
            result = result.multiply(new BigInteger(i + ""));

        return result;
    }
}
