package me.jamiechen.method;

/**
 * 应用代码模块化的概念对 me.jamiechen.loop.PrimeNumber 进行改进
 *
 * 分五行显示前 50 个素数，每行 10 个数
 *
 * Created by JamieChen on 2017/2/9 0009.
 */
public class PrimeNumberMethod {
    public static void main(String[] args) {
        System.out.printf("前 50 个素数为：\n");
        printPrimeNumber(50);
    }

    public static void printPrimeNumber(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;

        while (count < numberOfPrimes) {
            if (isPrime(number)) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.printf("%-5s\n", number);
                }else
                    System.out.printf("%-5s", number);
            }

            number++;
        }
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0)
                return false;
        }

        return true;
    }
}
