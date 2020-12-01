package today.zsh.chapter2.Section2_1;

/*
 * author: zsh
 * date: 11/30/2020 4:17 PM
 * description: 希尔排序
 *
 * 希尔排序的时间复杂度至今无法计算出
 * 但目前最重要的结论是: 它的运行时间达不到平方级别
 *
 **/
public class ShellSort extends ExampleSort {

    public static void sort (Comparable [] a) {
        int len = a.length;
        int h = 1;
        while (h < len/3) h = 3 * h + 1;
        while (h >= 1) {
            for (int i = h;i < len;i++){
                for (int k = i;k >= h && less(a[k], a[k-h]);k-=h) {
                    exCh(a, k, k-h);
                }
            }
            h = h/3;
        }
    }

    public static void main(String[] args) {
        String[] ss = {"1", "45", "23", "6", "14", "2", "4", }; // 1 14 2 23 4 45 6
//        Integer[] ss = {4, 1, 3, 6, 23, 54, 1, 34, 8, 9, 13, 25, 6 }; // 1 1 3 4 6 6 8 9 13 23 25 34 54
//        String[] ss = {"s", "o", "r", "t", "e", "x", "A", "m", "p", "l", "E",}; // A E e l m o p r s t x
        sort(ss);
        for (Comparable c : ss) System.out.print(c + " ");
    }

}
