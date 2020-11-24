package today.zsh.chapter1.chapter1_1;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class Test1_1_29 {

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

    public static int[] littleArray(int key,int[] nums) {
        int [] temp = new int[nums.length - 1];
        int tempLength = 0;

        for (int num : nums) {
            if (num < key) {
                temp[tempLength] = num;
                System.out.println(num);
                tempLength++;
            }
        }
        System.out.println(" tempLength : " + tempLength);
        if (tempLength > 0) {
            int [] result = new int[tempLength];
            for (int i = 0;i < result.length;i++) {
                result[i] = temp[i];
            }
            return result;
        }

        return new int[0];
    }

    public static int count(int key,int [] nums) {
        int sum = 0;
        for (int num : nums){
            if (key == num) sum++;
        }
        return sum;
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

        // 返回nums中小于 key的元素的数组
        int[] ints = littleArray(1560, nums);
        System.out.print("ints : ");
        for (int i : ints){
            System.out.print( i + " ");
        }
        System.out.println();

        // 计算nums中与key相同的元素的数量
        // nums[2] = num; nums[3] = num; // 测试 count方法
        int count = count(num, nums);
        System.out.println("count : " + count);

        int rank = rank(num, nums);

        System.out.println("rank -> key " + rank );

    }

}
