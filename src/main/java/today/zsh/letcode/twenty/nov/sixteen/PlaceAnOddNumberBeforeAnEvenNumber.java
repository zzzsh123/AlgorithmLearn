package today.zsh.letcode.twenty.nov.sixteen;

// 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
// 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。

public class PlaceAnOddNumberBeforeAnEvenNumber {
    /**
     * 提示
     * 1 <= nums.length <= 50000
     * 1 <= nums[i] <= 10000
     */
    public static int[] exchange(int[] nums) {
        // begin 用于记录放置奇数位置
        int begin = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] % 2 != 0) {
                int temp;
                temp = nums[i];
                nums[i] = nums[begin];
                nums[begin] = temp;
                begin++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] nums = {2,16,3,5,13,1,16,1,12,18,11,8,11,11,5,1};
        System.out.println(nums.length);

        int[] exchange = exchange(nums);
        System.out.println(exchange.toString());
        System.out.print("[");
        for (int num : exchange) System.out.print(num + ",");
        System.out.print("]");
        // [3,5,13,1,1,11,11,11,5,1,2,16,16,12,18,8]
        // [3,5,13,1,1,11,11,11,5,18,16,8,16,2,12,1]
    }

}
