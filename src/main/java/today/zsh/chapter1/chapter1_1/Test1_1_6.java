package today.zsh.chapter1.chapter1_1;

public class Test1_1_6 {

    public static void main(String[] args) {

        int f = 0;
        int g = 1;
        for (int i = 0;i <= 15;i++){
            System.out.print(f + " ");
            f = f + g;
            g = f - g;
            System.out.print(f + " ");
            System.out.print(g + " ");
            System.out.println(" ");
        }

    }

}
