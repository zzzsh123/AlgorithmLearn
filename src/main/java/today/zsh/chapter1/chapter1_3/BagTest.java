package today.zsh.chapter1.chapter1_3;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class BagTest {

    public static void main(String[] args) {

        Queue<String> as = new ArrayDeque<String>();
        as.add(" h ");
        as.add(" e ");
        as.add(" l ");
        as.add(" l ");
        as.add(" o ");
        as.add(" w ");
        as.add(" o ");
        as.add(" r ");
        as.add(" l ");
        as.add(" d ");
        for (String a : as) {
            System.out.print(a);
        }

        int sd = (1 + ((2 + 3) * (4 * 5)));
        System.out.println(sd);

        // FixedCapacityStackOfStrings 测试
        FixedCapacityStackOfStrings fix = new FixedCapacityStackOfStrings(6);
        fix.push("world");
        fix.push("hello");
        System.out.println(fix.size() + " size ");
        System.out.print(fix.pop() + " ");
        System.out.println();
        System.out.println(fix.isEmpty() + " isEmpty ");
        System.out.println(fix.pop());
        System.out.println(fix.isEmpty() + " isEmpty ");
        System.out.println(fix.size() + " size ");

        System.out.println(" ------------- ");

        FixedCapacityStack<Double> jis = new FixedCapacityStack<Double>(6);
        jis.push(6.5d);
        jis.push(5.68d);
        System.out.println(jis.size() + " size ");
        System.out.print(jis.pop() + " ");
        System.out.println();
        System.out.println(jis.isEmpty() + " isEmpty ");
        System.out.println(jis.pop());
        System.out.println(jis.isEmpty() + " isEmpty ");
        System.out.println(jis.size() + " size ");
        System.out.println(jis.isFull());
        System.out.println("peek() ----> " + jis.peek()); // peek() test
    }

}
