package today.zsh.chapter1.chapter1_3;

import java.util.Iterator;

public class ResizingArrayStackTest {

    public static void main(String[] args) {
        ResizingArrayStack<String> arrayStack = new ResizingArrayStack<>();

        System.out.println(arrayStack.size());
        System.out.println(arrayStack.isEmpty());
        arrayStack.push("1");
        arrayStack.push("2");
        arrayStack.push("3");
        arrayStack.push("4");
        System.out.println(arrayStack.size());
        System.out.println(arrayStack.isEmpty());
        Iterator<String> iterator = arrayStack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(arrayStack.pop() + " pop");
        System.out.println(arrayStack.pop() + " pop");
        for (String s : arrayStack) {
            System.out.println(s);
        }
    }

}
