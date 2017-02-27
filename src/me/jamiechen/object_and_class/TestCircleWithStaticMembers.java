package me.jamiechen.object_and_class;

/**
 *
 *
 * Created by JamieChen on 2017/2/24 0024.
 */
public class TestCircleWithStaticMembers {

    public static void main(String[] args) {

        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is " + CirlcleWithStaticMembers.numberOfObjects);

        CirlcleWithStaticMembers c1 = new CirlcleWithStaticMembers();

        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects ("
                + c1.numberOfObjects + ")");

        CirlcleWithStaticMembers c2 = new CirlcleWithStaticMembers(5);

        c1.radius = 9;

        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects ("
                + c1.numberOfObjects + ")");
        System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects ("
                + c2.numberOfObjects + ")");
    }
}
