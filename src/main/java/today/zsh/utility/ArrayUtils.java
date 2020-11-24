package today.zsh.utility;

import edu.princeton.cs.algs4.StdRandom;

public class ArrayUtils {

    public static int[] oneArrayInit() {
        int uniform = StdRandom.uniform(1, 12);
        int [] nums = new int[uniform];

        // 随机给原始数组插入数据
        for (int i = 0;i < nums.length;i++)
            nums[i] = StdRandom.uniform(1, 15);

        return nums;
    }
    public static int[][] twoArrayInit() {
        int uniform = StdRandom.uniform(1, 12);
        int [][] nums = new int[uniform][uniform];

        // 随机给原始数组插入数据
        for (int i = 0;i < nums.length;i++)
            for (int k = 0;k < nums[i].length;k++)
                nums[i][k] = StdRandom.uniform(1, 15);

        return nums;
    }

    public static boolean[][] twoBooleanArrayInit() {
        int uniform = StdRandom.uniform(1, 12);
        return new boolean[uniform][uniform];
    }

}
