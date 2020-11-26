package today.zsh.zback.t20200624;

// 两数之和
public class TheSumOfTwoNumbers {
    public static int[] twoSum(int[] nums, int target) {
        int [] a = new int[2];
        int low = 0,high = nums.length - 1;
        for (int i = 0;i < nums.length;i++){
            while (low < high) {
                if (nums[low] + nums[high] == target) {
                    a[0] = low;
                    a[1] = high;
                    return a;
                }
                if (nums[low] + nums[high] > target) {
                    ++low;
                }else {
                    --high;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int [] a = new int[4];
        a[0] = 2;
        a[1] = 7;
        a[2] = 11;
        a[3] = 15;

        int [] s = TheSumOfTwoNumbers.twoSum(a, 9);
        System.out.println(s[0] + "   w");
        System.out.println(s[1] + "   s");
    }

}
