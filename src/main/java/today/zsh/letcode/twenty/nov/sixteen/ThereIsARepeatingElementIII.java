package today.zsh.letcode.twenty.nov.sixteen;

/**
 * 在整数数组 nums 中，是否存在两个下标 i 和 j，使得 nums [i] 和 nums [j] 的差的绝对值小于等于 t ，且满足 i 和 j 的差的绝对值也小于等于 ķ 。
 *
 * 如果存在则返回 true，不存在返回 false。
 *
 */
public class ThereIsARepeatingElementIII {

    /**
     * @param nums  -2147483648,2147483647
     * @param k     1
     * @param t     1
     * @return
     */
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int lo = 0, hi = nums.length - 1;
        int tempLo = lo,tempHi = hi;
        while (lo < hi) {
            int differenceOfTwoNumbers  = (int) ((long)nums[lo] - (long)nums[hi]);
            int differenceOfTwoNumbersOfLoHi  = hi - lo;
            if (differenceOfTwoNumbers < 0) differenceOfTwoNumbers = -differenceOfTwoNumbers;
            System.out.println(differenceOfTwoNumbers + " differenceOfTwoNumbers ");
            System.out.println(differenceOfTwoNumbersOfLoHi + " differenceOfTwoNumbersOfLoHi ");
            if (differenceOfTwoNumbersOfLoHi < 0) differenceOfTwoNumbersOfLoHi = -differenceOfTwoNumbersOfLoHi;
            if (differenceOfTwoNumbers <= t && differenceOfTwoNumbersOfLoHi <= k) {
                return true;
            }
            System.out.println(lo + " lo ");
            System.out.println(hi + " hi ");
            lo++;
            System.out.println(lo + " lo ");
            System.out.println(hi + " hi ");
            if (lo == hi) {
                tempHi--;
                lo = 0;
                hi = tempHi;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int [] ye = {-2147483648,2147483647};
        int k = 1, t = 3;
        boolean b = containsNearbyAlmostDuplicate(ye, k, t);
        System.out.println(b);
    }

}
