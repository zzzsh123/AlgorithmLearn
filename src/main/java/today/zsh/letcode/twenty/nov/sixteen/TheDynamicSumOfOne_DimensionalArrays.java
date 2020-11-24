package today.zsh.letcode.twenty.nov.sixteen;

// 一维数组的动态和
public class TheDynamicSumOfOne_DimensionalArrays {

    /**
     * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
     *
     * 请返回 nums 的动态和。
     *
     */

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length;i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

}
