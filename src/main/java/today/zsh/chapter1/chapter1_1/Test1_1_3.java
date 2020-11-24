package today.zsh.chapter1.chapter1_1;

public class Test1_1_3 {

    public static void main(String[] args) {
        String [] s = {"1", "1", "1"};
        args = s;
        if (Integer.parseInt(args[0]) == Integer.parseInt(args[1]) && Integer.parseInt(args[1]) == Integer.parseInt(args[2]))
            System.out.println("equal");
        else System.out.println("not equal");
    }

}
