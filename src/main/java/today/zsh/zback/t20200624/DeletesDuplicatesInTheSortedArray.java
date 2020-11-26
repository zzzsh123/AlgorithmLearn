package today.zsh.zback.t20200624;

// 删除排序数组中的重复项
public class DeletesDuplicatesInTheSortedArray {
    public static int removeDuplicates(int[] nums) {

        int low = 0;
        int high = 1;

        while (high < nums.length) {
            if (nums[low] != nums[high]) {
                nums[low + 1] = nums[high];
                low++;
            }
            high++;
        }
//            while (high < nums.length) {
//                if (nums[low] == nums[high] && high <= nums.length - 1) {
//                    nums[high] = nums[high + 1];
//                    low = high;
//                    high = high + 1;
//                }
//            }

        for (int i = 0;i < nums.length;i++) System.out.println(nums[i]);
        return nums.length;
    }

    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 6, 7, 7, 8, 8, 9};
        DeletesDuplicatesInTheSortedArray.removeDuplicates(a);
    }
}
