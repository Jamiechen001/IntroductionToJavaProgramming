package me.jamiechen.object_oriented;

/**
 * StackOfIntegers 测试类
 *
 * Created by JamieChen on 2017/2/28 0028.
 */
public class TestStackOfIntegers {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 0; i < 10; i++)
            stack.push(i);

        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }
}
