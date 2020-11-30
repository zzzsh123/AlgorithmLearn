package today.zsh.chapter2.Section2_1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

/*
 * author: zsh
 * date: 11/30/2020 2:39 PM
 * description: 比较选择排序和插入排序
 **/
public class SortCompare {

    public static void main(String[] args) {

        String alg1 = "ShellSort";
        String alg2 = "Insertion";
        int alg3 = 100000;
        int alg4 = 1000;

        double time1 = timeRandomInput(alg1, alg3, alg4);
        double time2 = timeRandomInput(alg2, alg3, alg4);

        System.out.println(" time1 " + time1);
        System.out.println(" time2 " + time2);

        StdOut.printf("For %d random Doubles\n %s is ", alg3, alg1);
        StdOut.printf("%.1f times faster than %s\n", time2/time1, alg2);
    }
    public static double timeRandomInput (String alg,int N,int T) {
        double total = 0.0;
        Double[] a = new Double[N];
        for (int i = 0;i < T;i++)
            for (int k = 0;k < N;k++)
                a[k] = StdRandom.uniform();
            total += time(alg, a);
        return total;
    }
    public static double time (String alg, Comparable a[]) {
        Stopwatch stopwatch = new Stopwatch();
        if (alg.equals("Insertion")) InsertionSort.sort(a);
        if (alg.equals("Selection")) SelectionSort.sort(a);
        if (alg.equals("ShellSort")) ShellSort.sort(a);
        return stopwatch.elapsedTime();
    }
}
