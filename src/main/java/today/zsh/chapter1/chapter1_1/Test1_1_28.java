package today.zsh.chapter1.chapter1_1;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test1_1_28 {

    public static int rank(int key,int [] a){
        int depth = 1;
        System.out.println("depth : " + depth + " lo : 0," + "high : " + a.length);
        return rank(key, a, 0, a.length-1, depth);
    }

    public static int rank(int key,int [] a,int lo,int hi,int depth){
        depth++;
        int mid = lo + (hi - lo) / 2;
        System.out.println("depth : " + depth + ",lo : " + lo + ",high : " + hi + ",mid : " + mid);
        if (lo > hi) return -1;

        if (a[mid] > key) return rank(key, a, lo, mid - 1, depth);
        if (a[mid] < key) return rank(key, a, mid + 1, hi, depth);
        else return mid;
    }

    public static void main(String[] args) {

        int uniform = StdRandom.uniform(6, 295);
        int []nums = new int[uniform];

        // 随机给原始数组插入数据
        for (int i = 0;i < nums.length;i++)
            nums[i] = StdRandom.uniform(1, 48626);

        int num = nums[StdRandom.uniform(7, nums.length)];

        System.out.println(num + " <--- num");

        Arrays.sort(nums);
        Set<Integer> numSet = new HashSet<Integer>();
        for (int j : nums) {
            numSet.add(j);
        }
        int [] hb = new int[numSet.size() - 1];

        System.out.println(hb.length + " <--- hb || nums ---> " + nums.length);

        int rank = rank(num, nums);

        System.out.println("rank -> key " + rank );

    }

}
