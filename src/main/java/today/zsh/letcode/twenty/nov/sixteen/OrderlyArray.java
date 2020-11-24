package today.zsh.letcode.twenty.nov.sixteen;

// 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。

//        1 <= A.length <= 10000
//        -10000 <= A[i] <= 10000
//        A 。

import java.util.Arrays;

public class OrderlyArray {

    public int[] sortedSquares(int[] A) {
        // OverThePastSeveral --> 遍历次数
        int OverThePastSeveral = A.length - 1;
        for (int i = 0; i < OverThePastSeveral; i++) {
            if (A[i] < 0) {
                A[i] = -(A[i]);
            }
        }
        Arrays.sort(A);
        for (int i = 0; i < OverThePastSeveral; i++) {
            A[i] = A[i] * A[i];
        }
        return A;
    }

}
