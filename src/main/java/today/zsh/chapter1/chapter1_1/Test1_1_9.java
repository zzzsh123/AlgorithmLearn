package today.zsh.chapter1.chapter1_1;

public class Test1_1_9 {

    public static void main(String[] args) {

        StringBuilder s = new StringBuilder();
        for (int i = 6473;i > 0;i /= 2) {
            int sd = i%2;
            String s1 = String.valueOf(sd);
            s.insert(0, s1);
        }
        System.out.println("s = " + s);

        String a = Integer.toBinaryString(6473);
        System.out.println("a = " + a);

    }

}
