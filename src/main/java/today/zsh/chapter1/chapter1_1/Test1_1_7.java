package today.zsh.chapter1.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Test1_1_7 {


    public static void test1 () {
        double t = 9.0d;
        while (Math.abs(t - 9.0/t) > .001)
            t = (9.0/t + t) / 2.0;
        StdOut.printf("%.5f\n", t);
        //System.out.println("%.2f\n", t);
    }

    public static void test2(){
        int sum = 0;
        for (int i = 1;i < 1000;i++)
            for (int l =0;l < i;l++)
                sum++;
        // 1 - 999  1 + 999 ---- 499个1000 1个500
        // 共 499500
        System.out.println(sum);
    }

    public static void test3(){
        int sum = 0;

        for (int l =1;l < 1000;l *= 2)    // 1 2 4 8 16 32 64 128 256 512 十次
            for (int i = 1;i < 1000;i++)  // 1 - 999 999次
                sum++;  // sum = 999 * 10

        System.out.println(sum);
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

}
