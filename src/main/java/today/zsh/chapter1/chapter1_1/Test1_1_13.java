package today.zsh.chapter1.chapter1_1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 打印出一个二位数组的置换
 */
public class Test1_1_13 {

    public static void main(String[] args) {
        int uniform = StdRandom.uniform(1, 12);
        int [][] nums = new int[uniform][uniform];

        // 随机给原始数组插入数据
        for (int i = 0;i < nums.length;i++)
            for (int k = 0;k < nums[i].length;k++)
                nums[i][k] = StdRandom.uniform(1, 15);

        out(nums);
        System.out.println("------------------------------------");
        // 需遍历 nums  依次添加第二维数组长度
        int [][] back = new int[uniform][uniform];

        for (int i = 0;i < back.length;i++) {
            for (int k = 0;k < back[i].length;k++){
                back[i][k] = nums[k][i];
            }
        }
        out(back);
    }
    public static void out(int[][] back) {
        for (int[] ints : back) {
            for (int k = 0; k < ints.length; k++) {
                if (k < ints.length - 1) StdOut.print(ints[k] + ", ");
                else StdOut.print(ints[k] + " ");
            }
            System.out.println();
        }
    }

}
