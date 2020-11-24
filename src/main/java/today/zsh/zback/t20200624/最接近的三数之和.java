package today.zsh.zback.t20200624;

import java.util.Arrays;

public class 最接近的三数之和 {

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int nLen = nums.length;
        int best = 1000000;
        for (int i = 0;i < nLen;i++) {
            int aCoords = i;
            int bCoords = i + 1;
            int cCoords = nLen - 1;

            while (bCoords < cCoords) {
                int sum = nums[aCoords] + nums[bCoords] + nums[cCoords];

                if (sum == target) return sum;

                if (Math.abs(sum - target) < Math.abs(best - target)) best = sum;

                if (sum >target) {
                    int c0 = cCoords - 1;
                    while (bCoords < c0 && nums[cCoords] == nums[c0]) --c0;
                    cCoords = c0;
                }else {
                    int b0 = bCoords + 1;
                    while (b0 < cCoords && nums[b0] == nums[bCoords]) ++b0;
                    bCoords = b0;
                }
            }
        }
        return best;
    }

    public static void main(String[] args) {

        int a [] = new int[4];
        a[0] = -1;
        a[1] = 2;
        a[2] = 1;
        a[3] = -4;

        System.out.println(最接近的三数之和.threeSumClosest(a, 1));

    }

}
