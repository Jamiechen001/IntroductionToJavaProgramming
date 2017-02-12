package me.jamiechen.method;

import java.util.Scanner;

/**
 * 提示用户输年份和月份，然后显示该月的整个日历
 *
 * Created by JamieChen on 2017/2/12 0012.
 */
public class PrintCalendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入完整的年份（如 1998 ）：");
        int year = input.nextInt();

        System.out.print("请输入月份：");
        int month = input.nextInt();

        printMonth(year, month);
    }

    public static void printMonth(int year, int month) {

        printMonthTitle(year, month);

        printMonthBody(year, month);
    }

    public static void printMonthTitle(int year, int month) {
        System.out.printf("%10d年\t%-10s\n", year, getMonthName(month));
        System.out.println("-----------------------------");
        System.out.println("  一  二  三  四  五  六  日");
    }

    public static String getMonthName(int month) {

        String monthName = "";

        switch (month) {
            case 1:
                monthName = "一月";
                break;
            case 2:
                monthName = "二月";
                break;
            case 3:
                monthName = "三月";
                break;
            case 4:
                monthName = "四月";
                break;
            case 5:
                monthName = "五月";
                break;
            case 6:
                monthName = "六月";
                break;
            case 7:
                monthName = "七月";
                break;
            case 8:
                monthName = "八月";
                break;
            case 9:
                monthName = "九月";
                break;
            case 10:
                monthName = "十月";
                break;
            case 11:
                monthName = "十一月";
                break;
            case 12:
                monthName = "十二月";
                break;
            default:
                System.out.println("非法输入！");
                System.exit(1);
        }

        return monthName;
    }

    public static void printMonthBody(int year, int month) {

        int startDay = getStartDay(year, month);
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        int i;

        if (startDay == 0) {
            for (i = 0; i < 6; i++)
                System.out.print("    ");
        } else {
            for (i = 1; i < startDay; i++) {
                System.out.print("    ");
            }
        }


        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay - 1) % 7 == 0)
                System.out.println();
        }

        System.out.println();
    }

    public static int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAn_1_1800 = 3;
        int totalNumberOfDays = getTotalNumberOfDays(year, month);
        return (totalNumberOfDays + START_DAY_FOR_JAn_1_1800) % 7;
    }

    public static int getTotalNumberOfDays(int year, int month) {
        int total = 0;

        for (int i = 1800; i < year; i++) {
            if (isLeapYear(i))
                total += 366;
            else
                total += 365;
        }

        for (int i = 1; i < month; i++) {
            total += getNumberOfDaysInMonth(year, i);
        }

        return total;
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        else if (month == 2)
            return isLeapYear(year) ? 29 : 28;
        else
            return 0;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }


}
