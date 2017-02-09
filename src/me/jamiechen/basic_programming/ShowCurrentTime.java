package me.jamiechen.basic_programming;

/**
 * 通过调用 System.currentTimeMillis() 显示当前时间
 *
 * System.currentTimeMillis() 返回从 GMT1970年1月1日00:00:00开始到当前时刻的毫秒数
 *
 * 因为时区的原因，System.currentTimeMillis() 返回的小时数为 GMT+0 的小时数，中国时区为 GMT+8 ，
 *
 * 为正确显示北京时间，小时数需加 8
 *
 * Created by JamieChen on 2017/1/22 0022.
 */
public class ShowCurrentTime {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24 + 8;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
