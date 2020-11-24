package today.zsh.javabase;

public class Redirect {

    public static void main(String[] args) {

        for (int i = 0;i <= Integer.parseInt(args[0]);i++) {
            double random = Math.random();
            System.out.println(random);
        }

        System.out.println("Hello world");

    }

}
