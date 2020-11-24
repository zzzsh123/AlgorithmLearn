package today.zsh.chapter1.chapter1_1;

import today.zsh.utility.ArrayUtils;

// 遍历二维数组 其中i和j互质时，a[i][j]为true，反之为false
public class Test1_1_30 {

    public static void main(String[] args) {

        boolean[][] ints = ArrayUtils.twoBooleanArrayInit();

        for (int i = 1;i < ints.length - 1;i++) {
            for (int j = 1;j < ints[i].length - 1;j++){
                if (i > j){
                    ints[i][j] = i % j == 1;
                }else if (i < j){
                    ints[i][j] = j % i == 1;
                }else {
                    ints[i][j] = false;
                }
            }
        }

        System.out.println("ints:");
        for (int i = 0;i < ints.length - 1;i++) {
            for (int j = 0; j < ints[i].length - 1; j++) {
                System.out.print("ints[" + i + "][" + j+ "]: " + ints[i][j] + " ");
            }
            System.out.println();
        }
    }


}
