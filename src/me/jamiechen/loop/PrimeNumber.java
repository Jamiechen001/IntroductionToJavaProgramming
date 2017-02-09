package me.jamiechen.loop;

/**
 * 在 5 行中显示前 50 个素数，每行包含 10 个数
 *
 * Created by JamieChen on 2017/2/6 0006.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 100;
        final int NUMBER_OF_PRIMES_PER_LINE = 20;
        int count = 0;
        int number = 2;

        while (count < NUMBER_OF_PRIMES) {

            boolean isPrimeNumber = true;

            for(int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0)
                    System.out.printf("%5d\n", number);
                else
                    System.out.printf("%5d", number);
            }

            number++;

        }

    }

}
