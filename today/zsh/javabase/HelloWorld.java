public class HelloWorld {
    public static void main(String[] args) {
        for (int i = 0;i <= Integer.parseInt(args[0]);i++) {
            double random = Math.random()*10;
            System.out.println(random);
        }
    }
}