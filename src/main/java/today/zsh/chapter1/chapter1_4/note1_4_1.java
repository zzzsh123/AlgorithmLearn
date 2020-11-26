package today.zsh.chapter1.chapter1_4;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;
import edu.princeton.cs.algs4.ThreeSum;

/*
 * author: zsh
 * date: 11/26/2020 8:58 PM
 * description: test timer
 **/
public class note1_4_1 {

    public static void main(String[] args) {

        long begin = System.currentTimeMillis();
        int a [] = new int[4780];
        for (int i = 0;i < a.length; i++) {
            a[i] = StdRandom.uniform(-1000000, 1000000);
        }
        Stopwatch timer = new Stopwatch();
        int count = ThreeSum.count(a);
        double v = timer.elapsedTime();
        System.out.println(count + "triples, " + v + " seconds" );
        long end = System.currentTimeMillis();
        System.out.println((end - begin) + " <---- use");


    }

}
