package today.zsh.zback.t20200624;

//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//        你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。


import java.util.Arrays;

// 两数之和_review
public class TheSumOfTwoNumbersReview {
    public static int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int a [] = new int[2];
        int low = 0,high = nums.length - 1;
        //for (int i = 0;i <= high;i++) {
            while (low < high ) {
                if (nums[low] + nums[high] == target) {
                    a[0] = low;
                    a[1] = high;
                }
                if(nums[low] + nums[high] > target) {
                    boolean asd = low == 4 || low == 8 || low == 12;
                    high--;
                }else{
                    low++;
                }
            }
        //}
        return a;
    }

    public static void main(String[] args) {
        int [] a = new int[4];
        a[0] = 2;
        a[1] = 7;
        a[2] = 11;
        a[3] = 15;

        int [] s = TheSumOfTwoNumbersReview.twoSum(a, 9);
        System.out.println(s[0] + "   w");
        System.out.println(s[1] + "   s");
    }

}
