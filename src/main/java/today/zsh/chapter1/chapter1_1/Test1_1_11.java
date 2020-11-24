package today.zsh.chapter1.chapter1_1;

/**
 * 遍历二维数组
 * 标注行和列
 * true 和 false 输出不一致的值
 */
public class Test1_1_11 {

    public static void main(String[] args) {

        boolean[][] booleans = {
                {true, false, false, false, false,true, true, false, false, true, false},
                {false, false, false, false, true, false, true, false, true, true, false},
                {false, true, false, true, false, true, true, false, false, true, false},
                {true, false, true, false, false, true, true, false, false,true, true},
                {false, true, false, true, false, true, true, false, false, true, false},
                {false, false, false, false, true, false, true, false, true, true, false}
                };

        for (int i = 0;i < 6;i++) {
            System.out.println(i+1 + " line");
            for (int k = 0;k < 11;k++) {
                System.out.print(k+1 + " column: ");
//                System.out.print(booleans[i][k]);
                if (booleans[i][k] && k < 10) System.out.print(" ~ ,");
                else if (!booleans[i][k] && k == 10) System.out.println(" | ");
                else if (booleans[i][k] && k == 10) System.out.println(" ~ ");
                else System.out.print(" | ,");
            }
            System.out.println();
        }

    }

}
