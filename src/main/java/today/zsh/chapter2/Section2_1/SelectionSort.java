package today.zsh.chapter2.Section2_1;

/*
 * author: zsh
 * date: 11/27/2020 3:49 PM
 * description: 选择排序
 **/
public class SelectionSort {

    public static void sort(Comparable[] a) {
        int len = a.length;
        for (int i = 0; i < len - 1; i++) {
            int min = i;
            for (int k = i + 1; k < len; k++) {
                if (a[k].compareTo(a[min]) < 0) min = k;
                // if (less(a[k], a[min])) min = k;
            }
            // exCh(a, i, min);
            Comparable temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }


//    public int compareTo(String anotherString) {
//        int len1 = value.length;
//        int len2 = anotherString.value.length;
//        int lim = Math.min(len1, len2);
//        char v1[] = value;
//        char v2[] = anotherString.value;
//
//        int k = 0;
//        while (k < lim) {
//            char c1 = v1[k];
//            char c2 = v2[k];
//            if (c1 != c2) {
//                return c1 - c2;
//            }
//            k++;
//        }
//        return len1 - len2;
//    }

    public static void main(String[] args) {
        /**
         * a[k].compareTo(a[min]) < 0
         *
         * String compareTo()方法
         * 查看 String 源码中 compareTo 方法可以看到
         *   两个参数比较时会用String value()转换到 char[]
         *   挨个比较数组中的值 该排序中比较单个字母 只会循环一次
         *   比较时 char 如果两个char不相等
         *   返回 原参 - 入参
         *   因为char值比较时 会转换到ascii
         *   ascii 中 A-Z 65-90    a-z 97-122
         *   因此此次排序 升序时 大写A-Z 会在 小写a-z前面
         */
        // ascii 中 A-Z 65-90    a-z 97-122
        // String [] ss = {"s", "o", "r", "t", "e", "x", "A", "m", "p", "l", "e", }; // A e e l m o p r s t x
        String[] ss = {"s", "o", "r", "t", "e", "x", "A", "m", "p", "l", "E",}; // A E e l m o p r s t x
        sort(ss);
//        show(ss);
        for (Comparable c : ss) System.out.print(c + " ");
        System.out.println();
        System.out.println();
        System.out.println("A".length());
    }

    /**
     * @author: zsh
     * @param: [v, w]
     * @return: boolean
     * @description: 比较元素
     * @date: 11/27/2020 5:11 PM
    **/
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * @author: zsh
     * @param: [a, i, k]
     * @return: void
     * @description: 交换元素
     * @date: 11/27/2020 5:11 PM
    **/
    private static void exCh(Comparable[] a, int i, int k) {
        Comparable temp = a[i];
        a[i] = a[k];
        a[k] = temp;
    }

    /**
     * @author: zsh
     * @param: [a]
     * @return: void
     * @description: 遍历参数中所有元素
     * @date: 11/27/2020 5:07 PM
    **/
    private static void show(Comparable[] a) {
        for (Comparable c : a) System.out.print(c);
        System.out.println();
    }

}
