package today.zsh.zback.t20200623;

public class 搜索插入位置 {

    public static int searchInsert(int[] nums, int target) {

//        for (int i = 0;i<nums.length;i++) {
//            if (target >= nums[i]) return i;
//        }
//        return nums.length-1;
        if (nums[nums.length - 1] < target) return nums.length;

        int left = 0,right = nums.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (target == nums[mid]) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }

    public static void main(String[] args) {
        int a [] = new int[4];
        a[0] = 1;
        a[1] = 3;
        a[2] = 5;
        a[3] = 6;
        int x = 搜索插入位置.searchInsert(a, 7);
        System.out.println(x);
    }

}
