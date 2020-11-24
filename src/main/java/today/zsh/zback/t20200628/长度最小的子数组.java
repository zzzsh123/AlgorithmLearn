package today.zsh.zback.t20200628;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

//给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组，并返回其长度。如果不存在符合条件的连续子数组，返回 0。
//        示例: 
//        输入: s = 7, nums = [2,3,1,2,4,3]
//        输出: 2
//        解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。
public class 长度最小的子数组 {

    public int minSubArrayLen(int s, int[] nums) {
        Arrays.sort(nums);
        List<Integer> aList = new ArrayList<>(nums.length + 1);

        int temp = 0;
        while (temp <= s) {
            List<Integer> bList = new ArrayList<>();
            int i = nums.length - 1;
            nums[i]+=temp;
            i--;
            bList.add(nums[i]);
        }


        return 0;
    }

}
