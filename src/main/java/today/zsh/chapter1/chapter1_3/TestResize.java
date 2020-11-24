package today.zsh.chapter1.chapter1_3;

public class TestResize {

    public static void main(String[] args) {

        FixedCapacityStack<String> stack = new FixedCapacityStack<String>(3);

        System.out.println("length : " + stack.size());

        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");

        System.out.println("length : " + stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.toString());

    }

}
