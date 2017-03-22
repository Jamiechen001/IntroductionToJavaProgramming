package me.jamiechen.recursive;

import java.util.Scanner;

/**
 * Created by JamieChen on 2017/3/22 0022.
 */
public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = input.nextInt();

        System.out.println("The moves are: ");
        moveDisks(n, 'A', 'B', 'C');
    }

    public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from "
                    + fromTower + " to " + toTower);
        } else {
            moveDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("Move disk " + n + " from "
                    + fromTower + " to " + toTower);
            moveDisks(n - 1, auxTower, toTower, fromTower);
        }
    }
}
