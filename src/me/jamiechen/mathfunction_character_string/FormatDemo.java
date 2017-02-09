package me.jamiechen.mathfunction_character_string;

/**
 * 使用 printf 显示一个表格
 * Created by JamieChen on 2017/2/3 0003.
 */
public class FormatDemo {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "角度", "弧度", "正弦", "余弦", "正切");

        int degrees = 30;
        double radians = Math.toRadians(degrees);
        System.out.printf("%-10d\t%-10.4f\t%-10.4f\t%-10.4f\t%-10.4f\n",
                degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));

        degrees = 60;
        radians = Math.toRadians(degrees);
        System.out.printf("%-10d\t%-10.4f\t%-10.4f\t%-10.4f\t%-10.4f\n",
                degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
    }
}
