package me.jamiechen.inheritance_and_polymorphism;


/**
 * 一个演示动态绑定的例子
 *
 * Created by JamieChen on 2017/3/15 0015.
 */
public class DynamicBindingDemo {
    public static void main(String[] args) {
        m(new GraduateStudent());
        m(new Student());
        m(new Person());
        m(new Object());
    }

    public static void m(Object x) {
        System.out.println(x.toString());
    }
}

class GraduateStudent extends Student {

}

class Student extends Person {
    @Override
    public String toString() {
        return "Student";
    }
}

class Person extends Object {
    @Override
    public String toString() {
        return "Person";
    }
}
