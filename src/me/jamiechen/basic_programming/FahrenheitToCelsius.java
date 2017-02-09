package me.jamiechen.basic_programming;

import java.util.Scanner;

/**
 * 将华氏温度转换为摄氏温度
 * Created by JamieChen on 2017/1/21 0021.
 */
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (5.0 / 9) * (fahrenheit - 32);

        System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in celsius");
    }
}
