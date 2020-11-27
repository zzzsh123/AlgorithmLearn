package today.zsh.chapter2.Section2_1;

/*
 * author: zsh
 * date: 11/27/2020 3:56 PM
 * description: A template for the sorting algorithm class  排序算法类的模板
 **/
public class Example {

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exCh(Comparable[] a,int i,int k) {
        Comparable temp = a[i]; a[i] = a[k]; a[k] = temp;
    }

    private static void show(Comparable[] a) {
        for (Comparable c : a) System.out.print(c);
        System.out.println();
    }

    private static boolean isSorted(Comparable[] a) {
        for (int i = 1;i < a.length;i++) {
            if (less(a[i], a[i-1]))
                return false;
        }
        return true;
    }

}