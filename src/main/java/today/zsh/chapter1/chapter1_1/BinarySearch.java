package today.zsh.chapter1.chapter1_1;

import java.util.Arrays;

public class BinarySearch {

    public static int search(int k,int [] nums) {

        int lo = 0;
        int high = nums.length - 1;

        while (nums[lo] < nums[high]){
            int mid = lo + (high - lo) / 2;
            if (k < nums[mid]) high = mid - 1;
            else if (k > nums[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {2, 4, 14, 5, 23, 15, 3, 1, 45, 67};
        Arrays.sort(nums);
        for (int i = 0;i < nums.length - 1; i++){
            if (i != nums.length - 2) System.out.print(nums[i] + ", ");
            else System.out.print(nums[i]);
        }
        System.out.println();
        int search = search(23, nums);
        System.out.println("index ---> " + search + "nums["+ search +"]" + " --->" + 23);
    }

}
