package today.zsh.chapter2.Section2_1;

/*
 * author: zsh
 * date: 11/30/2020 10:08 AM
 * description: 插入排序
 **/
public class InsertionSort extends ExampleSort {

    /**
     * @author: zsh
     * @param: [a]
     * @return: void
     * @description: 插入排序
     *     排序从数组下标为1的元素开始，逐渐到最后一个元素，与前面的元素对比，
     *     如果后面的元素比前面的元素小(大小对比参考元素类型中的compareTo方法)，则交换两个元素的位置
     *
     * 部分有序数组：
     *     ·数组中每个元素都距离它最终位置都不远
     *     ·一个有序的大数组接一个小数组
     *     ·数组中只有几个元素的位置不正确
     *
     * 倒置: 指数组中两个顺序颠倒的元素
     * 插入排序对处理部分有序数组时很有效
     * 当数组中倒置的元素很少时，插入排序比其他大部分排序都会快
     * @date: 11/30/2020 1:09 PM
    **/
    public static void sort(Comparable[] a) {
        int len = a.length;
        for (int i = 1;i < len;i++) {
            // 从1开始到数组长度  每次会从当前元素遍历到数组第一个元素  保证了数组左侧遍历过的元素 总是有序的
            for (int k = i;k > 0 && (less(a[k], a[k-1] ));k--) {
                exCh(a, k, k-1);
            }
        }
    }

    public static void main(String[] args) {
        /**
         * 字符类型数组为String 会转换到char[]数字
         * 长度不一致时 先比较数组中第一个数字的ascii的值
         * ascii中 0-9 ----> 64-73
         */
        String[] ss = {"1", "45", "23", "6", "14", "2", "4", }; // 1 14 2 23 4 45 6
//        Integer[] ss = {4, 1, 3, 6, 23, 54, 1, 34, 8, 9, 13, 25, 6 }; // 1 1 3 4 6 6 8 9 13 23 25 34 54
//        String[] ss = {"s", "o", "r", "t", "e", "x", "A", "m", "p", "l", "E",}; // A E e l m o p r s t x
        sort(ss);
        for (Comparable c : ss) System.out.print(c + " ");
        System.out.println();
    }

}
