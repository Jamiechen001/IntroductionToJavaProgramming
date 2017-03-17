package me.jamiechen.object_oriented;

/**
 * BMI 类
 *
 * Created by JamieChen on 2017/2/28 0028.
 */

public class BMI {
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METER_PER_INCH      = 0.0254;
    private String             name;
    private int                age;
    private double             weight;
    private double             height;


    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    public BMI(String name, int age, double weight, double height) {
        this.name   = name;
        this.age    = age;
        this.weight = weight;
        this.height = height;
    }


    public int getAge() {
        return age;
    }

    public double getBMI() {
        double bmi = weight * KILOGRAMS_PER_POUND / ((height * METER_PER_INCH) * (height * METER_PER_INCH));

        return Math.round(bmi * 100) / 100.0;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        double bmi = getBMI();

        if (bmi < 18.5) {
            return "偏瘦";
        } else if (bmi < 25) {
            return "正常";
        } else if (bmi < 30) {
            return "偏重";
        } else {
            return "肥胖";
        }
    }

    public double getWeight() {
        return weight;
    }
}


