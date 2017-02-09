package me.jamiechen.choose;

import java.util.Scanner;

/**
 * 提示用户输入以千克为单位的体重，以米为单位的身高，然后计算并显示身体质量指数（BMI）
 * Created by JamieChen on 2017/1/26 0026.
 */
public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("单位为千克，请输入你的体重：");
        double weight = input.nextDouble();

        System.out.print("单位为米，请输入你的身高：");
        double height = input.nextDouble();

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("偏瘦");
        } else if (bmi < 25) {
            System.out.println("正常");
        } else if (bmi < 30) {
            System.out.println("超重");
        } else {
            System.out.println("过胖");
        }
    }
}
